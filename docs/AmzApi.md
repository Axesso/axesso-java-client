# AmzApi

All URIs are relative to *http://api.axesso.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**keywordSearch**](AmzApi.md#keywordSearch) | **GET** /amz/amazon-search-by-keyword | fetch results auf a keyword search on Amazon
[**requestBuyRecommendation**](AmzApi.md#requestBuyRecommendation) | **GET** /amz/amazon-lookup-buy-recommendations | request buy recommendations to a given product
[**requestProduct**](AmzApi.md#requestProduct) | **GET** /amz/amazon-lookup-product | lookup product information
[**sortOptions**](AmzApi.md#sortOptions) | **GET** /amz/sort-options | request available sort options to use in keyword search


<a name="keywordSearch"></a>
# **keywordSearch**
> KeywordSearchResponse keywordSearch(keyword, domainCode, sortBy, numberOfProducts)

fetch results auf a keyword search on Amazon



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AmzApi;


AmzApi apiInstance = new AmzApi();
String keyword = "keyword_example"; // String | keyword to search
String domainCode = "domainCode_example"; // String | domain for the search
String sortBy = "relevanceblender"; // String | sort option
Integer numberOfProducts = 20; // Integer | number of the results (max 20)
try {
    KeywordSearchResponse result = apiInstance.keywordSearch(keyword, domainCode, sortBy, numberOfProducts);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AmzApi#keywordSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyword** | **String**| keyword to search |
 **domainCode** | **String**| domain for the search |
 **sortBy** | **String**| sort option | [optional] [default to relevanceblender]
 **numberOfProducts** | **Integer**| number of the results (max 20) | [optional] [default to 20]

### Return type

[**KeywordSearchResponse**](KeywordSearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="requestBuyRecommendation"></a>
# **requestBuyRecommendation**
> BuyRecommendationResponse requestBuyRecommendation(url)

request buy recommendations to a given product



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AmzApi;


AmzApi apiInstance = new AmzApi();
String url = "url_example"; // String | The url of the requested product.
try {
    BuyRecommendationResponse result = apiInstance.requestBuyRecommendation(url);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AmzApi#requestBuyRecommendation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **url** | **String**| The url of the requested product. |

### Return type

[**BuyRecommendationResponse**](BuyRecommendationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="requestProduct"></a>
# **requestProduct**
> ProductDetailsResponse requestProduct(url, size)

lookup product information



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AmzApi;


AmzApi apiInstance = new AmzApi();
String url = "url_example"; // String | The url of the requested product.
String size = "size_example"; // String | Size parameter if available.
try {
    ProductDetailsResponse result = apiInstance.requestProduct(url, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AmzApi#requestProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **url** | **String**| The url of the requested product. |
 **size** | **String**| Size parameter if available. | [optional]

### Return type

[**ProductDetailsResponse**](ProductDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sortOptions"></a>
# **sortOptions**
> SortOptionResponse sortOptions()

request available sort options to use in keyword search



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AmzApi;


AmzApi apiInstance = new AmzApi();
try {
    SortOptionResponse result = apiInstance.sortOptions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AmzApi#sortOptions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SortOptionResponse**](SortOptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

