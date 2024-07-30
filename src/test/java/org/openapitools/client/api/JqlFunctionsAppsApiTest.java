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
import org.openapitools.client.model.JqlFunctionPrecomputationUpdateRequestBean;
import org.openapitools.client.model.PageBeanJqlFunctionPrecomputationBean;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for JqlFunctionsAppsApi
 */
@Disabled
public class JqlFunctionsAppsApiTest {

    private final JqlFunctionsAppsApi api = new JqlFunctionsAppsApi();

    /**
     * Get precomputations (apps)
     *
     * Returns the list of a function&#39;s precomputations along with information about when they were created, updated, and last used. Each precomputation has a &#x60;value&#x60; \\- the JQL fragment to replace the custom function clause with.  **[Permissions](#permissions) required:** This API is only accessible to apps and apps can only inspect their own functions.  The new &#x60;read:app-data:jira&#x60; OAuth scope is 100% optional now, and not using it won&#39;t break your app. However, we recommend adding it to your app&#39;s scope list because we will eventually make it mandatory.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPrecomputationsTest() throws ApiException {
        List<String> functionKey = null;
        Long startAt = null;
        Integer maxResults = null;
        String orderBy = null;
        PageBeanJqlFunctionPrecomputationBean response = api.getPrecomputations(functionKey, startAt, maxResults, orderBy);
        // TODO: test validations
    }

    /**
     * Update precomputations (apps)
     *
     * Update the precomputation value of a function created by a Forge/Connect app.  **[Permissions](#permissions) required:** An API for apps to update their own precomputations.  The new &#x60;write:app-data:jira&#x60; OAuth scope is 100% optional now, and not using it won&#39;t break your app. However, we recommend adding it to your app&#39;s scope list because we will eventually make it mandatory.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updatePrecomputationsTest() throws ApiException {
        JqlFunctionPrecomputationUpdateRequestBean jqlFunctionPrecomputationUpdateRequestBean = null;
        Object response = api.updatePrecomputations(jqlFunctionPrecomputationUpdateRequestBean);
        // TODO: test validations
    }

}