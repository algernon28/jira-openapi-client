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
import org.openapitools.client.model.IssuePickerSuggestionsIssueType;

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
 * A list of issues suggested for use in auto-completion.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class IssuePickerSuggestions {
  public static final String SERIALIZED_NAME_SECTIONS = "sections";
  @SerializedName(SERIALIZED_NAME_SECTIONS)
  private List<IssuePickerSuggestionsIssueType> sections = new ArrayList<>();

  public IssuePickerSuggestions() {
  }

  public IssuePickerSuggestions(
     List<IssuePickerSuggestionsIssueType> sections
  ) {
    this();
    this.sections = sections;
  }

  /**
   * A list of issues for an issue type suggested for use in auto-completion.
   * @return sections
   */
  @javax.annotation.Nullable
  public List<IssuePickerSuggestionsIssueType> getSections() {
    return sections;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuePickerSuggestions issuePickerSuggestions = (IssuePickerSuggestions) o;
    return Objects.equals(this.sections, issuePickerSuggestions.sections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssuePickerSuggestions {\n");
    sb.append("    sections: ").append(toIndentedString(sections)).append("\n");
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
    openapiFields.add("sections");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IssuePickerSuggestions
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IssuePickerSuggestions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssuePickerSuggestions is not found in the empty JSON string", IssuePickerSuggestions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IssuePickerSuggestions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IssuePickerSuggestions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("sections") != null && !jsonObj.get("sections").isJsonNull()) {
        JsonArray jsonArraysections = jsonObj.getAsJsonArray("sections");
        if (jsonArraysections != null) {
          // ensure the json data is an array
          if (!jsonObj.get("sections").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `sections` to be an array in the JSON string but got `%s`", jsonObj.get("sections").toString()));
          }

          // validate the optional field `sections` (array)
          for (int i = 0; i < jsonArraysections.size(); i++) {
            IssuePickerSuggestionsIssueType.validateJsonElement(jsonArraysections.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IssuePickerSuggestions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssuePickerSuggestions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssuePickerSuggestions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssuePickerSuggestions.class));

       return (TypeAdapter<T>) new TypeAdapter<IssuePickerSuggestions>() {
           @Override
           public void write(JsonWriter out, IssuePickerSuggestions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IssuePickerSuggestions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IssuePickerSuggestions given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IssuePickerSuggestions
   * @throws IOException if the JSON string is invalid with respect to IssuePickerSuggestions
   */
  public static IssuePickerSuggestions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssuePickerSuggestions.class);
  }

  /**
   * Convert an instance of IssuePickerSuggestions to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

