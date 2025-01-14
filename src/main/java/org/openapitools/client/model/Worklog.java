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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.EntityProperty;
import org.openapitools.client.model.UserDetails;
import org.openapitools.client.model.Visibility;
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
 * Details of a worklog.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class Worklog {
  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private UserDetails author;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private Object comment = null;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ISSUE_ID = "issueId";
  @SerializedName(SERIALIZED_NAME_ISSUE_ID)
  private String issueId;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private List<EntityProperty> properties = new ArrayList<>();

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private URI self;

  public static final String SERIALIZED_NAME_STARTED = "started";
  @SerializedName(SERIALIZED_NAME_STARTED)
  private OffsetDateTime started;

  public static final String SERIALIZED_NAME_TIME_SPENT = "timeSpent";
  @SerializedName(SERIALIZED_NAME_TIME_SPENT)
  private String timeSpent;

  public static final String SERIALIZED_NAME_TIME_SPENT_SECONDS = "timeSpentSeconds";
  @SerializedName(SERIALIZED_NAME_TIME_SPENT_SECONDS)
  private Long timeSpentSeconds;

  public static final String SERIALIZED_NAME_UPDATE_AUTHOR = "updateAuthor";
  @SerializedName(SERIALIZED_NAME_UPDATE_AUTHOR)
  private UserDetails updateAuthor;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private OffsetDateTime updated;

  public static final String SERIALIZED_NAME_VISIBILITY = "visibility";
  @SerializedName(SERIALIZED_NAME_VISIBILITY)
  private Visibility visibility;

  public Worklog() {
  }

  public Worklog(
     UserDetails author, 
     OffsetDateTime created, 
     String id, 
     String issueId, 
     URI self, 
     UserDetails updateAuthor, 
     OffsetDateTime updated
  ) {
    this();
    this.author = author;
    this.created = created;
    this.id = id;
    this.issueId = issueId;
    this.self = self;
    this.updateAuthor = updateAuthor;
    this.updated = updated;
  }

  /**
   * Details of the user who created the worklog.
   * @return author
   */
  @javax.annotation.Nullable
  public UserDetails getAuthor() {
    return author;
  }



  public Worklog comment(Object comment) {
    this.comment = comment;
    return this;
  }

  /**
   * A comment about the worklog in [Atlassian Document Format](https://developer.atlassian.com/cloud/jira/platform/apis/document/structure/). Optional when creating or updating a worklog.
   * @return comment
   */
  @javax.annotation.Nullable
  public Object getComment() {
    return comment;
  }

  public void setComment(Object comment) {
    this.comment = comment;
  }


  /**
   * The datetime on which the worklog was created.
   * @return created
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreated() {
    return created;
  }



  /**
   * The ID of the worklog record.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }



  /**
   * The ID of the issue this worklog is for.
   * @return issueId
   */
  @javax.annotation.Nullable
  public String getIssueId() {
    return issueId;
  }



  public Worklog properties(List<EntityProperty> properties) {
    this.properties = properties;
    return this;
  }

  public Worklog addPropertiesItem(EntityProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

  /**
   * Details of properties for the worklog. Optional when creating or updating a worklog.
   * @return properties
   */
  @javax.annotation.Nullable
  public List<EntityProperty> getProperties() {
    return properties;
  }

  public void setProperties(List<EntityProperty> properties) {
    this.properties = properties;
  }


  /**
   * The URL of the worklog item.
   * @return self
   */
  @javax.annotation.Nullable
  public URI getSelf() {
    return self;
  }



  public Worklog started(OffsetDateTime started) {
    this.started = started;
    return this;
  }

  /**
   * The datetime on which the worklog effort was started. Required when creating a worklog. Optional when updating a worklog.
   * @return started
   */
  @javax.annotation.Nullable
  public OffsetDateTime getStarted() {
    return started;
  }

  public void setStarted(OffsetDateTime started) {
    this.started = started;
  }


  public Worklog timeSpent(String timeSpent) {
    this.timeSpent = timeSpent;
    return this;
  }

  /**
   * The time spent working on the issue as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). Required when creating a worklog if &#x60;timeSpentSeconds&#x60; isn&#39;t provided. Optional when updating a worklog. Cannot be provided if &#x60;timeSpentSecond&#x60; is provided.
   * @return timeSpent
   */
  @javax.annotation.Nullable
  public String getTimeSpent() {
    return timeSpent;
  }

  public void setTimeSpent(String timeSpent) {
    this.timeSpent = timeSpent;
  }


  public Worklog timeSpentSeconds(Long timeSpentSeconds) {
    this.timeSpentSeconds = timeSpentSeconds;
    return this;
  }

  /**
   * The time in seconds spent working on the issue. Required when creating a worklog if &#x60;timeSpent&#x60; isn&#39;t provided. Optional when updating a worklog. Cannot be provided if &#x60;timeSpent&#x60; is provided.
   * @return timeSpentSeconds
   */
  @javax.annotation.Nullable
  public Long getTimeSpentSeconds() {
    return timeSpentSeconds;
  }

  public void setTimeSpentSeconds(Long timeSpentSeconds) {
    this.timeSpentSeconds = timeSpentSeconds;
  }


  /**
   * Details of the user who last updated the worklog.
   * @return updateAuthor
   */
  @javax.annotation.Nullable
  public UserDetails getUpdateAuthor() {
    return updateAuthor;
  }



  /**
   * The datetime on which the worklog was last updated.
   * @return updated
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdated() {
    return updated;
  }



  public Worklog visibility(Visibility visibility) {
    this.visibility = visibility;
    return this;
  }

  /**
   * Details about any restrictions in the visibility of the worklog. Optional when creating or updating a worklog.
   * @return visibility
   */
  @javax.annotation.Nullable
  public Visibility getVisibility() {
    return visibility;
  }

  public void setVisibility(Visibility visibility) {
    this.visibility = visibility;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the Worklog instance itself
   */
  public Worklog putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Worklog worklog = (Worklog) o;
    return Objects.equals(this.author, worklog.author) &&
        Objects.equals(this.comment, worklog.comment) &&
        Objects.equals(this.created, worklog.created) &&
        Objects.equals(this.id, worklog.id) &&
        Objects.equals(this.issueId, worklog.issueId) &&
        Objects.equals(this.properties, worklog.properties) &&
        Objects.equals(this.self, worklog.self) &&
        Objects.equals(this.started, worklog.started) &&
        Objects.equals(this.timeSpent, worklog.timeSpent) &&
        Objects.equals(this.timeSpentSeconds, worklog.timeSpentSeconds) &&
        Objects.equals(this.updateAuthor, worklog.updateAuthor) &&
        Objects.equals(this.updated, worklog.updated) &&
        Objects.equals(this.visibility, worklog.visibility)&&
        Objects.equals(this.additionalProperties, worklog.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, comment, created, id, issueId, properties, self, started, timeSpent, timeSpentSeconds, updateAuthor, updated, visibility, additionalProperties);
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
    sb.append("class Worklog {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    started: ").append(toIndentedString(started)).append("\n");
    sb.append("    timeSpent: ").append(toIndentedString(timeSpent)).append("\n");
    sb.append("    timeSpentSeconds: ").append(toIndentedString(timeSpentSeconds)).append("\n");
    sb.append("    updateAuthor: ").append(toIndentedString(updateAuthor)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("author");
    openapiFields.add("comment");
    openapiFields.add("created");
    openapiFields.add("id");
    openapiFields.add("issueId");
    openapiFields.add("properties");
    openapiFields.add("self");
    openapiFields.add("started");
    openapiFields.add("timeSpent");
    openapiFields.add("timeSpentSeconds");
    openapiFields.add("updateAuthor");
    openapiFields.add("updated");
    openapiFields.add("visibility");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Worklog
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Worklog.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Worklog is not found in the empty JSON string", Worklog.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `author`
      if (jsonObj.get("author") != null && !jsonObj.get("author").isJsonNull()) {
        UserDetails.validateJsonElement(jsonObj.get("author"));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("issueId") != null && !jsonObj.get("issueId").isJsonNull()) && !jsonObj.get("issueId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issueId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issueId").toString()));
      }
      if (jsonObj.get("properties") != null && !jsonObj.get("properties").isJsonNull()) {
        JsonArray jsonArrayproperties = jsonObj.getAsJsonArray("properties");
        if (jsonArrayproperties != null) {
          // ensure the json data is an array
          if (!jsonObj.get("properties").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `properties` to be an array in the JSON string but got `%s`", jsonObj.get("properties").toString()));
          }

          // validate the optional field `properties` (array)
          for (int i = 0; i < jsonArrayproperties.size(); i++) {
            EntityProperty.validateJsonElement(jsonArrayproperties.get(i));
          };
        }
      }
      if ((jsonObj.get("self") != null && !jsonObj.get("self").isJsonNull()) && !jsonObj.get("self").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `self` to be a primitive type in the JSON string but got `%s`", jsonObj.get("self").toString()));
      }
      if ((jsonObj.get("timeSpent") != null && !jsonObj.get("timeSpent").isJsonNull()) && !jsonObj.get("timeSpent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeSpent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeSpent").toString()));
      }
      // validate the optional field `updateAuthor`
      if (jsonObj.get("updateAuthor") != null && !jsonObj.get("updateAuthor").isJsonNull()) {
        UserDetails.validateJsonElement(jsonObj.get("updateAuthor"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Worklog.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Worklog' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Worklog> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Worklog.class));

       return (TypeAdapter<T>) new TypeAdapter<Worklog>() {
           @Override
           public void write(JsonWriter out, Worklog value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public Worklog read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             Worklog instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Worklog given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Worklog
   * @throws IOException if the JSON string is invalid with respect to Worklog
   */
  public static Worklog fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Worklog.class);
  }

  /**
   * Convert an instance of Worklog to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

