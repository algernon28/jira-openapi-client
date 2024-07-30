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
import org.openapitools.client.model.TimeTrackingConfiguration;

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
 * Details about the configuration of Jira.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class ModelConfiguration {
  public static final String SERIALIZED_NAME_ATTACHMENTS_ENABLED = "attachmentsEnabled";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS_ENABLED)
  private Boolean attachmentsEnabled;

  public static final String SERIALIZED_NAME_ISSUE_LINKING_ENABLED = "issueLinkingEnabled";
  @SerializedName(SERIALIZED_NAME_ISSUE_LINKING_ENABLED)
  private Boolean issueLinkingEnabled;

  public static final String SERIALIZED_NAME_SUB_TASKS_ENABLED = "subTasksEnabled";
  @SerializedName(SERIALIZED_NAME_SUB_TASKS_ENABLED)
  private Boolean subTasksEnabled;

  public static final String SERIALIZED_NAME_TIME_TRACKING_CONFIGURATION = "timeTrackingConfiguration";
  @SerializedName(SERIALIZED_NAME_TIME_TRACKING_CONFIGURATION)
  private TimeTrackingConfiguration timeTrackingConfiguration;

  public static final String SERIALIZED_NAME_TIME_TRACKING_ENABLED = "timeTrackingEnabled";
  @SerializedName(SERIALIZED_NAME_TIME_TRACKING_ENABLED)
  private Boolean timeTrackingEnabled;

  public static final String SERIALIZED_NAME_UNASSIGNED_ISSUES_ALLOWED = "unassignedIssuesAllowed";
  @SerializedName(SERIALIZED_NAME_UNASSIGNED_ISSUES_ALLOWED)
  private Boolean unassignedIssuesAllowed;

  public static final String SERIALIZED_NAME_VOTING_ENABLED = "votingEnabled";
  @SerializedName(SERIALIZED_NAME_VOTING_ENABLED)
  private Boolean votingEnabled;

  public static final String SERIALIZED_NAME_WATCHING_ENABLED = "watchingEnabled";
  @SerializedName(SERIALIZED_NAME_WATCHING_ENABLED)
  private Boolean watchingEnabled;

  public ModelConfiguration() {
  }

  public ModelConfiguration(
     Boolean attachmentsEnabled, 
     Boolean issueLinkingEnabled, 
     Boolean subTasksEnabled, 
     TimeTrackingConfiguration timeTrackingConfiguration, 
     Boolean timeTrackingEnabled, 
     Boolean unassignedIssuesAllowed, 
     Boolean votingEnabled, 
     Boolean watchingEnabled
  ) {
    this();
    this.attachmentsEnabled = attachmentsEnabled;
    this.issueLinkingEnabled = issueLinkingEnabled;
    this.subTasksEnabled = subTasksEnabled;
    this.timeTrackingConfiguration = timeTrackingConfiguration;
    this.timeTrackingEnabled = timeTrackingEnabled;
    this.unassignedIssuesAllowed = unassignedIssuesAllowed;
    this.votingEnabled = votingEnabled;
    this.watchingEnabled = watchingEnabled;
  }

  /**
   * Whether the ability to add attachments to issues is enabled.
   * @return attachmentsEnabled
   */
  @javax.annotation.Nullable
  public Boolean getAttachmentsEnabled() {
    return attachmentsEnabled;
  }



  /**
   * Whether the ability to link issues is enabled.
   * @return issueLinkingEnabled
   */
  @javax.annotation.Nullable
  public Boolean getIssueLinkingEnabled() {
    return issueLinkingEnabled;
  }



  /**
   * Whether the ability to create subtasks for issues is enabled.
   * @return subTasksEnabled
   */
  @javax.annotation.Nullable
  public Boolean getSubTasksEnabled() {
    return subTasksEnabled;
  }



  /**
   * The configuration of time tracking.
   * @return timeTrackingConfiguration
   */
  @javax.annotation.Nullable
  public TimeTrackingConfiguration getTimeTrackingConfiguration() {
    return timeTrackingConfiguration;
  }



  /**
   * Whether the ability to track time is enabled. This property is deprecated.
   * @return timeTrackingEnabled
   */
  @javax.annotation.Nullable
  public Boolean getTimeTrackingEnabled() {
    return timeTrackingEnabled;
  }



  /**
   * Whether the ability to create unassigned issues is enabled. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.
   * @return unassignedIssuesAllowed
   */
  @javax.annotation.Nullable
  public Boolean getUnassignedIssuesAllowed() {
    return unassignedIssuesAllowed;
  }



  /**
   * Whether the ability for users to vote on issues is enabled. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.
   * @return votingEnabled
   */
  @javax.annotation.Nullable
  public Boolean getVotingEnabled() {
    return votingEnabled;
  }



  /**
   * Whether the ability for users to watch issues is enabled. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.
   * @return watchingEnabled
   */
  @javax.annotation.Nullable
  public Boolean getWatchingEnabled() {
    return watchingEnabled;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelConfiguration _configuration = (ModelConfiguration) o;
    return Objects.equals(this.attachmentsEnabled, _configuration.attachmentsEnabled) &&
        Objects.equals(this.issueLinkingEnabled, _configuration.issueLinkingEnabled) &&
        Objects.equals(this.subTasksEnabled, _configuration.subTasksEnabled) &&
        Objects.equals(this.timeTrackingConfiguration, _configuration.timeTrackingConfiguration) &&
        Objects.equals(this.timeTrackingEnabled, _configuration.timeTrackingEnabled) &&
        Objects.equals(this.unassignedIssuesAllowed, _configuration.unassignedIssuesAllowed) &&
        Objects.equals(this.votingEnabled, _configuration.votingEnabled) &&
        Objects.equals(this.watchingEnabled, _configuration.watchingEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachmentsEnabled, issueLinkingEnabled, subTasksEnabled, timeTrackingConfiguration, timeTrackingEnabled, unassignedIssuesAllowed, votingEnabled, watchingEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelConfiguration {\n");
    sb.append("    attachmentsEnabled: ").append(toIndentedString(attachmentsEnabled)).append("\n");
    sb.append("    issueLinkingEnabled: ").append(toIndentedString(issueLinkingEnabled)).append("\n");
    sb.append("    subTasksEnabled: ").append(toIndentedString(subTasksEnabled)).append("\n");
    sb.append("    timeTrackingConfiguration: ").append(toIndentedString(timeTrackingConfiguration)).append("\n");
    sb.append("    timeTrackingEnabled: ").append(toIndentedString(timeTrackingEnabled)).append("\n");
    sb.append("    unassignedIssuesAllowed: ").append(toIndentedString(unassignedIssuesAllowed)).append("\n");
    sb.append("    votingEnabled: ").append(toIndentedString(votingEnabled)).append("\n");
    sb.append("    watchingEnabled: ").append(toIndentedString(watchingEnabled)).append("\n");
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
    openapiFields.add("attachmentsEnabled");
    openapiFields.add("issueLinkingEnabled");
    openapiFields.add("subTasksEnabled");
    openapiFields.add("timeTrackingConfiguration");
    openapiFields.add("timeTrackingEnabled");
    openapiFields.add("unassignedIssuesAllowed");
    openapiFields.add("votingEnabled");
    openapiFields.add("watchingEnabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ModelConfiguration
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModelConfiguration.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelConfiguration is not found in the empty JSON string", ModelConfiguration.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModelConfiguration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelConfiguration` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `timeTrackingConfiguration`
      if (jsonObj.get("timeTrackingConfiguration") != null && !jsonObj.get("timeTrackingConfiguration").isJsonNull()) {
        TimeTrackingConfiguration.validateJsonElement(jsonObj.get("timeTrackingConfiguration"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelConfiguration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelConfiguration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelConfiguration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelConfiguration.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelConfiguration>() {
           @Override
           public void write(JsonWriter out, ModelConfiguration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelConfiguration read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ModelConfiguration given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ModelConfiguration
   * @throws IOException if the JSON string is invalid with respect to ModelConfiguration
   */
  public static ModelConfiguration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelConfiguration.class);
  }

  /**
   * Convert an instance of ModelConfiguration to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
