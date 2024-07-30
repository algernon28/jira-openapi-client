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
import org.openapitools.client.model.AttachmentArchiveEntry;

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
 * AttachmentArchive
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class AttachmentArchive {
  public static final String SERIALIZED_NAME_ENTRIES = "entries";
  @SerializedName(SERIALIZED_NAME_ENTRIES)
  private List<AttachmentArchiveEntry> entries = new ArrayList<>();

  public static final String SERIALIZED_NAME_MORE_AVAILABLE = "moreAvailable";
  @SerializedName(SERIALIZED_NAME_MORE_AVAILABLE)
  private Boolean moreAvailable;

  public static final String SERIALIZED_NAME_TOTAL_ENTRY_COUNT = "totalEntryCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_ENTRY_COUNT)
  private Integer totalEntryCount;

  public static final String SERIALIZED_NAME_TOTAL_NUMBER_OF_ENTRIES_AVAILABLE = "totalNumberOfEntriesAvailable";
  @SerializedName(SERIALIZED_NAME_TOTAL_NUMBER_OF_ENTRIES_AVAILABLE)
  private Integer totalNumberOfEntriesAvailable;

  public AttachmentArchive() {
  }

  public AttachmentArchive entries(List<AttachmentArchiveEntry> entries) {
    this.entries = entries;
    return this;
  }

  public AttachmentArchive addEntriesItem(AttachmentArchiveEntry entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<>();
    }
    this.entries.add(entriesItem);
    return this;
  }

  /**
   * Get entries
   * @return entries
   */
  @javax.annotation.Nullable
  public List<AttachmentArchiveEntry> getEntries() {
    return entries;
  }

  public void setEntries(List<AttachmentArchiveEntry> entries) {
    this.entries = entries;
  }


  public AttachmentArchive moreAvailable(Boolean moreAvailable) {
    this.moreAvailable = moreAvailable;
    return this;
  }

  /**
   * Get moreAvailable
   * @return moreAvailable
   */
  @javax.annotation.Nullable
  public Boolean getMoreAvailable() {
    return moreAvailable;
  }

  public void setMoreAvailable(Boolean moreAvailable) {
    this.moreAvailable = moreAvailable;
  }


  public AttachmentArchive totalEntryCount(Integer totalEntryCount) {
    this.totalEntryCount = totalEntryCount;
    return this;
  }

  /**
   * Get totalEntryCount
   * @return totalEntryCount
   */
  @javax.annotation.Nullable
  public Integer getTotalEntryCount() {
    return totalEntryCount;
  }

  public void setTotalEntryCount(Integer totalEntryCount) {
    this.totalEntryCount = totalEntryCount;
  }


  public AttachmentArchive totalNumberOfEntriesAvailable(Integer totalNumberOfEntriesAvailable) {
    this.totalNumberOfEntriesAvailable = totalNumberOfEntriesAvailable;
    return this;
  }

  /**
   * Get totalNumberOfEntriesAvailable
   * @return totalNumberOfEntriesAvailable
   */
  @javax.annotation.Nullable
  public Integer getTotalNumberOfEntriesAvailable() {
    return totalNumberOfEntriesAvailable;
  }

  public void setTotalNumberOfEntriesAvailable(Integer totalNumberOfEntriesAvailable) {
    this.totalNumberOfEntriesAvailable = totalNumberOfEntriesAvailable;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentArchive attachmentArchive = (AttachmentArchive) o;
    return Objects.equals(this.entries, attachmentArchive.entries) &&
        Objects.equals(this.moreAvailable, attachmentArchive.moreAvailable) &&
        Objects.equals(this.totalEntryCount, attachmentArchive.totalEntryCount) &&
        Objects.equals(this.totalNumberOfEntriesAvailable, attachmentArchive.totalNumberOfEntriesAvailable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entries, moreAvailable, totalEntryCount, totalNumberOfEntriesAvailable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentArchive {\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    moreAvailable: ").append(toIndentedString(moreAvailable)).append("\n");
    sb.append("    totalEntryCount: ").append(toIndentedString(totalEntryCount)).append("\n");
    sb.append("    totalNumberOfEntriesAvailable: ").append(toIndentedString(totalNumberOfEntriesAvailable)).append("\n");
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
    openapiFields.add("entries");
    openapiFields.add("moreAvailable");
    openapiFields.add("totalEntryCount");
    openapiFields.add("totalNumberOfEntriesAvailable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AttachmentArchive
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AttachmentArchive.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AttachmentArchive is not found in the empty JSON string", AttachmentArchive.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AttachmentArchive.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AttachmentArchive` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("entries") != null && !jsonObj.get("entries").isJsonNull()) {
        JsonArray jsonArrayentries = jsonObj.getAsJsonArray("entries");
        if (jsonArrayentries != null) {
          // ensure the json data is an array
          if (!jsonObj.get("entries").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `entries` to be an array in the JSON string but got `%s`", jsonObj.get("entries").toString()));
          }

          // validate the optional field `entries` (array)
          for (int i = 0; i < jsonArrayentries.size(); i++) {
            AttachmentArchiveEntry.validateJsonElement(jsonArrayentries.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AttachmentArchive.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AttachmentArchive' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AttachmentArchive> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AttachmentArchive.class));

       return (TypeAdapter<T>) new TypeAdapter<AttachmentArchive>() {
           @Override
           public void write(JsonWriter out, AttachmentArchive value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AttachmentArchive read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AttachmentArchive given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AttachmentArchive
   * @throws IOException if the JSON string is invalid with respect to AttachmentArchive
   */
  public static AttachmentArchive fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AttachmentArchive.class);
  }

  /**
   * Convert an instance of AttachmentArchive to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

