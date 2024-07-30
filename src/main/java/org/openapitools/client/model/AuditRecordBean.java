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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.AssociatedItemBean;
import org.openapitools.client.model.ChangedValueBean;

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
 * An audit record.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class AuditRecordBean {
  public static final String SERIALIZED_NAME_ASSOCIATED_ITEMS = "associatedItems";
  @SerializedName(SERIALIZED_NAME_ASSOCIATED_ITEMS)
  private List<AssociatedItemBean> associatedItems = new ArrayList<>();

  public static final String SERIALIZED_NAME_AUTHOR_KEY = "authorKey";
  @SerializedName(SERIALIZED_NAME_AUTHOR_KEY)
  private String authorKey;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_CHANGED_VALUES = "changedValues";
  @SerializedName(SERIALIZED_NAME_CHANGED_VALUES)
  private List<ChangedValueBean> changedValues = new ArrayList<>();

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EVENT_SOURCE = "eventSource";
  @SerializedName(SERIALIZED_NAME_EVENT_SOURCE)
  private String eventSource;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_OBJECT_ITEM = "objectItem";
  @SerializedName(SERIALIZED_NAME_OBJECT_ITEM)
  private AssociatedItemBean objectItem;

  public static final String SERIALIZED_NAME_REMOTE_ADDRESS = "remoteAddress";
  @SerializedName(SERIALIZED_NAME_REMOTE_ADDRESS)
  private String remoteAddress;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private String summary;

  public AuditRecordBean() {
  }

  public AuditRecordBean(
     List<AssociatedItemBean> associatedItems, 
     String authorKey, 
     String category, 
     List<ChangedValueBean> changedValues, 
     OffsetDateTime created, 
     String description, 
     String eventSource, 
     Long id, 
     String remoteAddress, 
     String summary
  ) {
    this();
    this.associatedItems = associatedItems;
    this.authorKey = authorKey;
    this.category = category;
    this.changedValues = changedValues;
    this.created = created;
    this.description = description;
    this.eventSource = eventSource;
    this.id = id;
    this.remoteAddress = remoteAddress;
    this.summary = summary;
  }

  /**
   * The list of items associated with the changed record.
   * @return associatedItems
   */
  @javax.annotation.Nullable
  public List<AssociatedItemBean> getAssociatedItems() {
    return associatedItems;
  }



  /**
   * Deprecated, use &#x60;authorAccountId&#x60; instead. The key of the user who created the audit record.
   * @return authorKey
   */
  @javax.annotation.Nullable
  public String getAuthorKey() {
    return authorKey;
  }



  /**
   * The category of the audit record. For a list of these categories, see the help article [Auditing in Jira applications](https://confluence.atlassian.com/x/noXKM).
   * @return category
   */
  @javax.annotation.Nullable
  public String getCategory() {
    return category;
  }



  /**
   * The list of values changed in the record event.
   * @return changedValues
   */
  @javax.annotation.Nullable
  public List<ChangedValueBean> getChangedValues() {
    return changedValues;
  }



  /**
   * The date and time on which the audit record was created.
   * @return created
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreated() {
    return created;
  }



  /**
   * The description of the audit record.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }



  /**
   * The event the audit record originated from.
   * @return eventSource
   */
  @javax.annotation.Nullable
  public String getEventSource() {
    return eventSource;
  }



  /**
   * The ID of the audit record.
   * @return id
   */
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }



  public AuditRecordBean objectItem(AssociatedItemBean objectItem) {
    this.objectItem = objectItem;
    return this;
  }

  /**
   * Get objectItem
   * @return objectItem
   */
  @javax.annotation.Nullable
  public AssociatedItemBean getObjectItem() {
    return objectItem;
  }

  public void setObjectItem(AssociatedItemBean objectItem) {
    this.objectItem = objectItem;
  }


  /**
   * The URL of the computer where the creation of the audit record was initiated.
   * @return remoteAddress
   */
  @javax.annotation.Nullable
  public String getRemoteAddress() {
    return remoteAddress;
  }



  /**
   * The summary of the audit record.
   * @return summary
   */
  @javax.annotation.Nullable
  public String getSummary() {
    return summary;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditRecordBean auditRecordBean = (AuditRecordBean) o;
    return Objects.equals(this.associatedItems, auditRecordBean.associatedItems) &&
        Objects.equals(this.authorKey, auditRecordBean.authorKey) &&
        Objects.equals(this.category, auditRecordBean.category) &&
        Objects.equals(this.changedValues, auditRecordBean.changedValues) &&
        Objects.equals(this.created, auditRecordBean.created) &&
        Objects.equals(this.description, auditRecordBean.description) &&
        Objects.equals(this.eventSource, auditRecordBean.eventSource) &&
        Objects.equals(this.id, auditRecordBean.id) &&
        Objects.equals(this.objectItem, auditRecordBean.objectItem) &&
        Objects.equals(this.remoteAddress, auditRecordBean.remoteAddress) &&
        Objects.equals(this.summary, auditRecordBean.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associatedItems, authorKey, category, changedValues, created, description, eventSource, id, objectItem, remoteAddress, summary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditRecordBean {\n");
    sb.append("    associatedItems: ").append(toIndentedString(associatedItems)).append("\n");
    sb.append("    authorKey: ").append(toIndentedString(authorKey)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    changedValues: ").append(toIndentedString(changedValues)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    eventSource: ").append(toIndentedString(eventSource)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    objectItem: ").append(toIndentedString(objectItem)).append("\n");
    sb.append("    remoteAddress: ").append(toIndentedString(remoteAddress)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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
    openapiFields.add("associatedItems");
    openapiFields.add("authorKey");
    openapiFields.add("category");
    openapiFields.add("changedValues");
    openapiFields.add("created");
    openapiFields.add("description");
    openapiFields.add("eventSource");
    openapiFields.add("id");
    openapiFields.add("objectItem");
    openapiFields.add("remoteAddress");
    openapiFields.add("summary");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AuditRecordBean
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AuditRecordBean.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuditRecordBean is not found in the empty JSON string", AuditRecordBean.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AuditRecordBean.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuditRecordBean` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("associatedItems") != null && !jsonObj.get("associatedItems").isJsonNull()) {
        JsonArray jsonArrayassociatedItems = jsonObj.getAsJsonArray("associatedItems");
        if (jsonArrayassociatedItems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("associatedItems").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `associatedItems` to be an array in the JSON string but got `%s`", jsonObj.get("associatedItems").toString()));
          }

          // validate the optional field `associatedItems` (array)
          for (int i = 0; i < jsonArrayassociatedItems.size(); i++) {
            AssociatedItemBean.validateJsonElement(jsonArrayassociatedItems.get(i));
          };
        }
      }
      if ((jsonObj.get("authorKey") != null && !jsonObj.get("authorKey").isJsonNull()) && !jsonObj.get("authorKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authorKey").toString()));
      }
      if ((jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      if (jsonObj.get("changedValues") != null && !jsonObj.get("changedValues").isJsonNull()) {
        JsonArray jsonArraychangedValues = jsonObj.getAsJsonArray("changedValues");
        if (jsonArraychangedValues != null) {
          // ensure the json data is an array
          if (!jsonObj.get("changedValues").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `changedValues` to be an array in the JSON string but got `%s`", jsonObj.get("changedValues").toString()));
          }

          // validate the optional field `changedValues` (array)
          for (int i = 0; i < jsonArraychangedValues.size(); i++) {
            ChangedValueBean.validateJsonElement(jsonArraychangedValues.get(i));
          };
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("eventSource") != null && !jsonObj.get("eventSource").isJsonNull()) && !jsonObj.get("eventSource").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventSource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventSource").toString()));
      }
      // validate the optional field `objectItem`
      if (jsonObj.get("objectItem") != null && !jsonObj.get("objectItem").isJsonNull()) {
        AssociatedItemBean.validateJsonElement(jsonObj.get("objectItem"));
      }
      if ((jsonObj.get("remoteAddress") != null && !jsonObj.get("remoteAddress").isJsonNull()) && !jsonObj.get("remoteAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remoteAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remoteAddress").toString()));
      }
      if ((jsonObj.get("summary") != null && !jsonObj.get("summary").isJsonNull()) && !jsonObj.get("summary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `summary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("summary").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuditRecordBean.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuditRecordBean' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuditRecordBean> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuditRecordBean.class));

       return (TypeAdapter<T>) new TypeAdapter<AuditRecordBean>() {
           @Override
           public void write(JsonWriter out, AuditRecordBean value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuditRecordBean read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AuditRecordBean given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AuditRecordBean
   * @throws IOException if the JSON string is invalid with respect to AuditRecordBean
   */
  public static AuditRecordBean fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuditRecordBean.class);
  }

  /**
   * Convert an instance of AuditRecordBean to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
