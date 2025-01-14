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


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.ConnectModules;
import org.openapitools.client.model.ErrorMessage;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DynamicModulesApi
 */
@Disabled
public class DynamicModulesApiTest {

    private final DynamicModulesApi api = new DynamicModulesApi();

    /**
     * Get modules
     *
     * Returns all modules registered dynamically by the calling app.  **[Permissions](#permissions) required:** Only Connect apps can make this request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void dynamicModulesResourceGetModulesGetTest() throws ApiException {
        ConnectModules response = api.dynamicModulesResourceGetModulesGet();
        // TODO: test validations
    }

    /**
     * Register modules
     *
     * Registers a list of modules.  **[Permissions](#permissions) required:** Only Connect apps can make this request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void dynamicModulesResourceRegisterModulesPostTest() throws ApiException {
        ConnectModules connectModules = null;
        api.dynamicModulesResourceRegisterModulesPost(connectModules);
        // TODO: test validations
    }

    /**
     * Remove modules
     *
     * Remove all or a list of modules registered by the calling app.  **[Permissions](#permissions) required:** Only Connect apps can make this request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void dynamicModulesResourceRemoveModulesDeleteTest() throws ApiException {
        List<String> moduleKey = null;
        api.dynamicModulesResourceRemoveModulesDelete(moduleKey);
        // TODO: test validations
    }

}
