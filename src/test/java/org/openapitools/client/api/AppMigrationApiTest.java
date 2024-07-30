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
import org.openapitools.client.model.ConnectCustomFieldValues;
import org.openapitools.client.model.EntityPropertyDetails;
import java.util.UUID;
import org.openapitools.client.model.WorkflowRulesSearch;
import org.openapitools.client.model.WorkflowRulesSearchDetails;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AppMigrationApi
 */
@Disabled
public class AppMigrationApiTest {

    private final AppMigrationApi api = new AppMigrationApi();

    /**
     * Bulk update custom field value
     *
     * Updates the value of a custom field added by Connect apps on one or more issues. The values of up to 200 custom fields can be updated.  **[Permissions](#permissions) required:** Only Connect apps can make this request
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appIssueFieldValueUpdateResourceUpdateIssueFieldsPutTest() throws ApiException {
        UUID atlassianTransferId = null;
        ConnectCustomFieldValues connectCustomFieldValues = null;
        Object response = api.appIssueFieldValueUpdateResourceUpdateIssueFieldsPut(atlassianTransferId, connectCustomFieldValues);
        // TODO: test validations
    }

    /**
     * Bulk update entity properties
     *
     * Updates the values of multiple entity properties for an object, up to 50 updates per request. This operation is for use by Connect apps during app migration.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void migrationResourceUpdateEntityPropertiesValuePutTest() throws ApiException {
        UUID atlassianTransferId = null;
        String entityType = null;
        List<EntityPropertyDetails> entityPropertyDetails = null;
        api.migrationResourceUpdateEntityPropertiesValuePut(atlassianTransferId, entityType, entityPropertyDetails);
        // TODO: test validations
    }

    /**
     * Get workflow transition rule configurations
     *
     * Returns configurations for workflow transition rules migrated from server to cloud and owned by the calling Connect app.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void migrationResourceWorkflowRuleSearchPostTest() throws ApiException {
        UUID atlassianTransferId = null;
        WorkflowRulesSearch workflowRulesSearch = null;
        WorkflowRulesSearchDetails response = api.migrationResourceWorkflowRuleSearchPost(atlassianTransferId, workflowRulesSearch);
        // TODO: test validations
    }

}
