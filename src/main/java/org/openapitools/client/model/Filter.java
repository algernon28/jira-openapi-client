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
import org.openapitools.client.model.FilterSubscriptionsList;
import org.openapitools.client.model.SharePermission;
import org.openapitools.client.model.User;
import org.openapitools.client.model.UserList;

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
 * Details about a filter.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class Filter {
  public static final String SERIALIZED_NAME_APPROXIMATE_LAST_USED = "approximateLastUsed";
  @SerializedName(SERIALIZED_NAME_APPROXIMATE_LAST_USED)
  private OffsetDateTime approximateLastUsed;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EDIT_PERMISSIONS = "editPermissions";
  @SerializedName(SERIALIZED_NAME_EDIT_PERMISSIONS)
  private List<SharePermission> editPermissions = new ArrayList<>();

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

  public static final String SERIALIZED_NAME_SHARED_USERS = "sharedUsers";
  @SerializedName(SERIALIZED_NAME_SHARED_USERS)
  private UserList sharedUsers;

  public static final String SERIALIZED_NAME_SUBSCRIPTIONS = "subscriptions";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTIONS)
  private FilterSubscriptionsList subscriptions;

  public static final String SERIALIZED_NAME_VIEW_URL = "viewUrl";
  @SerializedName(SERIALIZED_NAME_VIEW_URL)
  private URI viewUrl;

  public Filter() {
  }

  public Filter(
     OffsetDateTime approximateLastUsed, 
     Long favouritedCount, 
     String id, 
     User owner, 
     URI searchUrl, 
     URI self, 
     UserList sharedUsers, 
     FilterSubscriptionsList subscriptions, 
     URI viewUrl
  ) {
    this();
    this.approximateLastUsed = approximateLastUsed;
    this.favouritedCount = favouritedCount;
    this.id = id;
    this.owner = owner;
    this.searchUrl = searchUrl;
    this.self = self;
    this.sharedUsers = sharedUsers;
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



  public Filter description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of the filter.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public Filter editPermissions(List<SharePermission> editPermissions) {
    this.editPermissions = editPermissions;
    return this;
  }

  public Filter addEditPermissionsItem(SharePermission editPermissionsItem) {
    if (this.editPermissions == null) {
      this.editPermissions = new ArrayList<>();
    }
    this.editPermissions.add(editPermissionsItem);
    return this;
  }

  /**
   * The groups and projects that can edit the filter.
   * @return editPermissions
   */
  @javax.annotation.Nullable
  public List<SharePermission> getEditPermissions() {
    return editPermissions;
  }

  public void setEditPermissions(List<SharePermission> editPermissions) {
    this.editPermissions = editPermissions;
  }


  public Filter favourite(Boolean favourite) {
    this.favourite = favourite;
    return this;
  }

  /**
   * Whether the filter is selected as a favorite.
   * @return favourite
   */
  @javax.annotation.Nullable
  public Boolean getFavourite() {
    return favourite;
  }

  public void setFavourite(Boolean favourite) {
    this.favourite = favourite;
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



  public Filter jql(String jql) {
    this.jql = jql;
    return this;
  }

  /**
   * The JQL query for the filter. For example, *project &#x3D; SSP AND issuetype &#x3D; Bug*.
   * @return jql
   */
  @javax.annotation.Nullable
  public String getJql() {
    return jql;
  }

  public void setJql(String jql) {
    this.jql = jql;
  }


  public Filter name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the filter. Must be unique.
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
   * The user who owns the filter. This is defaulted to the creator of the filter, however Jira administrators can change the owner of a shared filter in the admin settings.
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



  public Filter sharePermissions(List<SharePermission> sharePermissions) {
    this.sharePermissions = sharePermissions;
    return this;
  }

  public Filter addSharePermissionsItem(SharePermission sharePermissionsItem) {
    if (this.sharePermissions == null) {
      this.sharePermissions = new ArrayList<>();
    }
    this.sharePermissions.add(sharePermissionsItem);
    return this;
  }

  /**
   * The groups and projects that the filter is shared with.
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
   * A paginated list of the users that the filter is shared with. This includes users that are members of the groups or can browse the projects that the filter is shared with.
   * @return sharedUsers
   */
  @javax.annotation.Nullable
  public UserList getSharedUsers() {
    return sharedUsers;
  }



  /**
   * A paginated list of the users that are subscribed to the filter.
   * @return subscriptions
   */
  @javax.annotation.Nullable
  public FilterSubscriptionsList getSubscriptions() {
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
    Filter filter = (Filter) o;
    return Objects.equals(this.approximateLastUsed, filter.approximateLastUsed) &&
        Objects.equals(this.description, filter.description) &&
        Objects.equals(this.editPermissions, filter.editPermissions) &&
        Objects.equals(this.favourite, filter.favourite) &&
        Objects.equals(this.favouritedCount, filter.favouritedCount) &&
        Objects.equals(this.id, filter.id) &&
        Objects.equals(this.jql, filter.jql) &&
        Objects.equals(this.name, filter.name) &&
        Objects.equals(this.owner, filter.owner) &&
        Objects.equals(this.searchUrl, filter.searchUrl) &&
        Objects.equals(this.self, filter.self) &&
        Objects.equals(this.sharePermissions, filter.sharePermissions) &&
        Objects.equals(this.sharedUsers, filter.sharedUsers) &&
        Objects.equals(this.subscriptions, filter.subscriptions) &&
        Objects.equals(this.viewUrl, filter.viewUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approximateLastUsed, description, editPermissions, favourite, favouritedCount, id, jql, name, owner, searchUrl, self, sharePermissions, sharedUsers, subscriptions, viewUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Filter {\n");
    sb.append("    approximateLastUsed: ").append(toIndentedString(approximateLastUsed)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    editPermissions: ").append(toIndentedString(editPermissions)).append("\n");
    sb.append("    favourite: ").append(toIndentedString(favourite)).append("\n");
    sb.append("    favouritedCount: ").append(toIndentedString(favouritedCount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jql: ").append(toIndentedString(jql)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    searchUrl: ").append(toIndentedString(searchUrl)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    sharePermissions: ").append(toIndentedString(sharePermissions)).append("\n");
    sb.append("    sharedUsers: ").append(toIndentedString(sharedUsers)).append("\n");
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
    openapiFields.add("favourite");
    openapiFields.add("favouritedCount");
    openapiFields.add("id");
    openapiFields.add("jql");
    openapiFields.add("name");
    openapiFields.add("owner");
    openapiFields.add("searchUrl");
    openapiFields.add("self");
    openapiFields.add("sharePermissions");
    openapiFields.add("sharedUsers");
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
   * @throws IOException if the JSON Element is invalid with respect to Filter
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Filter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Filter is not found in the empty JSON string", Filter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Filter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Filter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Filter.openapiRequiredFields) {
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
      // validate the optional field `sharedUsers`
      if (jsonObj.get("sharedUsers") != null && !jsonObj.get("sharedUsers").isJsonNull()) {
        UserList.validateJsonElement(jsonObj.get("sharedUsers"));
      }
      // validate the optional field `subscriptions`
      if (jsonObj.get("subscriptions") != null && !jsonObj.get("subscriptions").isJsonNull()) {
        FilterSubscriptionsList.validateJsonElement(jsonObj.get("subscriptions"));
      }
      if ((jsonObj.get("viewUrl") != null && !jsonObj.get("viewUrl").isJsonNull()) && !jsonObj.get("viewUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `viewUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("viewUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Filter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Filter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Filter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Filter.class));

       return (TypeAdapter<T>) new TypeAdapter<Filter>() {
           @Override
           public void write(JsonWriter out, Filter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Filter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Filter given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Filter
   * @throws IOException if the JSON string is invalid with respect to Filter
   */
  public static Filter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Filter.class);
  }

  /**
   * Convert an instance of Filter to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

