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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * Details of how to filter and list search auto complete information.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class SearchAutoCompleteFilter {
  public static final String SERIALIZED_NAME_INCLUDE_COLLAPSED_FIELDS = "includeCollapsedFields";
  @SerializedName(SERIALIZED_NAME_INCLUDE_COLLAPSED_FIELDS)
  private Boolean includeCollapsedFields = false;

  public static final String SERIALIZED_NAME_PROJECT_IDS = "projectIds";
  @SerializedName(SERIALIZED_NAME_PROJECT_IDS)
  private List<Long> projectIds = new ArrayList<>();

  public SearchAutoCompleteFilter() {
  }

  public SearchAutoCompleteFilter includeCollapsedFields(Boolean includeCollapsedFields) {
    this.includeCollapsedFields = includeCollapsedFields;
    return this;
  }

  /**
   * Include collapsed fields for fields that have non-unique names.
   * @return includeCollapsedFields
   */
  @javax.annotation.Nullable
  public Boolean getIncludeCollapsedFields() {
    return includeCollapsedFields;
  }

  public void setIncludeCollapsedFields(Boolean includeCollapsedFields) {
    this.includeCollapsedFields = includeCollapsedFields;
  }


  public SearchAutoCompleteFilter projectIds(List<Long> projectIds) {
    this.projectIds = projectIds;
    return this;
  }

  public SearchAutoCompleteFilter addProjectIdsItem(Long projectIdsItem) {
    if (this.projectIds == null) {
      this.projectIds = new ArrayList<>();
    }
    this.projectIds.add(projectIdsItem);
    return this;
  }

  /**
   * List of project IDs used to filter the visible field details returned.
   * @return projectIds
   */
  @javax.annotation.Nullable
  public List<Long> getProjectIds() {
    return projectIds;
  }

  public void setProjectIds(List<Long> projectIds) {
    this.projectIds = projectIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchAutoCompleteFilter searchAutoCompleteFilter = (SearchAutoCompleteFilter) o;
    return Objects.equals(this.includeCollapsedFields, searchAutoCompleteFilter.includeCollapsedFields) &&
        Objects.equals(this.projectIds, searchAutoCompleteFilter.projectIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeCollapsedFields, projectIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchAutoCompleteFilter {\n");
    sb.append("    includeCollapsedFields: ").append(toIndentedString(includeCollapsedFields)).append("\n");
    sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
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
    openapiFields.add("includeCollapsedFields");
    openapiFields.add("projectIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SearchAutoCompleteFilter
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SearchAutoCompleteFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchAutoCompleteFilter is not found in the empty JSON string", SearchAutoCompleteFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SearchAutoCompleteFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchAutoCompleteFilter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("projectIds") != null && !jsonObj.get("projectIds").isJsonNull() && !jsonObj.get("projectIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectIds` to be an array in the JSON string but got `%s`", jsonObj.get("projectIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchAutoCompleteFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchAutoCompleteFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchAutoCompleteFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchAutoCompleteFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchAutoCompleteFilter>() {
           @Override
           public void write(JsonWriter out, SearchAutoCompleteFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchAutoCompleteFilter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SearchAutoCompleteFilter given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SearchAutoCompleteFilter
   * @throws IOException if the JSON string is invalid with respect to SearchAutoCompleteFilter
   */
  public static SearchAutoCompleteFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchAutoCompleteFilter.class);
  }

  /**
   * Convert an instance of SearchAutoCompleteFilter to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
