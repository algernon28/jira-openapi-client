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
 * The date the refreshed webhooks expire.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class WebhooksExpirationDate {
  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expirationDate";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private Long expirationDate;

  public WebhooksExpirationDate() {
  }

  public WebhooksExpirationDate(
     Long expirationDate
  ) {
    this();
    this.expirationDate = expirationDate;
  }

  /**
   * The expiration date of all the refreshed webhooks.
   * @return expirationDate
   */
  @javax.annotation.Nonnull
  public Long getExpirationDate() {
    return expirationDate;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhooksExpirationDate webhooksExpirationDate = (WebhooksExpirationDate) o;
    return Objects.equals(this.expirationDate, webhooksExpirationDate.expirationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expirationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhooksExpirationDate {\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
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
    openapiFields.add("expirationDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("expirationDate");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WebhooksExpirationDate
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WebhooksExpirationDate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhooksExpirationDate is not found in the empty JSON string", WebhooksExpirationDate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WebhooksExpirationDate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhooksExpirationDate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhooksExpirationDate.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhooksExpirationDate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhooksExpirationDate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhooksExpirationDate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhooksExpirationDate.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhooksExpirationDate>() {
           @Override
           public void write(JsonWriter out, WebhooksExpirationDate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhooksExpirationDate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WebhooksExpirationDate given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WebhooksExpirationDate
   * @throws IOException if the JSON string is invalid with respect to WebhooksExpirationDate
   */
  public static WebhooksExpirationDate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhooksExpirationDate.class);
  }

  /**
   * Convert an instance of WebhooksExpirationDate to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

