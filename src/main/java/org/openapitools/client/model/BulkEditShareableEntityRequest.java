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
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.client.model.BulkChangeOwnerDetails;
import org.openapitools.client.model.PermissionDetails;

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
 * Details of a request to bulk edit shareable entity.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class BulkEditShareableEntityRequest {
  /**
   * Allowed action for bulk edit shareable entity
   */
  @JsonAdapter(ActionEnum.Adapter.class)
  public enum ActionEnum {
    CHANGE_OWNER("changeOwner"),
    
    CHANGE_PERMISSION("changePermission"),
    
    ADD_PERMISSION("addPermission"),
    
    REMOVE_PERMISSION("removePermission");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActionEnum fromValue(String value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ActionEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ActionEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private ActionEnum action;

  public static final String SERIALIZED_NAME_CHANGE_OWNER_DETAILS = "changeOwnerDetails";
  @SerializedName(SERIALIZED_NAME_CHANGE_OWNER_DETAILS)
  private BulkChangeOwnerDetails changeOwnerDetails;

  public static final String SERIALIZED_NAME_ENTITY_IDS = "entityIds";
  @SerializedName(SERIALIZED_NAME_ENTITY_IDS)
  private Set<Long> entityIds = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_EXTEND_ADMIN_PERMISSIONS = "extendAdminPermissions";
  @SerializedName(SERIALIZED_NAME_EXTEND_ADMIN_PERMISSIONS)
  private Boolean extendAdminPermissions;

  public static final String SERIALIZED_NAME_PERMISSION_DETAILS = "permissionDetails";
  @SerializedName(SERIALIZED_NAME_PERMISSION_DETAILS)
  private PermissionDetails permissionDetails;

  public BulkEditShareableEntityRequest() {
  }

  public BulkEditShareableEntityRequest action(ActionEnum action) {
    this.action = action;
    return this;
  }

  /**
   * Allowed action for bulk edit shareable entity
   * @return action
   */
  @javax.annotation.Nonnull
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }


  public BulkEditShareableEntityRequest changeOwnerDetails(BulkChangeOwnerDetails changeOwnerDetails) {
    this.changeOwnerDetails = changeOwnerDetails;
    return this;
  }

  /**
   * The details of change owner action.
   * @return changeOwnerDetails
   */
  @javax.annotation.Nullable
  public BulkChangeOwnerDetails getChangeOwnerDetails() {
    return changeOwnerDetails;
  }

  public void setChangeOwnerDetails(BulkChangeOwnerDetails changeOwnerDetails) {
    this.changeOwnerDetails = changeOwnerDetails;
  }


  public BulkEditShareableEntityRequest entityIds(Set<Long> entityIds) {
    this.entityIds = entityIds;
    return this;
  }

  public BulkEditShareableEntityRequest addEntityIdsItem(Long entityIdsItem) {
    if (this.entityIds == null) {
      this.entityIds = new LinkedHashSet<>();
    }
    this.entityIds.add(entityIdsItem);
    return this;
  }

  /**
   * The id list of shareable entities to be changed.
   * @return entityIds
   */
  @javax.annotation.Nonnull
  public Set<Long> getEntityIds() {
    return entityIds;
  }

  public void setEntityIds(Set<Long> entityIds) {
    this.entityIds = entityIds;
  }


  public BulkEditShareableEntityRequest extendAdminPermissions(Boolean extendAdminPermissions) {
    this.extendAdminPermissions = extendAdminPermissions;
    return this;
  }

  /**
   * Whether the actions are executed by users with Administer Jira global permission.
   * @return extendAdminPermissions
   */
  @javax.annotation.Nullable
  public Boolean getExtendAdminPermissions() {
    return extendAdminPermissions;
  }

  public void setExtendAdminPermissions(Boolean extendAdminPermissions) {
    this.extendAdminPermissions = extendAdminPermissions;
  }


  public BulkEditShareableEntityRequest permissionDetails(PermissionDetails permissionDetails) {
    this.permissionDetails = permissionDetails;
    return this;
  }

  /**
   * The permission details to be changed.
   * @return permissionDetails
   */
  @javax.annotation.Nullable
  public PermissionDetails getPermissionDetails() {
    return permissionDetails;
  }

  public void setPermissionDetails(PermissionDetails permissionDetails) {
    this.permissionDetails = permissionDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkEditShareableEntityRequest bulkEditShareableEntityRequest = (BulkEditShareableEntityRequest) o;
    return Objects.equals(this.action, bulkEditShareableEntityRequest.action) &&
        Objects.equals(this.changeOwnerDetails, bulkEditShareableEntityRequest.changeOwnerDetails) &&
        Objects.equals(this.entityIds, bulkEditShareableEntityRequest.entityIds) &&
        Objects.equals(this.extendAdminPermissions, bulkEditShareableEntityRequest.extendAdminPermissions) &&
        Objects.equals(this.permissionDetails, bulkEditShareableEntityRequest.permissionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, changeOwnerDetails, entityIds, extendAdminPermissions, permissionDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkEditShareableEntityRequest {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    changeOwnerDetails: ").append(toIndentedString(changeOwnerDetails)).append("\n");
    sb.append("    entityIds: ").append(toIndentedString(entityIds)).append("\n");
    sb.append("    extendAdminPermissions: ").append(toIndentedString(extendAdminPermissions)).append("\n");
    sb.append("    permissionDetails: ").append(toIndentedString(permissionDetails)).append("\n");
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
    openapiFields.add("action");
    openapiFields.add("changeOwnerDetails");
    openapiFields.add("entityIds");
    openapiFields.add("extendAdminPermissions");
    openapiFields.add("permissionDetails");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("action");
    openapiRequiredFields.add("entityIds");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BulkEditShareableEntityRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BulkEditShareableEntityRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BulkEditShareableEntityRequest is not found in the empty JSON string", BulkEditShareableEntityRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BulkEditShareableEntityRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BulkEditShareableEntityRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BulkEditShareableEntityRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      // validate the required field `action`
      ActionEnum.validateJsonElement(jsonObj.get("action"));
      // validate the optional field `changeOwnerDetails`
      if (jsonObj.get("changeOwnerDetails") != null && !jsonObj.get("changeOwnerDetails").isJsonNull()) {
        BulkChangeOwnerDetails.validateJsonElement(jsonObj.get("changeOwnerDetails"));
      }
      // ensure the required json array is present
      if (jsonObj.get("entityIds") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("entityIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `entityIds` to be an array in the JSON string but got `%s`", jsonObj.get("entityIds").toString()));
      }
      // validate the optional field `permissionDetails`
      if (jsonObj.get("permissionDetails") != null && !jsonObj.get("permissionDetails").isJsonNull()) {
        PermissionDetails.validateJsonElement(jsonObj.get("permissionDetails"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BulkEditShareableEntityRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BulkEditShareableEntityRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BulkEditShareableEntityRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BulkEditShareableEntityRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<BulkEditShareableEntityRequest>() {
           @Override
           public void write(JsonWriter out, BulkEditShareableEntityRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BulkEditShareableEntityRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BulkEditShareableEntityRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BulkEditShareableEntityRequest
   * @throws IOException if the JSON string is invalid with respect to BulkEditShareableEntityRequest
   */
  public static BulkEditShareableEntityRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BulkEditShareableEntityRequest.class);
  }

  /**
   * Convert an instance of BulkEditShareableEntityRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
