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
 * The workflows that use this status. Only available if the &#x60;workflowUsages&#x60; expand is requested.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class WorkflowUsages {
  public static final String SERIALIZED_NAME_WORKFLOW_ID = "workflowId";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_ID)
  private String workflowId;

  public static final String SERIALIZED_NAME_WORKFLOW_NAME = "workflowName";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_NAME)
  private String workflowName;

  public WorkflowUsages() {
  }

  public WorkflowUsages workflowId(String workflowId) {
    this.workflowId = workflowId;
    return this;
  }

  /**
   * Workflow ID.
   * @return workflowId
   */
  @javax.annotation.Nullable
  public String getWorkflowId() {
    return workflowId;
  }

  public void setWorkflowId(String workflowId) {
    this.workflowId = workflowId;
  }


  public WorkflowUsages workflowName(String workflowName) {
    this.workflowName = workflowName;
    return this;
  }

  /**
   * Workflow name.
   * @return workflowName
   */
  @javax.annotation.Nullable
  public String getWorkflowName() {
    return workflowName;
  }

  public void setWorkflowName(String workflowName) {
    this.workflowName = workflowName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowUsages workflowUsages = (WorkflowUsages) o;
    return Objects.equals(this.workflowId, workflowUsages.workflowId) &&
        Objects.equals(this.workflowName, workflowUsages.workflowName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflowId, workflowName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowUsages {\n");
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
    sb.append("    workflowName: ").append(toIndentedString(workflowName)).append("\n");
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
    openapiFields.add("workflowId");
    openapiFields.add("workflowName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WorkflowUsages
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WorkflowUsages.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkflowUsages is not found in the empty JSON string", WorkflowUsages.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WorkflowUsages.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkflowUsages` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("workflowId") != null && !jsonObj.get("workflowId").isJsonNull()) && !jsonObj.get("workflowId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workflowId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workflowId").toString()));
      }
      if ((jsonObj.get("workflowName") != null && !jsonObj.get("workflowName").isJsonNull()) && !jsonObj.get("workflowName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workflowName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workflowName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkflowUsages.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkflowUsages' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkflowUsages> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkflowUsages.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkflowUsages>() {
           @Override
           public void write(JsonWriter out, WorkflowUsages value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkflowUsages read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WorkflowUsages given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WorkflowUsages
   * @throws IOException if the JSON string is invalid with respect to WorkflowUsages
   */
  public static WorkflowUsages fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkflowUsages.class);
  }

  /**
   * Convert an instance of WorkflowUsages to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

