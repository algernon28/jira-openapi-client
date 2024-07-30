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
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.client.model.JiraWorkflow;
import org.openapitools.client.model.JiraWorkflowStatus;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * WorkflowUpdateResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class WorkflowUpdateResponse {
  public static final String SERIALIZED_NAME_STATUSES = "statuses";
  @SerializedName(SERIALIZED_NAME_STATUSES)
  private Set<JiraWorkflowStatus> statuses = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_TASK_ID = "taskId";
  @SerializedName(SERIALIZED_NAME_TASK_ID)
  private String taskId;

  public static final String SERIALIZED_NAME_WORKFLOWS = "workflows";
  @SerializedName(SERIALIZED_NAME_WORKFLOWS)
  private Set<JiraWorkflow> workflows = new LinkedHashSet<>();

  public WorkflowUpdateResponse() {
  }

  public WorkflowUpdateResponse statuses(Set<JiraWorkflowStatus> statuses) {
    this.statuses = statuses;
    return this;
  }

  public WorkflowUpdateResponse addStatusesItem(JiraWorkflowStatus statusesItem) {
    if (this.statuses == null) {
      this.statuses = new LinkedHashSet<>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

  /**
   * List of updated statuses.
   * @return statuses
   */
  @javax.annotation.Nullable
  public Set<JiraWorkflowStatus> getStatuses() {
    return statuses;
  }

  public void setStatuses(Set<JiraWorkflowStatus> statuses) {
    this.statuses = statuses;
  }


  public WorkflowUpdateResponse taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * If there is a [asynchronous task](#async-operations) operation, as a result of this update.
   * @return taskId
   */
  @javax.annotation.Nullable
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }


  public WorkflowUpdateResponse workflows(Set<JiraWorkflow> workflows) {
    this.workflows = workflows;
    return this;
  }

  public WorkflowUpdateResponse addWorkflowsItem(JiraWorkflow workflowsItem) {
    if (this.workflows == null) {
      this.workflows = new LinkedHashSet<>();
    }
    this.workflows.add(workflowsItem);
    return this;
  }

  /**
   * List of updated workflows.
   * @return workflows
   */
  @javax.annotation.Nullable
  public Set<JiraWorkflow> getWorkflows() {
    return workflows;
  }

  public void setWorkflows(Set<JiraWorkflow> workflows) {
    this.workflows = workflows;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowUpdateResponse workflowUpdateResponse = (WorkflowUpdateResponse) o;
    return Objects.equals(this.statuses, workflowUpdateResponse.statuses) &&
        Objects.equals(this.taskId, workflowUpdateResponse.taskId) &&
        Objects.equals(this.workflows, workflowUpdateResponse.workflows);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(statuses, taskId, workflows);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowUpdateResponse {\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    workflows: ").append(toIndentedString(workflows)).append("\n");
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
    openapiFields.add("statuses");
    openapiFields.add("taskId");
    openapiFields.add("workflows");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WorkflowUpdateResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WorkflowUpdateResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkflowUpdateResponse is not found in the empty JSON string", WorkflowUpdateResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WorkflowUpdateResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkflowUpdateResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("statuses") != null && !jsonObj.get("statuses").isJsonNull()) {
        JsonArray jsonArraystatuses = jsonObj.getAsJsonArray("statuses");
        if (jsonArraystatuses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("statuses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `statuses` to be an array in the JSON string but got `%s`", jsonObj.get("statuses").toString()));
          }

          // validate the optional field `statuses` (array)
          for (int i = 0; i < jsonArraystatuses.size(); i++) {
            JiraWorkflowStatus.validateJsonElement(jsonArraystatuses.get(i));
          };
        }
      }
      if ((jsonObj.get("taskId") != null && !jsonObj.get("taskId").isJsonNull()) && !jsonObj.get("taskId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taskId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taskId").toString()));
      }
      if (jsonObj.get("workflows") != null && !jsonObj.get("workflows").isJsonNull()) {
        JsonArray jsonArrayworkflows = jsonObj.getAsJsonArray("workflows");
        if (jsonArrayworkflows != null) {
          // ensure the json data is an array
          if (!jsonObj.get("workflows").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `workflows` to be an array in the JSON string but got `%s`", jsonObj.get("workflows").toString()));
          }

          // validate the optional field `workflows` (array)
          for (int i = 0; i < jsonArrayworkflows.size(); i++) {
            JiraWorkflow.validateJsonElement(jsonArrayworkflows.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkflowUpdateResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkflowUpdateResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkflowUpdateResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkflowUpdateResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkflowUpdateResponse>() {
           @Override
           public void write(JsonWriter out, WorkflowUpdateResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkflowUpdateResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WorkflowUpdateResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WorkflowUpdateResponse
   * @throws IOException if the JSON string is invalid with respect to WorkflowUpdateResponse
   */
  public static WorkflowUpdateResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkflowUpdateResponse.class);
  }

  /**
   * Convert an instance of WorkflowUpdateResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

