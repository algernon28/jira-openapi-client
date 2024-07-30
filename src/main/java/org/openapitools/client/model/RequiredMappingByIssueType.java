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
import java.util.LinkedHashSet;
import java.util.Set;

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
 * The list of required status mappings by issue type.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class RequiredMappingByIssueType {
  public static final String SERIALIZED_NAME_ISSUE_TYPE_ID = "issueTypeId";
  @SerializedName(SERIALIZED_NAME_ISSUE_TYPE_ID)
  private String issueTypeId;

  public static final String SERIALIZED_NAME_STATUS_IDS = "statusIds";
  @SerializedName(SERIALIZED_NAME_STATUS_IDS)
  private Set<String> statusIds = new LinkedHashSet<>();

  public RequiredMappingByIssueType() {
  }

  public RequiredMappingByIssueType issueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
    return this;
  }

  /**
   * The ID of the issue type.
   * @return issueTypeId
   */
  @javax.annotation.Nullable
  public String getIssueTypeId() {
    return issueTypeId;
  }

  public void setIssueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
  }


  public RequiredMappingByIssueType statusIds(Set<String> statusIds) {
    this.statusIds = statusIds;
    return this;
  }

  public RequiredMappingByIssueType addStatusIdsItem(String statusIdsItem) {
    if (this.statusIds == null) {
      this.statusIds = new LinkedHashSet<>();
    }
    this.statusIds.add(statusIdsItem);
    return this;
  }

  /**
   * The status IDs requiring mapping.
   * @return statusIds
   */
  @javax.annotation.Nullable
  public Set<String> getStatusIds() {
    return statusIds;
  }

  public void setStatusIds(Set<String> statusIds) {
    this.statusIds = statusIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequiredMappingByIssueType requiredMappingByIssueType = (RequiredMappingByIssueType) o;
    return Objects.equals(this.issueTypeId, requiredMappingByIssueType.issueTypeId) &&
        Objects.equals(this.statusIds, requiredMappingByIssueType.statusIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueTypeId, statusIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequiredMappingByIssueType {\n");
    sb.append("    issueTypeId: ").append(toIndentedString(issueTypeId)).append("\n");
    sb.append("    statusIds: ").append(toIndentedString(statusIds)).append("\n");
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
    openapiFields.add("issueTypeId");
    openapiFields.add("statusIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RequiredMappingByIssueType
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RequiredMappingByIssueType.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RequiredMappingByIssueType is not found in the empty JSON string", RequiredMappingByIssueType.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RequiredMappingByIssueType.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RequiredMappingByIssueType` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("issueTypeId") != null && !jsonObj.get("issueTypeId").isJsonNull()) && !jsonObj.get("issueTypeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issueTypeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issueTypeId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("statusIds") != null && !jsonObj.get("statusIds").isJsonNull() && !jsonObj.get("statusIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `statusIds` to be an array in the JSON string but got `%s`", jsonObj.get("statusIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RequiredMappingByIssueType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RequiredMappingByIssueType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RequiredMappingByIssueType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RequiredMappingByIssueType.class));

       return (TypeAdapter<T>) new TypeAdapter<RequiredMappingByIssueType>() {
           @Override
           public void write(JsonWriter out, RequiredMappingByIssueType value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RequiredMappingByIssueType read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RequiredMappingByIssueType given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RequiredMappingByIssueType
   * @throws IOException if the JSON string is invalid with respect to RequiredMappingByIssueType
   */
  public static RequiredMappingByIssueType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RequiredMappingByIssueType.class);
  }

  /**
   * Convert an instance of RequiredMappingByIssueType to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

