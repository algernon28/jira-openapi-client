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
import java.net.URI;
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
 * UserBeanAvatarUrls
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class UserBeanAvatarUrls {
  public static final String SERIALIZED_NAME_16X16 = "16x16";
  @SerializedName(SERIALIZED_NAME_16X16)
  private URI _16x16;

  public static final String SERIALIZED_NAME_24X24 = "24x24";
  @SerializedName(SERIALIZED_NAME_24X24)
  private URI _24x24;

  public static final String SERIALIZED_NAME_32X32 = "32x32";
  @SerializedName(SERIALIZED_NAME_32X32)
  private URI _32x32;

  public static final String SERIALIZED_NAME_48X48 = "48x48";
  @SerializedName(SERIALIZED_NAME_48X48)
  private URI _48x48;

  public UserBeanAvatarUrls() {
  }

  public UserBeanAvatarUrls _16x16(URI _16x16) {
    this._16x16 = _16x16;
    return this;
  }

  /**
   * The URL of the user&#39;s 16x16 pixel avatar.
   * @return _16x16
   */
  @javax.annotation.Nullable
  public URI get16x16() {
    return _16x16;
  }

  public void set16x16(URI _16x16) {
    this._16x16 = _16x16;
  }


  public UserBeanAvatarUrls _24x24(URI _24x24) {
    this._24x24 = _24x24;
    return this;
  }

  /**
   * The URL of the user&#39;s 24x24 pixel avatar.
   * @return _24x24
   */
  @javax.annotation.Nullable
  public URI get24x24() {
    return _24x24;
  }

  public void set24x24(URI _24x24) {
    this._24x24 = _24x24;
  }


  public UserBeanAvatarUrls _32x32(URI _32x32) {
    this._32x32 = _32x32;
    return this;
  }

  /**
   * The URL of the user&#39;s 32x32 pixel avatar.
   * @return _32x32
   */
  @javax.annotation.Nullable
  public URI get32x32() {
    return _32x32;
  }

  public void set32x32(URI _32x32) {
    this._32x32 = _32x32;
  }


  public UserBeanAvatarUrls _48x48(URI _48x48) {
    this._48x48 = _48x48;
    return this;
  }

  /**
   * The URL of the user&#39;s 48x48 pixel avatar.
   * @return _48x48
   */
  @javax.annotation.Nullable
  public URI get48x48() {
    return _48x48;
  }

  public void set48x48(URI _48x48) {
    this._48x48 = _48x48;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserBeanAvatarUrls userBeanAvatarUrls = (UserBeanAvatarUrls) o;
    return Objects.equals(this._16x16, userBeanAvatarUrls._16x16) &&
        Objects.equals(this._24x24, userBeanAvatarUrls._24x24) &&
        Objects.equals(this._32x32, userBeanAvatarUrls._32x32) &&
        Objects.equals(this._48x48, userBeanAvatarUrls._48x48);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_16x16, _24x24, _32x32, _48x48);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserBeanAvatarUrls {\n");
    sb.append("    _16x16: ").append(toIndentedString(_16x16)).append("\n");
    sb.append("    _24x24: ").append(toIndentedString(_24x24)).append("\n");
    sb.append("    _32x32: ").append(toIndentedString(_32x32)).append("\n");
    sb.append("    _48x48: ").append(toIndentedString(_48x48)).append("\n");
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
    openapiFields.add("16x16");
    openapiFields.add("24x24");
    openapiFields.add("32x32");
    openapiFields.add("48x48");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UserBeanAvatarUrls
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UserBeanAvatarUrls.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserBeanAvatarUrls is not found in the empty JSON string", UserBeanAvatarUrls.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UserBeanAvatarUrls.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserBeanAvatarUrls` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("16x16") != null && !jsonObj.get("16x16").isJsonNull()) && !jsonObj.get("16x16").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `16x16` to be a primitive type in the JSON string but got `%s`", jsonObj.get("16x16").toString()));
      }
      if ((jsonObj.get("24x24") != null && !jsonObj.get("24x24").isJsonNull()) && !jsonObj.get("24x24").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `24x24` to be a primitive type in the JSON string but got `%s`", jsonObj.get("24x24").toString()));
      }
      if ((jsonObj.get("32x32") != null && !jsonObj.get("32x32").isJsonNull()) && !jsonObj.get("32x32").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `32x32` to be a primitive type in the JSON string but got `%s`", jsonObj.get("32x32").toString()));
      }
      if ((jsonObj.get("48x48") != null && !jsonObj.get("48x48").isJsonNull()) && !jsonObj.get("48x48").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `48x48` to be a primitive type in the JSON string but got `%s`", jsonObj.get("48x48").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserBeanAvatarUrls.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserBeanAvatarUrls' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserBeanAvatarUrls> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserBeanAvatarUrls.class));

       return (TypeAdapter<T>) new TypeAdapter<UserBeanAvatarUrls>() {
           @Override
           public void write(JsonWriter out, UserBeanAvatarUrls value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserBeanAvatarUrls read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UserBeanAvatarUrls given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UserBeanAvatarUrls
   * @throws IOException if the JSON string is invalid with respect to UserBeanAvatarUrls
   */
  public static UserBeanAvatarUrls fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserBeanAvatarUrls.class);
  }

  /**
   * Convert an instance of UserBeanAvatarUrls to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

