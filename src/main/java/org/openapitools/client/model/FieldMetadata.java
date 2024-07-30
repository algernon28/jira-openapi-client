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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.JsonTypeBean;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * The metadata describing an issue field.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class FieldMetadata {
  public static final String SERIALIZED_NAME_ALLOWED_VALUES = "allowedValues";
  @SerializedName(SERIALIZED_NAME_ALLOWED_VALUES)
  private List<Object> allowedValues = new ArrayList<>();

  public static final String SERIALIZED_NAME_AUTO_COMPLETE_URL = "autoCompleteUrl";
  @SerializedName(SERIALIZED_NAME_AUTO_COMPLETE_URL)
  private String autoCompleteUrl;

  public static final String SERIALIZED_NAME_CONFIGURATION = "configuration";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION)
  private Map<String, Object> _configuration = new HashMap<>();

  public static final String SERIALIZED_NAME_DEFAULT_VALUE = "defaultValue";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VALUE)
  private Object defaultValue = null;

  public static final String SERIALIZED_NAME_HAS_DEFAULT_VALUE = "hasDefaultValue";
  @SerializedName(SERIALIZED_NAME_HAS_DEFAULT_VALUE)
  private Boolean hasDefaultValue;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OPERATIONS = "operations";
  @SerializedName(SERIALIZED_NAME_OPERATIONS)
  private List<String> operations = new ArrayList<>();

  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  private Boolean required;

  public static final String SERIALIZED_NAME_SCHEMA = "schema";
  @SerializedName(SERIALIZED_NAME_SCHEMA)
  private JsonTypeBean schema;

  public FieldMetadata() {
  }

  public FieldMetadata(
     List<Object> allowedValues, 
     String autoCompleteUrl, 
     Map<String, Object> _configuration, 
     Object defaultValue, 
     Boolean hasDefaultValue, 
     String key, 
     String name, 
     List<String> operations, 
     Boolean required, 
     JsonTypeBean schema
  ) {
    this();
    this.allowedValues = allowedValues;
    this.autoCompleteUrl = autoCompleteUrl;
    this._configuration = _configuration;
    this.defaultValue = defaultValue;
    this.hasDefaultValue = hasDefaultValue;
    this.key = key;
    this.name = name;
    this.operations = operations;
    this.required = required;
    this.schema = schema;
  }

  /**
   * The list of values allowed in the field.
   * @return allowedValues
   */
  @javax.annotation.Nullable
  public List<Object> getAllowedValues() {
    return allowedValues;
  }



  /**
   * The URL that can be used to automatically complete the field.
   * @return autoCompleteUrl
   */
  @javax.annotation.Nullable
  public String getAutoCompleteUrl() {
    return autoCompleteUrl;
  }



  /**
   * The configuration properties.
   * @return _configuration
   */
  @javax.annotation.Nullable
  public Map<String, Object> getConfiguration() {
    return _configuration;
  }



  /**
   * The default value of the field.
   * @return defaultValue
   */
  @javax.annotation.Nullable
  public Object getDefaultValue() {
    return defaultValue;
  }



  /**
   * Whether the field has a default value.
   * @return hasDefaultValue
   */
  @javax.annotation.Nullable
  public Boolean getHasDefaultValue() {
    return hasDefaultValue;
  }



  /**
   * The key of the field.
   * @return key
   */
  @javax.annotation.Nonnull
  public String getKey() {
    return key;
  }



  /**
   * The name of the field.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }



  /**
   * The list of operations that can be performed on the field.
   * @return operations
   */
  @javax.annotation.Nonnull
  public List<String> getOperations() {
    return operations;
  }



  /**
   * Whether the field is required.
   * @return required
   */
  @javax.annotation.Nonnull
  public Boolean getRequired() {
    return required;
  }



  /**
   * The data type of the field.
   * @return schema
   */
  @javax.annotation.Nonnull
  public JsonTypeBean getSchema() {
    return schema;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldMetadata fieldMetadata = (FieldMetadata) o;
    return Objects.equals(this.allowedValues, fieldMetadata.allowedValues) &&
        Objects.equals(this.autoCompleteUrl, fieldMetadata.autoCompleteUrl) &&
        Objects.equals(this._configuration, fieldMetadata._configuration) &&
        Objects.equals(this.defaultValue, fieldMetadata.defaultValue) &&
        Objects.equals(this.hasDefaultValue, fieldMetadata.hasDefaultValue) &&
        Objects.equals(this.key, fieldMetadata.key) &&
        Objects.equals(this.name, fieldMetadata.name) &&
        Objects.equals(this.operations, fieldMetadata.operations) &&
        Objects.equals(this.required, fieldMetadata.required) &&
        Objects.equals(this.schema, fieldMetadata.schema);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedValues, autoCompleteUrl, _configuration, defaultValue, hasDefaultValue, key, name, operations, required, schema);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldMetadata {\n");
    sb.append("    allowedValues: ").append(toIndentedString(allowedValues)).append("\n");
    sb.append("    autoCompleteUrl: ").append(toIndentedString(autoCompleteUrl)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    hasDefaultValue: ").append(toIndentedString(hasDefaultValue)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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
    openapiFields.add("allowedValues");
    openapiFields.add("autoCompleteUrl");
    openapiFields.add("configuration");
    openapiFields.add("defaultValue");
    openapiFields.add("hasDefaultValue");
    openapiFields.add("key");
    openapiFields.add("name");
    openapiFields.add("operations");
    openapiFields.add("required");
    openapiFields.add("schema");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("key");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("operations");
    openapiRequiredFields.add("required");
    openapiRequiredFields.add("schema");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FieldMetadata
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FieldMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FieldMetadata is not found in the empty JSON string", FieldMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FieldMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FieldMetadata` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FieldMetadata.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("allowedValues") != null && !jsonObj.get("allowedValues").isJsonNull() && !jsonObj.get("allowedValues").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowedValues` to be an array in the JSON string but got `%s`", jsonObj.get("allowedValues").toString()));
      }
      if ((jsonObj.get("autoCompleteUrl") != null && !jsonObj.get("autoCompleteUrl").isJsonNull()) && !jsonObj.get("autoCompleteUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `autoCompleteUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("autoCompleteUrl").toString()));
      }
      if (!jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("operations") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("operations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `operations` to be an array in the JSON string but got `%s`", jsonObj.get("operations").toString()));
      }
      // validate the required field `schema`
      JsonTypeBean.validateJsonElement(jsonObj.get("schema"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FieldMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FieldMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FieldMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FieldMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<FieldMetadata>() {
           @Override
           public void write(JsonWriter out, FieldMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FieldMetadata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FieldMetadata given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FieldMetadata
   * @throws IOException if the JSON string is invalid with respect to FieldMetadata
   */
  public static FieldMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FieldMetadata.class);
  }

  /**
   * Convert an instance of FieldMetadata to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

