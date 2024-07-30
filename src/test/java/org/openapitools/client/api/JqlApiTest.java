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
import org.openapitools.client.model.AutoCompleteSuggestions;
import org.openapitools.client.model.ConvertedJQLQueries;
import org.openapitools.client.model.ErrorCollection;
import org.openapitools.client.model.JQLPersonalDataMigrationRequest;
import org.openapitools.client.model.JQLReferenceData;
import org.openapitools.client.model.JqlQueriesToParse;
import org.openapitools.client.model.JqlQueriesToSanitize;
import org.openapitools.client.model.ParsedJqlQueries;
import org.openapitools.client.model.SanitizedJqlQueries;
import org.openapitools.client.model.SearchAutoCompleteFilter;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for JqlApi
 */
@Disabled
public class JqlApiTest {

    private final JqlApi api = new JqlApi();

    /**
     * Get field reference data (GET)
     *
     * Returns reference data for JQL searches. This is a downloadable version of the documentation provided in [Advanced searching - fields reference](https://confluence.atlassian.com/x/gwORLQ) and [Advanced searching - functions reference](https://confluence.atlassian.com/x/hgORLQ), along with a list of JQL-reserved words. Use this information to assist with the programmatic creation of JQL queries or the validation of queries built in a custom query builder.  To filter visible field details by project or collapse non-unique fields by field type then [Get field reference data (POST)](#api-rest-api-3-jql-autocompletedata-post) can be used.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAutoCompleteTest() throws ApiException {
        JQLReferenceData response = api.getAutoComplete();
        // TODO: test validations
    }

    /**
     * Get field reference data (POST)
     *
     * Returns reference data for JQL searches. This is a downloadable version of the documentation provided in [Advanced searching - fields reference](https://confluence.atlassian.com/x/gwORLQ) and [Advanced searching - functions reference](https://confluence.atlassian.com/x/hgORLQ), along with a list of JQL-reserved words. Use this information to assist with the programmatic creation of JQL queries or the validation of queries built in a custom query builder.  This operation can filter the custom fields returned by project. Invalid project IDs in &#x60;projectIds&#x60; are ignored. System fields are always returned.  It can also return the collapsed field for custom fields. Collapsed fields enable searches to be performed across all fields with the same name and of the same field type. For example, the collapsed field &#x60;Component - Component[Dropdown]&#x60; enables dropdown fields &#x60;Component - cf[10061]&#x60; and &#x60;Component - cf[10062]&#x60; to be searched simultaneously.  **[Permissions](#permissions) required:** None.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAutoCompletePostTest() throws ApiException {
        SearchAutoCompleteFilter searchAutoCompleteFilter = null;
        JQLReferenceData response = api.getAutoCompletePost(searchAutoCompleteFilter);
        // TODO: test validations
    }

    /**
     * Get field auto complete suggestions
     *
     * Returns the JQL search auto complete suggestions for a field.  Suggestions can be obtained by providing:   *  &#x60;fieldName&#x60; to get a list of all values for the field.  *  &#x60;fieldName&#x60; and &#x60;fieldValue&#x60; to get a list of values containing the text in &#x60;fieldValue&#x60;.  *  &#x60;fieldName&#x60; and &#x60;predicateName&#x60; to get a list of all predicate values for the field.  *  &#x60;fieldName&#x60;, &#x60;predicateName&#x60;, and &#x60;predicateValue&#x60; to get a list of predicate values containing the text in &#x60;predicateValue&#x60;.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFieldAutoCompleteForQueryStringTest() throws ApiException {
        String fieldName = null;
        String fieldValue = null;
        String predicateName = null;
        String predicateValue = null;
        AutoCompleteSuggestions response = api.getFieldAutoCompleteForQueryString(fieldName, fieldValue, predicateName, predicateValue);
        // TODO: test validations
    }

    /**
     * Convert user identifiers to account IDs in JQL queries
     *
     * Converts one or more JQL queries with user identifiers (username or user key) to equivalent JQL queries with account IDs.  You may wish to use this operation if your system stores JQL queries and you want to make them GDPR-compliant. For more information about GDPR-related changes, see the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/).  **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void migrateQueriesTest() throws ApiException {
        JQLPersonalDataMigrationRequest jqLPersonalDataMigrationRequest = null;
        ConvertedJQLQueries response = api.migrateQueries(jqLPersonalDataMigrationRequest);
        // TODO: test validations
    }

    /**
     * Parse JQL query
     *
     * Parses and validates JQL queries.  Validation is performed in context of the current user.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void parseJqlQueriesTest() throws ApiException {
        String validation = null;
        JqlQueriesToParse jqlQueriesToParse = null;
        ParsedJqlQueries response = api.parseJqlQueries(validation, jqlQueriesToParse);
        // TODO: test validations
    }

    /**
     * Sanitize JQL queries
     *
     * Sanitizes one or more JQL queries by converting readable details into IDs where a user doesn&#39;t have permission to view the entity.  For example, if the query contains the clause *project &#x3D; &#39;Secret project&#39;*, and a user does not have browse permission for the project \&quot;Secret project\&quot;, the sanitized query replaces the clause with *project &#x3D; 12345\&quot;* (where 12345 is the ID of the project). If a user has the required permission, the clause is not sanitized. If the account ID is null, sanitizing is performed for an anonymous user.  Note that sanitization doesn&#39;t make the queries GDPR-compliant, because it doesn&#39;t remove user identifiers (username or user key). If you need to make queries GDPR-compliant, use [Convert user identifiers to account IDs in JQL queries](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-jql/#api-rest-api-3-jql-sanitize-post).  Before sanitization each JQL query is parsed. The queries are returned in the same order that they were passed.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sanitiseJqlQueriesTest() throws ApiException {
        JqlQueriesToSanitize jqlQueriesToSanitize = null;
        SanitizedJqlQueries response = api.sanitiseJqlQueries(jqlQueriesToSanitize);
        // TODO: test validations
    }

}
