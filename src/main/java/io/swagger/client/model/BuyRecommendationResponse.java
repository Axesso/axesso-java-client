/*
 * Axesso Api
 * Use this api to fetch information to Amazon products and more.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@axesso.de
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * BuyRecommendationResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-21T15:33:25.535Z")
public class BuyRecommendationResponse {
  @SerializedName("responseStatus")
  private String responseStatus = null;

  @SerializedName("responseMessage")
  private String responseMessage = null;

  @SerializedName("numberOfProducts")
  private Long numberOfProducts = null;

  @SerializedName("buyRecommendations")
  private List<String> buyRecommendations = null;

  public BuyRecommendationResponse responseStatus(String responseStatus) {
    this.responseStatus = responseStatus;
    return this;
  }

   /**
   * Get responseStatus
   * @return responseStatus
  **/
  @ApiModelProperty(example = "PRODUCT_FOUND_RESPONSE", value = "")
  public String getResponseStatus() {
    return responseStatus;
  }

  public void setResponseStatus(String responseStatus) {
    this.responseStatus = responseStatus;
  }

  public BuyRecommendationResponse responseMessage(String responseMessage) {
    this.responseMessage = responseMessage;
    return this;
  }

   /**
   * Get responseMessage
   * @return responseMessage
  **/
  @ApiModelProperty(example = "Product successfully found!", value = "")
  public String getResponseMessage() {
    return responseMessage;
  }

  public void setResponseMessage(String responseMessage) {
    this.responseMessage = responseMessage;
  }

  public BuyRecommendationResponse numberOfProducts(Long numberOfProducts) {
    this.numberOfProducts = numberOfProducts;
    return this;
  }

   /**
   * Get numberOfProducts
   * @return numberOfProducts
  **/
  @ApiModelProperty(value = "")
  public Long getNumberOfProducts() {
    return numberOfProducts;
  }

  public void setNumberOfProducts(Long numberOfProducts) {
    this.numberOfProducts = numberOfProducts;
  }

  public BuyRecommendationResponse buyRecommendations(List<String> buyRecommendations) {
    this.buyRecommendations = buyRecommendations;
    return this;
  }

  public BuyRecommendationResponse addBuyRecommendationsItem(String buyRecommendationsItem) {
    if (this.buyRecommendations == null) {
      this.buyRecommendations = new ArrayList<String>();
    }
    this.buyRecommendations.add(buyRecommendationsItem);
    return this;
  }

   /**
   * Get buyRecommendations
   * @return buyRecommendations
  **/
  @ApiModelProperty(value = "")
  public List<String> getBuyRecommendations() {
    return buyRecommendations;
  }

  public void setBuyRecommendations(List<String> buyRecommendations) {
    this.buyRecommendations = buyRecommendations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuyRecommendationResponse buyRecommendationResponse = (BuyRecommendationResponse) o;
    return Objects.equals(this.responseStatus, buyRecommendationResponse.responseStatus) &&
        Objects.equals(this.responseMessage, buyRecommendationResponse.responseMessage) &&
        Objects.equals(this.numberOfProducts, buyRecommendationResponse.numberOfProducts) &&
        Objects.equals(this.buyRecommendations, buyRecommendationResponse.buyRecommendations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseStatus, responseMessage, numberOfProducts, buyRecommendations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuyRecommendationResponse {\n");
    
    sb.append("    responseStatus: ").append(toIndentedString(responseStatus)).append("\n");
    sb.append("    responseMessage: ").append(toIndentedString(responseMessage)).append("\n");
    sb.append("    numberOfProducts: ").append(toIndentedString(numberOfProducts)).append("\n");
    sb.append("    buyRecommendations: ").append(toIndentedString(buyRecommendations)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
