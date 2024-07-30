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
import org.openapitools.client.model.FieldConfigurationScheme;

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
 * Project list with assigned field configuration schema.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class FieldConfigurationSchemeProjects {
  public static final String SERIALIZED_NAME_FIELD_CONFIGURATION_SCHEME = "fieldConfigurationScheme";
  @SerializedName(SERIALIZED_NAME_FIELD_CONFIGURATION_SCHEME)
  private FieldConfigurationScheme fieldConfigurationScheme;

  public static final String SERIALIZED_NAME_PROJECT_IDS = "projectIds";
  @SerializedName(SERIALIZED_NAME_PROJECT_IDS)
  private List<String> projectIds = new ArrayList<>();

  public FieldConfigurationSchemeProjects() {
  }

  public FieldConfigurationSchemeProjects fieldConfigurationScheme(FieldConfigurationScheme fieldConfigurationScheme) {
    this.fieldConfigurationScheme = fieldConfigurationScheme;
    return this;
  }

  /**
   * Get fieldConfigurationScheme
   * @return fieldConfigurationScheme
   */
  @javax.annotation.Nullable
  public FieldConfigurationScheme getFieldConfigurationScheme() {
    return fieldConfigurationScheme;
  }

  public void setFieldConfigurationScheme(FieldConfigurationScheme fieldConfigurationScheme) {
    this.fieldConfigurationScheme = fieldConfigurationScheme;
  }


  public FieldConfigurationSchemeProjects projectIds(List<String> projectIds) {
    this.projectIds = projectIds;
    return this;
  }

  public FieldConfigurationSchemeProjects addProjectIdsItem(String projectIdsItem) {
    if (this.projectIds == null) {
      this.projectIds = new ArrayList<>();
    }
    this.projectIds.add(projectIdsItem);
    return this;
  }

  /**
   * The IDs of projects using the field configuration scheme.
   * @return projectIds
   */
  @javax.annotation.Nonnull
  public List<String> getProjectIds() {
    return projectIds;
  }

  public void setProjectIds(List<String> projectIds) {
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
    FieldConfigurationSchemeProjects fieldConfigurationSchemeProjects = (FieldConfigurationSchemeProjects) o;
    return Objects.equals(this.fieldConfigurationScheme, fieldConfigurationSchemeProjects.fieldConfigurationScheme) &&
        Objects.equals(this.projectIds, fieldConfigurationSchemeProjects.projectIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldConfigurationScheme, projectIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldConfigurationSchemeProjects {\n");
    sb.append("    fieldConfigurationScheme: ").append(toIndentedString(fieldConfigurationScheme)).append("\n");
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
    openapiFields.add("fieldConfigurationScheme");
    openapiFields.add("projectIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("projectIds");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FieldConfigurationSchemeProjects
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FieldConfigurationSchemeProjects.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FieldConfigurationSchemeProjects is not found in the empty JSON string", FieldConfigurationSchemeProjects.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FieldConfigurationSchemeProjects.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FieldConfigurationSchemeProjects` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FieldConfigurationSchemeProjects.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `fieldConfigurationScheme`
      if (jsonObj.get("fieldConfigurationScheme") != null && !jsonObj.get("fieldConfigurationScheme").isJsonNull()) {
        FieldConfigurationScheme.validateJsonElement(jsonObj.get("fieldConfigurationScheme"));
      }
      // ensure the required json array is present
      if (jsonObj.get("projectIds") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("projectIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectIds` to be an array in the JSON string but got `%s`", jsonObj.get("projectIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FieldConfigurationSchemeProjects.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FieldConfigurationSchemeProjects' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FieldConfigurationSchemeProjects> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FieldConfigurationSchemeProjects.class));

       return (TypeAdapter<T>) new TypeAdapter<FieldConfigurationSchemeProjects>() {
           @Override
           public void write(JsonWriter out, FieldConfigurationSchemeProjects value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FieldConfigurationSchemeProjects read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FieldConfigurationSchemeProjects given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FieldConfigurationSchemeProjects
   * @throws IOException if the JSON string is invalid with respect to FieldConfigurationSchemeProjects
   */
  public static FieldConfigurationSchemeProjects fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FieldConfigurationSchemeProjects.class);
  }

  /**
   * Convert an instance of FieldConfigurationSchemeProjects to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

