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
import org.openapitools.client.model.DocumentVersion;
import org.openapitools.client.model.SimpleUsage;

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
 * Workflow metadata and usage detail.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class WorkflowMetadataRestModel {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_USAGE = "usage";
  @SerializedName(SERIALIZED_NAME_USAGE)
  private List<SimpleUsage> usage = new ArrayList<>();

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private DocumentVersion version;

  public WorkflowMetadataRestModel() {
  }

  public WorkflowMetadataRestModel description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the workflow.
   * @return description
   */
  @javax.annotation.Nonnull
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public WorkflowMetadataRestModel id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the workflow.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public WorkflowMetadataRestModel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the workflow.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public WorkflowMetadataRestModel usage(List<SimpleUsage> usage) {
    this.usage = usage;
    return this;
  }

  public WorkflowMetadataRestModel addUsageItem(SimpleUsage usageItem) {
    if (this.usage == null) {
      this.usage = new ArrayList<>();
    }
    this.usage.add(usageItem);
    return this;
  }

  /**
   * Use the optional &#x60;workflows.usages&#x60; expand to get additional information about the projects and issue types associated with the workflows in the workflow scheme.
   * @return usage
   */
  @javax.annotation.Nonnull
  public List<SimpleUsage> getUsage() {
    return usage;
  }

  public void setUsage(List<SimpleUsage> usage) {
    this.usage = usage;
  }


  public WorkflowMetadataRestModel version(DocumentVersion version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @javax.annotation.Nonnull
  public DocumentVersion getVersion() {
    return version;
  }

  public void setVersion(DocumentVersion version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowMetadataRestModel workflowMetadataRestModel = (WorkflowMetadataRestModel) o;
    return Objects.equals(this.description, workflowMetadataRestModel.description) &&
        Objects.equals(this.id, workflowMetadataRestModel.id) &&
        Objects.equals(this.name, workflowMetadataRestModel.name) &&
        Objects.equals(this.usage, workflowMetadataRestModel.usage) &&
        Objects.equals(this.version, workflowMetadataRestModel.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, name, usage, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowMetadataRestModel {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("usage");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("usage");
    openapiRequiredFields.add("version");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WorkflowMetadataRestModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WorkflowMetadataRestModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkflowMetadataRestModel is not found in the empty JSON string", WorkflowMetadataRestModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WorkflowMetadataRestModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkflowMetadataRestModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WorkflowMetadataRestModel.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("usage").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `usage` to be an array in the JSON string but got `%s`", jsonObj.get("usage").toString()));
      }

      JsonArray jsonArrayusage = jsonObj.getAsJsonArray("usage");
      // validate the required field `usage` (array)
      for (int i = 0; i < jsonArrayusage.size(); i++) {
        SimpleUsage.validateJsonElement(jsonArrayusage.get(i));
      };
      // validate the required field `version`
      DocumentVersion.validateJsonElement(jsonObj.get("version"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkflowMetadataRestModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkflowMetadataRestModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkflowMetadataRestModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkflowMetadataRestModel.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkflowMetadataRestModel>() {
           @Override
           public void write(JsonWriter out, WorkflowMetadataRestModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkflowMetadataRestModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WorkflowMetadataRestModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WorkflowMetadataRestModel
   * @throws IOException if the JSON string is invalid with respect to WorkflowMetadataRestModel
   */
  public static WorkflowMetadataRestModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkflowMetadataRestModel.class);
  }

  /**
   * Convert an instance of WorkflowMetadataRestModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
