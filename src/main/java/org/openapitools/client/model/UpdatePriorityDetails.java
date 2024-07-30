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
 * Details of an issue priority.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class UpdatePriorityDetails {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * The URL of an icon for the priority. Accepted protocols are HTTP and HTTPS. Built in icons can also be used.
   */
  @JsonAdapter(IconUrlEnum.Adapter.class)
  public enum IconUrlEnum {
    BLOCKER_PNG("/images/icons/priorities/blocker.png"),
    
    CRITICAL_PNG("/images/icons/priorities/critical.png"),
    
    HIGH_PNG("/images/icons/priorities/high.png"),
    
    HIGHEST_PNG("/images/icons/priorities/highest.png"),
    
    LOW_PNG("/images/icons/priorities/low.png"),
    
    LOWEST_PNG("/images/icons/priorities/lowest.png"),
    
    MAJOR_PNG("/images/icons/priorities/major.png"),
    
    MEDIUM_PNG("/images/icons/priorities/medium.png"),
    
    MINOR_PNG("/images/icons/priorities/minor.png"),
    
    TRIVIAL_PNG("/images/icons/priorities/trivial.png"),
    
    BLOCKER_NEW_PNG("/images/icons/priorities/blocker_new.png"),
    
    CRITICAL_NEW_PNG("/images/icons/priorities/critical_new.png"),
    
    HIGH_NEW_PNG("/images/icons/priorities/high_new.png"),
    
    HIGHEST_NEW_PNG("/images/icons/priorities/highest_new.png"),
    
    LOW_NEW_PNG("/images/icons/priorities/low_new.png"),
    
    LOWEST_NEW_PNG("/images/icons/priorities/lowest_new.png"),
    
    MAJOR_NEW_PNG("/images/icons/priorities/major_new.png"),
    
    MEDIUM_NEW_PNG("/images/icons/priorities/medium_new.png"),
    
    MINOR_NEW_PNG("/images/icons/priorities/minor_new.png"),
    
    TRIVIAL_NEW_PNG("/images/icons/priorities/trivial_new.png");

    private String value;

    IconUrlEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IconUrlEnum fromValue(String value) {
      for (IconUrlEnum b : IconUrlEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IconUrlEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IconUrlEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IconUrlEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IconUrlEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      IconUrlEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ICON_URL = "iconUrl";
  @SerializedName(SERIALIZED_NAME_ICON_URL)
  private IconUrlEnum iconUrl;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STATUS_COLOR = "statusColor";
  @SerializedName(SERIALIZED_NAME_STATUS_COLOR)
  private String statusColor;

  public UpdatePriorityDetails() {
  }

  public UpdatePriorityDetails description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the priority.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public UpdatePriorityDetails iconUrl(IconUrlEnum iconUrl) {
    this.iconUrl = iconUrl;
    return this;
  }

  /**
   * The URL of an icon for the priority. Accepted protocols are HTTP and HTTPS. Built in icons can also be used.
   * @return iconUrl
   */
  @javax.annotation.Nullable
  public IconUrlEnum getIconUrl() {
    return iconUrl;
  }

  public void setIconUrl(IconUrlEnum iconUrl) {
    this.iconUrl = iconUrl;
  }


  public UpdatePriorityDetails name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the priority. Must be unique.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public UpdatePriorityDetails statusColor(String statusColor) {
    this.statusColor = statusColor;
    return this;
  }

  /**
   * The status color of the priority in 3-digit or 6-digit hexadecimal format.
   * @return statusColor
   */
  @javax.annotation.Nullable
  public String getStatusColor() {
    return statusColor;
  }

  public void setStatusColor(String statusColor) {
    this.statusColor = statusColor;
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
   * @return the UpdatePriorityDetails instance itself
   */
  public UpdatePriorityDetails putAdditionalProperty(String key, Object value) {
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
    UpdatePriorityDetails updatePriorityDetails = (UpdatePriorityDetails) o;
    return Objects.equals(this.description, updatePriorityDetails.description) &&
        Objects.equals(this.iconUrl, updatePriorityDetails.iconUrl) &&
        Objects.equals(this.name, updatePriorityDetails.name) &&
        Objects.equals(this.statusColor, updatePriorityDetails.statusColor)&&
        Objects.equals(this.additionalProperties, updatePriorityDetails.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, iconUrl, name, statusColor, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePriorityDetails {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    statusColor: ").append(toIndentedString(statusColor)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("iconUrl");
    openapiFields.add("name");
    openapiFields.add("statusColor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdatePriorityDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdatePriorityDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdatePriorityDetails is not found in the empty JSON string", UpdatePriorityDetails.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("iconUrl") != null && !jsonObj.get("iconUrl").isJsonNull()) && !jsonObj.get("iconUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iconUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iconUrl").toString()));
      }
      // validate the optional field `iconUrl`
      if (jsonObj.get("iconUrl") != null && !jsonObj.get("iconUrl").isJsonNull()) {
        IconUrlEnum.validateJsonElement(jsonObj.get("iconUrl"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("statusColor") != null && !jsonObj.get("statusColor").isJsonNull()) && !jsonObj.get("statusColor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statusColor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statusColor").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdatePriorityDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdatePriorityDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdatePriorityDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdatePriorityDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdatePriorityDetails>() {
           @Override
           public void write(JsonWriter out, UpdatePriorityDetails value) throws IOException {
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
           public UpdatePriorityDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             UpdatePriorityDetails instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of UpdatePriorityDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdatePriorityDetails
   * @throws IOException if the JSON string is invalid with respect to UpdatePriorityDetails
   */
  public static UpdatePriorityDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdatePriorityDetails.class);
  }

  /**
   * Convert an instance of UpdatePriorityDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
