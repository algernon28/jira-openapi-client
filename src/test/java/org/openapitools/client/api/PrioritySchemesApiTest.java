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
import org.openapitools.client.model.CreatePrioritySchemeDetails;
import org.openapitools.client.model.PageBeanPrioritySchemeWithPaginatedPrioritiesAndProjects;
import org.openapitools.client.model.PageBeanPriorityWithSequence;
import org.openapitools.client.model.PageBeanProject;
import org.openapitools.client.model.PrioritySchemeId;
import java.util.Set;
import org.openapitools.client.model.SuggestedMappingsRequestBean;
import org.openapitools.client.model.UpdatePrioritySchemeRequestBean;
import org.openapitools.client.model.UpdatePrioritySchemeResponseBean;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PrioritySchemesApi
 */
@Disabled
public class PrioritySchemesApiTest {

    private final PrioritySchemesApi api = new PrioritySchemesApi();

    /**
     * Create priority scheme
     *
     * Creates a new priority scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createPrioritySchemeTest() throws ApiException {
        CreatePrioritySchemeDetails createPrioritySchemeDetails = null;
        PrioritySchemeId response = api.createPriorityScheme(createPrioritySchemeDetails);
        // TODO: test validations
    }

    /**
     * Delete priority scheme
     *
     * Deletes a priority scheme.  This operation is only available for priority schemes without any associated projects. Any associated projects must be removed from the priority scheme before this operation can be performed.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deletePrioritySchemeTest() throws ApiException {
        Long schemeId = null;
        Object response = api.deletePriorityScheme(schemeId);
        // TODO: test validations
    }

    /**
     * Get available priorities by priority scheme
     *
     * Returns a [paginated](#pagination) list of priorities available for adding to a priority scheme.  **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAvailablePrioritiesByPrioritySchemeTest() throws ApiException {
        String schemeId = null;
        String startAt = null;
        String maxResults = null;
        String query = null;
        Set<String> exclude = null;
        PageBeanPriorityWithSequence response = api.getAvailablePrioritiesByPriorityScheme(schemeId, startAt, maxResults, query, exclude);
        // TODO: test validations
    }

    /**
     * Get priorities by priority scheme
     *
     * Returns a [paginated](#pagination) list of priorities by scheme.  **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPrioritiesByPrioritySchemeTest() throws ApiException {
        String schemeId = null;
        String startAt = null;
        String maxResults = null;
        PageBeanPriorityWithSequence response = api.getPrioritiesByPriorityScheme(schemeId, startAt, maxResults);
        // TODO: test validations
    }

    /**
     * Get priority schemes
     *
     * Returns a [paginated](#pagination) list of priority schemes.  **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPrioritySchemesTest() throws ApiException {
        String startAt = null;
        String maxResults = null;
        Set<Long> priorityId = null;
        Set<Long> schemeId = null;
        String schemeName = null;
        Boolean onlyDefault = null;
        String orderBy = null;
        String expand = null;
        PageBeanPrioritySchemeWithPaginatedPrioritiesAndProjects response = api.getPrioritySchemes(startAt, maxResults, priorityId, schemeId, schemeName, onlyDefault, orderBy, expand);
        // TODO: test validations
    }

    /**
     * Get projects by priority scheme
     *
     * Returns a [paginated](#pagination) list of projects by scheme.  **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProjectsByPrioritySchemeTest() throws ApiException {
        String schemeId = null;
        String startAt = null;
        String maxResults = null;
        Set<Long> projectId = null;
        String query = null;
        PageBeanProject response = api.getProjectsByPriorityScheme(schemeId, startAt, maxResults, projectId, query);
        // TODO: test validations
    }

    /**
     * Suggested priorities for mappings
     *
     * Returns a [paginated](#pagination) list of priorities that would require mapping, given a change in priorities or projects associated with a priority scheme.  **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void suggestedPrioritiesForMappingsTest() throws ApiException {
        SuggestedMappingsRequestBean suggestedMappingsRequestBean = null;
        PageBeanPriorityWithSequence response = api.suggestedPrioritiesForMappings(suggestedMappingsRequestBean);
        // TODO: test validations
    }

    /**
     * Update priority scheme
     *
     * Updates a priority scheme. This includes its details, the lists of priorities and projects in it  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updatePrioritySchemeTest() throws ApiException {
        Long schemeId = null;
        UpdatePrioritySchemeRequestBean updatePrioritySchemeRequestBean = null;
        UpdatePrioritySchemeResponseBean response = api.updatePriorityScheme(schemeId, updatePrioritySchemeRequestBean);
        // TODO: test validations
    }

}
