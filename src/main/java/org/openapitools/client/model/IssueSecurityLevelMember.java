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
import org.openapitools.client.model.PermissionHolder;

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
 * Issue security level member.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class IssueSecurityLevelMember {
  public static final String SERIALIZED_NAME_HOLDER = "holder";
  @SerializedName(SERIALIZED_NAME_HOLDER)
  private PermissionHolder holder;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_ISSUE_SECURITY_LEVEL_ID = "issueSecurityLevelId";
  @SerializedName(SERIALIZED_NAME_ISSUE_SECURITY_LEVEL_ID)
  private Long issueSecurityLevelId;

  public static final String SERIALIZED_NAME_MANAGED = "managed";
  @SerializedName(SERIALIZED_NAME_MANAGED)
  private Boolean managed;

  public IssueSecurityLevelMember() {
  }

  public IssueSecurityLevelMember holder(PermissionHolder holder) {
    this.holder = holder;
    return this;
  }

  /**
   * The user or group being granted the permission. It consists of a &#x60;type&#x60; and a type-dependent &#x60;parameter&#x60;. See [Holder object](../api-group-permission-schemes/#holder-object) in *Get all permission schemes* for more information.
   * @return holder
   */
  @javax.annotation.Nonnull
  public PermissionHolder getHolder() {
    return holder;
  }

  public void setHolder(PermissionHolder holder) {
    this.holder = holder;
  }


  public IssueSecurityLevelMember id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the issue security level member.
   * @return id
   */
  @javax.annotation.Nonnull
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public IssueSecurityLevelMember issueSecurityLevelId(Long issueSecurityLevelId) {
    this.issueSecurityLevelId = issueSecurityLevelId;
    return this;
  }

  /**
   * The ID of the issue security level.
   * @return issueSecurityLevelId
   */
  @javax.annotation.Nonnull
  public Long getIssueSecurityLevelId() {
    return issueSecurityLevelId;
  }

  public void setIssueSecurityLevelId(Long issueSecurityLevelId) {
    this.issueSecurityLevelId = issueSecurityLevelId;
  }


  public IssueSecurityLevelMember managed(Boolean managed) {
    this.managed = managed;
    return this;
  }

  /**
   * Get managed
   * @return managed
   */
  @javax.annotation.Nullable
  public Boolean getManaged() {
    return managed;
  }

  public void setManaged(Boolean managed) {
    this.managed = managed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueSecurityLevelMember issueSecurityLevelMember = (IssueSecurityLevelMember) o;
    return Objects.equals(this.holder, issueSecurityLevelMember.holder) &&
        Objects.equals(this.id, issueSecurityLevelMember.id) &&
        Objects.equals(this.issueSecurityLevelId, issueSecurityLevelMember.issueSecurityLevelId) &&
        Objects.equals(this.managed, issueSecurityLevelMember.managed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(holder, id, issueSecurityLevelId, managed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueSecurityLevelMember {\n");
    sb.append("    holder: ").append(toIndentedString(holder)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issueSecurityLevelId: ").append(toIndentedString(issueSecurityLevelId)).append("\n");
    sb.append("    managed: ").append(toIndentedString(managed)).append("\n");
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
    openapiFields.add("holder");
    openapiFields.add("id");
    openapiFields.add("issueSecurityLevelId");
    openapiFields.add("managed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("holder");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("issueSecurityLevelId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IssueSecurityLevelMember
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IssueSecurityLevelMember.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssueSecurityLevelMember is not found in the empty JSON string", IssueSecurityLevelMember.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IssueSecurityLevelMember.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IssueSecurityLevelMember` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IssueSecurityLevelMember.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `holder`
      PermissionHolder.validateJsonElement(jsonObj.get("holder"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IssueSecurityLevelMember.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssueSecurityLevelMember' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssueSecurityLevelMember> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssueSecurityLevelMember.class));

       return (TypeAdapter<T>) new TypeAdapter<IssueSecurityLevelMember>() {
           @Override
           public void write(JsonWriter out, IssueSecurityLevelMember value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IssueSecurityLevelMember read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IssueSecurityLevelMember given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IssueSecurityLevelMember
   * @throws IOException if the JSON string is invalid with respect to IssueSecurityLevelMember
   */
  public static IssueSecurityLevelMember fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssueSecurityLevelMember.class);
  }

  /**
   * Convert an instance of IssueSecurityLevelMember to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
