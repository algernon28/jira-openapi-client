/*
 * The Jira Cloud platform REST API
 * Jira Cloud platform REST API documentation
 *
 * The version of the OpenAPI document: 1001.0.0-SNAPSHOT-df7582dfe7cda5bf12b0b05c137e574248cecd69
 * Contact: ecosystem@atlassian.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * IssueLimitReportRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class IssueLimitReportRequest {
  public static final String SERIALIZED_NAME_ISSUES_APPROACHING_LIMIT_PARAMS = "issuesApproachingLimitParams";
  @SerializedName(SERIALIZED_NAME_ISSUES_APPROACHING_LIMIT_PARAMS)
  private Map<String, Integer> issuesApproachingLimitParams = new HashMap<>();

  public IssueLimitReportRequest() {
  }

  public IssueLimitReportRequest issuesApproachingLimitParams(Map<String, Integer> issuesApproachingLimitParams) {
    this.issuesApproachingLimitParams = issuesApproachingLimitParams;
    return this;
  }

  public IssueLimitReportRequest putIssuesApproachingLimitParamsItem(String key, Integer issuesApproachingLimitParamsItem) {
    if (this.issuesApproachingLimitParams == null) {
      this.issuesApproachingLimitParams = new HashMap<>();
    }
    this.issuesApproachingLimitParams.put(key, issuesApproachingLimitParamsItem);
    return this;
  }

  /**
   * A list of fields and their respective approaching limit threshold. Required for querying issues approaching limits. Optional for querying issues breaching limits. Accepted fields are: &#x60;comment&#x60;, &#x60;worklog&#x60;, &#x60;attachment&#x60;, &#x60;remoteIssueLinks&#x60;, and &#x60;issuelinks&#x60;. Example: &#x60;{\&quot;issuesApproachingLimitParams\&quot;: {\&quot;comment\&quot;: 4500, \&quot;attachment\&quot;: 1800}}&#x60;
   * @return issuesApproachingLimitParams
   */
  @javax.annotation.Nullable
  public Map<String, Integer> getIssuesApproachingLimitParams() {
    return issuesApproachingLimitParams;
  }

  public void setIssuesApproachingLimitParams(Map<String, Integer> issuesApproachingLimitParams) {
    this.issuesApproachingLimitParams = issuesApproachingLimitParams;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueLimitReportRequest issueLimitReportRequest = (IssueLimitReportRequest) o;
    return Objects.equals(this.issuesApproachingLimitParams, issueLimitReportRequest.issuesApproachingLimitParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuesApproachingLimitParams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueLimitReportRequest {\n");
    sb.append("    issuesApproachingLimitParams: ").append(toIndentedString(issuesApproachingLimitParams)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("issuesApproachingLimitParams");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IssueLimitReportRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IssueLimitReportRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssueLimitReportRequest is not found in the empty JSON string", IssueLimitReportRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IssueLimitReportRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IssueLimitReportRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IssueLimitReportRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssueLimitReportRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssueLimitReportRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssueLimitReportRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<IssueLimitReportRequest>() {
           @Override
           public void write(JsonWriter out, IssueLimitReportRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IssueLimitReportRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IssueLimitReportRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IssueLimitReportRequest
   * @throws IOException if the JSON string is invalid with respect to IssueLimitReportRequest
   */
  public static IssueLimitReportRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssueLimitReportRequest.class);
  }

  /**
   * Convert an instance of IssueLimitReportRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

