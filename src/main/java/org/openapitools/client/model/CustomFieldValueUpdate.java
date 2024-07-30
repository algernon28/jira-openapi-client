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
 * A list of issue IDs and the value to update a custom field to.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class CustomFieldValueUpdate {
  public static final String SERIALIZED_NAME_ISSUE_IDS = "issueIds";
  @SerializedName(SERIALIZED_NAME_ISSUE_IDS)
  private List<Long> issueIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Object value = null;

  public CustomFieldValueUpdate() {
  }

  public CustomFieldValueUpdate issueIds(List<Long> issueIds) {
    this.issueIds = issueIds;
    return this;
  }

  public CustomFieldValueUpdate addIssueIdsItem(Long issueIdsItem) {
    if (this.issueIds == null) {
      this.issueIds = new ArrayList<>();
    }
    this.issueIds.add(issueIdsItem);
    return this;
  }

  /**
   * The list of issue IDs.
   * @return issueIds
   */
  @javax.annotation.Nonnull
  public List<Long> getIssueIds() {
    return issueIds;
  }

  public void setIssueIds(List<Long> issueIds) {
    this.issueIds = issueIds;
  }


  public CustomFieldValueUpdate value(Object value) {
    this.value = value;
    return this;
  }

  /**
   * The value for the custom field. The value must be compatible with the [custom field type](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field/#data-types) as follows:   *  &#x60;string&#x60; the value must be a string.  *  &#x60;number&#x60; the value must be a number.  *  &#x60;datetime&#x60; the value must be a string that represents a date in the ISO format or the simplified extended ISO format. For example, &#x60;\&quot;2023-01-18T12:00:00-03:00\&quot;&#x60; or &#x60;\&quot;2023-01-18T12:00:00.000Z\&quot;&#x60;. However, the milliseconds part is ignored.  *  &#x60;user&#x60; the value must be an object that contains the &#x60;accountId&#x60; field.  *  &#x60;group&#x60; the value must be an object that contains the group &#x60;name&#x60; or &#x60;groupId&#x60; field. Because group names can change, we recommend using &#x60;groupId&#x60;.  A list of appropriate values must be provided if the field is of the &#x60;list&#x60; [collection type](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field/#collection-types).
   * @return value
   */
  @javax.annotation.Nullable
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldValueUpdate customFieldValueUpdate = (CustomFieldValueUpdate) o;
    return Objects.equals(this.issueIds, customFieldValueUpdate.issueIds) &&
        Objects.equals(this.value, customFieldValueUpdate.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueIds, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldValueUpdate {\n");
    sb.append("    issueIds: ").append(toIndentedString(issueIds)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("issueIds");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("issueIds");
    openapiRequiredFields.add("value");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CustomFieldValueUpdate
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomFieldValueUpdate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomFieldValueUpdate is not found in the empty JSON string", CustomFieldValueUpdate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CustomFieldValueUpdate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomFieldValueUpdate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomFieldValueUpdate.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("issueIds") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("issueIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `issueIds` to be an array in the JSON string but got `%s`", jsonObj.get("issueIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomFieldValueUpdate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomFieldValueUpdate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomFieldValueUpdate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomFieldValueUpdate.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomFieldValueUpdate>() {
           @Override
           public void write(JsonWriter out, CustomFieldValueUpdate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomFieldValueUpdate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CustomFieldValueUpdate given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CustomFieldValueUpdate
   * @throws IOException if the JSON string is invalid with respect to CustomFieldValueUpdate
   */
  public static CustomFieldValueUpdate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomFieldValueUpdate.class);
  }

  /**
   * Convert an instance of CustomFieldValueUpdate to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
