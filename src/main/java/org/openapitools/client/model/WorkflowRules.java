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
import org.openapitools.client.model.WorkflowCondition;
import org.openapitools.client.model.WorkflowTransitionRule;

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
 * A collection of transition rules.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class WorkflowRules {
  public static final String SERIALIZED_NAME_CONDITIONS_TREE = "conditionsTree";
  @SerializedName(SERIALIZED_NAME_CONDITIONS_TREE)
  private WorkflowCondition conditionsTree;

  public static final String SERIALIZED_NAME_POST_FUNCTIONS = "postFunctions";
  @SerializedName(SERIALIZED_NAME_POST_FUNCTIONS)
  private List<WorkflowTransitionRule> postFunctions = new ArrayList<>();

  public static final String SERIALIZED_NAME_VALIDATORS = "validators";
  @SerializedName(SERIALIZED_NAME_VALIDATORS)
  private List<WorkflowTransitionRule> validators = new ArrayList<>();

  public WorkflowRules() {
  }

  public WorkflowRules conditionsTree(WorkflowCondition conditionsTree) {
    this.conditionsTree = conditionsTree;
    return this;
  }

  /**
   * Get conditionsTree
   * @return conditionsTree
   */
  @javax.annotation.Nullable
  public WorkflowCondition getConditionsTree() {
    return conditionsTree;
  }

  public void setConditionsTree(WorkflowCondition conditionsTree) {
    this.conditionsTree = conditionsTree;
  }


  public WorkflowRules postFunctions(List<WorkflowTransitionRule> postFunctions) {
    this.postFunctions = postFunctions;
    return this;
  }

  public WorkflowRules addPostFunctionsItem(WorkflowTransitionRule postFunctionsItem) {
    if (this.postFunctions == null) {
      this.postFunctions = new ArrayList<>();
    }
    this.postFunctions.add(postFunctionsItem);
    return this;
  }

  /**
   * The workflow post functions.
   * @return postFunctions
   */
  @javax.annotation.Nullable
  public List<WorkflowTransitionRule> getPostFunctions() {
    return postFunctions;
  }

  public void setPostFunctions(List<WorkflowTransitionRule> postFunctions) {
    this.postFunctions = postFunctions;
  }


  public WorkflowRules validators(List<WorkflowTransitionRule> validators) {
    this.validators = validators;
    return this;
  }

  public WorkflowRules addValidatorsItem(WorkflowTransitionRule validatorsItem) {
    if (this.validators == null) {
      this.validators = new ArrayList<>();
    }
    this.validators.add(validatorsItem);
    return this;
  }

  /**
   * The workflow validators.
   * @return validators
   */
  @javax.annotation.Nullable
  public List<WorkflowTransitionRule> getValidators() {
    return validators;
  }

  public void setValidators(List<WorkflowTransitionRule> validators) {
    this.validators = validators;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowRules workflowRules = (WorkflowRules) o;
    return Objects.equals(this.conditionsTree, workflowRules.conditionsTree) &&
        Objects.equals(this.postFunctions, workflowRules.postFunctions) &&
        Objects.equals(this.validators, workflowRules.validators);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionsTree, postFunctions, validators);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowRules {\n");
    sb.append("    conditionsTree: ").append(toIndentedString(conditionsTree)).append("\n");
    sb.append("    postFunctions: ").append(toIndentedString(postFunctions)).append("\n");
    sb.append("    validators: ").append(toIndentedString(validators)).append("\n");
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
    openapiFields.add("conditionsTree");
    openapiFields.add("postFunctions");
    openapiFields.add("validators");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WorkflowRules
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WorkflowRules.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkflowRules is not found in the empty JSON string", WorkflowRules.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WorkflowRules.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkflowRules` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `conditionsTree`
      if (jsonObj.get("conditionsTree") != null && !jsonObj.get("conditionsTree").isJsonNull()) {
        WorkflowCondition.validateJsonElement(jsonObj.get("conditionsTree"));
      }
      if (jsonObj.get("postFunctions") != null && !jsonObj.get("postFunctions").isJsonNull()) {
        JsonArray jsonArraypostFunctions = jsonObj.getAsJsonArray("postFunctions");
        if (jsonArraypostFunctions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("postFunctions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `postFunctions` to be an array in the JSON string but got `%s`", jsonObj.get("postFunctions").toString()));
          }

          // validate the optional field `postFunctions` (array)
          for (int i = 0; i < jsonArraypostFunctions.size(); i++) {
            WorkflowTransitionRule.validateJsonElement(jsonArraypostFunctions.get(i));
          };
        }
      }
      if (jsonObj.get("validators") != null && !jsonObj.get("validators").isJsonNull()) {
        JsonArray jsonArrayvalidators = jsonObj.getAsJsonArray("validators");
        if (jsonArrayvalidators != null) {
          // ensure the json data is an array
          if (!jsonObj.get("validators").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `validators` to be an array in the JSON string but got `%s`", jsonObj.get("validators").toString()));
          }

          // validate the optional field `validators` (array)
          for (int i = 0; i < jsonArrayvalidators.size(); i++) {
            WorkflowTransitionRule.validateJsonElement(jsonArrayvalidators.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkflowRules.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkflowRules' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkflowRules> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkflowRules.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkflowRules>() {
           @Override
           public void write(JsonWriter out, WorkflowRules value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkflowRules read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WorkflowRules given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WorkflowRules
   * @throws IOException if the JSON string is invalid with respect to WorkflowRules
   */
  public static WorkflowRules fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkflowRules.class);
  }

  /**
   * Convert an instance of WorkflowRules to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
