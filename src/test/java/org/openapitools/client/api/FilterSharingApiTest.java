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
import org.openapitools.client.model.DefaultShareScope;
import org.openapitools.client.model.SharePermission;
import org.openapitools.client.model.SharePermissionInputBean;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FilterSharingApi
 */
@Disabled
public class FilterSharingApiTest {

    private final FilterSharingApi api = new FilterSharingApi();

    /**
     * Add share permission
     *
     * Add a share permissions to a filter. If you add a global share permission (one for all logged-in users or the public) it will overwrite all share permissions for the filter.  Be aware that this operation uses different objects for updating share permissions compared to [Update filter](#api-rest-api-3-filter-id-put).  **[Permissions](#permissions) required:** *Share dashboards and filters* [global permission](https://confluence.atlassian.com/x/x4dKLg) and the user must own the filter.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addSharePermissionTest() throws ApiException {
        Long id = null;
        SharePermissionInputBean sharePermissionInputBean = null;
        List<SharePermission> response = api.addSharePermission(id, sharePermissionInputBean);
        // TODO: test validations
    }

    /**
     * Delete share permission
     *
     * Deletes a share permission from a filter.  **[Permissions](#permissions) required:** Permission to access Jira and the user must own the filter.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteSharePermissionTest() throws ApiException {
        Long id = null;
        Long permissionId = null;
        api.deleteSharePermission(id, permissionId);
        // TODO: test validations
    }

    /**
     * Get default share scope
     *
     * Returns the default sharing settings for new filters and dashboards for a user.  **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDefaultShareScopeTest() throws ApiException {
        DefaultShareScope response = api.getDefaultShareScope();
        // TODO: test validations
    }

    /**
     * Get share permission
     *
     * Returns a share permission for a filter. A filter can be shared with groups, projects, all logged-in users, or the public. Sharing with all logged-in users or the public is known as a global share permission.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None, however, a share permission is only returned for:   *  filters owned by the user.  *  filters shared with a group that the user is a member of.  *  filters shared with a private project that the user has *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for.  *  filters shared with a public project.  *  filters shared with the public.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSharePermissionTest() throws ApiException {
        Long id = null;
        Long permissionId = null;
        SharePermission response = api.getSharePermission(id, permissionId);
        // TODO: test validations
    }

    /**
     * Get share permissions
     *
     * Returns the share permissions for a filter. A filter can be shared with groups, projects, all logged-in users, or the public. Sharing with all logged-in users or the public is known as a global share permission.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None, however, share permissions are only returned for:   *  filters owned by the user.  *  filters shared with a group that the user is a member of.  *  filters shared with a private project that the user has *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for.  *  filters shared with a public project.  *  filters shared with the public.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSharePermissionsTest() throws ApiException {
        Long id = null;
        List<SharePermission> response = api.getSharePermissions(id);
        // TODO: test validations
    }

    /**
     * Set default share scope
     *
     * Sets the default sharing for new filters and dashboards for a user.  **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setDefaultShareScopeTest() throws ApiException {
        DefaultShareScope defaultShareScope = null;
        DefaultShareScope response = api.setDefaultShareScope(defaultShareScope);
        // TODO: test validations
    }

}
