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
import java.time.OffsetDateTime;
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
 * The response for status request for a running/completed export task.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class ExportArchivedIssuesTaskProgressResponse {
  public static final String SERIALIZED_NAME_FILE_URL = "fileUrl";
  @SerializedName(SERIALIZED_NAME_FILE_URL)
  private String fileUrl;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private String payload;

  public static final String SERIALIZED_NAME_PROGRESS = "progress";
  @SerializedName(SERIALIZED_NAME_PROGRESS)
  private Long progress;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_SUBMITTED_TIME = "submittedTime";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_TIME)
  private OffsetDateTime submittedTime;

  public static final String SERIALIZED_NAME_TASK_ID = "taskId";
  @SerializedName(SERIALIZED_NAME_TASK_ID)
  private String taskId;

  public ExportArchivedIssuesTaskProgressResponse() {
  }

  public ExportArchivedIssuesTaskProgressResponse fileUrl(String fileUrl) {
    this.fileUrl = fileUrl;
    return this;
  }

  /**
   * Get fileUrl
   * @return fileUrl
   */
  @javax.annotation.Nullable
  public String getFileUrl() {
    return fileUrl;
  }

  public void setFileUrl(String fileUrl) {
    this.fileUrl = fileUrl;
  }


  public ExportArchivedIssuesTaskProgressResponse payload(String payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Get payload
   * @return payload
   */
  @javax.annotation.Nullable
  public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }


  public ExportArchivedIssuesTaskProgressResponse progress(Long progress) {
    this.progress = progress;
    return this;
  }

  /**
   * Get progress
   * @return progress
   */
  @javax.annotation.Nullable
  public Long getProgress() {
    return progress;
  }

  public void setProgress(Long progress) {
    this.progress = progress;
  }


  public ExportArchivedIssuesTaskProgressResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public ExportArchivedIssuesTaskProgressResponse submittedTime(OffsetDateTime submittedTime) {
    this.submittedTime = submittedTime;
    return this;
  }

  /**
   * Get submittedTime
   * @return submittedTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getSubmittedTime() {
    return submittedTime;
  }

  public void setSubmittedTime(OffsetDateTime submittedTime) {
    this.submittedTime = submittedTime;
  }


  public ExportArchivedIssuesTaskProgressResponse taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * Get taskId
   * @return taskId
   */
  @javax.annotation.Nullable
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportArchivedIssuesTaskProgressResponse exportArchivedIssuesTaskProgressResponse = (ExportArchivedIssuesTaskProgressResponse) o;
    return Objects.equals(this.fileUrl, exportArchivedIssuesTaskProgressResponse.fileUrl) &&
        Objects.equals(this.payload, exportArchivedIssuesTaskProgressResponse.payload) &&
        Objects.equals(this.progress, exportArchivedIssuesTaskProgressResponse.progress) &&
        Objects.equals(this.status, exportArchivedIssuesTaskProgressResponse.status) &&
        Objects.equals(this.submittedTime, exportArchivedIssuesTaskProgressResponse.submittedTime) &&
        Objects.equals(this.taskId, exportArchivedIssuesTaskProgressResponse.taskId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileUrl, payload, progress, status, submittedTime, taskId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportArchivedIssuesTaskProgressResponse {\n");
    sb.append("    fileUrl: ").append(toIndentedString(fileUrl)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    submittedTime: ").append(toIndentedString(submittedTime)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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
    openapiFields.add("fileUrl");
    openapiFields.add("payload");
    openapiFields.add("progress");
    openapiFields.add("status");
    openapiFields.add("submittedTime");
    openapiFields.add("taskId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ExportArchivedIssuesTaskProgressResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExportArchivedIssuesTaskProgressResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExportArchivedIssuesTaskProgressResponse is not found in the empty JSON string", ExportArchivedIssuesTaskProgressResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ExportArchivedIssuesTaskProgressResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExportArchivedIssuesTaskProgressResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("fileUrl") != null && !jsonObj.get("fileUrl").isJsonNull()) && !jsonObj.get("fileUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fileUrl").toString()));
      }
      if ((jsonObj.get("payload") != null && !jsonObj.get("payload").isJsonNull()) && !jsonObj.get("payload").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payload` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payload").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("taskId") != null && !jsonObj.get("taskId").isJsonNull()) && !jsonObj.get("taskId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taskId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taskId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExportArchivedIssuesTaskProgressResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExportArchivedIssuesTaskProgressResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExportArchivedIssuesTaskProgressResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExportArchivedIssuesTaskProgressResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ExportArchivedIssuesTaskProgressResponse>() {
           @Override
           public void write(JsonWriter out, ExportArchivedIssuesTaskProgressResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExportArchivedIssuesTaskProgressResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ExportArchivedIssuesTaskProgressResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ExportArchivedIssuesTaskProgressResponse
   * @throws IOException if the JSON string is invalid with respect to ExportArchivedIssuesTaskProgressResponse
   */
  public static ExportArchivedIssuesTaskProgressResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExportArchivedIssuesTaskProgressResponse.class);
  }

  /**
   * Convert an instance of ExportArchivedIssuesTaskProgressResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

