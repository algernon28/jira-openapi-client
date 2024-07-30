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
import org.openapitools.client.model.PrioritySchemeWithPaginatedPrioritiesAndProjects;
import org.openapitools.client.model.TaskProgressBeanJsonNode;

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
 * Details of the updated priority scheme.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class UpdatePrioritySchemeResponseBean {
  public static final String SERIALIZED_NAME_PRIORITY_SCHEME = "priorityScheme";
  @SerializedName(SERIALIZED_NAME_PRIORITY_SCHEME)
  private PrioritySchemeWithPaginatedPrioritiesAndProjects priorityScheme;

  public static final String SERIALIZED_NAME_TASK = "task";
  @SerializedName(SERIALIZED_NAME_TASK)
  private TaskProgressBeanJsonNode task;

  public UpdatePrioritySchemeResponseBean() {
  }

  public UpdatePrioritySchemeResponseBean(
     TaskProgressBeanJsonNode task
  ) {
    this();
    this.task = task;
  }

  public UpdatePrioritySchemeResponseBean priorityScheme(PrioritySchemeWithPaginatedPrioritiesAndProjects priorityScheme) {
    this.priorityScheme = priorityScheme;
    return this;
  }

  /**
   * Get priorityScheme
   * @return priorityScheme
   */
  @javax.annotation.Nullable
  public PrioritySchemeWithPaginatedPrioritiesAndProjects getPriorityScheme() {
    return priorityScheme;
  }

  public void setPriorityScheme(PrioritySchemeWithPaginatedPrioritiesAndProjects priorityScheme) {
    this.priorityScheme = priorityScheme;
  }


  /**
   * The in-progress issue migration task.
   * @return task
   */
  @javax.annotation.Nullable
  public TaskProgressBeanJsonNode getTask() {
    return task;
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
   * @return the UpdatePrioritySchemeResponseBean instance itself
   */
  public UpdatePrioritySchemeResponseBean putAdditionalProperty(String key, Object value) {
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
    UpdatePrioritySchemeResponseBean updatePrioritySchemeResponseBean = (UpdatePrioritySchemeResponseBean) o;
    return Objects.equals(this.priorityScheme, updatePrioritySchemeResponseBean.priorityScheme) &&
        Objects.equals(this.task, updatePrioritySchemeResponseBean.task)&&
        Objects.equals(this.additionalProperties, updatePrioritySchemeResponseBean.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priorityScheme, task, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePrioritySchemeResponseBean {\n");
    sb.append("    priorityScheme: ").append(toIndentedString(priorityScheme)).append("\n");
    sb.append("    task: ").append(toIndentedString(task)).append("\n");
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
    openapiFields.add("priorityScheme");
    openapiFields.add("task");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdatePrioritySchemeResponseBean
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdatePrioritySchemeResponseBean.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdatePrioritySchemeResponseBean is not found in the empty JSON string", UpdatePrioritySchemeResponseBean.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `task`
      if (jsonObj.get("task") != null && !jsonObj.get("task").isJsonNull()) {
        TaskProgressBeanJsonNode.validateJsonElement(jsonObj.get("task"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdatePrioritySchemeResponseBean.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdatePrioritySchemeResponseBean' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdatePrioritySchemeResponseBean> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdatePrioritySchemeResponseBean.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdatePrioritySchemeResponseBean>() {
           @Override
           public void write(JsonWriter out, UpdatePrioritySchemeResponseBean value) throws IOException {
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
           public UpdatePrioritySchemeResponseBean read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             UpdatePrioritySchemeResponseBean instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of UpdatePrioritySchemeResponseBean given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdatePrioritySchemeResponseBean
   * @throws IOException if the JSON string is invalid with respect to UpdatePrioritySchemeResponseBean
   */
  public static UpdatePrioritySchemeResponseBean fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdatePrioritySchemeResponseBean.class);
  }

  /**
   * Convert an instance of UpdatePrioritySchemeResponseBean to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
