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
import org.openapitools.client.model.CompoundClause;
import org.openapitools.client.model.FieldChangedClause;
import org.openapitools.client.model.FieldValueClause;
import org.openapitools.client.model.FieldWasClause;
import org.openapitools.client.model.JqlQueryClauseOperand;
import org.openapitools.client.model.JqlQueryClauseTimePredicate;
import org.openapitools.client.model.JqlQueryField;



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
public class JqlQueryClause extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(JqlQueryClause.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!JqlQueryClause.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'JqlQueryClause' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CompoundClause> adapterCompoundClause = gson.getDelegateAdapter(this, TypeToken.get(CompoundClause.class));
            final TypeAdapter<FieldValueClause> adapterFieldValueClause = gson.getDelegateAdapter(this, TypeToken.get(FieldValueClause.class));
            final TypeAdapter<FieldWasClause> adapterFieldWasClause = gson.getDelegateAdapter(this, TypeToken.get(FieldWasClause.class));
            final TypeAdapter<FieldChangedClause> adapterFieldChangedClause = gson.getDelegateAdapter(this, TypeToken.get(FieldChangedClause.class));

            return (TypeAdapter<T>) new TypeAdapter<JqlQueryClause>() {
                @Override
                public void write(JsonWriter out, JqlQueryClause value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CompoundClause`
                    if (value.getActualInstance() instanceof CompoundClause) {
                        JsonElement element = adapterCompoundClause.toJsonTree((CompoundClause)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `FieldValueClause`
                    if (value.getActualInstance() instanceof FieldValueClause) {
                        JsonElement element = adapterFieldValueClause.toJsonTree((FieldValueClause)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `FieldWasClause`
                    if (value.getActualInstance() instanceof FieldWasClause) {
                        JsonElement element = adapterFieldWasClause.toJsonTree((FieldWasClause)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `FieldChangedClause`
                    if (value.getActualInstance() instanceof FieldChangedClause) {
                        JsonElement element = adapterFieldChangedClause.toJsonTree((FieldChangedClause)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: CompoundClause, FieldChangedClause, FieldValueClause, FieldWasClause");
                }

                @Override
                public JqlQueryClause read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize CompoundClause
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CompoundClause.validateJsonElement(jsonElement);
                        actualAdapter = adapterCompoundClause;
                        JqlQueryClause ret = new JqlQueryClause();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CompoundClause failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CompoundClause'", e);
                    }
                    // deserialize FieldValueClause
                    try {
                        // validate the JSON object to see if any exception is thrown
                        FieldValueClause.validateJsonElement(jsonElement);
                        actualAdapter = adapterFieldValueClause;
                        JqlQueryClause ret = new JqlQueryClause();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for FieldValueClause failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'FieldValueClause'", e);
                    }
                    // deserialize FieldWasClause
                    try {
                        // validate the JSON object to see if any exception is thrown
                        FieldWasClause.validateJsonElement(jsonElement);
                        actualAdapter = adapterFieldWasClause;
                        JqlQueryClause ret = new JqlQueryClause();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for FieldWasClause failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'FieldWasClause'", e);
                    }
                    // deserialize FieldChangedClause
                    try {
                        // validate the JSON object to see if any exception is thrown
                        FieldChangedClause.validateJsonElement(jsonElement);
                        actualAdapter = adapterFieldChangedClause;
                        JqlQueryClause ret = new JqlQueryClause();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for FieldChangedClause failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'FieldChangedClause'", e);
                    }

                    throw new IOException(String.format("Failed deserialization for JqlQueryClause: no class matches result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public JqlQueryClause() {
        super("anyOf", Boolean.FALSE);
    }

    public JqlQueryClause(Object o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CompoundClause", CompoundClause.class);
        schemas.put("FieldValueClause", FieldValueClause.class);
        schemas.put("FieldWasClause", FieldWasClause.class);
        schemas.put("FieldChangedClause", FieldChangedClause.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return JqlQueryClause.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * CompoundClause, FieldChangedClause, FieldValueClause, FieldWasClause
     *
     * It could be an instance of the 'anyOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CompoundClause) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof FieldValueClause) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof FieldWasClause) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof FieldChangedClause) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CompoundClause, FieldChangedClause, FieldValueClause, FieldWasClause");
    }

    /**
     * Get the actual instance, which can be the following:
     * CompoundClause, FieldChangedClause, FieldValueClause, FieldWasClause
     *
     * @return The actual instance (CompoundClause, FieldChangedClause, FieldValueClause, FieldWasClause)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CompoundClause`. If the actual instance is not `CompoundClause`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CompoundClause`
     * @throws ClassCastException if the instance is not `CompoundClause`
     */
    public CompoundClause getCompoundClause() throws ClassCastException {
        return (CompoundClause)super.getActualInstance();
    }
    /**
     * Get the actual instance of `FieldValueClause`. If the actual instance is not `FieldValueClause`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FieldValueClause`
     * @throws ClassCastException if the instance is not `FieldValueClause`
     */
    public FieldValueClause getFieldValueClause() throws ClassCastException {
        return (FieldValueClause)super.getActualInstance();
    }
    /**
     * Get the actual instance of `FieldWasClause`. If the actual instance is not `FieldWasClause`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FieldWasClause`
     * @throws ClassCastException if the instance is not `FieldWasClause`
     */
    public FieldWasClause getFieldWasClause() throws ClassCastException {
        return (FieldWasClause)super.getActualInstance();
    }
    /**
     * Get the actual instance of `FieldChangedClause`. If the actual instance is not `FieldChangedClause`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FieldChangedClause`
     * @throws ClassCastException if the instance is not `FieldChangedClause`
     */
    public FieldChangedClause getFieldChangedClause() throws ClassCastException {
        return (FieldChangedClause)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to JqlQueryClause
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate anyOf schemas one by one
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with CompoundClause
        try {
            CompoundClause.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CompoundClause failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with FieldValueClause
        try {
            FieldValueClause.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for FieldValueClause failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with FieldWasClause
        try {
            FieldWasClause.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for FieldWasClause failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with FieldChangedClause
        try {
            FieldChangedClause.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for FieldChangedClause failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        throw new IOException(String.format("The JSON string is invalid for JqlQueryClause with anyOf schemas: CompoundClause, FieldChangedClause, FieldValueClause, FieldWasClause. no class match the result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
    }

    /**
     * Create an instance of JqlQueryClause given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of JqlQueryClause
     * @throws IOException if the JSON string is invalid with respect to JqlQueryClause
     */
    public static JqlQueryClause fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, JqlQueryClause.class);
    }

    /**
     * Convert an instance of JqlQueryClause to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
