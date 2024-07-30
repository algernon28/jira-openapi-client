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
 * Details of Jira expressions for analysis.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class JiraExpressionForAnalysis {
  public static final String SERIALIZED_NAME_CONTEXT_VARIABLES = "contextVariables";
  @SerializedName(SERIALIZED_NAME_CONTEXT_VARIABLES)
  private Map<String, String> contextVariables = new HashMap<>();

  public static final String SERIALIZED_NAME_EXPRESSIONS = "expressions";
  @SerializedName(SERIALIZED_NAME_EXPRESSIONS)
  private List<String> expressions = new ArrayList<>();

  public JiraExpressionForAnalysis() {
  }

  public JiraExpressionForAnalysis contextVariables(Map<String, String> contextVariables) {
    this.contextVariables = contextVariables;
    return this;
  }

  public JiraExpressionForAnalysis putContextVariablesItem(String key, String contextVariablesItem) {
    if (this.contextVariables == null) {
      this.contextVariables = new HashMap<>();
    }
    this.contextVariables.put(key, contextVariablesItem);
    return this;
  }

  /**
   * Context variables and their types. The type checker assumes that [common context variables](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/#context-variables), such as &#x60;issue&#x60; or &#x60;project&#x60;, are available in context and sets their type. Use this property to override the default types or provide details of new variables.
   * @return contextVariables
   */
  @javax.annotation.Nullable
  public Map<String, String> getContextVariables() {
    return contextVariables;
  }

  public void setContextVariables(Map<String, String> contextVariables) {
    this.contextVariables = contextVariables;
  }


  public JiraExpressionForAnalysis expressions(List<String> expressions) {
    this.expressions = expressions;
    return this;
  }

  public JiraExpressionForAnalysis addExpressionsItem(String expressionsItem) {
    if (this.expressions == null) {
      this.expressions = new ArrayList<>();
    }
    this.expressions.add(expressionsItem);
    return this;
  }

  /**
   * The list of Jira expressions to analyse.
   * @return expressions
   */
  @javax.annotation.Nonnull
  public List<String> getExpressions() {
    return expressions;
  }

  public void setExpressions(List<String> expressions) {
    this.expressions = expressions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraExpressionForAnalysis jiraExpressionForAnalysis = (JiraExpressionForAnalysis) o;
    return Objects.equals(this.contextVariables, jiraExpressionForAnalysis.contextVariables) &&
        Objects.equals(this.expressions, jiraExpressionForAnalysis.expressions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextVariables, expressions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraExpressionForAnalysis {\n");
    sb.append("    contextVariables: ").append(toIndentedString(contextVariables)).append("\n");
    sb.append("    expressions: ").append(toIndentedString(expressions)).append("\n");
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
    openapiFields.add("contextVariables");
    openapiFields.add("expressions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("expressions");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to JiraExpressionForAnalysis
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!JiraExpressionForAnalysis.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JiraExpressionForAnalysis is not found in the empty JSON string", JiraExpressionForAnalysis.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!JiraExpressionForAnalysis.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JiraExpressionForAnalysis` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : JiraExpressionForAnalysis.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("expressions") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("expressions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `expressions` to be an array in the JSON string but got `%s`", jsonObj.get("expressions").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JiraExpressionForAnalysis.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JiraExpressionForAnalysis' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JiraExpressionForAnalysis> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JiraExpressionForAnalysis.class));

       return (TypeAdapter<T>) new TypeAdapter<JiraExpressionForAnalysis>() {
           @Override
           public void write(JsonWriter out, JiraExpressionForAnalysis value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JiraExpressionForAnalysis read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of JiraExpressionForAnalysis given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of JiraExpressionForAnalysis
   * @throws IOException if the JSON string is invalid with respect to JiraExpressionForAnalysis
   */
  public static JiraExpressionForAnalysis fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JiraExpressionForAnalysis.class);
  }

  /**
   * Convert an instance of JiraExpressionForAnalysis to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

