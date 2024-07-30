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
import org.openapitools.client.model.ActorInputBean;
import org.openapitools.client.model.ActorsMap;
import org.openapitools.client.model.ProjectRole;
import org.openapitools.client.model.ProjectRoleActorsUpdateBean;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectRoleActorsApi
 */
@Disabled
public class ProjectRoleActorsApiTest {

    private final ProjectRoleActorsApi api = new ProjectRoleActorsApi();

    /**
     * Add actors to project role
     *
     * Adds actors to a project role for the project.  To replace all actors for the project, use [Set actors for project role](#api-rest-api-3-project-projectIdOrKey-role-id-put).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addActorUsersTest() throws ApiException {
        String projectIdOrKey = null;
        Long id = null;
        ActorsMap actorsMap = null;
        ProjectRole response = api.addActorUsers(projectIdOrKey, id, actorsMap);
        // TODO: test validations
    }

    /**
     * Add default actors to project role
     *
     * Adds [default actors](#api-rest-api-3-resolution-get) to a role. You may add groups or users, but you cannot add groups and users in the same request.  Changing a project role&#39;s default actors does not affect project role members for projects already created.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addProjectRoleActorsToRoleTest() throws ApiException {
        Long id = null;
        ActorInputBean actorInputBean = null;
        ProjectRole response = api.addProjectRoleActorsToRole(id, actorInputBean);
        // TODO: test validations
    }

    /**
     * Delete actors from project role
     *
     * Deletes actors from a project role for the project.  To remove default actors from the project role, use [Delete default actors from project role](#api-rest-api-3-role-id-actors-delete).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteActorTest() throws ApiException {
        String projectIdOrKey = null;
        Long id = null;
        String user = null;
        String group = null;
        String groupId = null;
        api.deleteActor(projectIdOrKey, id, user, group, groupId);
        // TODO: test validations
    }

    /**
     * Delete default actors from project role
     *
     * Deletes the [default actors](#api-rest-api-3-resolution-get) from a project role. You may delete a group or user, but you cannot delete a group and a user in the same request.  Changing a project role&#39;s default actors does not affect project role members for projects already created.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteProjectRoleActorsFromRoleTest() throws ApiException {
        Long id = null;
        String user = null;
        String groupId = null;
        String group = null;
        ProjectRole response = api.deleteProjectRoleActorsFromRole(id, user, groupId, group);
        // TODO: test validations
    }

    /**
     * Get default actors for project role
     *
     * Returns the [default actors](#api-rest-api-3-resolution-get) for the project role.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProjectRoleActorsForRoleTest() throws ApiException {
        Long id = null;
        ProjectRole response = api.getProjectRoleActorsForRole(id);
        // TODO: test validations
    }

    /**
     * Set actors for project role
     *
     * Sets the actors for a project role for a project, replacing all existing actors.  To add actors to the project without overwriting the existing list, use [Add actors to project role](#api-rest-api-3-project-projectIdOrKey-role-id-post).  **[Permissions](#permissions) required:** *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setActorsTest() throws ApiException {
        String projectIdOrKey = null;
        Long id = null;
        ProjectRoleActorsUpdateBean projectRoleActorsUpdateBean = null;
        ProjectRole response = api.setActors(projectIdOrKey, id, projectRoleActorsUpdateBean);
        // TODO: test validations
    }

}
