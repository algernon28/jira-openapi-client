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
import org.openapitools.client.model.ProjectWithDataPolicy;

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
 * Details about data policies for a list of projects.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class ProjectDataPolicies {
  public static final String SERIALIZED_NAME_PROJECT_DATA_POLICIES = "projectDataPolicies";
  @SerializedName(SERIALIZED_NAME_PROJECT_DATA_POLICIES)
  private List<ProjectWithDataPolicy> projectDataPolicies = new ArrayList<>();

  public ProjectDataPolicies() {
  }

  public ProjectDataPolicies(
     List<ProjectWithDataPolicy> projectDataPolicies
  ) {
    this();
    this.projectDataPolicies = projectDataPolicies;
  }

  /**
   * List of projects with data policies.
   * @return projectDataPolicies
   */
  @javax.annotation.Nullable
  public List<ProjectWithDataPolicy> getProjectDataPolicies() {
    return projectDataPolicies;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectDataPolicies projectDataPolicies = (ProjectDataPolicies) o;
    return Objects.equals(this.projectDataPolicies, projectDataPolicies.projectDataPolicies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectDataPolicies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectDataPolicies {\n");
    sb.append("    projectDataPolicies: ").append(toIndentedString(projectDataPolicies)).append("\n");
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
    openapiFields.add("projectDataPolicies");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProjectDataPolicies
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProjectDataPolicies.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectDataPolicies is not found in the empty JSON string", ProjectDataPolicies.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProjectDataPolicies.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProjectDataPolicies` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("projectDataPolicies") != null && !jsonObj.get("projectDataPolicies").isJsonNull()) {
        JsonArray jsonArrayprojectDataPolicies = jsonObj.getAsJsonArray("projectDataPolicies");
        if (jsonArrayprojectDataPolicies != null) {
          // ensure the json data is an array
          if (!jsonObj.get("projectDataPolicies").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `projectDataPolicies` to be an array in the JSON string but got `%s`", jsonObj.get("projectDataPolicies").toString()));
          }

          // validate the optional field `projectDataPolicies` (array)
          for (int i = 0; i < jsonArrayprojectDataPolicies.size(); i++) {
            ProjectWithDataPolicy.validateJsonElement(jsonArrayprojectDataPolicies.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectDataPolicies.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectDataPolicies' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectDataPolicies> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectDataPolicies.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectDataPolicies>() {
           @Override
           public void write(JsonWriter out, ProjectDataPolicies value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectDataPolicies read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ProjectDataPolicies given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProjectDataPolicies
   * @throws IOException if the JSON string is invalid with respect to ProjectDataPolicies
   */
  public static ProjectDataPolicies fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectDataPolicies.class);
  }

  /**
   * Convert an instance of ProjectDataPolicies to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

