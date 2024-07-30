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
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Field;

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
 * A page of items.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class PageBeanField {
  public static final String SERIALIZED_NAME_IS_LAST = "isLast";
  @SerializedName(SERIALIZED_NAME_IS_LAST)
  private Boolean isLast;

  public static final String SERIALIZED_NAME_MAX_RESULTS = "maxResults";
  @SerializedName(SERIALIZED_NAME_MAX_RESULTS)
  private Integer maxResults;

  public static final String SERIALIZED_NAME_NEXT_PAGE = "nextPage";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE)
  private URI nextPage;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private URI self;

  public static final String SERIALIZED_NAME_START_AT = "startAt";
  @SerializedName(SERIALIZED_NAME_START_AT)
  private Long startAt;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Long total;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<Field> values = new ArrayList<>();

  public PageBeanField() {
  }

  public PageBeanField(
     Boolean isLast, 
     Integer maxResults, 
     URI nextPage, 
     URI self, 
     Long startAt, 
     Long total, 
     List<Field> values
  ) {
    this();
    this.isLast = isLast;
    this.maxResults = maxResults;
    this.nextPage = nextPage;
    this.self = self;
    this.startAt = startAt;
    this.total = total;
    this.values = values;
  }

  /**
   * Whether this is the last page.
   * @return isLast
   */
  @javax.annotation.Nullable
  public Boolean getIsLast() {
    return isLast;
  }



  /**
   * The maximum number of items that could be returned.
   * @return maxResults
   */
  @javax.annotation.Nullable
  public Integer getMaxResults() {
    return maxResults;
  }



  /**
   * If there is another page of results, the URL of the next page.
   * @return nextPage
   */
  @javax.annotation.Nullable
  public URI getNextPage() {
    return nextPage;
  }



  /**
   * The URL of the page.
   * @return self
   */
  @javax.annotation.Nullable
  public URI getSelf() {
    return self;
  }



  /**
   * The index of the first item returned.
   * @return startAt
   */
  @javax.annotation.Nullable
  public Long getStartAt() {
    return startAt;
  }



  /**
   * The number of items returned.
   * @return total
   */
  @javax.annotation.Nullable
  public Long getTotal() {
    return total;
  }



  /**
   * The list of items.
   * @return values
   */
  @javax.annotation.Nullable
  public List<Field> getValues() {
    return values;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageBeanField pageBeanField = (PageBeanField) o;
    return Objects.equals(this.isLast, pageBeanField.isLast) &&
        Objects.equals(this.maxResults, pageBeanField.maxResults) &&
        Objects.equals(this.nextPage, pageBeanField.nextPage) &&
        Objects.equals(this.self, pageBeanField.self) &&
        Objects.equals(this.startAt, pageBeanField.startAt) &&
        Objects.equals(this.total, pageBeanField.total) &&
        Objects.equals(this.values, pageBeanField.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isLast, maxResults, nextPage, self, startAt, total, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageBeanField {\n");
    sb.append("    isLast: ").append(toIndentedString(isLast)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
    openapiFields.add("isLast");
    openapiFields.add("maxResults");
    openapiFields.add("nextPage");
    openapiFields.add("self");
    openapiFields.add("startAt");
    openapiFields.add("total");
    openapiFields.add("values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PageBeanField
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PageBeanField.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PageBeanField is not found in the empty JSON string", PageBeanField.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PageBeanField.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PageBeanField` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("nextPage") != null && !jsonObj.get("nextPage").isJsonNull()) && !jsonObj.get("nextPage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextPage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextPage").toString()));
      }
      if ((jsonObj.get("self") != null && !jsonObj.get("self").isJsonNull()) && !jsonObj.get("self").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `self` to be a primitive type in the JSON string but got `%s`", jsonObj.get("self").toString()));
      }
      if (jsonObj.get("values") != null && !jsonObj.get("values").isJsonNull()) {
        JsonArray jsonArrayvalues = jsonObj.getAsJsonArray("values");
        if (jsonArrayvalues != null) {
          // ensure the json data is an array
          if (!jsonObj.get("values").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `values` to be an array in the JSON string but got `%s`", jsonObj.get("values").toString()));
          }

          // validate the optional field `values` (array)
          for (int i = 0; i < jsonArrayvalues.size(); i++) {
            Field.validateJsonElement(jsonArrayvalues.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PageBeanField.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PageBeanField' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PageBeanField> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PageBeanField.class));

       return (TypeAdapter<T>) new TypeAdapter<PageBeanField>() {
           @Override
           public void write(JsonWriter out, PageBeanField value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PageBeanField read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PageBeanField given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PageBeanField
   * @throws IOException if the JSON string is invalid with respect to PageBeanField
   */
  public static PageBeanField fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PageBeanField.class);
  }

  /**
   * Convert an instance of PageBeanField to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

