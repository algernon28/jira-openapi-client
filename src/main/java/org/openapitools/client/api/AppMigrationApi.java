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


import org.openapitools.client.model.ConnectCustomFieldValues;
import org.openapitools.client.model.EntityPropertyDetails;
import java.util.UUID;
import org.openapitools.client.model.WorkflowRulesSearch;
import org.openapitools.client.model.WorkflowRulesSearchDetails;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppMigrationApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AppMigrationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AppMigrationApi(ApiClient apiClient) {
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
     * Build call for appIssueFieldValueUpdateResourceUpdateIssueFieldsPut
     * @param atlassianTransferId The ID of the transfer. (required)
     * @param connectCustomFieldValues  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if: * the transfer ID is not found. * the authorisation credentials are incorrect or missing. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call appIssueFieldValueUpdateResourceUpdateIssueFieldsPutCall(UUID atlassianTransferId, ConnectCustomFieldValues connectCustomFieldValues, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = connectCustomFieldValues;

        // create path and map variables
        String localVarPath = "/rest/atlassian-connect/1/migration/field";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (atlassianTransferId != null) {
            localVarHeaderParams.put("Atlassian-Transfer-Id", localVarApiClient.parameterToString(atlassianTransferId));
        }

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

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call appIssueFieldValueUpdateResourceUpdateIssueFieldsPutValidateBeforeCall(UUID atlassianTransferId, ConnectCustomFieldValues connectCustomFieldValues, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'atlassianTransferId' is set
        if (atlassianTransferId == null) {
            throw new ApiException("Missing the required parameter 'atlassianTransferId' when calling appIssueFieldValueUpdateResourceUpdateIssueFieldsPut(Async)");
        }

        // verify the required parameter 'connectCustomFieldValues' is set
        if (connectCustomFieldValues == null) {
            throw new ApiException("Missing the required parameter 'connectCustomFieldValues' when calling appIssueFieldValueUpdateResourceUpdateIssueFieldsPut(Async)");
        }

        return appIssueFieldValueUpdateResourceUpdateIssueFieldsPutCall(atlassianTransferId, connectCustomFieldValues, _callback);

    }

    /**
     * Bulk update custom field value
     * Updates the value of a custom field added by Connect apps on one or more issues. The values of up to 200 custom fields can be updated.  **[Permissions](#permissions) required:** Only Connect apps can make this request
     * @param atlassianTransferId The ID of the transfer. (required)
     * @param connectCustomFieldValues  (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if: * the transfer ID is not found. * the authorisation credentials are incorrect or missing. </td><td>  -  </td></tr>
     </table>
     */
    public Object appIssueFieldValueUpdateResourceUpdateIssueFieldsPut(UUID atlassianTransferId, ConnectCustomFieldValues connectCustomFieldValues) throws ApiException {
        ApiResponse<Object> localVarResp = appIssueFieldValueUpdateResourceUpdateIssueFieldsPutWithHttpInfo(atlassianTransferId, connectCustomFieldValues);
        return localVarResp.getData();
    }

    /**
     * Bulk update custom field value
     * Updates the value of a custom field added by Connect apps on one or more issues. The values of up to 200 custom fields can be updated.  **[Permissions](#permissions) required:** Only Connect apps can make this request
     * @param atlassianTransferId The ID of the transfer. (required)
     * @param connectCustomFieldValues  (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if: * the transfer ID is not found. * the authorisation credentials are incorrect or missing. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> appIssueFieldValueUpdateResourceUpdateIssueFieldsPutWithHttpInfo(UUID atlassianTransferId, ConnectCustomFieldValues connectCustomFieldValues) throws ApiException {
        okhttp3.Call localVarCall = appIssueFieldValueUpdateResourceUpdateIssueFieldsPutValidateBeforeCall(atlassianTransferId, connectCustomFieldValues, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Bulk update custom field value (asynchronously)
     * Updates the value of a custom field added by Connect apps on one or more issues. The values of up to 200 custom fields can be updated.  **[Permissions](#permissions) required:** Only Connect apps can make this request
     * @param atlassianTransferId The ID of the transfer. (required)
     * @param connectCustomFieldValues  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if: * the transfer ID is not found. * the authorisation credentials are incorrect or missing. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call appIssueFieldValueUpdateResourceUpdateIssueFieldsPutAsync(UUID atlassianTransferId, ConnectCustomFieldValues connectCustomFieldValues, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = appIssueFieldValueUpdateResourceUpdateIssueFieldsPutValidateBeforeCall(atlassianTransferId, connectCustomFieldValues, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for migrationResourceUpdateEntityPropertiesValuePut
     * @param atlassianTransferId The app migration transfer ID. (required)
     * @param entityType The type indicating the object that contains the entity properties. (required)
     * @param entityPropertyDetails  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is not valid. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the authorisation credentials are incorrect or missing. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call migrationResourceUpdateEntityPropertiesValuePutCall(UUID atlassianTransferId, String entityType, List<EntityPropertyDetails> entityPropertyDetails, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = entityPropertyDetails;

        // create path and map variables
        String localVarPath = "/rest/atlassian-connect/1/migration/properties/{entityType}"
            .replace("{" + "entityType" + "}", localVarApiClient.escapeString(entityType.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (atlassianTransferId != null) {
            localVarHeaderParams.put("Atlassian-Transfer-Id", localVarApiClient.parameterToString(atlassianTransferId));
        }

        final String[] localVarAccepts = {
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

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call migrationResourceUpdateEntityPropertiesValuePutValidateBeforeCall(UUID atlassianTransferId, String entityType, List<EntityPropertyDetails> entityPropertyDetails, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'atlassianTransferId' is set
        if (atlassianTransferId == null) {
            throw new ApiException("Missing the required parameter 'atlassianTransferId' when calling migrationResourceUpdateEntityPropertiesValuePut(Async)");
        }

        // verify the required parameter 'entityType' is set
        if (entityType == null) {
            throw new ApiException("Missing the required parameter 'entityType' when calling migrationResourceUpdateEntityPropertiesValuePut(Async)");
        }

        // verify the required parameter 'entityPropertyDetails' is set
        if (entityPropertyDetails == null) {
            throw new ApiException("Missing the required parameter 'entityPropertyDetails' when calling migrationResourceUpdateEntityPropertiesValuePut(Async)");
        }

        return migrationResourceUpdateEntityPropertiesValuePutCall(atlassianTransferId, entityType, entityPropertyDetails, _callback);

    }

    /**
     * Bulk update entity properties
     * Updates the values of multiple entity properties for an object, up to 50 updates per request. This operation is for use by Connect apps during app migration.
     * @param atlassianTransferId The app migration transfer ID. (required)
     * @param entityType The type indicating the object that contains the entity properties. (required)
     * @param entityPropertyDetails  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is not valid. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the authorisation credentials are incorrect or missing. </td><td>  -  </td></tr>
     </table>
     */
    public void migrationResourceUpdateEntityPropertiesValuePut(UUID atlassianTransferId, String entityType, List<EntityPropertyDetails> entityPropertyDetails) throws ApiException {
        migrationResourceUpdateEntityPropertiesValuePutWithHttpInfo(atlassianTransferId, entityType, entityPropertyDetails);
    }

    /**
     * Bulk update entity properties
     * Updates the values of multiple entity properties for an object, up to 50 updates per request. This operation is for use by Connect apps during app migration.
     * @param atlassianTransferId The app migration transfer ID. (required)
     * @param entityType The type indicating the object that contains the entity properties. (required)
     * @param entityPropertyDetails  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is not valid. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the authorisation credentials are incorrect or missing. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> migrationResourceUpdateEntityPropertiesValuePutWithHttpInfo(UUID atlassianTransferId, String entityType, List<EntityPropertyDetails> entityPropertyDetails) throws ApiException {
        okhttp3.Call localVarCall = migrationResourceUpdateEntityPropertiesValuePutValidateBeforeCall(atlassianTransferId, entityType, entityPropertyDetails, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Bulk update entity properties (asynchronously)
     * Updates the values of multiple entity properties for an object, up to 50 updates per request. This operation is for use by Connect apps during app migration.
     * @param atlassianTransferId The app migration transfer ID. (required)
     * @param entityType The type indicating the object that contains the entity properties. (required)
     * @param entityPropertyDetails  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is not valid. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the authorisation credentials are incorrect or missing. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call migrationResourceUpdateEntityPropertiesValuePutAsync(UUID atlassianTransferId, String entityType, List<EntityPropertyDetails> entityPropertyDetails, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = migrationResourceUpdateEntityPropertiesValuePutValidateBeforeCall(atlassianTransferId, entityType, entityPropertyDetails, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for migrationResourceWorkflowRuleSearchPost
     * @param atlassianTransferId The app migration transfer ID. (required)
     * @param workflowRulesSearch  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is not valid. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the authorisation credentials are incorrect or missing. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call migrationResourceWorkflowRuleSearchPostCall(UUID atlassianTransferId, WorkflowRulesSearch workflowRulesSearch, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = workflowRulesSearch;

        // create path and map variables
        String localVarPath = "/rest/atlassian-connect/1/migration/workflow/rule/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (atlassianTransferId != null) {
            localVarHeaderParams.put("Atlassian-Transfer-Id", localVarApiClient.parameterToString(atlassianTransferId));
        }

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

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call migrationResourceWorkflowRuleSearchPostValidateBeforeCall(UUID atlassianTransferId, WorkflowRulesSearch workflowRulesSearch, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'atlassianTransferId' is set
        if (atlassianTransferId == null) {
            throw new ApiException("Missing the required parameter 'atlassianTransferId' when calling migrationResourceWorkflowRuleSearchPost(Async)");
        }

        // verify the required parameter 'workflowRulesSearch' is set
        if (workflowRulesSearch == null) {
            throw new ApiException("Missing the required parameter 'workflowRulesSearch' when calling migrationResourceWorkflowRuleSearchPost(Async)");
        }

        return migrationResourceWorkflowRuleSearchPostCall(atlassianTransferId, workflowRulesSearch, _callback);

    }

    /**
     * Get workflow transition rule configurations
     * Returns configurations for workflow transition rules migrated from server to cloud and owned by the calling Connect app.
     * @param atlassianTransferId The app migration transfer ID. (required)
     * @param workflowRulesSearch  (required)
     * @return WorkflowRulesSearchDetails
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is not valid. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the authorisation credentials are incorrect or missing. </td><td>  -  </td></tr>
     </table>
     */
    public WorkflowRulesSearchDetails migrationResourceWorkflowRuleSearchPost(UUID atlassianTransferId, WorkflowRulesSearch workflowRulesSearch) throws ApiException {
        ApiResponse<WorkflowRulesSearchDetails> localVarResp = migrationResourceWorkflowRuleSearchPostWithHttpInfo(atlassianTransferId, workflowRulesSearch);
        return localVarResp.getData();
    }

    /**
     * Get workflow transition rule configurations
     * Returns configurations for workflow transition rules migrated from server to cloud and owned by the calling Connect app.
     * @param atlassianTransferId The app migration transfer ID. (required)
     * @param workflowRulesSearch  (required)
     * @return ApiResponse&lt;WorkflowRulesSearchDetails&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is not valid. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the authorisation credentials are incorrect or missing. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<WorkflowRulesSearchDetails> migrationResourceWorkflowRuleSearchPostWithHttpInfo(UUID atlassianTransferId, WorkflowRulesSearch workflowRulesSearch) throws ApiException {
        okhttp3.Call localVarCall = migrationResourceWorkflowRuleSearchPostValidateBeforeCall(atlassianTransferId, workflowRulesSearch, null);
        Type localVarReturnType = new TypeToken<WorkflowRulesSearchDetails>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get workflow transition rule configurations (asynchronously)
     * Returns configurations for workflow transition rules migrated from server to cloud and owned by the calling Connect app.
     * @param atlassianTransferId The app migration transfer ID. (required)
     * @param workflowRulesSearch  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is not valid. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the authorisation credentials are incorrect or missing. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call migrationResourceWorkflowRuleSearchPostAsync(UUID atlassianTransferId, WorkflowRulesSearch workflowRulesSearch, final ApiCallback<WorkflowRulesSearchDetails> _callback) throws ApiException {

        okhttp3.Call localVarCall = migrationResourceWorkflowRuleSearchPostValidateBeforeCall(atlassianTransferId, workflowRulesSearch, _callback);
        Type localVarReturnType = new TypeToken<WorkflowRulesSearchDetails>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
