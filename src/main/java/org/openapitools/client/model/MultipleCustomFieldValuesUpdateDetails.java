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
import org.openapitools.client.model.MultipleCustomFieldValuesUpdate;

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
 * List of updates for a custom fields.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class MultipleCustomFieldValuesUpdateDetails {
  public static final String SERIALIZED_NAME_UPDATES = "updates";
  @SerializedName(SERIALIZED_NAME_UPDATES)
  private List<MultipleCustomFieldValuesUpdate> updates = new ArrayList<>();

  public MultipleCustomFieldValuesUpdateDetails() {
  }

  public MultipleCustomFieldValuesUpdateDetails updates(List<MultipleCustomFieldValuesUpdate> updates) {
    this.updates = updates;
    return this;
  }

  public MultipleCustomFieldValuesUpdateDetails addUpdatesItem(MultipleCustomFieldValuesUpdate updatesItem) {
    if (this.updates == null) {
      this.updates = new ArrayList<>();
    }
    this.updates.add(updatesItem);
    return this;
  }

  /**
   * Get updates
   * @return updates
   */
  @javax.annotation.Nullable
  public List<MultipleCustomFieldValuesUpdate> getUpdates() {
    return updates;
  }

  public void setUpdates(List<MultipleCustomFieldValuesUpdate> updates) {
    this.updates = updates;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultipleCustomFieldValuesUpdateDetails multipleCustomFieldValuesUpdateDetails = (MultipleCustomFieldValuesUpdateDetails) o;
    return Objects.equals(this.updates, multipleCustomFieldValuesUpdateDetails.updates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultipleCustomFieldValuesUpdateDetails {\n");
    sb.append("    updates: ").append(toIndentedString(updates)).append("\n");
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
    openapiFields.add("updates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MultipleCustomFieldValuesUpdateDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MultipleCustomFieldValuesUpdateDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MultipleCustomFieldValuesUpdateDetails is not found in the empty JSON string", MultipleCustomFieldValuesUpdateDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MultipleCustomFieldValuesUpdateDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MultipleCustomFieldValuesUpdateDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("updates") != null && !jsonObj.get("updates").isJsonNull()) {
        JsonArray jsonArrayupdates = jsonObj.getAsJsonArray("updates");
        if (jsonArrayupdates != null) {
          // ensure the json data is an array
          if (!jsonObj.get("updates").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `updates` to be an array in the JSON string but got `%s`", jsonObj.get("updates").toString()));
          }

          // validate the optional field `updates` (array)
          for (int i = 0; i < jsonArrayupdates.size(); i++) {
            MultipleCustomFieldValuesUpdate.validateJsonElement(jsonArrayupdates.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MultipleCustomFieldValuesUpdateDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MultipleCustomFieldValuesUpdateDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MultipleCustomFieldValuesUpdateDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MultipleCustomFieldValuesUpdateDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<MultipleCustomFieldValuesUpdateDetails>() {
           @Override
           public void write(JsonWriter out, MultipleCustomFieldValuesUpdateDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MultipleCustomFieldValuesUpdateDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MultipleCustomFieldValuesUpdateDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MultipleCustomFieldValuesUpdateDetails
   * @throws IOException if the JSON string is invalid with respect to MultipleCustomFieldValuesUpdateDetails
   */
  public static MultipleCustomFieldValuesUpdateDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MultipleCustomFieldValuesUpdateDetails.class);
  }

  /**
   * Convert an instance of MultipleCustomFieldValuesUpdateDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

