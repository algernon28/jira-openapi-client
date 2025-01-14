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
import org.openapitools.client.model.ContainerForRegisteredWebhooks;
import org.openapitools.client.model.ContainerForWebhookIDs;
import org.openapitools.client.model.ErrorCollection;
import org.openapitools.client.model.FailedWebhooks;
import org.openapitools.client.model.PageBeanWebhook;
import org.openapitools.client.model.WebhookRegistrationDetails;
import org.openapitools.client.model.WebhooksExpirationDate;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WebhooksApi
 */
@Disabled
public class WebhooksApiTest {

    private final WebhooksApi api = new WebhooksApi();

    /**
     * Delete webhooks by ID
     *
     * Removes webhooks by ID. Only webhooks registered by the calling app are removed. If webhooks created by other apps are specified, they are ignored.  **[Permissions](#permissions) required:** Only [Connect](https://developer.atlassian.com/cloud/jira/platform/#connect-apps) and [OAuth 2.0](https://developer.atlassian.com/cloud/jira/platform/oauth-2-3lo-apps) apps can use this operation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteWebhookByIdTest() throws ApiException {
        ContainerForWebhookIDs containerForWebhookIDs = null;
        api.deleteWebhookById(containerForWebhookIDs);
        // TODO: test validations
    }

    /**
     * Get dynamic webhooks for app
     *
     * Returns a [paginated](#pagination) list of the webhooks registered by the calling app.  **[Permissions](#permissions) required:** Only [Connect](https://developer.atlassian.com/cloud/jira/platform/#connect-apps) and [OAuth 2.0](https://developer.atlassian.com/cloud/jira/platform/oauth-2-3lo-apps) apps can use this operation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDynamicWebhooksForAppTest() throws ApiException {
        Long startAt = null;
        Integer maxResults = null;
        PageBeanWebhook response = api.getDynamicWebhooksForApp(startAt, maxResults);
        // TODO: test validations
    }

    /**
     * Get failed webhooks
     *
     * Returns webhooks that have recently failed to be delivered to the requesting app after the maximum number of retries.  After 72 hours the failure may no longer be returned by this operation.  The oldest failure is returned first.  This method uses a cursor-based pagination. To request the next page use the failure time of the last webhook on the list as the &#x60;failedAfter&#x60; value or use the URL provided in &#x60;next&#x60;.  **[Permissions](#permissions) required:** Only [Connect apps](https://developer.atlassian.com/cloud/jira/platform/index/#connect-apps) can use this operation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFailedWebhooksTest() throws ApiException {
        Integer maxResults = null;
        Long after = null;
        FailedWebhooks response = api.getFailedWebhooks(maxResults, after);
        // TODO: test validations
    }

    /**
     * Extend webhook life
     *
     * Extends the life of webhook. Webhooks registered through the REST API expire after 30 days. Call this operation to keep them alive.  Unrecognized webhook IDs (those that are not found or belong to other apps) are ignored.  **[Permissions](#permissions) required:** Only [Connect](https://developer.atlassian.com/cloud/jira/platform/#connect-apps) and [OAuth 2.0](https://developer.atlassian.com/cloud/jira/platform/oauth-2-3lo-apps) apps can use this operation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void refreshWebhooksTest() throws ApiException {
        ContainerForWebhookIDs containerForWebhookIDs = null;
        WebhooksExpirationDate response = api.refreshWebhooks(containerForWebhookIDs);
        // TODO: test validations
    }

    /**
     * Register dynamic webhooks
     *
     * Registers webhooks.  **NOTE:** for non-public OAuth apps, webhooks are delivered only if there is a match between the app owner and the user who registered a dynamic webhook.  **[Permissions](#permissions) required:** Only [Connect](https://developer.atlassian.com/cloud/jira/platform/#connect-apps) and [OAuth 2.0](https://developer.atlassian.com/cloud/jira/platform/oauth-2-3lo-apps) apps can use this operation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void registerDynamicWebhooksTest() throws ApiException {
        WebhookRegistrationDetails webhookRegistrationDetails = null;
        ContainerForRegisteredWebhooks response = api.registerDynamicWebhooks(webhookRegistrationDetails);
        // TODO: test validations
    }

}
