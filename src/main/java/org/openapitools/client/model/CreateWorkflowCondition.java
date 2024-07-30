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
 * A workflow transition condition.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class CreateWorkflowCondition {
  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<CreateWorkflowCondition> conditions = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONFIGURATION = "configuration";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION)
  private Map<String, Object> _configuration = new HashMap<>();

  /**
   * The compound condition operator.
   */
  @JsonAdapter(OperatorEnum.Adapter.class)
  public enum OperatorEnum {
    AND("AND"),
    
    OR("OR");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperatorEnum fromValue(String value) {
      for (OperatorEnum b : OperatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OperatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperatorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperatorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OperatorEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      OperatorEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private OperatorEnum operator;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public CreateWorkflowCondition() {
  }

  public CreateWorkflowCondition conditions(List<CreateWorkflowCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public CreateWorkflowCondition addConditionsItem(CreateWorkflowCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * The list of workflow conditions.
   * @return conditions
   */
  @javax.annotation.Nullable
  public List<CreateWorkflowCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<CreateWorkflowCondition> conditions) {
    this.conditions = conditions;
  }


  public CreateWorkflowCondition _configuration(Map<String, Object> _configuration) {
    this._configuration = _configuration;
    return this;
  }

  public CreateWorkflowCondition putConfigurationItem(String key, Object _configurationItem) {
    if (this._configuration == null) {
      this._configuration = new HashMap<>();
    }
    this._configuration.put(key, _configurationItem);
    return this;
  }

  /**
   * EXPERIMENTAL. The configuration of the transition rule.
   * @return _configuration
   */
  @javax.annotation.Nullable
  public Map<String, Object> getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(Map<String, Object> _configuration) {
    this._configuration = _configuration;
  }


  public CreateWorkflowCondition operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

  /**
   * The compound condition operator.
   * @return operator
   */
  @javax.annotation.Nullable
  public OperatorEnum getOperator() {
    return operator;
  }

  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  public CreateWorkflowCondition type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the transition rule.
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWorkflowCondition createWorkflowCondition = (CreateWorkflowCondition) o;
    return Objects.equals(this.conditions, createWorkflowCondition.conditions) &&
        Objects.equals(this._configuration, createWorkflowCondition._configuration) &&
        Objects.equals(this.operator, createWorkflowCondition.operator) &&
        Objects.equals(this.type, createWorkflowCondition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, _configuration, operator, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWorkflowCondition {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("conditions");
    openapiFields.add("configuration");
    openapiFields.add("operator");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateWorkflowCondition
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateWorkflowCondition.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateWorkflowCondition is not found in the empty JSON string", CreateWorkflowCondition.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateWorkflowCondition.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateWorkflowCondition` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("conditions") != null && !jsonObj.get("conditions").isJsonNull()) {
        JsonArray jsonArrayconditions = jsonObj.getAsJsonArray("conditions");
        if (jsonArrayconditions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("conditions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `conditions` to be an array in the JSON string but got `%s`", jsonObj.get("conditions").toString()));
          }

          // validate the optional field `conditions` (array)
          for (int i = 0; i < jsonArrayconditions.size(); i++) {
            CreateWorkflowCondition.validateJsonElement(jsonArrayconditions.get(i));
          };
        }
      }
      if ((jsonObj.get("operator") != null && !jsonObj.get("operator").isJsonNull()) && !jsonObj.get("operator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operator").toString()));
      }
      // validate the optional field `operator`
      if (jsonObj.get("operator") != null && !jsonObj.get("operator").isJsonNull()) {
        OperatorEnum.validateJsonElement(jsonObj.get("operator"));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateWorkflowCondition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateWorkflowCondition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateWorkflowCondition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateWorkflowCondition.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateWorkflowCondition>() {
           @Override
           public void write(JsonWriter out, CreateWorkflowCondition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateWorkflowCondition read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateWorkflowCondition given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateWorkflowCondition
   * @throws IOException if the JSON string is invalid with respect to CreateWorkflowCondition
   */
  public static CreateWorkflowCondition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateWorkflowCondition.class);
  }

  /**
   * Convert an instance of CreateWorkflowCondition to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

