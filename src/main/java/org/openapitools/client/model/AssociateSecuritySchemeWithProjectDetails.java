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
import org.openapitools.client.model.OldToNewSecurityLevelMappingsBean;

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
 * Issue security scheme, project, and remapping details.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class AssociateSecuritySchemeWithProjectDetails {
  public static final String SERIALIZED_NAME_OLD_TO_NEW_SECURITY_LEVEL_MAPPINGS = "oldToNewSecurityLevelMappings";
  @SerializedName(SERIALIZED_NAME_OLD_TO_NEW_SECURITY_LEVEL_MAPPINGS)
  private List<OldToNewSecurityLevelMappingsBean> oldToNewSecurityLevelMappings = new ArrayList<>();

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public static final String SERIALIZED_NAME_SCHEME_ID = "schemeId";
  @SerializedName(SERIALIZED_NAME_SCHEME_ID)
  private String schemeId;

  public AssociateSecuritySchemeWithProjectDetails() {
  }

  public AssociateSecuritySchemeWithProjectDetails oldToNewSecurityLevelMappings(List<OldToNewSecurityLevelMappingsBean> oldToNewSecurityLevelMappings) {
    this.oldToNewSecurityLevelMappings = oldToNewSecurityLevelMappings;
    return this;
  }

  public AssociateSecuritySchemeWithProjectDetails addOldToNewSecurityLevelMappingsItem(OldToNewSecurityLevelMappingsBean oldToNewSecurityLevelMappingsItem) {
    if (this.oldToNewSecurityLevelMappings == null) {
      this.oldToNewSecurityLevelMappings = new ArrayList<>();
    }
    this.oldToNewSecurityLevelMappings.add(oldToNewSecurityLevelMappingsItem);
    return this;
  }

  /**
   * The list of scheme levels which should be remapped to new levels of the issue security scheme.
   * @return oldToNewSecurityLevelMappings
   */
  @javax.annotation.Nullable
  public List<OldToNewSecurityLevelMappingsBean> getOldToNewSecurityLevelMappings() {
    return oldToNewSecurityLevelMappings;
  }

  public void setOldToNewSecurityLevelMappings(List<OldToNewSecurityLevelMappingsBean> oldToNewSecurityLevelMappings) {
    this.oldToNewSecurityLevelMappings = oldToNewSecurityLevelMappings;
  }


  public AssociateSecuritySchemeWithProjectDetails projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The ID of the project.
   * @return projectId
   */
  @javax.annotation.Nonnull
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  public AssociateSecuritySchemeWithProjectDetails schemeId(String schemeId) {
    this.schemeId = schemeId;
    return this;
  }

  /**
   * The ID of the issue security scheme. Providing null will clear the association with the issue security scheme.
   * @return schemeId
   */
  @javax.annotation.Nonnull
  public String getSchemeId() {
    return schemeId;
  }

  public void setSchemeId(String schemeId) {
    this.schemeId = schemeId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssociateSecuritySchemeWithProjectDetails associateSecuritySchemeWithProjectDetails = (AssociateSecuritySchemeWithProjectDetails) o;
    return Objects.equals(this.oldToNewSecurityLevelMappings, associateSecuritySchemeWithProjectDetails.oldToNewSecurityLevelMappings) &&
        Objects.equals(this.projectId, associateSecuritySchemeWithProjectDetails.projectId) &&
        Objects.equals(this.schemeId, associateSecuritySchemeWithProjectDetails.schemeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oldToNewSecurityLevelMappings, projectId, schemeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssociateSecuritySchemeWithProjectDetails {\n");
    sb.append("    oldToNewSecurityLevelMappings: ").append(toIndentedString(oldToNewSecurityLevelMappings)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    schemeId: ").append(toIndentedString(schemeId)).append("\n");
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
    openapiFields.add("oldToNewSecurityLevelMappings");
    openapiFields.add("projectId");
    openapiFields.add("schemeId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("projectId");
    openapiRequiredFields.add("schemeId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AssociateSecuritySchemeWithProjectDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AssociateSecuritySchemeWithProjectDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AssociateSecuritySchemeWithProjectDetails is not found in the empty JSON string", AssociateSecuritySchemeWithProjectDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AssociateSecuritySchemeWithProjectDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AssociateSecuritySchemeWithProjectDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AssociateSecuritySchemeWithProjectDetails.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("oldToNewSecurityLevelMappings") != null && !jsonObj.get("oldToNewSecurityLevelMappings").isJsonNull()) {
        JsonArray jsonArrayoldToNewSecurityLevelMappings = jsonObj.getAsJsonArray("oldToNewSecurityLevelMappings");
        if (jsonArrayoldToNewSecurityLevelMappings != null) {
          // ensure the json data is an array
          if (!jsonObj.get("oldToNewSecurityLevelMappings").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `oldToNewSecurityLevelMappings` to be an array in the JSON string but got `%s`", jsonObj.get("oldToNewSecurityLevelMappings").toString()));
          }

          // validate the optional field `oldToNewSecurityLevelMappings` (array)
          for (int i = 0; i < jsonArrayoldToNewSecurityLevelMappings.size(); i++) {
            OldToNewSecurityLevelMappingsBean.validateJsonElement(jsonArrayoldToNewSecurityLevelMappings.get(i));
          };
        }
      }
      if (!jsonObj.get("projectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectId").toString()));
      }
      if (!jsonObj.get("schemeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `schemeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("schemeId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AssociateSecuritySchemeWithProjectDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AssociateSecuritySchemeWithProjectDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AssociateSecuritySchemeWithProjectDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AssociateSecuritySchemeWithProjectDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AssociateSecuritySchemeWithProjectDetails>() {
           @Override
           public void write(JsonWriter out, AssociateSecuritySchemeWithProjectDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AssociateSecuritySchemeWithProjectDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AssociateSecuritySchemeWithProjectDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AssociateSecuritySchemeWithProjectDetails
   * @throws IOException if the JSON string is invalid with respect to AssociateSecuritySchemeWithProjectDetails
   */
  public static AssociateSecuritySchemeWithProjectDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AssociateSecuritySchemeWithProjectDetails.class);
  }

  /**
   * Convert an instance of AssociateSecuritySchemeWithProjectDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
