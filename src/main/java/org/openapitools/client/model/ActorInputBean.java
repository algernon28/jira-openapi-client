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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * ActorInputBean
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class ActorInputBean {
  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private List<String> group = new ArrayList<>();

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private List<String> groupId = new ArrayList<>();

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private List<String> user = new ArrayList<>();

  public ActorInputBean() {
  }

  public ActorInputBean group(List<String> group) {
    this.group = group;
    return this;
  }

  public ActorInputBean addGroupItem(String groupItem) {
    if (this.group == null) {
      this.group = new ArrayList<>();
    }
    this.group.add(groupItem);
    return this;
  }

  /**
   * The name of the group to add as a default actor. This parameter cannot be used with the &#x60;groupId&#x60; parameter. As a group&#39;s name can change,use of &#x60;groupId&#x60; is recommended. This parameter accepts a comma-separated list. For example, &#x60;\&quot;group\&quot;:[\&quot;project-admin\&quot;, \&quot;jira-developers\&quot;]&#x60;.
   * @return group
   */
  @javax.annotation.Nullable
  public List<String> getGroup() {
    return group;
  }

  public void setGroup(List<String> group) {
    this.group = group;
  }


  public ActorInputBean groupId(List<String> groupId) {
    this.groupId = groupId;
    return this;
  }

  public ActorInputBean addGroupIdItem(String groupIdItem) {
    if (this.groupId == null) {
      this.groupId = new ArrayList<>();
    }
    this.groupId.add(groupIdItem);
    return this;
  }

  /**
   * The ID of the group to add as a default actor. This parameter cannot be used with the &#x60;group&#x60; parameter This parameter accepts a comma-separated list. For example, &#x60;\&quot;groupId\&quot;:[\&quot;77f6ab39-e755-4570-a6ae-2d7a8df0bcb8\&quot;, \&quot;0c011f85-69ed-49c4-a801-3b18d0f771bc\&quot;]&#x60;.
   * @return groupId
   */
  @javax.annotation.Nullable
  public List<String> getGroupId() {
    return groupId;
  }

  public void setGroupId(List<String> groupId) {
    this.groupId = groupId;
  }


  public ActorInputBean user(List<String> user) {
    this.user = user;
    return this;
  }

  public ActorInputBean addUserItem(String userItem) {
    if (this.user == null) {
      this.user = new ArrayList<>();
    }
    this.user.add(userItem);
    return this;
  }

  /**
   * The account IDs of the users to add as default actors. This parameter accepts a comma-separated list. For example, &#x60;\&quot;user\&quot;:[\&quot;5b10a2844c20165700ede21g\&quot;, \&quot;5b109f2e9729b51b54dc274d\&quot;]&#x60;.
   * @return user
   */
  @javax.annotation.Nullable
  public List<String> getUser() {
    return user;
  }

  public void setUser(List<String> user) {
    this.user = user;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActorInputBean actorInputBean = (ActorInputBean) o;
    return Objects.equals(this.group, actorInputBean.group) &&
        Objects.equals(this.groupId, actorInputBean.groupId) &&
        Objects.equals(this.user, actorInputBean.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, groupId, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActorInputBean {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
    openapiFields.add("group");
    openapiFields.add("groupId");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ActorInputBean
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ActorInputBean.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ActorInputBean is not found in the empty JSON string", ActorInputBean.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ActorInputBean.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ActorInputBean` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("group") != null && !jsonObj.get("group").isJsonNull() && !jsonObj.get("group").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `group` to be an array in the JSON string but got `%s`", jsonObj.get("group").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("groupId") != null && !jsonObj.get("groupId").isJsonNull() && !jsonObj.get("groupId").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupId` to be an array in the JSON string but got `%s`", jsonObj.get("groupId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull() && !jsonObj.get("user").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `user` to be an array in the JSON string but got `%s`", jsonObj.get("user").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ActorInputBean.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ActorInputBean' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ActorInputBean> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ActorInputBean.class));

       return (TypeAdapter<T>) new TypeAdapter<ActorInputBean>() {
           @Override
           public void write(JsonWriter out, ActorInputBean value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ActorInputBean read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ActorInputBean given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ActorInputBean
   * @throws IOException if the JSON string is invalid with respect to ActorInputBean
   */
  public static ActorInputBean fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ActorInputBean.class);
  }

  /**
   * Convert an instance of ActorInputBean to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

