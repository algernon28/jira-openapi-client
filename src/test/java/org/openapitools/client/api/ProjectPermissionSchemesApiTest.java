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
import org.openapitools.client.model.IdBean;
import org.openapitools.client.model.PermissionScheme;
import org.openapitools.client.model.ProjectIssueSecurityLevels;
import org.openapitools.client.model.SecurityScheme;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectPermissionSchemesApi
 */
@Disabled
public class ProjectPermissionSchemesApiTest {

    private final ProjectPermissionSchemesApi api = new ProjectPermissionSchemesApi();

    /**
     * Assign permission scheme
     *
     * Assigns a permission scheme with a project. See [Managing project permissions](https://confluence.atlassian.com/x/yodKLg) for more information about permission schemes.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assignPermissionSchemeTest() throws ApiException {
        String projectKeyOrId = null;
        IdBean idBean = null;
        String expand = null;
        PermissionScheme response = api.assignPermissionScheme(projectKeyOrId, idBean, expand);
        // TODO: test validations
    }

    /**
     * Get assigned permission scheme
     *
     * Gets the [permission scheme](https://confluence.atlassian.com/x/yodKLg) associated with the project.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAssignedPermissionSchemeTest() throws ApiException {
        String projectKeyOrId = null;
        String expand = null;
        PermissionScheme response = api.getAssignedPermissionScheme(projectKeyOrId, expand);
        // TODO: test validations
    }

    /**
     * Get project issue security scheme
     *
     * Returns the [issue security scheme](https://confluence.atlassian.com/x/J4lKLg) associated with the project.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or the *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProjectIssueSecuritySchemeTest() throws ApiException {
        String projectKeyOrId = null;
        SecurityScheme response = api.getProjectIssueSecurityScheme(projectKeyOrId);
        // TODO: test validations
    }

    /**
     * Get project issue security levels
     *
     * Returns all [issue security](https://confluence.atlassian.com/x/J4lKLg) levels for the project that the user has access to.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [global permission](https://confluence.atlassian.com/x/x4dKLg) for the project, however, issue security levels are only returned for authenticated user with *Set Issue Security* [global permission](https://confluence.atlassian.com/x/x4dKLg) for the project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSecurityLevelsForProjectTest() throws ApiException {
        String projectKeyOrId = null;
        ProjectIssueSecurityLevels response = api.getSecurityLevelsForProject(projectKeyOrId);
        // TODO: test validations
    }

}
