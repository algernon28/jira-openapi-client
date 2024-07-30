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
import org.openapitools.client.model.IssueContextVariable;
import org.openapitools.client.model.JsonContextVariable;
import org.openapitools.client.model.UserContextVariable;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class CustomContextVariable extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CustomContextVariable.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CustomContextVariable.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CustomContextVariable' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UserContextVariable> adapterUserContextVariable = gson.getDelegateAdapter(this, TypeToken.get(UserContextVariable.class));
            final TypeAdapter<IssueContextVariable> adapterIssueContextVariable = gson.getDelegateAdapter(this, TypeToken.get(IssueContextVariable.class));
            final TypeAdapter<JsonContextVariable> adapterJsonContextVariable = gson.getDelegateAdapter(this, TypeToken.get(JsonContextVariable.class));

            return (TypeAdapter<T>) new TypeAdapter<CustomContextVariable>() {
                @Override
                public void write(JsonWriter out, CustomContextVariable value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `UserContextVariable`
                    if (value.getActualInstance() instanceof UserContextVariable) {
                        JsonElement element = adapterUserContextVariable.toJsonTree((UserContextVariable)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `IssueContextVariable`
                    if (value.getActualInstance() instanceof IssueContextVariable) {
                        JsonElement element = adapterIssueContextVariable.toJsonTree((IssueContextVariable)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `JsonContextVariable`
                    if (value.getActualInstance() instanceof JsonContextVariable) {
                        JsonElement element = adapterJsonContextVariable.toJsonTree((JsonContextVariable)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: IssueContextVariable, JsonContextVariable, UserContextVariable");
                }

                @Override
                public CustomContextVariable read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize UserContextVariable
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UserContextVariable.validateJsonElement(jsonElement);
                        actualAdapter = adapterUserContextVariable;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UserContextVariable'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UserContextVariable failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UserContextVariable'", e);
                    }
                    // deserialize IssueContextVariable
                    try {
                        // validate the JSON object to see if any exception is thrown
                        IssueContextVariable.validateJsonElement(jsonElement);
                        actualAdapter = adapterIssueContextVariable;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'IssueContextVariable'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for IssueContextVariable failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'IssueContextVariable'", e);
                    }
                    // deserialize JsonContextVariable
                    try {
                        // validate the JSON object to see if any exception is thrown
                        JsonContextVariable.validateJsonElement(jsonElement);
                        actualAdapter = adapterJsonContextVariable;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'JsonContextVariable'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for JsonContextVariable failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'JsonContextVariable'", e);
                    }

                    if (match == 1) {
                        CustomContextVariable ret = new CustomContextVariable();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for CustomContextVariable: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public CustomContextVariable() {
        super("oneOf", Boolean.FALSE);
    }

    public CustomContextVariable(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("UserContextVariable", UserContextVariable.class);
        schemas.put("IssueContextVariable", IssueContextVariable.class);
        schemas.put("JsonContextVariable", JsonContextVariable.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CustomContextVariable.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * IssueContextVariable, JsonContextVariable, UserContextVariable
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof UserContextVariable) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof IssueContextVariable) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof JsonContextVariable) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be IssueContextVariable, JsonContextVariable, UserContextVariable");
    }

    /**
     * Get the actual instance, which can be the following:
     * IssueContextVariable, JsonContextVariable, UserContextVariable
     *
     * @return The actual instance (IssueContextVariable, JsonContextVariable, UserContextVariable)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `UserContextVariable`. If the actual instance is not `UserContextVariable`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UserContextVariable`
     * @throws ClassCastException if the instance is not `UserContextVariable`
     */
    public UserContextVariable getUserContextVariable() throws ClassCastException {
        return (UserContextVariable)super.getActualInstance();
    }
    /**
     * Get the actual instance of `IssueContextVariable`. If the actual instance is not `IssueContextVariable`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `IssueContextVariable`
     * @throws ClassCastException if the instance is not `IssueContextVariable`
     */
    public IssueContextVariable getIssueContextVariable() throws ClassCastException {
        return (IssueContextVariable)super.getActualInstance();
    }
    /**
     * Get the actual instance of `JsonContextVariable`. If the actual instance is not `JsonContextVariable`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `JsonContextVariable`
     * @throws ClassCastException if the instance is not `JsonContextVariable`
     */
    public JsonContextVariable getJsonContextVariable() throws ClassCastException {
        return (JsonContextVariable)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CustomContextVariable
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with UserContextVariable
        try {
            UserContextVariable.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UserContextVariable failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with IssueContextVariable
        try {
            IssueContextVariable.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for IssueContextVariable failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with JsonContextVariable
        try {
            JsonContextVariable.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for JsonContextVariable failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for CustomContextVariable with oneOf schemas: IssueContextVariable, JsonContextVariable, UserContextVariable. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of CustomContextVariable given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CustomContextVariable
     * @throws IOException if the JSON string is invalid with respect to CustomContextVariable
     */
    public static CustomContextVariable fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CustomContextVariable.class);
    }

    /**
     * Convert an instance of CustomContextVariable to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
