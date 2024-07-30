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
 * A change item.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class ChangeDetails {
  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private String field;

  public static final String SERIALIZED_NAME_FIELD_ID = "fieldId";
  @SerializedName(SERIALIZED_NAME_FIELD_ID)
  private String fieldId;

  public static final String SERIALIZED_NAME_FIELDTYPE = "fieldtype";
  @SerializedName(SERIALIZED_NAME_FIELDTYPE)
  private String fieldtype;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_FROM_STRING = "fromString";
  @SerializedName(SERIALIZED_NAME_FROM_STRING)
  private String fromString;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_TO_STRING = "toString";
  @SerializedName(SERIALIZED_NAME_TO_STRING)
  private String toString;

  public ChangeDetails() {
  }

  public ChangeDetails(
     String field, 
     String fieldId, 
     String fieldtype, 
     String from, 
     String fromString, 
     String to, 
     String toString
  ) {
    this();
    this.field = field;
    this.fieldId = fieldId;
    this.fieldtype = fieldtype;
    this.from = from;
    this.fromString = fromString;
    this.to = to;
    this.toString = toString;
  }

  /**
   * The name of the field changed.
   * @return field
   */
  @javax.annotation.Nullable
  public String getField() {
    return field;
  }



  /**
   * The ID of the field changed.
   * @return fieldId
   */
  @javax.annotation.Nullable
  public String getFieldId() {
    return fieldId;
  }



  /**
   * The type of the field changed.
   * @return fieldtype
   */
  @javax.annotation.Nullable
  public String getFieldtype() {
    return fieldtype;
  }



  /**
   * The details of the original value.
   * @return from
   */
  @javax.annotation.Nullable
  public String getFrom() {
    return from;
  }



  /**
   * The details of the original value as a string.
   * @return fromString
   */
  @javax.annotation.Nullable
  public String getFromString() {
    return fromString;
  }



  /**
   * The details of the new value.
   * @return to
   */
  @javax.annotation.Nullable
  public String getTo() {
    return to;
  }



  /**
   * The details of the new value as a string.
   * @return toString
   */
  @javax.annotation.Nullable
  public String getToString() {
    return toString;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeDetails changeDetails = (ChangeDetails) o;
    return Objects.equals(this.field, changeDetails.field) &&
        Objects.equals(this.fieldId, changeDetails.fieldId) &&
        Objects.equals(this.fieldtype, changeDetails.fieldtype) &&
        Objects.equals(this.from, changeDetails.from) &&
        Objects.equals(this.fromString, changeDetails.fromString) &&
        Objects.equals(this.to, changeDetails.to) &&
        Objects.equals(this.toString, changeDetails.toString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, fieldId, fieldtype, from, fromString, to, toString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeDetails {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    fieldtype: ").append(toIndentedString(fieldtype)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    fromString: ").append(toIndentedString(fromString)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    toString: ").append(toIndentedString(toString)).append("\n");
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
    openapiFields.add("field");
    openapiFields.add("fieldId");
    openapiFields.add("fieldtype");
    openapiFields.add("from");
    openapiFields.add("fromString");
    openapiFields.add("to");
    openapiFields.add("toString");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ChangeDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChangeDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChangeDetails is not found in the empty JSON string", ChangeDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ChangeDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChangeDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("field") != null && !jsonObj.get("field").isJsonNull()) && !jsonObj.get("field").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field").toString()));
      }
      if ((jsonObj.get("fieldId") != null && !jsonObj.get("fieldId").isJsonNull()) && !jsonObj.get("fieldId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldId").toString()));
      }
      if ((jsonObj.get("fieldtype") != null && !jsonObj.get("fieldtype").isJsonNull()) && !jsonObj.get("fieldtype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldtype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldtype").toString()));
      }
      if ((jsonObj.get("from") != null && !jsonObj.get("from").isJsonNull()) && !jsonObj.get("from").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `from` to be a primitive type in the JSON string but got `%s`", jsonObj.get("from").toString()));
      }
      if ((jsonObj.get("fromString") != null && !jsonObj.get("fromString").isJsonNull()) && !jsonObj.get("fromString").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fromString` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fromString").toString()));
      }
      if ((jsonObj.get("to") != null && !jsonObj.get("to").isJsonNull()) && !jsonObj.get("to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("to").toString()));
      }
      if ((jsonObj.get("toString") != null && !jsonObj.get("toString").isJsonNull()) && !jsonObj.get("toString").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `toString` to be a primitive type in the JSON string but got `%s`", jsonObj.get("toString").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChangeDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChangeDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChangeDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChangeDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<ChangeDetails>() {
           @Override
           public void write(JsonWriter out, ChangeDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChangeDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ChangeDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ChangeDetails
   * @throws IOException if the JSON string is invalid with respect to ChangeDetails
   */
  public static ChangeDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChangeDetails.class);
  }

  /**
   * Convert an instance of ChangeDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

