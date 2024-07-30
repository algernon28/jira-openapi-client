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
import org.openapitools.client.model.User;

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
 * A paginated list of users sharing the filter. This includes users that are members of the groups or can browse the projects that the filter is shared with.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class UserList {
  public static final String SERIALIZED_NAME_END_INDEX = "end-index";
  @SerializedName(SERIALIZED_NAME_END_INDEX)
  private Integer endIndex;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<User> items = new ArrayList<>();

  public static final String SERIALIZED_NAME_MAX_RESULTS = "max-results";
  @SerializedName(SERIALIZED_NAME_MAX_RESULTS)
  private Integer maxResults;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_START_INDEX = "start-index";
  @SerializedName(SERIALIZED_NAME_START_INDEX)
  private Integer startIndex;

  public UserList() {
  }

  public UserList(
     Integer endIndex, 
     List<User> items, 
     Integer maxResults, 
     Integer size, 
     Integer startIndex
  ) {
    this();
    this.endIndex = endIndex;
    this.items = items;
    this.maxResults = maxResults;
    this.size = size;
    this.startIndex = startIndex;
  }

  /**
   * The index of the last item returned on the page.
   * @return endIndex
   */
  @javax.annotation.Nullable
  public Integer getEndIndex() {
    return endIndex;
  }



  /**
   * The list of items.
   * @return items
   */
  @javax.annotation.Nullable
  public List<User> getItems() {
    return items;
  }



  /**
   * The maximum number of results that could be on the page.
   * @return maxResults
   */
  @javax.annotation.Nullable
  public Integer getMaxResults() {
    return maxResults;
  }



  /**
   * The number of items on the page.
   * @return size
   */
  @javax.annotation.Nullable
  public Integer getSize() {
    return size;
  }



  /**
   * The index of the first item returned on the page.
   * @return startIndex
   */
  @javax.annotation.Nullable
  public Integer getStartIndex() {
    return startIndex;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserList userList = (UserList) o;
    return Objects.equals(this.endIndex, userList.endIndex) &&
        Objects.equals(this.items, userList.items) &&
        Objects.equals(this.maxResults, userList.maxResults) &&
        Objects.equals(this.size, userList.size) &&
        Objects.equals(this.startIndex, userList.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endIndex, items, maxResults, size, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserList {\n");
    sb.append("    endIndex: ").append(toIndentedString(endIndex)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
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
    openapiFields.add("end-index");
    openapiFields.add("items");
    openapiFields.add("max-results");
    openapiFields.add("size");
    openapiFields.add("start-index");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UserList
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UserList.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserList is not found in the empty JSON string", UserList.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UserList.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserList` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("items") != null && !jsonObj.get("items").isJsonNull()) {
        JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
        if (jsonArrayitems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("items").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
          }

          // validate the optional field `items` (array)
          for (int i = 0; i < jsonArrayitems.size(); i++) {
            User.validateJsonElement(jsonArrayitems.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserList.class));

       return (TypeAdapter<T>) new TypeAdapter<UserList>() {
           @Override
           public void write(JsonWriter out, UserList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserList read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UserList given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UserList
   * @throws IOException if the JSON string is invalid with respect to UserList
   */
  public static UserList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserList.class);
  }

  /**
   * Convert an instance of UserList to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

