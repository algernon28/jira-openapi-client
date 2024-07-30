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
import org.openapitools.client.model.ErrorCollection;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Details of the sanitized JQL query.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class SanitizedJqlQuery {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private ErrorCollection errors;

  public static final String SERIALIZED_NAME_INITIAL_QUERY = "initialQuery";
  @SerializedName(SERIALIZED_NAME_INITIAL_QUERY)
  private String initialQuery;

  public static final String SERIALIZED_NAME_SANITIZED_QUERY = "sanitizedQuery";
  @SerializedName(SERIALIZED_NAME_SANITIZED_QUERY)
  private String sanitizedQuery;

  public SanitizedJqlQuery() {
  }

  public SanitizedJqlQuery accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The account ID of the user for whom sanitization was performed.
   * @return accountId
   */
  @javax.annotation.Nullable
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public SanitizedJqlQuery errors(ErrorCollection errors) {
    this.errors = errors;
    return this;
  }

  /**
   * The list of errors.
   * @return errors
   */
  @javax.annotation.Nullable
  public ErrorCollection getErrors() {
    return errors;
  }

  public void setErrors(ErrorCollection errors) {
    this.errors = errors;
  }


  public SanitizedJqlQuery initialQuery(String initialQuery) {
    this.initialQuery = initialQuery;
    return this;
  }

  /**
   * The initial query.
   * @return initialQuery
   */
  @javax.annotation.Nullable
  public String getInitialQuery() {
    return initialQuery;
  }

  public void setInitialQuery(String initialQuery) {
    this.initialQuery = initialQuery;
  }


  public SanitizedJqlQuery sanitizedQuery(String sanitizedQuery) {
    this.sanitizedQuery = sanitizedQuery;
    return this;
  }

  /**
   * The sanitized query, if there were no errors.
   * @return sanitizedQuery
   */
  @javax.annotation.Nullable
  public String getSanitizedQuery() {
    return sanitizedQuery;
  }

  public void setSanitizedQuery(String sanitizedQuery) {
    this.sanitizedQuery = sanitizedQuery;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SanitizedJqlQuery sanitizedJqlQuery = (SanitizedJqlQuery) o;
    return Objects.equals(this.accountId, sanitizedJqlQuery.accountId) &&
        Objects.equals(this.errors, sanitizedJqlQuery.errors) &&
        Objects.equals(this.initialQuery, sanitizedJqlQuery.initialQuery) &&
        Objects.equals(this.sanitizedQuery, sanitizedJqlQuery.sanitizedQuery);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, errors, initialQuery, sanitizedQuery);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SanitizedJqlQuery {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    initialQuery: ").append(toIndentedString(initialQuery)).append("\n");
    sb.append("    sanitizedQuery: ").append(toIndentedString(sanitizedQuery)).append("\n");
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
    openapiFields.add("accountId");
    openapiFields.add("errors");
    openapiFields.add("initialQuery");
    openapiFields.add("sanitizedQuery");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SanitizedJqlQuery
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SanitizedJqlQuery.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SanitizedJqlQuery is not found in the empty JSON string", SanitizedJqlQuery.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SanitizedJqlQuery.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SanitizedJqlQuery` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("accountId") != null && !jsonObj.get("accountId").isJsonNull()) && !jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
      // validate the optional field `errors`
      if (jsonObj.get("errors") != null && !jsonObj.get("errors").isJsonNull()) {
        ErrorCollection.validateJsonElement(jsonObj.get("errors"));
      }
      if ((jsonObj.get("initialQuery") != null && !jsonObj.get("initialQuery").isJsonNull()) && !jsonObj.get("initialQuery").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `initialQuery` to be a primitive type in the JSON string but got `%s`", jsonObj.get("initialQuery").toString()));
      }
      if ((jsonObj.get("sanitizedQuery") != null && !jsonObj.get("sanitizedQuery").isJsonNull()) && !jsonObj.get("sanitizedQuery").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sanitizedQuery` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sanitizedQuery").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SanitizedJqlQuery.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SanitizedJqlQuery' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SanitizedJqlQuery> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SanitizedJqlQuery.class));

       return (TypeAdapter<T>) new TypeAdapter<SanitizedJqlQuery>() {
           @Override
           public void write(JsonWriter out, SanitizedJqlQuery value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SanitizedJqlQuery read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SanitizedJqlQuery given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SanitizedJqlQuery
   * @throws IOException if the JSON string is invalid with respect to SanitizedJqlQuery
   */
  public static SanitizedJqlQuery fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SanitizedJqlQuery.class);
  }

  /**
   * Convert an instance of SanitizedJqlQuery to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

