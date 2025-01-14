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
import org.openapitools.client.model.ColumnItem;
import org.openapitools.client.model.ColumnRequestBody;
import org.openapitools.client.model.ErrorCollection;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IssueNavigatorSettingsApi
 */
@Disabled
public class IssueNavigatorSettingsApiTest {

    private final IssueNavigatorSettingsApi api = new IssueNavigatorSettingsApi();

    /**
     * Get issue navigator default columns
     *
     * Returns the default issue navigator columns.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getIssueNavigatorDefaultColumnsTest() throws ApiException {
        List<ColumnItem> response = api.getIssueNavigatorDefaultColumns();
        // TODO: test validations
    }

    /**
     * Set issue navigator default columns
     *
     * Sets the default issue navigator columns.  The &#x60;columns&#x60; parameter accepts a navigable field value and is expressed as HTML form data. To specify multiple columns, pass multiple &#x60;columns&#x60; parameters. For example, in curl:  &#x60;curl -X PUT -d columns&#x3D;summary -d columns&#x3D;description https://your-domain.atlassian.net/rest/api/3/settings/columns&#x60;  If no column details are sent, then all default columns are removed.  A navigable field is one that can be used as a column on the issue navigator. Find details of navigable issue columns using [Get fields](#api-rest-api-3-field-get).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setIssueNavigatorDefaultColumnsTest() throws ApiException {
        ColumnRequestBody columnRequestBody = null;
        api.setIssueNavigatorDefaultColumns(columnRequestBody);
        // TODO: test validations
    }

}
