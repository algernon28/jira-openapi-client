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
import org.openapitools.client.model.ComponentIssuesCount;
import org.openapitools.client.model.PageBean2ComponentJsonBean;
import org.openapitools.client.model.PageBeanComponentWithIssueCount;
import org.openapitools.client.model.ProjectComponent;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectComponentsApi
 */
@Disabled
public class ProjectComponentsApiTest {

    private final ProjectComponentsApi api = new ProjectComponentsApi();

    /**
     * Create component
     *
     * Creates a component. Use components to provide containers for issues within a project. Use components to provide containers for issues within a project.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project in which the component is created or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createComponentTest() throws ApiException {
        ProjectComponent projectComponent = null;
        ProjectComponent response = api.createComponent(projectComponent);
        // TODO: test validations
    }

    /**
     * Delete component
     *
     * Deletes a component.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the component or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteComponentTest() throws ApiException {
        String id = null;
        String moveIssuesTo = null;
        api.deleteComponent(id, moveIssuesTo);
        // TODO: test validations
    }

    /**
     * Find components for projects
     *
     * Returns a [paginated](#pagination) list of all components in a project, including global (Compass) components when applicable.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findComponentsForProjectsTest() throws ApiException {
        List<String> projectIdsOrKeys = null;
        Long startAt = null;
        Integer maxResults = null;
        String orderBy = null;
        String query = null;
        PageBean2ComponentJsonBean response = api.findComponentsForProjects(projectIdsOrKeys, startAt, maxResults, orderBy, query);
        // TODO: test validations
    }

    /**
     * Get component
     *
     * Returns a component.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for project containing the component.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getComponentTest() throws ApiException {
        String id = null;
        ProjectComponent response = api.getComponent(id);
        // TODO: test validations
    }

    /**
     * Get component issues count
     *
     * Returns the counts of issues assigned to the component.  This operation can be accessed anonymously.  **Deprecation notice:** The required OAuth 2.0 scopes will be updated on June 15, 2024.   *  **Classic**: &#x60;read:jira-work&#x60;  *  **Granular**: &#x60;read:field:jira&#x60;, &#x60;read:project.component:jira&#x60;  **[Permissions](#permissions) required:** None.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getComponentRelatedIssuesTest() throws ApiException {
        String id = null;
        ComponentIssuesCount response = api.getComponentRelatedIssues(id);
        // TODO: test validations
    }

    /**
     * Get project components
     *
     * Returns all components in a project. See the [Get project components paginated](#api-rest-api-3-project-projectIdOrKey-component-get) resource if you want to get a full list of components with pagination.  If your project uses Compass components, this API will return a paginated list of Compass components that are linked to issues in that project.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProjectComponentsTest() throws ApiException {
        String projectIdOrKey = null;
        String componentSource = null;
        List<ProjectComponent> response = api.getProjectComponents(projectIdOrKey, componentSource);
        // TODO: test validations
    }

    /**
     * Get project components paginated
     *
     * Returns a [paginated](#pagination) list of all components in a project. See the [Get project components](#api-rest-api-3-project-projectIdOrKey-components-get) resource if you want to get a full list of versions without pagination.  If your project uses Compass components, this API will return a list of Compass components that are linked to issues in that project.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProjectComponentsPaginatedTest() throws ApiException {
        String projectIdOrKey = null;
        Long startAt = null;
        Integer maxResults = null;
        String orderBy = null;
        String componentSource = null;
        String query = null;
        PageBeanComponentWithIssueCount response = api.getProjectComponentsPaginated(projectIdOrKey, startAt, maxResults, orderBy, componentSource, query);
        // TODO: test validations
    }

    /**
     * Update component
     *
     * Updates a component. Any fields included in the request are overwritten. If &#x60;leadAccountId&#x60; is an empty string (\&quot;\&quot;) the component lead is removed.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the component or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateComponentTest() throws ApiException {
        String id = null;
        ProjectComponent projectComponent = null;
        ProjectComponent response = api.updateComponent(id, projectComponent);
        // TODO: test validations
    }

}
