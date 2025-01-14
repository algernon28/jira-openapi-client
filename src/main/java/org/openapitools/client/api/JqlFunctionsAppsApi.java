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

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.JqlFunctionPrecomputationUpdateRequestBean;
import org.openapitools.client.model.PageBeanJqlFunctionPrecomputationBean;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JqlFunctionsAppsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public JqlFunctionsAppsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public JqlFunctionsAppsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getPrecomputations
     * @param functionKey The function key in format:   *  Forge: &#x60;ari:cloud:ecosystem::extension/[App ID]/[Environment ID]/static/[Function key from manifest]&#x60;  *  Connect: &#x60;[App key]__[Module key]&#x60; (optional)
     * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
     * @param maxResults The maximum number of items to return per page. (optional, default to 100)
     * @param orderBy [Order](#ordering) the results by a field:   *  &#x60;functionKey&#x60; Sorts by the functionKey.  *  &#x60;used&#x60; Sorts by the used timestamp.  *  &#x60;created&#x60; Sorts by the created timestamp.  *  &#x60;updated&#x60; Sorts by the updated timestamp. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the request is not authenticated as the app that provided the function. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the function is not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPrecomputationsCall(List<String> functionKey, Long startAt, Integer maxResults, String orderBy, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/rest/api/3/jql/function/computation";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (functionKey != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "functionKey", functionKey));
        }

        if (startAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("startAt", startAt));
        }

        if (maxResults != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("maxResults", maxResults));
        }

        if (orderBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("orderBy", orderBy));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPrecomputationsValidateBeforeCall(List<String> functionKey, Long startAt, Integer maxResults, String orderBy, final ApiCallback _callback) throws ApiException {
        return getPrecomputationsCall(functionKey, startAt, maxResults, orderBy, _callback);

    }

    /**
     * Get precomputations (apps)
     * Returns the list of a function&#39;s precomputations along with information about when they were created, updated, and last used. Each precomputation has a &#x60;value&#x60; \\- the JQL fragment to replace the custom function clause with.  **[Permissions](#permissions) required:** This API is only accessible to apps and apps can only inspect their own functions.  The new &#x60;read:app-data:jira&#x60; OAuth scope is 100% optional now, and not using it won&#39;t break your app. However, we recommend adding it to your app&#39;s scope list because we will eventually make it mandatory.
     * @param functionKey The function key in format:   *  Forge: &#x60;ari:cloud:ecosystem::extension/[App ID]/[Environment ID]/static/[Function key from manifest]&#x60;  *  Connect: &#x60;[App key]__[Module key]&#x60; (optional)
     * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
     * @param maxResults The maximum number of items to return per page. (optional, default to 100)
     * @param orderBy [Order](#ordering) the results by a field:   *  &#x60;functionKey&#x60; Sorts by the functionKey.  *  &#x60;used&#x60; Sorts by the used timestamp.  *  &#x60;created&#x60; Sorts by the created timestamp.  *  &#x60;updated&#x60; Sorts by the updated timestamp. (optional)
     * @return PageBeanJqlFunctionPrecomputationBean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the request is not authenticated as the app that provided the function. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the function is not found. </td><td>  -  </td></tr>
     </table>
     */
    public PageBeanJqlFunctionPrecomputationBean getPrecomputations(List<String> functionKey, Long startAt, Integer maxResults, String orderBy) throws ApiException {
        ApiResponse<PageBeanJqlFunctionPrecomputationBean> localVarResp = getPrecomputationsWithHttpInfo(functionKey, startAt, maxResults, orderBy);
        return localVarResp.getData();
    }

    /**
     * Get precomputations (apps)
     * Returns the list of a function&#39;s precomputations along with information about when they were created, updated, and last used. Each precomputation has a &#x60;value&#x60; \\- the JQL fragment to replace the custom function clause with.  **[Permissions](#permissions) required:** This API is only accessible to apps and apps can only inspect their own functions.  The new &#x60;read:app-data:jira&#x60; OAuth scope is 100% optional now, and not using it won&#39;t break your app. However, we recommend adding it to your app&#39;s scope list because we will eventually make it mandatory.
     * @param functionKey The function key in format:   *  Forge: &#x60;ari:cloud:ecosystem::extension/[App ID]/[Environment ID]/static/[Function key from manifest]&#x60;  *  Connect: &#x60;[App key]__[Module key]&#x60; (optional)
     * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
     * @param maxResults The maximum number of items to return per page. (optional, default to 100)
     * @param orderBy [Order](#ordering) the results by a field:   *  &#x60;functionKey&#x60; Sorts by the functionKey.  *  &#x60;used&#x60; Sorts by the used timestamp.  *  &#x60;created&#x60; Sorts by the created timestamp.  *  &#x60;updated&#x60; Sorts by the updated timestamp. (optional)
     * @return ApiResponse&lt;PageBeanJqlFunctionPrecomputationBean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the request is not authenticated as the app that provided the function. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the function is not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PageBeanJqlFunctionPrecomputationBean> getPrecomputationsWithHttpInfo(List<String> functionKey, Long startAt, Integer maxResults, String orderBy) throws ApiException {
        okhttp3.Call localVarCall = getPrecomputationsValidateBeforeCall(functionKey, startAt, maxResults, orderBy, null);
        Type localVarReturnType = new TypeToken<PageBeanJqlFunctionPrecomputationBean>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get precomputations (apps) (asynchronously)
     * Returns the list of a function&#39;s precomputations along with information about when they were created, updated, and last used. Each precomputation has a &#x60;value&#x60; \\- the JQL fragment to replace the custom function clause with.  **[Permissions](#permissions) required:** This API is only accessible to apps and apps can only inspect their own functions.  The new &#x60;read:app-data:jira&#x60; OAuth scope is 100% optional now, and not using it won&#39;t break your app. However, we recommend adding it to your app&#39;s scope list because we will eventually make it mandatory.
     * @param functionKey The function key in format:   *  Forge: &#x60;ari:cloud:ecosystem::extension/[App ID]/[Environment ID]/static/[Function key from manifest]&#x60;  *  Connect: &#x60;[App key]__[Module key]&#x60; (optional)
     * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
     * @param maxResults The maximum number of items to return per page. (optional, default to 100)
     * @param orderBy [Order](#ordering) the results by a field:   *  &#x60;functionKey&#x60; Sorts by the functionKey.  *  &#x60;used&#x60; Sorts by the used timestamp.  *  &#x60;created&#x60; Sorts by the created timestamp.  *  &#x60;updated&#x60; Sorts by the updated timestamp. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the request is not authenticated as the app that provided the function. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the function is not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPrecomputationsAsync(List<String> functionKey, Long startAt, Integer maxResults, String orderBy, final ApiCallback<PageBeanJqlFunctionPrecomputationBean> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPrecomputationsValidateBeforeCall(functionKey, startAt, maxResults, orderBy, _callback);
        Type localVarReturnType = new TypeToken<PageBeanJqlFunctionPrecomputationBean>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updatePrecomputations
     * @param jqlFunctionPrecomputationUpdateRequestBean  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the request is not authenticated as the app that provided the function. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the function is not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updatePrecomputationsCall(JqlFunctionPrecomputationUpdateRequestBean jqlFunctionPrecomputationUpdateRequestBean, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = jqlFunctionPrecomputationUpdateRequestBean;

        // create path and map variables
        String localVarPath = "/rest/api/3/jql/function/computation";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updatePrecomputationsValidateBeforeCall(JqlFunctionPrecomputationUpdateRequestBean jqlFunctionPrecomputationUpdateRequestBean, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'jqlFunctionPrecomputationUpdateRequestBean' is set
        if (jqlFunctionPrecomputationUpdateRequestBean == null) {
            throw new ApiException("Missing the required parameter 'jqlFunctionPrecomputationUpdateRequestBean' when calling updatePrecomputations(Async)");
        }

        return updatePrecomputationsCall(jqlFunctionPrecomputationUpdateRequestBean, _callback);

    }

    /**
     * Update precomputations (apps)
     * Update the precomputation value of a function created by a Forge/Connect app.  **[Permissions](#permissions) required:** An API for apps to update their own precomputations.  The new &#x60;write:app-data:jira&#x60; OAuth scope is 100% optional now, and not using it won&#39;t break your app. However, we recommend adding it to your app&#39;s scope list because we will eventually make it mandatory.
     * @param jqlFunctionPrecomputationUpdateRequestBean  (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the request is not authenticated as the app that provided the function. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the function is not found. </td><td>  -  </td></tr>
     </table>
     */
    public Object updatePrecomputations(JqlFunctionPrecomputationUpdateRequestBean jqlFunctionPrecomputationUpdateRequestBean) throws ApiException {
        ApiResponse<Object> localVarResp = updatePrecomputationsWithHttpInfo(jqlFunctionPrecomputationUpdateRequestBean);
        return localVarResp.getData();
    }

    /**
     * Update precomputations (apps)
     * Update the precomputation value of a function created by a Forge/Connect app.  **[Permissions](#permissions) required:** An API for apps to update their own precomputations.  The new &#x60;write:app-data:jira&#x60; OAuth scope is 100% optional now, and not using it won&#39;t break your app. However, we recommend adding it to your app&#39;s scope list because we will eventually make it mandatory.
     * @param jqlFunctionPrecomputationUpdateRequestBean  (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the request is not authenticated as the app that provided the function. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the function is not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> updatePrecomputationsWithHttpInfo(JqlFunctionPrecomputationUpdateRequestBean jqlFunctionPrecomputationUpdateRequestBean) throws ApiException {
        okhttp3.Call localVarCall = updatePrecomputationsValidateBeforeCall(jqlFunctionPrecomputationUpdateRequestBean, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update precomputations (apps) (asynchronously)
     * Update the precomputation value of a function created by a Forge/Connect app.  **[Permissions](#permissions) required:** An API for apps to update their own precomputations.  The new &#x60;write:app-data:jira&#x60; OAuth scope is 100% optional now, and not using it won&#39;t break your app. However, we recommend adding it to your app&#39;s scope list because we will eventually make it mandatory.
     * @param jqlFunctionPrecomputationUpdateRequestBean  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the request is not authenticated as the app that provided the function. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the function is not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updatePrecomputationsAsync(JqlFunctionPrecomputationUpdateRequestBean jqlFunctionPrecomputationUpdateRequestBean, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = updatePrecomputationsValidateBeforeCall(jqlFunctionPrecomputationUpdateRequestBean, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
