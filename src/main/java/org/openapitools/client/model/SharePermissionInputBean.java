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
 * SharePermissionInputBean
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class SharePermissionInputBean {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_GROUPNAME = "groupname";
  @SerializedName(SERIALIZED_NAME_GROUPNAME)
  private String groupname;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public static final String SERIALIZED_NAME_PROJECT_ROLE_ID = "projectRoleId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ROLE_ID)
  private String projectRoleId;

  public static final String SERIALIZED_NAME_RIGHTS = "rights";
  @SerializedName(SERIALIZED_NAME_RIGHTS)
  private Integer rights;

  /**
   * The type of the share permission.Specify the type as follows:   *  &#x60;user&#x60; Share with a user.  *  &#x60;group&#x60; Share with a group. Specify &#x60;groupname&#x60; as well.  *  &#x60;project&#x60; Share with a project. Specify &#x60;projectId&#x60; as well.  *  &#x60;projectRole&#x60; Share with a project role in a project. Specify &#x60;projectId&#x60; and &#x60;projectRoleId&#x60; as well.  *  &#x60;global&#x60; Share globally, including anonymous users. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.  *  &#x60;authenticated&#x60; Share with all logged-in users. This shows as &#x60;loggedin&#x60; in the response. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    USER("user"),
    
    PROJECT("project"),
    
    GROUP("group"),
    
    PROJECT_ROLE("projectRole"),
    
    GLOBAL("global"),
    
    AUTHENTICATED("authenticated");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public SharePermissionInputBean() {
  }

  public SharePermissionInputBean accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The user account ID that the filter is shared with. For a request, specify the &#x60;accountId&#x60; property for the user.
   * @return accountId
   */
  @javax.annotation.Nullable
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public SharePermissionInputBean groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * The ID of the group, which uniquely identifies the group across all Atlassian products.For example, *952d12c3-5b5b-4d04-bb32-44d383afc4b2*. Cannot be provided with &#x60;groupname&#x60;.
   * @return groupId
   */
  @javax.annotation.Nullable
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public SharePermissionInputBean groupname(String groupname) {
    this.groupname = groupname;
    return this;
  }

  /**
   * The name of the group to share the filter with. Set &#x60;type&#x60; to &#x60;group&#x60;. Please note that the name of a group is mutable, to reliably identify a group use &#x60;groupId&#x60;.
   * @return groupname
   */
  @javax.annotation.Nullable
  public String getGroupname() {
    return groupname;
  }

  public void setGroupname(String groupname) {
    this.groupname = groupname;
  }


  public SharePermissionInputBean projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The ID of the project to share the filter with. Set &#x60;type&#x60; to &#x60;project&#x60;.
   * @return projectId
   */
  @javax.annotation.Nullable
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  public SharePermissionInputBean projectRoleId(String projectRoleId) {
    this.projectRoleId = projectRoleId;
    return this;
  }

  /**
   * The ID of the project role to share the filter with. Set &#x60;type&#x60; to &#x60;projectRole&#x60; and the &#x60;projectId&#x60; for the project that the role is in.
   * @return projectRoleId
   */
  @javax.annotation.Nullable
  public String getProjectRoleId() {
    return projectRoleId;
  }

  public void setProjectRoleId(String projectRoleId) {
    this.projectRoleId = projectRoleId;
  }


  public SharePermissionInputBean rights(Integer rights) {
    this.rights = rights;
    return this;
  }

  /**
   * The rights for the share permission.
   * @return rights
   */
  @javax.annotation.Nullable
  public Integer getRights() {
    return rights;
  }

  public void setRights(Integer rights) {
    this.rights = rights;
  }


  public SharePermissionInputBean type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the share permission.Specify the type as follows:   *  &#x60;user&#x60; Share with a user.  *  &#x60;group&#x60; Share with a group. Specify &#x60;groupname&#x60; as well.  *  &#x60;project&#x60; Share with a project. Specify &#x60;projectId&#x60; as well.  *  &#x60;projectRole&#x60; Share with a project role in a project. Specify &#x60;projectId&#x60; and &#x60;projectRoleId&#x60; as well.  *  &#x60;global&#x60; Share globally, including anonymous users. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.  *  &#x60;authenticated&#x60; Share with all logged-in users. This shows as &#x60;loggedin&#x60; in the response. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.
   * @return type
   */
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharePermissionInputBean sharePermissionInputBean = (SharePermissionInputBean) o;
    return Objects.equals(this.accountId, sharePermissionInputBean.accountId) &&
        Objects.equals(this.groupId, sharePermissionInputBean.groupId) &&
        Objects.equals(this.groupname, sharePermissionInputBean.groupname) &&
        Objects.equals(this.projectId, sharePermissionInputBean.projectId) &&
        Objects.equals(this.projectRoleId, sharePermissionInputBean.projectRoleId) &&
        Objects.equals(this.rights, sharePermissionInputBean.rights) &&
        Objects.equals(this.type, sharePermissionInputBean.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, groupId, groupname, projectId, projectRoleId, rights, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharePermissionInputBean {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupname: ").append(toIndentedString(groupname)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    projectRoleId: ").append(toIndentedString(projectRoleId)).append("\n");
    sb.append("    rights: ").append(toIndentedString(rights)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("accountId");
    openapiFields.add("groupId");
    openapiFields.add("groupname");
    openapiFields.add("projectId");
    openapiFields.add("projectRoleId");
    openapiFields.add("rights");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SharePermissionInputBean
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SharePermissionInputBean.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SharePermissionInputBean is not found in the empty JSON string", SharePermissionInputBean.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SharePermissionInputBean.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SharePermissionInputBean` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SharePermissionInputBean.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("accountId") != null && !jsonObj.get("accountId").isJsonNull()) && !jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
      if ((jsonObj.get("groupId") != null && !jsonObj.get("groupId").isJsonNull()) && !jsonObj.get("groupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("groupId").toString()));
      }
      if ((jsonObj.get("groupname") != null && !jsonObj.get("groupname").isJsonNull()) && !jsonObj.get("groupname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("groupname").toString()));
      }
      if ((jsonObj.get("projectId") != null && !jsonObj.get("projectId").isJsonNull()) && !jsonObj.get("projectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectId").toString()));
      }
      if ((jsonObj.get("projectRoleId") != null && !jsonObj.get("projectRoleId").isJsonNull()) && !jsonObj.get("projectRoleId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectRoleId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectRoleId").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `type`
      TypeEnum.validateJsonElement(jsonObj.get("type"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SharePermissionInputBean.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SharePermissionInputBean' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SharePermissionInputBean> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SharePermissionInputBean.class));

       return (TypeAdapter<T>) new TypeAdapter<SharePermissionInputBean>() {
           @Override
           public void write(JsonWriter out, SharePermissionInputBean value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SharePermissionInputBean read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SharePermissionInputBean given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SharePermissionInputBean
   * @throws IOException if the JSON string is invalid with respect to SharePermissionInputBean
   */
  public static SharePermissionInputBean fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SharePermissionInputBean.class);
  }

  /**
   * Convert an instance of SharePermissionInputBean to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
