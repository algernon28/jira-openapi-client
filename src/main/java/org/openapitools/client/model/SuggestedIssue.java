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
 * An issue suggested for use in the issue picker auto-completion.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class SuggestedIssue {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_IMG = "img";
  @SerializedName(SERIALIZED_NAME_IMG)
  private String img;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_KEY_HTML = "keyHtml";
  @SerializedName(SERIALIZED_NAME_KEY_HTML)
  private String keyHtml;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private String summary;

  public static final String SERIALIZED_NAME_SUMMARY_TEXT = "summaryText";
  @SerializedName(SERIALIZED_NAME_SUMMARY_TEXT)
  private String summaryText;

  public SuggestedIssue() {
  }

  public SuggestedIssue(
     Long id, 
     String img, 
     String key, 
     String keyHtml, 
     String summary, 
     String summaryText
  ) {
    this();
    this.id = id;
    this.img = img;
    this.key = key;
    this.keyHtml = keyHtml;
    this.summary = summary;
    this.summaryText = summaryText;
  }

  /**
   * The ID of the issue.
   * @return id
   */
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }



  /**
   * The URL of the issue type&#39;s avatar.
   * @return img
   */
  @javax.annotation.Nullable
  public String getImg() {
    return img;
  }



  /**
   * The key of the issue.
   * @return key
   */
  @javax.annotation.Nullable
  public String getKey() {
    return key;
  }



  /**
   * The key of the issue in HTML format.
   * @return keyHtml
   */
  @javax.annotation.Nullable
  public String getKeyHtml() {
    return keyHtml;
  }



  /**
   * The phrase containing the query string in HTML format, with the string highlighted with HTML bold tags.
   * @return summary
   */
  @javax.annotation.Nullable
  public String getSummary() {
    return summary;
  }



  /**
   * The phrase containing the query string, as plain text.
   * @return summaryText
   */
  @javax.annotation.Nullable
  public String getSummaryText() {
    return summaryText;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestedIssue suggestedIssue = (SuggestedIssue) o;
    return Objects.equals(this.id, suggestedIssue.id) &&
        Objects.equals(this.img, suggestedIssue.img) &&
        Objects.equals(this.key, suggestedIssue.key) &&
        Objects.equals(this.keyHtml, suggestedIssue.keyHtml) &&
        Objects.equals(this.summary, suggestedIssue.summary) &&
        Objects.equals(this.summaryText, suggestedIssue.summaryText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, img, key, keyHtml, summary, summaryText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestedIssue {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    img: ").append(toIndentedString(img)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    keyHtml: ").append(toIndentedString(keyHtml)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    summaryText: ").append(toIndentedString(summaryText)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("img");
    openapiFields.add("key");
    openapiFields.add("keyHtml");
    openapiFields.add("summary");
    openapiFields.add("summaryText");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SuggestedIssue
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SuggestedIssue.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SuggestedIssue is not found in the empty JSON string", SuggestedIssue.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SuggestedIssue.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SuggestedIssue` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("img") != null && !jsonObj.get("img").isJsonNull()) && !jsonObj.get("img").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `img` to be a primitive type in the JSON string but got `%s`", jsonObj.get("img").toString()));
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("keyHtml") != null && !jsonObj.get("keyHtml").isJsonNull()) && !jsonObj.get("keyHtml").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keyHtml` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyHtml").toString()));
      }
      if ((jsonObj.get("summary") != null && !jsonObj.get("summary").isJsonNull()) && !jsonObj.get("summary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `summary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("summary").toString()));
      }
      if ((jsonObj.get("summaryText") != null && !jsonObj.get("summaryText").isJsonNull()) && !jsonObj.get("summaryText").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `summaryText` to be a primitive type in the JSON string but got `%s`", jsonObj.get("summaryText").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SuggestedIssue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SuggestedIssue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SuggestedIssue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SuggestedIssue.class));

       return (TypeAdapter<T>) new TypeAdapter<SuggestedIssue>() {
           @Override
           public void write(JsonWriter out, SuggestedIssue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SuggestedIssue read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SuggestedIssue given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SuggestedIssue
   * @throws IOException if the JSON string is invalid with respect to SuggestedIssue
   */
  public static SuggestedIssue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SuggestedIssue.class);
  }

  /**
   * Convert an instance of SuggestedIssue to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
