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
import java.net.URI;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.SimpleLink;
import org.openapitools.client.model.VersionApprover;
import org.openapitools.client.model.VersionIssuesStatus;

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
 * Details about a project version.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class Version {
  public static final String SERIALIZED_NAME_APPROVERS = "approvers";
  @SerializedName(SERIALIZED_NAME_APPROVERS)
  private List<VersionApprover> approvers = new ArrayList<>();

  public static final String SERIALIZED_NAME_ARCHIVED = "archived";
  @SerializedName(SERIALIZED_NAME_ARCHIVED)
  private Boolean archived;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DRIVER = "driver";
  @SerializedName(SERIALIZED_NAME_DRIVER)
  private String driver;

  public static final String SERIALIZED_NAME_EXPAND = "expand";
  @SerializedName(SERIALIZED_NAME_EXPAND)
  private String expand;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ISSUES_STATUS_FOR_FIX_VERSION = "issuesStatusForFixVersion";
  @SerializedName(SERIALIZED_NAME_ISSUES_STATUS_FOR_FIX_VERSION)
  private VersionIssuesStatus issuesStatusForFixVersion;

  public static final String SERIALIZED_NAME_MOVE_UNFIXED_ISSUES_TO = "moveUnfixedIssuesTo";
  @SerializedName(SERIALIZED_NAME_MOVE_UNFIXED_ISSUES_TO)
  private URI moveUnfixedIssuesTo;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OPERATIONS = "operations";
  @SerializedName(SERIALIZED_NAME_OPERATIONS)
  private List<SimpleLink> operations = new ArrayList<>();

  public static final String SERIALIZED_NAME_OVERDUE = "overdue";
  @SerializedName(SERIALIZED_NAME_OVERDUE)
  private Boolean overdue;

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private String project;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private Long projectId;

  public static final String SERIALIZED_NAME_RELEASE_DATE = "releaseDate";
  @SerializedName(SERIALIZED_NAME_RELEASE_DATE)
  private LocalDate releaseDate;

  public static final String SERIALIZED_NAME_RELEASED = "released";
  @SerializedName(SERIALIZED_NAME_RELEASED)
  private Boolean released;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private URI self;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_USER_RELEASE_DATE = "userReleaseDate";
  @SerializedName(SERIALIZED_NAME_USER_RELEASE_DATE)
  private String userReleaseDate;

  public static final String SERIALIZED_NAME_USER_START_DATE = "userStartDate";
  @SerializedName(SERIALIZED_NAME_USER_START_DATE)
  private String userStartDate;

  public Version() {
  }

  public Version(
     List<VersionApprover> approvers, 
     String driver, 
     String id, 
     VersionIssuesStatus issuesStatusForFixVersion, 
     List<SimpleLink> operations, 
     Boolean overdue, 
     URI self, 
     String userReleaseDate, 
     String userStartDate
  ) {
    this();
    this.approvers = approvers;
    this.driver = driver;
    this.id = id;
    this.issuesStatusForFixVersion = issuesStatusForFixVersion;
    this.operations = operations;
    this.overdue = overdue;
    this.self = self;
    this.userReleaseDate = userReleaseDate;
    this.userStartDate = userStartDate;
  }

  /**
   * If the expand option &#x60;approvers&#x60; is used, returns a list containing the approvers for this version.
   * @return approvers
   */
  @javax.annotation.Nullable
  public List<VersionApprover> getApprovers() {
    return approvers;
  }



  public Version archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

  /**
   * Indicates that the version is archived. Optional when creating or updating a version.
   * @return archived
   */
  @javax.annotation.Nullable
  public Boolean getArchived() {
    return archived;
  }

  public void setArchived(Boolean archived) {
    this.archived = archived;
  }


  public Version description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the version. Optional when creating or updating a version. The maximum size is 16,384 bytes.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * If the expand option &#x60;driver&#x60; is used, returns the Atlassian account ID of the driver.
   * @return driver
   */
  @javax.annotation.Nullable
  public String getDriver() {
    return driver;
  }



  public Version expand(String expand) {
    this.expand = expand;
    return this;
  }

  /**
   * Use [expand](em&gt;#expansion) to include additional information about version in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;operations&#x60; Returns the list of operations available for this version.  *  &#x60;issuesstatus&#x60; Returns the count of issues in this version for each of the status categories *to do*, *in progress*, *done*, and *unmapped*. The *unmapped* property contains a count of issues with a status other than *to do*, *in progress*, and *done*.  *  &#x60;driver&#x60; Returns the Atlassian account ID of the version driver.  *  &#x60;approvers&#x60; Returns a list containing approvers for this version.  Optional for create and update.
   * @return expand
   */
  @javax.annotation.Nullable
  public String getExpand() {
    return expand;
  }

  public void setExpand(String expand) {
    this.expand = expand;
  }


  /**
   * The ID of the version.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }



  /**
   * If the expand option &#x60;issuesstatus&#x60; is used, returns the count of issues in this version for each of the status categories *to do*, *in progress*, *done*, and *unmapped*. The *unmapped* property contains a count of issues with a status other than *to do*, *in progress*, and *done*.
   * @return issuesStatusForFixVersion
   */
  @javax.annotation.Nullable
  public VersionIssuesStatus getIssuesStatusForFixVersion() {
    return issuesStatusForFixVersion;
  }



  public Version moveUnfixedIssuesTo(URI moveUnfixedIssuesTo) {
    this.moveUnfixedIssuesTo = moveUnfixedIssuesTo;
    return this;
  }

  /**
   * The URL of the self link to the version to which all unfixed issues are moved when a version is released. Not applicable when creating a version. Optional when updating a version.
   * @return moveUnfixedIssuesTo
   */
  @javax.annotation.Nullable
  public URI getMoveUnfixedIssuesTo() {
    return moveUnfixedIssuesTo;
  }

  public void setMoveUnfixedIssuesTo(URI moveUnfixedIssuesTo) {
    this.moveUnfixedIssuesTo = moveUnfixedIssuesTo;
  }


  public Version name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The unique name of the version. Required when creating a version. Optional when updating a version. The maximum length is 255 characters.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  /**
   * If the expand option &#x60;operations&#x60; is used, returns the list of operations available for this version.
   * @return operations
   */
  @javax.annotation.Nullable
  public List<SimpleLink> getOperations() {
    return operations;
  }



  /**
   * Indicates that the version is overdue.
   * @return overdue
   */
  @javax.annotation.Nullable
  public Boolean getOverdue() {
    return overdue;
  }



  public Version project(String project) {
    this.project = project;
    return this;
  }

  /**
   * Deprecated. Use &#x60;projectId&#x60;.
   * @return project
   */
  @javax.annotation.Nullable
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }


  public Version projectId(Long projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The ID of the project to which this version is attached. Required when creating a version. Not applicable when updating a version.
   * @return projectId
   */
  @javax.annotation.Nullable
  public Long getProjectId() {
    return projectId;
  }

  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }


  public Version releaseDate(LocalDate releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

  /**
   * The release date of the version. Expressed in ISO 8601 format (yyyy-mm-dd). Optional when creating or updating a version.
   * @return releaseDate
   */
  @javax.annotation.Nullable
  public LocalDate getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(LocalDate releaseDate) {
    this.releaseDate = releaseDate;
  }


  public Version released(Boolean released) {
    this.released = released;
    return this;
  }

  /**
   * Indicates that the version is released. If the version is released a request to release again is ignored. Not applicable when creating a version. Optional when updating a version.
   * @return released
   */
  @javax.annotation.Nullable
  public Boolean getReleased() {
    return released;
  }

  public void setReleased(Boolean released) {
    this.released = released;
  }


  /**
   * The URL of the version.
   * @return self
   */
  @javax.annotation.Nullable
  public URI getSelf() {
    return self;
  }



  public Version startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The start date of the version. Expressed in ISO 8601 format (yyyy-mm-dd). Optional when creating or updating a version.
   * @return startDate
   */
  @javax.annotation.Nullable
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  /**
   * The date on which work on this version is expected to finish, expressed in the instance&#39;s *Day/Month/Year Format* date format.
   * @return userReleaseDate
   */
  @javax.annotation.Nullable
  public String getUserReleaseDate() {
    return userReleaseDate;
  }



  /**
   * The date on which work on this version is expected to start, expressed in the instance&#39;s *Day/Month/Year Format* date format.
   * @return userStartDate
   */
  @javax.annotation.Nullable
  public String getUserStartDate() {
    return userStartDate;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Version version = (Version) o;
    return Objects.equals(this.approvers, version.approvers) &&
        Objects.equals(this.archived, version.archived) &&
        Objects.equals(this.description, version.description) &&
        Objects.equals(this.driver, version.driver) &&
        Objects.equals(this.expand, version.expand) &&
        Objects.equals(this.id, version.id) &&
        Objects.equals(this.issuesStatusForFixVersion, version.issuesStatusForFixVersion) &&
        Objects.equals(this.moveUnfixedIssuesTo, version.moveUnfixedIssuesTo) &&
        Objects.equals(this.name, version.name) &&
        Objects.equals(this.operations, version.operations) &&
        Objects.equals(this.overdue, version.overdue) &&
        Objects.equals(this.project, version.project) &&
        Objects.equals(this.projectId, version.projectId) &&
        Objects.equals(this.releaseDate, version.releaseDate) &&
        Objects.equals(this.released, version.released) &&
        Objects.equals(this.self, version.self) &&
        Objects.equals(this.startDate, version.startDate) &&
        Objects.equals(this.userReleaseDate, version.userReleaseDate) &&
        Objects.equals(this.userStartDate, version.userStartDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvers, archived, description, driver, expand, id, issuesStatusForFixVersion, moveUnfixedIssuesTo, name, operations, overdue, project, projectId, releaseDate, released, self, startDate, userReleaseDate, userStartDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Version {\n");
    sb.append("    approvers: ").append(toIndentedString(approvers)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issuesStatusForFixVersion: ").append(toIndentedString(issuesStatusForFixVersion)).append("\n");
    sb.append("    moveUnfixedIssuesTo: ").append(toIndentedString(moveUnfixedIssuesTo)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
    sb.append("    overdue: ").append(toIndentedString(overdue)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    released: ").append(toIndentedString(released)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    userReleaseDate: ").append(toIndentedString(userReleaseDate)).append("\n");
    sb.append("    userStartDate: ").append(toIndentedString(userStartDate)).append("\n");
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
    openapiFields.add("approvers");
    openapiFields.add("archived");
    openapiFields.add("description");
    openapiFields.add("driver");
    openapiFields.add("expand");
    openapiFields.add("id");
    openapiFields.add("issuesStatusForFixVersion");
    openapiFields.add("moveUnfixedIssuesTo");
    openapiFields.add("name");
    openapiFields.add("operations");
    openapiFields.add("overdue");
    openapiFields.add("project");
    openapiFields.add("projectId");
    openapiFields.add("releaseDate");
    openapiFields.add("released");
    openapiFields.add("self");
    openapiFields.add("startDate");
    openapiFields.add("userReleaseDate");
    openapiFields.add("userStartDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Version
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Version.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Version is not found in the empty JSON string", Version.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Version.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Version` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("approvers") != null && !jsonObj.get("approvers").isJsonNull() && !jsonObj.get("approvers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `approvers` to be an array in the JSON string but got `%s`", jsonObj.get("approvers").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("driver") != null && !jsonObj.get("driver").isJsonNull()) && !jsonObj.get("driver").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `driver` to be a primitive type in the JSON string but got `%s`", jsonObj.get("driver").toString()));
      }
      if ((jsonObj.get("expand") != null && !jsonObj.get("expand").isJsonNull()) && !jsonObj.get("expand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expand").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("moveUnfixedIssuesTo") != null && !jsonObj.get("moveUnfixedIssuesTo").isJsonNull()) && !jsonObj.get("moveUnfixedIssuesTo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `moveUnfixedIssuesTo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("moveUnfixedIssuesTo").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("operations") != null && !jsonObj.get("operations").isJsonNull()) {
        JsonArray jsonArrayoperations = jsonObj.getAsJsonArray("operations");
        if (jsonArrayoperations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("operations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `operations` to be an array in the JSON string but got `%s`", jsonObj.get("operations").toString()));
          }

          // validate the optional field `operations` (array)
          for (int i = 0; i < jsonArrayoperations.size(); i++) {
            SimpleLink.validateJsonElement(jsonArrayoperations.get(i));
          };
        }
      }
      if ((jsonObj.get("project") != null && !jsonObj.get("project").isJsonNull()) && !jsonObj.get("project").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project").toString()));
      }
      if ((jsonObj.get("self") != null && !jsonObj.get("self").isJsonNull()) && !jsonObj.get("self").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `self` to be a primitive type in the JSON string but got `%s`", jsonObj.get("self").toString()));
      }
      if ((jsonObj.get("userReleaseDate") != null && !jsonObj.get("userReleaseDate").isJsonNull()) && !jsonObj.get("userReleaseDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userReleaseDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userReleaseDate").toString()));
      }
      if ((jsonObj.get("userStartDate") != null && !jsonObj.get("userStartDate").isJsonNull()) && !jsonObj.get("userStartDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userStartDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userStartDate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Version.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Version' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Version> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Version.class));

       return (TypeAdapter<T>) new TypeAdapter<Version>() {
           @Override
           public void write(JsonWriter out, Version value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Version read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Version given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Version
   * @throws IOException if the JSON string is invalid with respect to Version
   */
  public static Version fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Version.class);
  }

  /**
   * Convert an instance of Version to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
