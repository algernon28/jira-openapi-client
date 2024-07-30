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
 * Details of names changed in the record event.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class ChangedValueBean {
  public static final String SERIALIZED_NAME_CHANGED_FROM = "changedFrom";
  @SerializedName(SERIALIZED_NAME_CHANGED_FROM)
  private String changedFrom;

  public static final String SERIALIZED_NAME_CHANGED_TO = "changedTo";
  @SerializedName(SERIALIZED_NAME_CHANGED_TO)
  private String changedTo;

  public static final String SERIALIZED_NAME_FIELD_NAME = "fieldName";
  @SerializedName(SERIALIZED_NAME_FIELD_NAME)
  private String fieldName;

  public ChangedValueBean() {
  }

  public ChangedValueBean(
     String changedFrom, 
     String changedTo, 
     String fieldName
  ) {
    this();
    this.changedFrom = changedFrom;
    this.changedTo = changedTo;
    this.fieldName = fieldName;
  }

  /**
   * The value of the field before the change.
   * @return changedFrom
   */
  @javax.annotation.Nullable
  public String getChangedFrom() {
    return changedFrom;
  }



  /**
   * The value of the field after the change.
   * @return changedTo
   */
  @javax.annotation.Nullable
  public String getChangedTo() {
    return changedTo;
  }



  /**
   * The name of the field changed.
   * @return fieldName
   */
  @javax.annotation.Nullable
  public String getFieldName() {
    return fieldName;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangedValueBean changedValueBean = (ChangedValueBean) o;
    return Objects.equals(this.changedFrom, changedValueBean.changedFrom) &&
        Objects.equals(this.changedTo, changedValueBean.changedTo) &&
        Objects.equals(this.fieldName, changedValueBean.fieldName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changedFrom, changedTo, fieldName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangedValueBean {\n");
    sb.append("    changedFrom: ").append(toIndentedString(changedFrom)).append("\n");
    sb.append("    changedTo: ").append(toIndentedString(changedTo)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
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
    openapiFields.add("changedFrom");
    openapiFields.add("changedTo");
    openapiFields.add("fieldName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ChangedValueBean
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChangedValueBean.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChangedValueBean is not found in the empty JSON string", ChangedValueBean.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ChangedValueBean.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChangedValueBean` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("changedFrom") != null && !jsonObj.get("changedFrom").isJsonNull()) && !jsonObj.get("changedFrom").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `changedFrom` to be a primitive type in the JSON string but got `%s`", jsonObj.get("changedFrom").toString()));
      }
      if ((jsonObj.get("changedTo") != null && !jsonObj.get("changedTo").isJsonNull()) && !jsonObj.get("changedTo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `changedTo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("changedTo").toString()));
      }
      if ((jsonObj.get("fieldName") != null && !jsonObj.get("fieldName").isJsonNull()) && !jsonObj.get("fieldName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChangedValueBean.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChangedValueBean' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChangedValueBean> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChangedValueBean.class));

       return (TypeAdapter<T>) new TypeAdapter<ChangedValueBean>() {
           @Override
           public void write(JsonWriter out, ChangedValueBean value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChangedValueBean read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ChangedValueBean given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ChangedValueBean
   * @throws IOException if the JSON string is invalid with respect to ChangedValueBean
   */
  public static ChangedValueBean fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChangedValueBean.class);
  }

  /**
   * Convert an instance of ChangedValueBean to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
