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
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.BulkEditActionError;

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
public class BulkEditShareableEntityResponse {
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

  public static final String SERIALIZED_NAME_ENTITY_ERRORS = "entityErrors";
  @SerializedName(SERIALIZED_NAME_ENTITY_ERRORS)
  private Map<String, BulkEditActionError> entityErrors = new HashMap<>();

  public BulkEditShareableEntityResponse() {
  }

  public BulkEditShareableEntityResponse action(ActionEnum action) {
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


  public BulkEditShareableEntityResponse entityErrors(Map<String, BulkEditActionError> entityErrors) {
    this.entityErrors = entityErrors;
    return this;
  }

  public BulkEditShareableEntityResponse putEntityErrorsItem(String key, BulkEditActionError entityErrorsItem) {
    if (this.entityErrors == null) {
      this.entityErrors = new HashMap<>();
    }
    this.entityErrors.put(key, entityErrorsItem);
    return this;
  }

  /**
   * The mapping dashboard id to errors if any.
   * @return entityErrors
   */
  @javax.annotation.Nullable
  public Map<String, BulkEditActionError> getEntityErrors() {
    return entityErrors;
  }

  public void setEntityErrors(Map<String, BulkEditActionError> entityErrors) {
    this.entityErrors = entityErrors;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkEditShareableEntityResponse bulkEditShareableEntityResponse = (BulkEditShareableEntityResponse) o;
    return Objects.equals(this.action, bulkEditShareableEntityResponse.action) &&
        Objects.equals(this.entityErrors, bulkEditShareableEntityResponse.entityErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, entityErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkEditShareableEntityResponse {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    entityErrors: ").append(toIndentedString(entityErrors)).append("\n");
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
    openapiFields.add("entityErrors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("action");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BulkEditShareableEntityResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BulkEditShareableEntityResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BulkEditShareableEntityResponse is not found in the empty JSON string", BulkEditShareableEntityResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BulkEditShareableEntityResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BulkEditShareableEntityResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BulkEditShareableEntityResponse.openapiRequiredFields) {
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BulkEditShareableEntityResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BulkEditShareableEntityResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BulkEditShareableEntityResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BulkEditShareableEntityResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<BulkEditShareableEntityResponse>() {
           @Override
           public void write(JsonWriter out, BulkEditShareableEntityResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BulkEditShareableEntityResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BulkEditShareableEntityResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BulkEditShareableEntityResponse
   * @throws IOException if the JSON string is invalid with respect to BulkEditShareableEntityResponse
   */
  public static BulkEditShareableEntityResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BulkEditShareableEntityResponse.class);
  }

  /**
   * Convert an instance of BulkEditShareableEntityResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

