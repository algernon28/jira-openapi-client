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
 * IssueBulkEditField
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class IssueBulkEditField {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FIELD_OPTIONS = "fieldOptions";
  @SerializedName(SERIALIZED_NAME_FIELD_OPTIONS)
  private List<Object> fieldOptions = new ArrayList<>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IS_REQUIRED = "isRequired";
  @SerializedName(SERIALIZED_NAME_IS_REQUIRED)
  private Boolean isRequired;

  /**
   * Gets or Sets multiSelectFieldOptions
   */
  @JsonAdapter(MultiSelectFieldOptionsEnum.Adapter.class)
  public enum MultiSelectFieldOptionsEnum {
    ADD("ADD"),
    
    REMOVE("REMOVE"),
    
    REPLACE("REPLACE"),
    
    REMOVE_ALL("REMOVE_ALL");

    private String value;

    MultiSelectFieldOptionsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MultiSelectFieldOptionsEnum fromValue(String value) {
      for (MultiSelectFieldOptionsEnum b : MultiSelectFieldOptionsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MultiSelectFieldOptionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MultiSelectFieldOptionsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MultiSelectFieldOptionsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MultiSelectFieldOptionsEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      MultiSelectFieldOptionsEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_MULTI_SELECT_FIELD_OPTIONS = "multiSelectFieldOptions";
  @SerializedName(SERIALIZED_NAME_MULTI_SELECT_FIELD_OPTIONS)
  private List<MultiSelectFieldOptionsEnum> multiSelectFieldOptions = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SEARCH_URL = "searchUrl";
  @SerializedName(SERIALIZED_NAME_SEARCH_URL)
  private String searchUrl;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_UNAVAILABLE_MESSAGE = "unavailableMessage";
  @SerializedName(SERIALIZED_NAME_UNAVAILABLE_MESSAGE)
  private String unavailableMessage;

  public IssueBulkEditField() {
  }

  public IssueBulkEditField description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the field.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public IssueBulkEditField fieldOptions(List<Object> fieldOptions) {
    this.fieldOptions = fieldOptions;
    return this;
  }

  public IssueBulkEditField addFieldOptionsItem(Object fieldOptionsItem) {
    if (this.fieldOptions == null) {
      this.fieldOptions = new ArrayList<>();
    }
    this.fieldOptions.add(fieldOptionsItem);
    return this;
  }

  /**
   * A list of options related to the field, applicable in contexts where multiple selections are allowed.
   * @return fieldOptions
   */
  @javax.annotation.Nullable
  public List<Object> getFieldOptions() {
    return fieldOptions;
  }

  public void setFieldOptions(List<Object> fieldOptions) {
    this.fieldOptions = fieldOptions;
  }


  public IssueBulkEditField id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique ID of the field.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public IssueBulkEditField isRequired(Boolean isRequired) {
    this.isRequired = isRequired;
    return this;
  }

  /**
   * Indicates whether the field is mandatory for the operation.
   * @return isRequired
   */
  @javax.annotation.Nullable
  public Boolean getIsRequired() {
    return isRequired;
  }

  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }


  public IssueBulkEditField multiSelectFieldOptions(List<MultiSelectFieldOptionsEnum> multiSelectFieldOptions) {
    this.multiSelectFieldOptions = multiSelectFieldOptions;
    return this;
  }

  public IssueBulkEditField addMultiSelectFieldOptionsItem(MultiSelectFieldOptionsEnum multiSelectFieldOptionsItem) {
    if (this.multiSelectFieldOptions == null) {
      this.multiSelectFieldOptions = new ArrayList<>();
    }
    this.multiSelectFieldOptions.add(multiSelectFieldOptionsItem);
    return this;
  }

  /**
   * Specifies supported actions (like add, replace, remove) on multi-select fields via an enum.
   * @return multiSelectFieldOptions
   */
  @javax.annotation.Nullable
  public List<MultiSelectFieldOptionsEnum> getMultiSelectFieldOptions() {
    return multiSelectFieldOptions;
  }

  public void setMultiSelectFieldOptions(List<MultiSelectFieldOptionsEnum> multiSelectFieldOptions) {
    this.multiSelectFieldOptions = multiSelectFieldOptions;
  }


  public IssueBulkEditField name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The display name of the field.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public IssueBulkEditField searchUrl(String searchUrl) {
    this.searchUrl = searchUrl;
    return this;
  }

  /**
   * A URL to fetch additional data for the field
   * @return searchUrl
   */
  @javax.annotation.Nullable
  public String getSearchUrl() {
    return searchUrl;
  }

  public void setSearchUrl(String searchUrl) {
    this.searchUrl = searchUrl;
  }


  public IssueBulkEditField type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the field.
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public IssueBulkEditField unavailableMessage(String unavailableMessage) {
    this.unavailableMessage = unavailableMessage;
    return this;
  }

  /**
   * A message indicating why the field is unavailable for editing.
   * @return unavailableMessage
   */
  @javax.annotation.Nullable
  public String getUnavailableMessage() {
    return unavailableMessage;
  }

  public void setUnavailableMessage(String unavailableMessage) {
    this.unavailableMessage = unavailableMessage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueBulkEditField issueBulkEditField = (IssueBulkEditField) o;
    return Objects.equals(this.description, issueBulkEditField.description) &&
        Objects.equals(this.fieldOptions, issueBulkEditField.fieldOptions) &&
        Objects.equals(this.id, issueBulkEditField.id) &&
        Objects.equals(this.isRequired, issueBulkEditField.isRequired) &&
        Objects.equals(this.multiSelectFieldOptions, issueBulkEditField.multiSelectFieldOptions) &&
        Objects.equals(this.name, issueBulkEditField.name) &&
        Objects.equals(this.searchUrl, issueBulkEditField.searchUrl) &&
        Objects.equals(this.type, issueBulkEditField.type) &&
        Objects.equals(this.unavailableMessage, issueBulkEditField.unavailableMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, fieldOptions, id, isRequired, multiSelectFieldOptions, name, searchUrl, type, unavailableMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueBulkEditField {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fieldOptions: ").append(toIndentedString(fieldOptions)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    multiSelectFieldOptions: ").append(toIndentedString(multiSelectFieldOptions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    searchUrl: ").append(toIndentedString(searchUrl)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    unavailableMessage: ").append(toIndentedString(unavailableMessage)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("fieldOptions");
    openapiFields.add("id");
    openapiFields.add("isRequired");
    openapiFields.add("multiSelectFieldOptions");
    openapiFields.add("name");
    openapiFields.add("searchUrl");
    openapiFields.add("type");
    openapiFields.add("unavailableMessage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IssueBulkEditField
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IssueBulkEditField.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssueBulkEditField is not found in the empty JSON string", IssueBulkEditField.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IssueBulkEditField.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IssueBulkEditField` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("fieldOptions") != null && !jsonObj.get("fieldOptions").isJsonNull() && !jsonObj.get("fieldOptions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldOptions` to be an array in the JSON string but got `%s`", jsonObj.get("fieldOptions").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("multiSelectFieldOptions") != null && !jsonObj.get("multiSelectFieldOptions").isJsonNull() && !jsonObj.get("multiSelectFieldOptions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `multiSelectFieldOptions` to be an array in the JSON string but got `%s`", jsonObj.get("multiSelectFieldOptions").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("searchUrl") != null && !jsonObj.get("searchUrl").isJsonNull()) && !jsonObj.get("searchUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `searchUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("searchUrl").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("unavailableMessage") != null && !jsonObj.get("unavailableMessage").isJsonNull()) && !jsonObj.get("unavailableMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unavailableMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unavailableMessage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IssueBulkEditField.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssueBulkEditField' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssueBulkEditField> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssueBulkEditField.class));

       return (TypeAdapter<T>) new TypeAdapter<IssueBulkEditField>() {
           @Override
           public void write(JsonWriter out, IssueBulkEditField value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IssueBulkEditField read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IssueBulkEditField given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IssueBulkEditField
   * @throws IOException if the JSON string is invalid with respect to IssueBulkEditField
   */
  public static IssueBulkEditField fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssueBulkEditField.class);
  }

  /**
   * Convert an instance of IssueBulkEditField to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
