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
 * An ordered list of custom field option IDs and information on where to move them.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class OrderOfCustomFieldOptions {
  public static final String SERIALIZED_NAME_AFTER = "after";
  @SerializedName(SERIALIZED_NAME_AFTER)
  private String after;

  public static final String SERIALIZED_NAME_CUSTOM_FIELD_OPTION_IDS = "customFieldOptionIds";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELD_OPTION_IDS)
  private List<String> customFieldOptionIds = new ArrayList<>();

  /**
   * The position the custom field options should be moved to. Required if &#x60;after&#x60; isn&#39;t provided.
   */
  @JsonAdapter(PositionEnum.Adapter.class)
  public enum PositionEnum {
    FIRST("First"),
    
    LAST("Last");

    private String value;

    PositionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PositionEnum fromValue(String value) {
      for (PositionEnum b : PositionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PositionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PositionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PositionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PositionEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      PositionEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private PositionEnum position;

  public OrderOfCustomFieldOptions() {
  }

  public OrderOfCustomFieldOptions after(String after) {
    this.after = after;
    return this;
  }

  /**
   * The ID of the custom field option or cascading option to place the moved options after. Required if &#x60;position&#x60; isn&#39;t provided.
   * @return after
   */
  @javax.annotation.Nullable
  public String getAfter() {
    return after;
  }

  public void setAfter(String after) {
    this.after = after;
  }


  public OrderOfCustomFieldOptions customFieldOptionIds(List<String> customFieldOptionIds) {
    this.customFieldOptionIds = customFieldOptionIds;
    return this;
  }

  public OrderOfCustomFieldOptions addCustomFieldOptionIdsItem(String customFieldOptionIdsItem) {
    if (this.customFieldOptionIds == null) {
      this.customFieldOptionIds = new ArrayList<>();
    }
    this.customFieldOptionIds.add(customFieldOptionIdsItem);
    return this;
  }

  /**
   * A list of IDs of custom field options to move. The order of the custom field option IDs in the list is the order they are given after the move. The list must contain custom field options or cascading options, but not both.
   * @return customFieldOptionIds
   */
  @javax.annotation.Nonnull
  public List<String> getCustomFieldOptionIds() {
    return customFieldOptionIds;
  }

  public void setCustomFieldOptionIds(List<String> customFieldOptionIds) {
    this.customFieldOptionIds = customFieldOptionIds;
  }


  public OrderOfCustomFieldOptions position(PositionEnum position) {
    this.position = position;
    return this;
  }

  /**
   * The position the custom field options should be moved to. Required if &#x60;after&#x60; isn&#39;t provided.
   * @return position
   */
  @javax.annotation.Nullable
  public PositionEnum getPosition() {
    return position;
  }

  public void setPosition(PositionEnum position) {
    this.position = position;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderOfCustomFieldOptions orderOfCustomFieldOptions = (OrderOfCustomFieldOptions) o;
    return Objects.equals(this.after, orderOfCustomFieldOptions.after) &&
        Objects.equals(this.customFieldOptionIds, orderOfCustomFieldOptions.customFieldOptionIds) &&
        Objects.equals(this.position, orderOfCustomFieldOptions.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(after, customFieldOptionIds, position);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderOfCustomFieldOptions {\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    customFieldOptionIds: ").append(toIndentedString(customFieldOptionIds)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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
    openapiFields.add("after");
    openapiFields.add("customFieldOptionIds");
    openapiFields.add("position");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("customFieldOptionIds");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrderOfCustomFieldOptions
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderOfCustomFieldOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderOfCustomFieldOptions is not found in the empty JSON string", OrderOfCustomFieldOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderOfCustomFieldOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderOfCustomFieldOptions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrderOfCustomFieldOptions.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("after") != null && !jsonObj.get("after").isJsonNull()) && !jsonObj.get("after").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `after` to be a primitive type in the JSON string but got `%s`", jsonObj.get("after").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("customFieldOptionIds") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("customFieldOptionIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `customFieldOptionIds` to be an array in the JSON string but got `%s`", jsonObj.get("customFieldOptionIds").toString()));
      }
      if ((jsonObj.get("position") != null && !jsonObj.get("position").isJsonNull()) && !jsonObj.get("position").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `position` to be a primitive type in the JSON string but got `%s`", jsonObj.get("position").toString()));
      }
      // validate the optional field `position`
      if (jsonObj.get("position") != null && !jsonObj.get("position").isJsonNull()) {
        PositionEnum.validateJsonElement(jsonObj.get("position"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderOfCustomFieldOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderOfCustomFieldOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderOfCustomFieldOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderOfCustomFieldOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderOfCustomFieldOptions>() {
           @Override
           public void write(JsonWriter out, OrderOfCustomFieldOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderOfCustomFieldOptions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrderOfCustomFieldOptions given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrderOfCustomFieldOptions
   * @throws IOException if the JSON string is invalid with respect to OrderOfCustomFieldOptions
   */
  public static OrderOfCustomFieldOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderOfCustomFieldOptions.class);
  }

  /**
   * Convert an instance of OrderOfCustomFieldOptions to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
