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
import org.openapitools.client.model.WorkflowAssociationStatusMapping;

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
 * The status mappings by workflows. Status mappings are required when the new workflow for an issue type doesn&#39;t contain all statuses that the old workflow has. Status mappings can be provided by a combination of &#x60;statusMappingsByWorkflows&#x60; and &#x60;statusMappingsByIssueTypeOverride&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class MappingsByWorkflow {
  public static final String SERIALIZED_NAME_NEW_WORKFLOW_ID = "newWorkflowId";
  @SerializedName(SERIALIZED_NAME_NEW_WORKFLOW_ID)
  private String newWorkflowId;

  public static final String SERIALIZED_NAME_OLD_WORKFLOW_ID = "oldWorkflowId";
  @SerializedName(SERIALIZED_NAME_OLD_WORKFLOW_ID)
  private String oldWorkflowId;

  public static final String SERIALIZED_NAME_STATUS_MAPPINGS = "statusMappings";
  @SerializedName(SERIALIZED_NAME_STATUS_MAPPINGS)
  private List<WorkflowAssociationStatusMapping> statusMappings = new ArrayList<>();

  public MappingsByWorkflow() {
  }

  public MappingsByWorkflow newWorkflowId(String newWorkflowId) {
    this.newWorkflowId = newWorkflowId;
    return this;
  }

  /**
   * The ID of the new workflow.
   * @return newWorkflowId
   */
  @javax.annotation.Nonnull
  public String getNewWorkflowId() {
    return newWorkflowId;
  }

  public void setNewWorkflowId(String newWorkflowId) {
    this.newWorkflowId = newWorkflowId;
  }


  public MappingsByWorkflow oldWorkflowId(String oldWorkflowId) {
    this.oldWorkflowId = oldWorkflowId;
    return this;
  }

  /**
   * The ID of the old workflow.
   * @return oldWorkflowId
   */
  @javax.annotation.Nonnull
  public String getOldWorkflowId() {
    return oldWorkflowId;
  }

  public void setOldWorkflowId(String oldWorkflowId) {
    this.oldWorkflowId = oldWorkflowId;
  }


  public MappingsByWorkflow statusMappings(List<WorkflowAssociationStatusMapping> statusMappings) {
    this.statusMappings = statusMappings;
    return this;
  }

  public MappingsByWorkflow addStatusMappingsItem(WorkflowAssociationStatusMapping statusMappingsItem) {
    if (this.statusMappings == null) {
      this.statusMappings = new ArrayList<>();
    }
    this.statusMappings.add(statusMappingsItem);
    return this;
  }

  /**
   * The list of status mappings.
   * @return statusMappings
   */
  @javax.annotation.Nonnull
  public List<WorkflowAssociationStatusMapping> getStatusMappings() {
    return statusMappings;
  }

  public void setStatusMappings(List<WorkflowAssociationStatusMapping> statusMappings) {
    this.statusMappings = statusMappings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MappingsByWorkflow mappingsByWorkflow = (MappingsByWorkflow) o;
    return Objects.equals(this.newWorkflowId, mappingsByWorkflow.newWorkflowId) &&
        Objects.equals(this.oldWorkflowId, mappingsByWorkflow.oldWorkflowId) &&
        Objects.equals(this.statusMappings, mappingsByWorkflow.statusMappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newWorkflowId, oldWorkflowId, statusMappings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MappingsByWorkflow {\n");
    sb.append("    newWorkflowId: ").append(toIndentedString(newWorkflowId)).append("\n");
    sb.append("    oldWorkflowId: ").append(toIndentedString(oldWorkflowId)).append("\n");
    sb.append("    statusMappings: ").append(toIndentedString(statusMappings)).append("\n");
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
    openapiFields.add("newWorkflowId");
    openapiFields.add("oldWorkflowId");
    openapiFields.add("statusMappings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("newWorkflowId");
    openapiRequiredFields.add("oldWorkflowId");
    openapiRequiredFields.add("statusMappings");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MappingsByWorkflow
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MappingsByWorkflow.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MappingsByWorkflow is not found in the empty JSON string", MappingsByWorkflow.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MappingsByWorkflow.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MappingsByWorkflow` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MappingsByWorkflow.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("newWorkflowId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `newWorkflowId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("newWorkflowId").toString()));
      }
      if (!jsonObj.get("oldWorkflowId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oldWorkflowId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oldWorkflowId").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("statusMappings").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `statusMappings` to be an array in the JSON string but got `%s`", jsonObj.get("statusMappings").toString()));
      }

      JsonArray jsonArraystatusMappings = jsonObj.getAsJsonArray("statusMappings");
      // validate the required field `statusMappings` (array)
      for (int i = 0; i < jsonArraystatusMappings.size(); i++) {
        WorkflowAssociationStatusMapping.validateJsonElement(jsonArraystatusMappings.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MappingsByWorkflow.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MappingsByWorkflow' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MappingsByWorkflow> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MappingsByWorkflow.class));

       return (TypeAdapter<T>) new TypeAdapter<MappingsByWorkflow>() {
           @Override
           public void write(JsonWriter out, MappingsByWorkflow value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MappingsByWorkflow read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MappingsByWorkflow given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MappingsByWorkflow
   * @throws IOException if the JSON string is invalid with respect to MappingsByWorkflow
   */
  public static MappingsByWorkflow fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MappingsByWorkflow.class);
  }

  /**
   * Convert an instance of MappingsByWorkflow to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
