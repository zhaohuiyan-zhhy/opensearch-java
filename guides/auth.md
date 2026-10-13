- [Authentication](#authentication)
  - [Amazon OpenSearch Service](#amazon-opensearch-service)

# Authentication

## Amazon OpenSearch Service

Requests to [OpenSearch Service and OpenSearch Serverless](https://docs.aws.amazon.com/opensearch-service/index.html) must be signed using the AWS signing protocol. Use `AwsSdk2Transport` to send signed requests.

> ⚠️ **Warning** ⚠️  
> Using `software.amazon.awssdk.http.apache.ApacheHttpClient` is discouraged as it does not support request bodies on GET or DELETE requests.  
> This leads to incorrect handling of requests such as `OpenSearchClient.clearScroll()` and `OpenSearchClient.deletePit()`.  
> As such `AwsSdk2Transport` will throw a `TransportException` if an unsupported request is encountered while using `ApacheHttpClient`.

Optional GET bodies are omitted when none of their body fields are set. For example,
`client.ml().getProfile(r -> r)` sends a GET without a body and works with AWS SDK
`UrlConnectionHttpClient`.

If a GET request has a body, `UrlConnectionHttpClient` would rewrite the signed
request to POST. `AwsSdk2Transport` rejects these requests before sending them;
use a compatible client such as `AwsCrtHttpClient` instead. This includes explicitly
supplied generic bodies such as `{}` or an empty string. Explicit `false` values,
empty collections, and required PIT request bodies are preserved.

ML profile calls without body fields use the server's URL-based defaults and
model/task IDs. This can produce different results from the previous `{}` body.

```java
SdkHttpClient httpClient = AwsCrtHttpClient.builder().build();

OpenSearchClient client = new OpenSearchClient(
    new AwsSdk2Transport(
        httpClient,
        "search-...us-west-2.es.amazonaws.com", // OpenSearch endpoint, without https://
        "es", // signing service name, use "aoss" for OpenSearch Serverless
        Region.US_WEST_2, // signing service region
        AwsSdk2TransportOptions.builder().build()
    )
);

InfoResponse info = client.info();
System.out.println(info.version().distribution() + ": " + info.version().number());

httpClient.close();
```
