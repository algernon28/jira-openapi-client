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
import org.openapitools.client.model.JiraUserField;

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
 * JiraMultipleSelectUserPickerField
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class JiraMultipleSelectUserPickerField {
  public static final String SERIALIZED_NAME_FIELD_ID = "fieldId";
  @SerializedName(SERIALIZED_NAME_FIELD_ID)
  private String fieldId;

  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private List<JiraUserField> users = new ArrayList<>();

  public JiraMultipleSelectUserPickerField() {
  }

  public JiraMultipleSelectUserPickerField fieldId(String fieldId) {
    this.fieldId = fieldId;
    return this;
  }

  /**
   * Get fieldId
   * @return fieldId
   */
  @javax.annotation.Nonnull
  public String getFieldId() {
    return fieldId;
  }

  public void setFieldId(String fieldId) {
    this.fieldId = fieldId;
  }


  public JiraMultipleSelectUserPickerField users(List<JiraUserField> users) {
    this.users = users;
    return this;
  }

  public JiraMultipleSelectUserPickerField addUsersItem(JiraUserField usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * Get users
   * @return users
   */
  @javax.annotation.Nullable
  public List<JiraUserField> getUsers() {
    return users;
  }

  public void setUsers(List<JiraUserField> users) {
    this.users = users;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraMultipleSelectUserPickerField jiraMultipleSelectUserPickerField = (JiraMultipleSelectUserPickerField) o;
    return Objects.equals(this.fieldId, jiraMultipleSelectUserPickerField.fieldId) &&
        Objects.equals(this.users, jiraMultipleSelectUserPickerField.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldId, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraMultipleSelectUserPickerField {\n");
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
    openapiFields.add("fieldId");
    openapiFields.add("users");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fieldId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to JiraMultipleSelectUserPickerField
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!JiraMultipleSelectUserPickerField.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JiraMultipleSelectUserPickerField is not found in the empty JSON string", JiraMultipleSelectUserPickerField.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!JiraMultipleSelectUserPickerField.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JiraMultipleSelectUserPickerField` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : JiraMultipleSelectUserPickerField.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("fieldId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldId").toString()));
      }
      if (jsonObj.get("users") != null && !jsonObj.get("users").isJsonNull()) {
        JsonArray jsonArrayusers = jsonObj.getAsJsonArray("users");
        if (jsonArrayusers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("users").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `users` to be an array in the JSON string but got `%s`", jsonObj.get("users").toString()));
          }

          // validate the optional field `users` (array)
          for (int i = 0; i < jsonArrayusers.size(); i++) {
            JiraUserField.validateJsonElement(jsonArrayusers.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JiraMultipleSelectUserPickerField.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JiraMultipleSelectUserPickerField' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JiraMultipleSelectUserPickerField> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JiraMultipleSelectUserPickerField.class));

       return (TypeAdapter<T>) new TypeAdapter<JiraMultipleSelectUserPickerField>() {
           @Override
           public void write(JsonWriter out, JiraMultipleSelectUserPickerField value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JiraMultipleSelectUserPickerField read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of JiraMultipleSelectUserPickerField given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of JiraMultipleSelectUserPickerField
   * @throws IOException if the JSON string is invalid with respect to JiraMultipleSelectUserPickerField
   */
  public static JiraMultipleSelectUserPickerField fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JiraMultipleSelectUserPickerField.class);
  }

  /**
   * Convert an instance of JiraMultipleSelectUserPickerField to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
