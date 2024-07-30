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
 * Details of scheme and new default level.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class DefaultLevelValue {
  public static final String SERIALIZED_NAME_DEFAULT_LEVEL_ID = "defaultLevelId";
  @SerializedName(SERIALIZED_NAME_DEFAULT_LEVEL_ID)
  private String defaultLevelId;

  public static final String SERIALIZED_NAME_ISSUE_SECURITY_SCHEME_ID = "issueSecuritySchemeId";
  @SerializedName(SERIALIZED_NAME_ISSUE_SECURITY_SCHEME_ID)
  private String issueSecuritySchemeId;

  public DefaultLevelValue() {
  }

  public DefaultLevelValue defaultLevelId(String defaultLevelId) {
    this.defaultLevelId = defaultLevelId;
    return this;
  }

  /**
   * The ID of the issue security level to set as default for the specified scheme. Providing null will reset the default level.
   * @return defaultLevelId
   */
  @javax.annotation.Nonnull
  public String getDefaultLevelId() {
    return defaultLevelId;
  }

  public void setDefaultLevelId(String defaultLevelId) {
    this.defaultLevelId = defaultLevelId;
  }


  public DefaultLevelValue issueSecuritySchemeId(String issueSecuritySchemeId) {
    this.issueSecuritySchemeId = issueSecuritySchemeId;
    return this;
  }

  /**
   * The ID of the issue security scheme to set default level for.
   * @return issueSecuritySchemeId
   */
  @javax.annotation.Nonnull
  public String getIssueSecuritySchemeId() {
    return issueSecuritySchemeId;
  }

  public void setIssueSecuritySchemeId(String issueSecuritySchemeId) {
    this.issueSecuritySchemeId = issueSecuritySchemeId;
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
   * @return the DefaultLevelValue instance itself
   */
  public DefaultLevelValue putAdditionalProperty(String key, Object value) {
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
    DefaultLevelValue defaultLevelValue = (DefaultLevelValue) o;
    return Objects.equals(this.defaultLevelId, defaultLevelValue.defaultLevelId) &&
        Objects.equals(this.issueSecuritySchemeId, defaultLevelValue.issueSecuritySchemeId)&&
        Objects.equals(this.additionalProperties, defaultLevelValue.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultLevelId, issueSecuritySchemeId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultLevelValue {\n");
    sb.append("    defaultLevelId: ").append(toIndentedString(defaultLevelId)).append("\n");
    sb.append("    issueSecuritySchemeId: ").append(toIndentedString(issueSecuritySchemeId)).append("\n");
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
    openapiFields.add("defaultLevelId");
    openapiFields.add("issueSecuritySchemeId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("defaultLevelId");
    openapiRequiredFields.add("issueSecuritySchemeId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DefaultLevelValue
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DefaultLevelValue.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DefaultLevelValue is not found in the empty JSON string", DefaultLevelValue.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DefaultLevelValue.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("defaultLevelId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `defaultLevelId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("defaultLevelId").toString()));
      }
      if (!jsonObj.get("issueSecuritySchemeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issueSecuritySchemeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issueSecuritySchemeId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DefaultLevelValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DefaultLevelValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DefaultLevelValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DefaultLevelValue.class));

       return (TypeAdapter<T>) new TypeAdapter<DefaultLevelValue>() {
           @Override
           public void write(JsonWriter out, DefaultLevelValue value) throws IOException {
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
           public DefaultLevelValue read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DefaultLevelValue instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of DefaultLevelValue given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DefaultLevelValue
   * @throws IOException if the JSON string is invalid with respect to DefaultLevelValue
   */
  public static DefaultLevelValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DefaultLevelValue.class);
  }

  /**
   * Convert an instance of DefaultLevelValue to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

