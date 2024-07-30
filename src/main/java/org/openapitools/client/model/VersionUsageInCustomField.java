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
 * List of custom fields using the version.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class VersionUsageInCustomField {
  public static final String SERIALIZED_NAME_CUSTOM_FIELD_ID = "customFieldId";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELD_ID)
  private Long customFieldId;

  public static final String SERIALIZED_NAME_FIELD_NAME = "fieldName";
  @SerializedName(SERIALIZED_NAME_FIELD_NAME)
  private String fieldName;

  public static final String SERIALIZED_NAME_ISSUE_COUNT_WITH_VERSION_IN_CUSTOM_FIELD = "issueCountWithVersionInCustomField";
  @SerializedName(SERIALIZED_NAME_ISSUE_COUNT_WITH_VERSION_IN_CUSTOM_FIELD)
  private Long issueCountWithVersionInCustomField;

  public VersionUsageInCustomField() {
  }

  public VersionUsageInCustomField(
     Long customFieldId, 
     String fieldName, 
     Long issueCountWithVersionInCustomField
  ) {
    this();
    this.customFieldId = customFieldId;
    this.fieldName = fieldName;
    this.issueCountWithVersionInCustomField = issueCountWithVersionInCustomField;
  }

  /**
   * The ID of the custom field.
   * @return customFieldId
   */
  @javax.annotation.Nullable
  public Long getCustomFieldId() {
    return customFieldId;
  }



  /**
   * The name of the custom field.
   * @return fieldName
   */
  @javax.annotation.Nullable
  public String getFieldName() {
    return fieldName;
  }



  /**
   * Count of the issues where the custom field contains the version.
   * @return issueCountWithVersionInCustomField
   */
  @javax.annotation.Nullable
  public Long getIssueCountWithVersionInCustomField() {
    return issueCountWithVersionInCustomField;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionUsageInCustomField versionUsageInCustomField = (VersionUsageInCustomField) o;
    return Objects.equals(this.customFieldId, versionUsageInCustomField.customFieldId) &&
        Objects.equals(this.fieldName, versionUsageInCustomField.fieldName) &&
        Objects.equals(this.issueCountWithVersionInCustomField, versionUsageInCustomField.issueCountWithVersionInCustomField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customFieldId, fieldName, issueCountWithVersionInCustomField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionUsageInCustomField {\n");
    sb.append("    customFieldId: ").append(toIndentedString(customFieldId)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    issueCountWithVersionInCustomField: ").append(toIndentedString(issueCountWithVersionInCustomField)).append("\n");
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
    openapiFields.add("customFieldId");
    openapiFields.add("fieldName");
    openapiFields.add("issueCountWithVersionInCustomField");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to VersionUsageInCustomField
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VersionUsageInCustomField.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VersionUsageInCustomField is not found in the empty JSON string", VersionUsageInCustomField.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VersionUsageInCustomField.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VersionUsageInCustomField` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("fieldName") != null && !jsonObj.get("fieldName").isJsonNull()) && !jsonObj.get("fieldName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VersionUsageInCustomField.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VersionUsageInCustomField' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VersionUsageInCustomField> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VersionUsageInCustomField.class));

       return (TypeAdapter<T>) new TypeAdapter<VersionUsageInCustomField>() {
           @Override
           public void write(JsonWriter out, VersionUsageInCustomField value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VersionUsageInCustomField read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of VersionUsageInCustomField given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VersionUsageInCustomField
   * @throws IOException if the JSON string is invalid with respect to VersionUsageInCustomField
   */
  public static VersionUsageInCustomField fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VersionUsageInCustomField.class);
  }

  /**
   * Convert an instance of VersionUsageInCustomField to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
