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
 * The default value for a Forge date time custom field.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class CustomFieldContextDefaultValueForgeDateTimeField {
  public static final String SERIALIZED_NAME_CONTEXT_ID = "contextId";
  @SerializedName(SERIALIZED_NAME_CONTEXT_ID)
  private String contextId;

  public static final String SERIALIZED_NAME_DATE_TIME = "dateTime";
  @SerializedName(SERIALIZED_NAME_DATE_TIME)
  private String dateTime;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_USE_CURRENT = "useCurrent";
  @SerializedName(SERIALIZED_NAME_USE_CURRENT)
  private Boolean useCurrent = false;

  public CustomFieldContextDefaultValueForgeDateTimeField() {
  }

  public CustomFieldContextDefaultValueForgeDateTimeField contextId(String contextId) {
    this.contextId = contextId;
    return this;
  }

  /**
   * The ID of the context.
   * @return contextId
   */
  @javax.annotation.Nonnull
  public String getContextId() {
    return contextId;
  }

  public void setContextId(String contextId) {
    this.contextId = contextId;
  }


  public CustomFieldContextDefaultValueForgeDateTimeField dateTime(String dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * The default date-time in ISO format. Ignored if &#x60;useCurrent&#x60; is true.
   * @return dateTime
   */
  @javax.annotation.Nullable
  public String getDateTime() {
    return dateTime;
  }

  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
  }


  public CustomFieldContextDefaultValueForgeDateTimeField type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public CustomFieldContextDefaultValueForgeDateTimeField useCurrent(Boolean useCurrent) {
    this.useCurrent = useCurrent;
    return this;
  }

  /**
   * Whether to use the current date.
   * @return useCurrent
   */
  @javax.annotation.Nullable
  public Boolean getUseCurrent() {
    return useCurrent;
  }

  public void setUseCurrent(Boolean useCurrent) {
    this.useCurrent = useCurrent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldContextDefaultValueForgeDateTimeField customFieldContextDefaultValueForgeDateTimeField = (CustomFieldContextDefaultValueForgeDateTimeField) o;
    return Objects.equals(this.contextId, customFieldContextDefaultValueForgeDateTimeField.contextId) &&
        Objects.equals(this.dateTime, customFieldContextDefaultValueForgeDateTimeField.dateTime) &&
        Objects.equals(this.type, customFieldContextDefaultValueForgeDateTimeField.type) &&
        Objects.equals(this.useCurrent, customFieldContextDefaultValueForgeDateTimeField.useCurrent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextId, dateTime, type, useCurrent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldContextDefaultValueForgeDateTimeField {\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    useCurrent: ").append(toIndentedString(useCurrent)).append("\n");
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
    openapiFields.add("contextId");
    openapiFields.add("dateTime");
    openapiFields.add("type");
    openapiFields.add("useCurrent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("contextId");
    openapiRequiredFields.add("type");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CustomFieldContextDefaultValueForgeDateTimeField
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomFieldContextDefaultValueForgeDateTimeField.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomFieldContextDefaultValueForgeDateTimeField is not found in the empty JSON string", CustomFieldContextDefaultValueForgeDateTimeField.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CustomFieldContextDefaultValueForgeDateTimeField.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomFieldContextDefaultValueForgeDateTimeField` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomFieldContextDefaultValueForgeDateTimeField.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("contextId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contextId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contextId").toString()));
      }
      if ((jsonObj.get("dateTime") != null && !jsonObj.get("dateTime").isJsonNull()) && !jsonObj.get("dateTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dateTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dateTime").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomFieldContextDefaultValueForgeDateTimeField.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomFieldContextDefaultValueForgeDateTimeField' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomFieldContextDefaultValueForgeDateTimeField> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomFieldContextDefaultValueForgeDateTimeField.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomFieldContextDefaultValueForgeDateTimeField>() {
           @Override
           public void write(JsonWriter out, CustomFieldContextDefaultValueForgeDateTimeField value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomFieldContextDefaultValueForgeDateTimeField read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CustomFieldContextDefaultValueForgeDateTimeField given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CustomFieldContextDefaultValueForgeDateTimeField
   * @throws IOException if the JSON string is invalid with respect to CustomFieldContextDefaultValueForgeDateTimeField
   */
  public static CustomFieldContextDefaultValueForgeDateTimeField fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomFieldContextDefaultValueForgeDateTimeField.class);
  }

  /**
   * Convert an instance of CustomFieldContextDefaultValueForgeDateTimeField to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

