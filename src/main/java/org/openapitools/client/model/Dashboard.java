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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.SharePermission;
import org.openapitools.client.model.UserBean;

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
 * Details of a dashboard.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class Dashboard {
  public static final String SERIALIZED_NAME_AUTOMATIC_REFRESH_MS = "automaticRefreshMs";
  @SerializedName(SERIALIZED_NAME_AUTOMATIC_REFRESH_MS)
  private Integer automaticRefreshMs;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EDIT_PERMISSIONS = "editPermissions";
  @SerializedName(SERIALIZED_NAME_EDIT_PERMISSIONS)
  private List<SharePermission> editPermissions = new ArrayList<>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IS_FAVOURITE = "isFavourite";
  @SerializedName(SERIALIZED_NAME_IS_FAVOURITE)
  private Boolean isFavourite;

  public static final String SERIALIZED_NAME_IS_WRITABLE = "isWritable";
  @SerializedName(SERIALIZED_NAME_IS_WRITABLE)
  private Boolean isWritable;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private UserBean owner;

  public static final String SERIALIZED_NAME_POPULARITY = "popularity";
  @SerializedName(SERIALIZED_NAME_POPULARITY)
  private Long popularity;

  public static final String SERIALIZED_NAME_RANK = "rank";
  @SerializedName(SERIALIZED_NAME_RANK)
  private Integer rank;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private URI self;

  public static final String SERIALIZED_NAME_SHARE_PERMISSIONS = "sharePermissions";
  @SerializedName(SERIALIZED_NAME_SHARE_PERMISSIONS)
  private List<SharePermission> sharePermissions = new ArrayList<>();

  public static final String SERIALIZED_NAME_SYSTEM_DASHBOARD = "systemDashboard";
  @SerializedName(SERIALIZED_NAME_SYSTEM_DASHBOARD)
  private Boolean systemDashboard;

  public static final String SERIALIZED_NAME_VIEW = "view";
  @SerializedName(SERIALIZED_NAME_VIEW)
  private String view;

  public Dashboard() {
  }

  public Dashboard(
     Integer automaticRefreshMs, 
     List<SharePermission> editPermissions, 
     String id, 
     Boolean isFavourite, 
     Boolean isWritable, 
     String name, 
     UserBean owner, 
     Long popularity, 
     Integer rank, 
     URI self, 
     List<SharePermission> sharePermissions, 
     Boolean systemDashboard, 
     String view
  ) {
    this();
    this.automaticRefreshMs = automaticRefreshMs;
    this.editPermissions = editPermissions;
    this.id = id;
    this.isFavourite = isFavourite;
    this.isWritable = isWritable;
    this.name = name;
    this.owner = owner;
    this.popularity = popularity;
    this.rank = rank;
    this.self = self;
    this.sharePermissions = sharePermissions;
    this.systemDashboard = systemDashboard;
    this.view = view;
  }

  /**
   * The automatic refresh interval for the dashboard in milliseconds.
   * @return automaticRefreshMs
   */
  @javax.annotation.Nullable
  public Integer getAutomaticRefreshMs() {
    return automaticRefreshMs;
  }



  public Dashboard description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
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
   * The details of any edit share permissions for the dashboard.
   * @return editPermissions
   */
  @javax.annotation.Nullable
  public List<SharePermission> getEditPermissions() {
    return editPermissions;
  }



  /**
   * The ID of the dashboard.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }



  /**
   * Whether the dashboard is selected as a favorite by the user.
   * @return isFavourite
   */
  @javax.annotation.Nullable
  public Boolean getIsFavourite() {
    return isFavourite;
  }



  /**
   * Whether the current user has permission to edit the dashboard.
   * @return isWritable
   */
  @javax.annotation.Nullable
  public Boolean getIsWritable() {
    return isWritable;
  }



  /**
   * The name of the dashboard.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }



  /**
   * The owner of the dashboard.
   * @return owner
   */
  @javax.annotation.Nullable
  public UserBean getOwner() {
    return owner;
  }



  /**
   * The number of users who have this dashboard as a favorite.
   * @return popularity
   */
  @javax.annotation.Nullable
  public Long getPopularity() {
    return popularity;
  }



  /**
   * The rank of this dashboard.
   * @return rank
   */
  @javax.annotation.Nullable
  public Integer getRank() {
    return rank;
  }



  /**
   * The URL of these dashboard details.
   * @return self
   */
  @javax.annotation.Nullable
  public URI getSelf() {
    return self;
  }



  /**
   * The details of any view share permissions for the dashboard.
   * @return sharePermissions
   */
  @javax.annotation.Nullable
  public List<SharePermission> getSharePermissions() {
    return sharePermissions;
  }



  /**
   * Whether the current dashboard is system dashboard.
   * @return systemDashboard
   */
  @javax.annotation.Nullable
  public Boolean getSystemDashboard() {
    return systemDashboard;
  }



  /**
   * The URL of the dashboard.
   * @return view
   */
  @javax.annotation.Nullable
  public String getView() {
    return view;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dashboard dashboard = (Dashboard) o;
    return Objects.equals(this.automaticRefreshMs, dashboard.automaticRefreshMs) &&
        Objects.equals(this.description, dashboard.description) &&
        Objects.equals(this.editPermissions, dashboard.editPermissions) &&
        Objects.equals(this.id, dashboard.id) &&
        Objects.equals(this.isFavourite, dashboard.isFavourite) &&
        Objects.equals(this.isWritable, dashboard.isWritable) &&
        Objects.equals(this.name, dashboard.name) &&
        Objects.equals(this.owner, dashboard.owner) &&
        Objects.equals(this.popularity, dashboard.popularity) &&
        Objects.equals(this.rank, dashboard.rank) &&
        Objects.equals(this.self, dashboard.self) &&
        Objects.equals(this.sharePermissions, dashboard.sharePermissions) &&
        Objects.equals(this.systemDashboard, dashboard.systemDashboard) &&
        Objects.equals(this.view, dashboard.view);
  }

  @Override
  public int hashCode() {
    return Objects.hash(automaticRefreshMs, description, editPermissions, id, isFavourite, isWritable, name, owner, popularity, rank, self, sharePermissions, systemDashboard, view);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dashboard {\n");
    sb.append("    automaticRefreshMs: ").append(toIndentedString(automaticRefreshMs)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    editPermissions: ").append(toIndentedString(editPermissions)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isFavourite: ").append(toIndentedString(isFavourite)).append("\n");
    sb.append("    isWritable: ").append(toIndentedString(isWritable)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    popularity: ").append(toIndentedString(popularity)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    sharePermissions: ").append(toIndentedString(sharePermissions)).append("\n");
    sb.append("    systemDashboard: ").append(toIndentedString(systemDashboard)).append("\n");
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
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
    openapiFields.add("automaticRefreshMs");
    openapiFields.add("description");
    openapiFields.add("editPermissions");
    openapiFields.add("id");
    openapiFields.add("isFavourite");
    openapiFields.add("isWritable");
    openapiFields.add("name");
    openapiFields.add("owner");
    openapiFields.add("popularity");
    openapiFields.add("rank");
    openapiFields.add("self");
    openapiFields.add("sharePermissions");
    openapiFields.add("systemDashboard");
    openapiFields.add("view");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Dashboard
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Dashboard.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Dashboard is not found in the empty JSON string", Dashboard.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Dashboard.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Dashboard` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `owner`
      if (jsonObj.get("owner") != null && !jsonObj.get("owner").isJsonNull()) {
        UserBean.validateJsonElement(jsonObj.get("owner"));
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
      if ((jsonObj.get("view") != null && !jsonObj.get("view").isJsonNull()) && !jsonObj.get("view").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `view` to be a primitive type in the JSON string but got `%s`", jsonObj.get("view").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Dashboard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Dashboard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Dashboard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Dashboard.class));

       return (TypeAdapter<T>) new TypeAdapter<Dashboard>() {
           @Override
           public void write(JsonWriter out, Dashboard value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Dashboard read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Dashboard given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Dashboard
   * @throws IOException if the JSON string is invalid with respect to Dashboard
   */
  public static Dashboard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Dashboard.class);
  }

  /**
   * Convert an instance of Dashboard to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

