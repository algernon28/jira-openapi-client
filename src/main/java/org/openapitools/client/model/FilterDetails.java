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
import org.openapitools.client.model.FilterSubscription;
import org.openapitools.client.model.SharePermission;
import org.openapitools.client.model.User;

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
 * Details of a filter.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class FilterDetails {
  public static final String SERIALIZED_NAME_APPROXIMATE_LAST_USED = "approximateLastUsed";
  @SerializedName(SERIALIZED_NAME_APPROXIMATE_LAST_USED)
  private OffsetDateTime approximateLastUsed;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EDIT_PERMISSIONS = "editPermissions";
  @SerializedName(SERIALIZED_NAME_EDIT_PERMISSIONS)
  private List<SharePermission> editPermissions = new ArrayList<>();

  public static final String SERIALIZED_NAME_EXPAND = "expand";
  @SerializedName(SERIALIZED_NAME_EXPAND)
  private String expand;

  public static final String SERIALIZED_NAME_FAVOURITE = "favourite";
  @SerializedName(SERIALIZED_NAME_FAVOURITE)
  private Boolean favourite;

  public static final String SERIALIZED_NAME_FAVOURITED_COUNT = "favouritedCount";
  @SerializedName(SERIALIZED_NAME_FAVOURITED_COUNT)
  private Long favouritedCount;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_JQL = "jql";
  @SerializedName(SERIALIZED_NAME_JQL)
  private String jql;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private User owner;

  public static final String SERIALIZED_NAME_SEARCH_URL = "searchUrl";
  @SerializedName(SERIALIZED_NAME_SEARCH_URL)
  private URI searchUrl;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private URI self;

  public static final String SERIALIZED_NAME_SHARE_PERMISSIONS = "sharePermissions";
  @SerializedName(SERIALIZED_NAME_SHARE_PERMISSIONS)
  private List<SharePermission> sharePermissions = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUBSCRIPTIONS = "subscriptions";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTIONS)
  private List<FilterSubscription> subscriptions = new ArrayList<>();

  public static final String SERIALIZED_NAME_VIEW_URL = "viewUrl";
  @SerializedName(SERIALIZED_NAME_VIEW_URL)
  private URI viewUrl;

  public FilterDetails() {
  }

  public FilterDetails(
     OffsetDateTime approximateLastUsed, 
     String expand, 
     Boolean favourite, 
     Long favouritedCount, 
     String id, 
     String jql, 
     User owner, 
     URI searchUrl, 
     URI self, 
     List<FilterSubscription> subscriptions, 
     URI viewUrl
  ) {
    this();
    this.approximateLastUsed = approximateLastUsed;
    this.expand = expand;
    this.favourite = favourite;
    this.favouritedCount = favouritedCount;
    this.id = id;
    this.jql = jql;
    this.owner = owner;
    this.searchUrl = searchUrl;
    this.self = self;
    this.subscriptions = subscriptions;
    this.viewUrl = viewUrl;
  }

  /**
   * \\[Experimental\\] Approximate last used time. Returns the date and time when the filter was last used. Returns &#x60;null&#x60; if the filter hasn&#39;t been used after tracking was enabled. For performance reasons, timestamps aren&#39;t updated in real time and therefore may not be exactly accurate.
   * @return approximateLastUsed
   */
  @javax.annotation.Nullable
  public OffsetDateTime getApproximateLastUsed() {
    return approximateLastUsed;
  }



  public FilterDetails description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the filter.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public FilterDetails editPermissions(List<SharePermission> editPermissions) {
    this.editPermissions = editPermissions;
    return this;
  }

  public FilterDetails addEditPermissionsItem(SharePermission editPermissionsItem) {
    if (this.editPermissions == null) {
      this.editPermissions = new ArrayList<>();
    }
    this.editPermissions.add(editPermissionsItem);
    return this;
  }

  /**
   * The groups and projects that can edit the filter. This can be specified when updating a filter, but not when creating a filter.
   * @return editPermissions
   */
  @javax.annotation.Nullable
  public List<SharePermission> getEditPermissions() {
    return editPermissions;
  }

  public void setEditPermissions(List<SharePermission> editPermissions) {
    this.editPermissions = editPermissions;
  }


  /**
   * Expand options that include additional filter details in the response.
   * @return expand
   */
  @javax.annotation.Nullable
  public String getExpand() {
    return expand;
  }



  /**
   * Whether the filter is selected as a favorite by any users, not including the filter owner.
   * @return favourite
   */
  @javax.annotation.Nullable
  public Boolean getFavourite() {
    return favourite;
  }



  /**
   * The count of how many users have selected this filter as a favorite, including the filter owner.
   * @return favouritedCount
   */
  @javax.annotation.Nullable
  public Long getFavouritedCount() {
    return favouritedCount;
  }



  /**
   * The unique identifier for the filter.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }



  /**
   * The JQL query for the filter. For example, *project &#x3D; SSP AND issuetype &#x3D; Bug*.
   * @return jql
   */
  @javax.annotation.Nullable
  public String getJql() {
    return jql;
  }



  public FilterDetails name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the filter.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  /**
   * The user who owns the filter. Defaults to the creator of the filter, however, Jira administrators can change the owner of a shared filter in the admin settings.
   * @return owner
   */
  @javax.annotation.Nullable
  public User getOwner() {
    return owner;
  }



  /**
   * A URL to view the filter results in Jira, using the [Search for issues using JQL](#api-rest-api-3-filter-search-get) operation with the filter&#39;s JQL string to return the filter results. For example, *https://your-domain.atlassian.net/rest/api/3/search?jql&#x3D;project+%3D+SSP+AND+issuetype+%3D+Bug*.
   * @return searchUrl
   */
  @javax.annotation.Nullable
  public URI getSearchUrl() {
    return searchUrl;
  }



  /**
   * The URL of the filter.
   * @return self
   */
  @javax.annotation.Nullable
  public URI getSelf() {
    return self;
  }



  public FilterDetails sharePermissions(List<SharePermission> sharePermissions) {
    this.sharePermissions = sharePermissions;
    return this;
  }

  public FilterDetails addSharePermissionsItem(SharePermission sharePermissionsItem) {
    if (this.sharePermissions == null) {
      this.sharePermissions = new ArrayList<>();
    }
    this.sharePermissions.add(sharePermissionsItem);
    return this;
  }

  /**
   * The groups and projects that the filter is shared with. This can be specified when updating a filter, but not when creating a filter.
   * @return sharePermissions
   */
  @javax.annotation.Nullable
  public List<SharePermission> getSharePermissions() {
    return sharePermissions;
  }

  public void setSharePermissions(List<SharePermission> sharePermissions) {
    this.sharePermissions = sharePermissions;
  }


  /**
   * The users that are subscribed to the filter.
   * @return subscriptions
   */
  @javax.annotation.Nullable
  public List<FilterSubscription> getSubscriptions() {
    return subscriptions;
  }



  /**
   * A URL to view the filter results in Jira, using the ID of the filter. For example, *https://your-domain.atlassian.net/issues/?filter&#x3D;10100*.
   * @return viewUrl
   */
  @javax.annotation.Nullable
  public URI getViewUrl() {
    return viewUrl;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterDetails filterDetails = (FilterDetails) o;
    return Objects.equals(this.approximateLastUsed, filterDetails.approximateLastUsed) &&
        Objects.equals(this.description, filterDetails.description) &&
        Objects.equals(this.editPermissions, filterDetails.editPermissions) &&
        Objects.equals(this.expand, filterDetails.expand) &&
        Objects.equals(this.favourite, filterDetails.favourite) &&
        Objects.equals(this.favouritedCount, filterDetails.favouritedCount) &&
        Objects.equals(this.id, filterDetails.id) &&
        Objects.equals(this.jql, filterDetails.jql) &&
        Objects.equals(this.name, filterDetails.name) &&
        Objects.equals(this.owner, filterDetails.owner) &&
        Objects.equals(this.searchUrl, filterDetails.searchUrl) &&
        Objects.equals(this.self, filterDetails.self) &&
        Objects.equals(this.sharePermissions, filterDetails.sharePermissions) &&
        Objects.equals(this.subscriptions, filterDetails.subscriptions) &&
        Objects.equals(this.viewUrl, filterDetails.viewUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approximateLastUsed, description, editPermissions, expand, favourite, favouritedCount, id, jql, name, owner, searchUrl, self, sharePermissions, subscriptions, viewUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterDetails {\n");
    sb.append("    approximateLastUsed: ").append(toIndentedString(approximateLastUsed)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    editPermissions: ").append(toIndentedString(editPermissions)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    favourite: ").append(toIndentedString(favourite)).append("\n");
    sb.append("    favouritedCount: ").append(toIndentedString(favouritedCount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jql: ").append(toIndentedString(jql)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    searchUrl: ").append(toIndentedString(searchUrl)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    sharePermissions: ").append(toIndentedString(sharePermissions)).append("\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
    sb.append("    viewUrl: ").append(toIndentedString(viewUrl)).append("\n");
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
    openapiFields.add("approximateLastUsed");
    openapiFields.add("description");
    openapiFields.add("editPermissions");
    openapiFields.add("expand");
    openapiFields.add("favourite");
    openapiFields.add("favouritedCount");
    openapiFields.add("id");
    openapiFields.add("jql");
    openapiFields.add("name");
    openapiFields.add("owner");
    openapiFields.add("searchUrl");
    openapiFields.add("self");
    openapiFields.add("sharePermissions");
    openapiFields.add("subscriptions");
    openapiFields.add("viewUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FilterDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FilterDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FilterDetails is not found in the empty JSON string", FilterDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FilterDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FilterDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FilterDetails.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("editPermissions") != null && !jsonObj.get("editPermissions").isJsonNull()) {
        JsonArray jsonArrayeditPermissions = jsonObj.getAsJsonArray("editPermissions");
        if (jsonArrayeditPermissions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("editPermissions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `editPermissions` to be an array in the JSON string but got `%s`", jsonObj.get("editPermissions").toString()));
          }

          // validate the optional field `editPermissions` (array)
          for (int i = 0; i < jsonArrayeditPermissions.size(); i++) {
            SharePermission.validateJsonElement(jsonArrayeditPermissions.get(i));
          };
        }
      }
      if ((jsonObj.get("expand") != null && !jsonObj.get("expand").isJsonNull()) && !jsonObj.get("expand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expand").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("jql") != null && !jsonObj.get("jql").isJsonNull()) && !jsonObj.get("jql").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jql` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jql").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `owner`
      if (jsonObj.get("owner") != null && !jsonObj.get("owner").isJsonNull()) {
        User.validateJsonElement(jsonObj.get("owner"));
      }
      if ((jsonObj.get("searchUrl") != null && !jsonObj.get("searchUrl").isJsonNull()) && !jsonObj.get("searchUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `searchUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("searchUrl").toString()));
      }
      if ((jsonObj.get("self") != null && !jsonObj.get("self").isJsonNull()) && !jsonObj.get("self").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `self` to be a primitive type in the JSON string but got `%s`", jsonObj.get("self").toString()));
      }
      if (jsonObj.get("sharePermissions") != null && !jsonObj.get("sharePermissions").isJsonNull()) {
        JsonArray jsonArraysharePermissions = jsonObj.getAsJsonArray("sharePermissions");
        if (jsonArraysharePermissions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("sharePermissions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `sharePermissions` to be an array in the JSON string but got `%s`", jsonObj.get("sharePermissions").toString()));
          }

          // validate the optional field `sharePermissions` (array)
          for (int i = 0; i < jsonArraysharePermissions.size(); i++) {
            SharePermission.validateJsonElement(jsonArraysharePermissions.get(i));
          };
        }
      }
      if (jsonObj.get("subscriptions") != null && !jsonObj.get("subscriptions").isJsonNull()) {
        JsonArray jsonArraysubscriptions = jsonObj.getAsJsonArray("subscriptions");
        if (jsonArraysubscriptions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("subscriptions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `subscriptions` to be an array in the JSON string but got `%s`", jsonObj.get("subscriptions").toString()));
          }

          // validate the optional field `subscriptions` (array)
          for (int i = 0; i < jsonArraysubscriptions.size(); i++) {
            FilterSubscription.validateJsonElement(jsonArraysubscriptions.get(i));
          };
        }
      }
      if ((jsonObj.get("viewUrl") != null && !jsonObj.get("viewUrl").isJsonNull()) && !jsonObj.get("viewUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `viewUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("viewUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FilterDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FilterDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FilterDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FilterDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<FilterDetails>() {
           @Override
           public void write(JsonWriter out, FilterDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FilterDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FilterDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FilterDetails
   * @throws IOException if the JSON string is invalid with respect to FilterDetails
   */
  public static FilterDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FilterDetails.class);
  }

  /**
   * Convert an instance of FilterDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

