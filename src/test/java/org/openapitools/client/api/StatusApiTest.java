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
import org.openapitools.client.model.JiraStatus;
import org.openapitools.client.model.PageOfStatuses;
import org.openapitools.client.model.StatusCreateRequest;
import org.openapitools.client.model.StatusUpdateRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StatusApi
 */
@Disabled
public class StatusApiTest {

    private final StatusApi api = new StatusApi();

    /**
     * Bulk create statuses
     *
     * Creates statuses for a global or project scope.  **[Permissions](#permissions) required:**   *  *Administer projects* [project permission.](https://confluence.atlassian.com/x/yodKLg)  *  *Administer Jira* [project permission.](https://confluence.atlassian.com/x/yodKLg)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createStatusesTest() throws ApiException {
        StatusCreateRequest statusCreateRequest = null;
        List<JiraStatus> response = api.createStatuses(statusCreateRequest);
        // TODO: test validations
    }

    /**
     * Bulk delete Statuses
     *
     * Deletes statuses by ID.  **[Permissions](#permissions) required:**   *  *Administer projects* [project permission.](https://confluence.atlassian.com/x/yodKLg)  *  *Administer Jira* [project permission.](https://confluence.atlassian.com/x/yodKLg)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteStatusesByIdTest() throws ApiException {
        List<String> id = null;
        Object response = api.deleteStatusesById(id);
        // TODO: test validations
    }

    /**
     * Bulk get statuses
     *
     * Returns a list of the statuses specified by one or more status IDs.  **[Permissions](#permissions) required:**   *  *Administer projects* [project permission.](https://confluence.atlassian.com/x/yodKLg)  *  *Administer Jira* [project permission.](https://confluence.atlassian.com/x/yodKLg)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getStatusesByIdTest() throws ApiException {
        List<String> id = null;
        String expand = null;
        List<JiraStatus> response = api.getStatusesById(id, expand);
        // TODO: test validations
    }

    /**
     * Search statuses paginated
     *
     * Returns a [paginated](https://developer.atlassian.com/cloud/jira/platform/rest/v3/intro/#pagination) list of statuses that match a search on name or project.  **[Permissions](#permissions) required:**   *  *Administer projects* [project permission.](https://confluence.atlassian.com/x/yodKLg)  *  *Administer Jira* [project permission.](https://confluence.atlassian.com/x/yodKLg)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchTest() throws ApiException {
        String expand = null;
        String projectId = null;
        Long startAt = null;
        Integer maxResults = null;
        String searchString = null;
        String statusCategory = null;
        PageOfStatuses response = api.search(expand, projectId, startAt, maxResults, searchString, statusCategory);
        // TODO: test validations
    }

    /**
     * Bulk update statuses
     *
     * Updates statuses by ID.  **[Permissions](#permissions) required:**   *  *Administer projects* [project permission.](https://confluence.atlassian.com/x/yodKLg)  *  *Administer Jira* [project permission.](https://confluence.atlassian.com/x/yodKLg)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateStatusesTest() throws ApiException {
        StatusUpdateRequest statusUpdateRequest = null;
        Object response = api.updateStatuses(statusUpdateRequest);
        // TODO: test validations
    }

}
