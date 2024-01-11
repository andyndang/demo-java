# Songbird

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Gradle

```groovy
implementation 'ai.whylabs.WhyLabs:Songbird:2.1.3'
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.CreateAccountUserRequest;
import ai.whylabs.WhyLabs.models.operations.CreateAccountUserResponse;
import ai.whylabs.WhyLabs.models.shared.CreateAccountUserRequest;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.CreateAccountUserRequest req = new CreateAccountUserRequest(
                new CreateAccountUserRequest(
                    "string"){{
                    active = false;
                    externalId = "string";
                    userSchema = "string";

                }},
                "org-123");

            ai.whylabs.WhyLabs.models.operations.CreateAccountUserResponse res = sdk.account.createAccountUser(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

### [account](docs/sdks/account/README.md)

* [createAccountUser](docs/sdks/account/README.md#createaccountuser) - Create an account user
* [deleteAccountUser](docs/sdks/account/README.md#deleteaccountuser) - Delete account user
* [getAccountMemberships](docs/sdks/account/README.md#getaccountmemberships) - Get memberships in an account
* [getAccountUserByEmail](docs/sdks/account/README.md#getaccountuserbyemail) - Get account user by email
* [getAccountUserById](docs/sdks/account/README.md#getaccountuserbyid) - Get account user by user_id
* [listAccountUsers](docs/sdks/account/README.md#listaccountusers) - List users in an account
* [listManagedOrganizations](docs/sdks/account/README.md#listmanagedorganizations) - List managed organizations for a parent organization
* [patchOrganizationMemberships](docs/sdks/account/README.md#patchorganizationmemberships) - Add or delete memberships in a specific role and managed organization
* [putOrganizationMemberships](docs/sdks/account/README.md#putorganizationmemberships) - Replace the memberships in a specific role and managed organization
* [updateAccountUser](docs/sdks/account/README.md#updateaccountuser) - Update account user

### [internal](docs/sdks/internal/README.md)

* [activateAzureSubscription](docs/sdks/internal/README.md#activateazuresubscription) - Endpoint to activate Azure Marketplace subscriptions
* [azureMarketplaceWebhook](docs/sdks/internal/README.md#azuremarketplacewebhook) - Endpoint for Azure Marketplace webhooks
* [createAccountUser](docs/sdks/internal/README.md#createaccountuser) - Create an account user
* [createMembership](docs/sdks/internal/README.md#createmembership) - Create a membership for a user, making them apart of an organization. Uses the user's current email address.
* [createOrganization](docs/sdks/internal/README.md#createorganization) - Create an organization
* [createUser](docs/sdks/internal/README.md#createuser) - Create a user.
* [deleteAccountUser](docs/sdks/internal/README.md#deleteaccountuser) - Delete account user
* [deleteOrganization](docs/sdks/internal/README.md#deleteorganization) - Delete an org
* [generateReport](docs/sdks/internal/README.md#generatereport) - Generate an admin report
* [getAWSMarketplaceMetadata](docs/sdks/internal/README.md#getawsmarketplacemetadata) - Get marketplace metadata for an org if any exists.
* [getAccountMemberships](docs/sdks/internal/README.md#getaccountmemberships) - Get memberships in an account
* [getAccountUserByEmail](docs/sdks/internal/README.md#getaccountuserbyemail) - Get account user by email
* [getAccountUserById](docs/sdks/internal/README.md#getaccountuserbyid) - Get account user by user_id
* [getApiKey](docs/sdks/internal/README.md#getapikey) - Get an api key by its id
* [getConnection](docs/sdks/internal/README.md#getconnection) - Get the connection metadata for a given org
* [getDefaultMembershipForEmail](docs/sdks/internal/README.md#getdefaultmembershipforemail) - Get the default membership for a user.
* [getFeatureFlags](docs/sdks/internal/README.md#getfeatureflags) - Get feature flags for the specified user/org
* [getMemberships](docs/sdks/internal/README.md#getmemberships) - Get memberships for a user.
* [getMembershipsByEmail](docs/sdks/internal/README.md#getmembershipsbyemail) - Get memberships for a user given that user's email address.
* [getMembershipsByOrg](docs/sdks/internal/README.md#getmembershipsbyorg) - Get memberships for an org.
* [getMonitorConfigV3Version](docs/sdks/internal/README.md#getmonitorconfigv3version) - Get the monitor config document version for a given dataset.
* [getNotificationSettings](docs/sdks/internal/README.md#getnotificationsettings) - Get notification settings for an org
* [getOrganization](docs/sdks/internal/README.md#getorganization) - Get the metadata about an organization.
* [getOrganizationSubscriptions](docs/sdks/internal/README.md#getorganizationsubscriptions) - Get organization subscription details
* [getUser](docs/sdks/internal/README.md#getuser) - Get a user by their id.
* [getUserByEmail](docs/sdks/internal/README.md#getuserbyemail) - Get a user by their email.
* [hideSegments](docs/sdks/internal/README.md#hidesegments) - Hides a list of segments
* [listAccountUsers](docs/sdks/internal/README.md#listaccountusers) - List users in an account
* [listApiKeys](docs/sdks/internal/README.md#listapikeys) - List API key metadata for a given organization and user
* [listJobs](docs/sdks/internal/README.md#listjobs) - List all of the jobs in a workspace.
* [listManagedOrganizations](docs/sdks/internal/README.md#listmanagedorganizations) - List managed organizations for a parent organization
* [listMonitorConfigV3Versions](docs/sdks/internal/README.md#listmonitorconfigv3versions) - List the monitor config document versions for a given dataset.
* [listOrganizations](docs/sdks/internal/README.md#listorganizations) - Get a list of all of the organization ids.
* [~~partiallyUpdateOrg~~](docs/sdks/internal/README.md#partiallyupdateorg) - Update some fields of an organization to non-null values :warning: **Deprecated**
* [partiallyUpdateOrganization](docs/sdks/internal/README.md#partiallyupdateorganization) - Update some fields of an organization to non-null values
* [patchOrganizationMemberships](docs/sdks/internal/README.md#patchorganizationmemberships) - Add or delete memberships in a specific role and managed organization
* [postMonitorConfigValidationJob](docs/sdks/internal/README.md#postmonitorconfigvalidationjob) - Create a monitor config validation job for all configs
* [provisionAWSMarketplaceNewUser](docs/sdks/internal/README.md#provisionawsmarketplacenewuser) - Create resources for a new user coming from AWS Marketplace
* [provisionDatabricksConnection](docs/sdks/internal/README.md#provisiondatabricksconnection) - Create resources for a new user coming from Databricks
* [provisionNewUser](docs/sdks/internal/README.md#provisionnewuser) - Create the resources that a new user needs to use WhyLabs via the website.
* [putOrganizationMemberships](docs/sdks/internal/README.md#putorganizationmemberships) - Replace the memberships in a specific role and managed organization
* [putRequestMonitorRunConfig](docs/sdks/internal/README.md#putrequestmonitorrunconfig) - Put the RequestMonitorRun config into S3.
* [refreshConnection](docs/sdks/internal/README.md#refreshconnection) - Refresh metadata for a workspace connection.
* [registerDatabricksConnection](docs/sdks/internal/README.md#registerdatabricksconnection) - Register databricks metadata, temporarily storing it against a UUID so that it can be used to provision a databricks connection after email authentication
* [removeMembershipByEmail](docs/sdks/internal/README.md#removemembershipbyemail) - Removes membership in a given org from a user, using the user's email address.
* [runJob](docs/sdks/internal/README.md#runjob) - Run an existing job in a given databricks workspace.
* [setDefaultMembership](docs/sdks/internal/README.md#setdefaultmembership) - Sets the organization that should be used when logging a user in
* [stripePaymentEndpoint](docs/sdks/internal/README.md#stripepaymentendpoint) - Endpoint for Stripe payment webhooks
* [updateAccountUser](docs/sdks/internal/README.md#updateaccountuser) - Update account user
* [updateConnection](docs/sdks/internal/README.md#updateconnection) - Update the connection metadata for a given org
* [updateMembershipByEmail](docs/sdks/internal/README.md#updatemembershipbyemail) - Updates the role in an membership
* [updateNotificationSettings](docs/sdks/internal/README.md#updatenotificationsettings) - Update notification settings for an org
* [~~updateOrg~~](docs/sdks/internal/README.md#updateorg) - Update an existing organization :warning: **Deprecated**
* [updateOrganization](docs/sdks/internal/README.md#updateorganization) - Update an existing organization
* [updateUser](docs/sdks/internal/README.md#updateuser) - Update a user.
* [whyLabsSearch](docs/sdks/internal/README.md#whylabssearch) - WhyLabs Search
* [whyLabsSearchIndexing](docs/sdks/internal/README.md#whylabssearchindexing) - WhyLabs Search Indexing

### [admin](docs/sdks/admin/README.md)

* [generateReport](docs/sdks/admin/README.md#generatereport) - Generate an admin report
* [postMonitorConfigValidationJob](docs/sdks/admin/README.md#postmonitorconfigvalidationjob) - Create a monitor config validation job for all configs

### [databricks](docs/sdks/databricks/README.md)

* [getConnection](docs/sdks/databricks/README.md#getconnection) - Get the connection metadata for a given org
* [listJobs](docs/sdks/databricks/README.md#listjobs) - List all of the jobs in a workspace.
* [refreshConnection](docs/sdks/databricks/README.md#refreshconnection) - Refresh metadata for a workspace connection.
* [runJob](docs/sdks/databricks/README.md#runjob) - Run an existing job in a given databricks workspace.
* [updateConnection](docs/sdks/databricks/README.md#updateconnection) - Update the connection metadata for a given org

### [featureFlags](docs/sdks/featureflags/README.md)

* [getFeatureFlags](docs/sdks/featureflags/README.md#getfeatureflags) - Get feature flags for the specified user/org

### [membership](docs/sdks/membership/README.md)

* [createMembership](docs/sdks/membership/README.md#createmembership) - Create a membership for a user, making them apart of an organization. Uses the user's current email address.
* [createOrganizationMembership](docs/sdks/membership/README.md#createorganizationmembership) - Create a membership for a user, making them apart of an organization. Uses the user's current email address.
* [getDefaultMembershipForEmail](docs/sdks/membership/README.md#getdefaultmembershipforemail) - Get the default membership for a user.
* [getMemberships](docs/sdks/membership/README.md#getmemberships) - Get memberships for a user.
* [getMembershipsByEmail](docs/sdks/membership/README.md#getmembershipsbyemail) - Get memberships for a user given that user's email address.
* [getMembershipsByOrg](docs/sdks/membership/README.md#getmembershipsbyorg) - Get memberships for an org.
* [listOrganizationMemberships](docs/sdks/membership/README.md#listorganizationmemberships) - List organization memberships
* [removeMembershipByEmail](docs/sdks/membership/README.md#removemembershipbyemail) - Removes membership in a given org from a user, using the user's email address.
* [removeOrganizationMembership](docs/sdks/membership/README.md#removeorganizationmembership) - Removes membership in a given org from a user, using the user's email address.
* [setDefaultMembership](docs/sdks/membership/README.md#setdefaultmembership) - Sets the organization that should be used when logging a user in
* [updateMembershipByEmail](docs/sdks/membership/README.md#updatemembershipbyemail) - Updates the role in an membership
* [updateOrganizationMembership](docs/sdks/membership/README.md#updateorganizationmembership) - Updates the role in an membership

### [notificationSettings](docs/sdks/notificationsettings/README.md)

* [addNotificationAction](docs/sdks/notificationsettings/README.md#addnotificationaction) - Add new notification action
* [deleteNotificationAction](docs/sdks/notificationsettings/README.md#deletenotificationaction) - Delete notification action
* [disableNotificationAction](docs/sdks/notificationsettings/README.md#disablenotificationaction) - Disable notification action
* [enableNotificationAction](docs/sdks/notificationsettings/README.md#enablenotificationaction) - Enable notification action
* [getNotificationAction](docs/sdks/notificationsettings/README.md#getnotificationaction) - Get notification action for id
* [getNotificationSettings](docs/sdks/notificationsettings/README.md#getnotificationsettings) - Get notification settings for an org
* [listNotificationActions](docs/sdks/notificationsettings/README.md#listnotificationactions) - List notification actions for an org
* [putNotificationAction](docs/sdks/notificationsettings/README.md#putnotificationaction) - Add new notification action
* [testNotificationAction](docs/sdks/notificationsettings/README.md#testnotificationaction) - Test a notification action
* [updateNotificationAction](docs/sdks/notificationsettings/README.md#updatenotificationaction) - Update notification action
* [updateNotificationSettings](docs/sdks/notificationsettings/README.md#updatenotificationsettings) - Update notification settings for an org
* [getEmailNotificationActionPayload](docs/sdks/notificationsettings/README.md#getemailnotificationactionpayload) - Get dummy notification action payload
* [getPagerDutyNotificationActionPayload](docs/sdks/notificationsettings/README.md#getpagerdutynotificationactionpayload) - Get dummy notification action payload
* [getSlackNotificationActionPayload](docs/sdks/notificationsettings/README.md#getslacknotificationactionpayload) - Get dummy notification action payload

### [organizations](docs/sdks/organizations/README.md)

* [createOrganization](docs/sdks/organizations/README.md#createorganization) - Create an organization
* [deleteOrganization](docs/sdks/organizations/README.md#deleteorganization) - Delete an org
* [getAWSMarketplaceMetadata](docs/sdks/organizations/README.md#getawsmarketplacemetadata) - Get marketplace metadata for an org if any exists.
* [getOrganization](docs/sdks/organizations/README.md#getorganization) - Get the metadata about an organization.
* [listOrganizations](docs/sdks/organizations/README.md#listorganizations) - Get a list of all of the organization ids.
* [~~partiallyUpdateOrg~~](docs/sdks/organizations/README.md#partiallyupdateorg) - Update some fields of an organization to non-null values :warning: **Deprecated**
* [partiallyUpdateOrganization](docs/sdks/organizations/README.md#partiallyupdateorganization) - Update some fields of an organization to non-null values
* [~~updateOrg~~](docs/sdks/organizations/README.md#updateorg) - Update an existing organization :warning: **Deprecated**
* [updateOrganization](docs/sdks/organizations/README.md#updateorganization) - Update an existing organization

### [apiKey](docs/sdks/apikey/README.md)

* [createApiKey](docs/sdks/apikey/README.md#createapikey) - Generate an API key for a user.
* [getApiKey](docs/sdks/apikey/README.md#getapikey) - Get an api key by its id
* [listApiKeys](docs/sdks/apikey/README.md#listapikeys) - List API key metadata for a given organization and user
* [revokeApiKey](docs/sdks/apikey/README.md#revokeapikey) - Revoke the given API Key, removing its ability to access WhyLabs systems

### [datasetProfile](docs/sdks/datasetprofile/README.md)

* [createReferenceProfile](docs/sdks/datasetprofile/README.md#createreferenceprofile) - Returns data needed to uploading the reference profile
* [deleteAnalyzerResults](docs/sdks/datasetprofile/README.md#deleteanalyzerresults) - Deletes a set of analyzer results
* [deleteDatasetProfiles](docs/sdks/datasetprofile/README.md#deletedatasetprofiles) - Deletes a set of dataset profiles
* [deleteReferenceProfile](docs/sdks/datasetprofile/README.md#deletereferenceprofile) - Delete a single reference profile
* [getProfileTraces](docs/sdks/datasetprofile/README.md#getprofiletraces) - Returns a list for profile traces matching a trace id
* [getReferenceProfile](docs/sdks/datasetprofile/README.md#getreferenceprofile) - Returns a single reference profile
* [hideSegments](docs/sdks/datasetprofile/README.md#hidesegments) - Hides a list of segments
* [listDeleteAnalyzerResultsRequests](docs/sdks/datasetprofile/README.md#listdeleteanalyzerresultsrequests) - List requests to delete analyzer results
* [listDeleteDatasetProfilesRequests](docs/sdks/datasetprofile/README.md#listdeletedatasetprofilesrequests) - List requests to delete dataset profiles
* [listReferenceProfiles](docs/sdks/datasetprofile/README.md#listreferenceprofiles) - Returns a list for reference profiles between the given time range filtered on the upload timestamp
* [listSegments](docs/sdks/datasetprofile/README.md#listsegments) - Returns a list of segments

### [datasetMetadata](docs/sdks/datasetmetadata/README.md)

* [deleteDatasetMetadata](docs/sdks/datasetmetadata/README.md#deletedatasetmetadata) - Delete dataset metadata for the specified dataset
* [getDatasetMetadata](docs/sdks/datasetmetadata/README.md#getdatasetmetadata) - Get dataset metadata for the specified dataset
* [putDatasetMetadata](docs/sdks/datasetmetadata/README.md#putdatasetmetadata) - Put dataset metadata for the specified dataset

### [featureWeights](docs/sdks/featureweights/README.md)

* [getColumnWeights](docs/sdks/featureweights/README.md#getcolumnweights) - Get column weights for the specified dataset
* [putColumnWeights](docs/sdks/featureweights/README.md#putcolumnweights) - Put column weights for the specified dataset

### [debugEvents](docs/sdks/debugevents/README.md)

* [logDebugEvent](docs/sdks/debugevents/README.md#logdebugevent) - Log a debug event

### [log](docs/sdks/log/README.md)

* [getProfileObservatoryLink](docs/sdks/log/README.md#getprofileobservatorylink) - Get observatory links for profiles in a given org/model. A max of 3 profiles can be viewed a a time.
* [logAsync](docs/sdks/log/README.md#logasync) - Like /log, except this api doesn't take the actual profile content. It returns an upload link that can be used to upload the profile to.
* [logReference](docs/sdks/log/README.md#logreference) - Returns a presigned URL for uploading the reference profile to.

### [models](docs/sdks/models/README.md)

* [createModel](docs/sdks/models/README.md#createmodel) - Create a model with a given name and a time period
* [deactivateModel](docs/sdks/models/README.md#deactivatemodel) - Mark a model as inactive
* [deleteEntitySchema](docs/sdks/models/README.md#deleteentityschema) - Delete the entity schema config for a given dataset.
* [deleteEntitySchemaColumn](docs/sdks/models/README.md#deleteentityschemacolumn) - Delete the entity schema of a single column for a given dataset.
* [deleteEntitySchemaMetric](docs/sdks/models/README.md#deleteentityschemametric) - Delete the schema of a single metric for a given dataset.
* [getEntitySchema](docs/sdks/models/README.md#getentityschema) - Get the entity schema config for a given dataset.
* [getEntitySchemaColumn](docs/sdks/models/README.md#getentityschemacolumn) - Get the entity schema of a single column for a given dataset.
* [getModel](docs/sdks/models/README.md#getmodel) - Get a model metadata
* [listModels](docs/sdks/models/README.md#listmodels) - Get a list of all of the model ids for an organization.
* [putEntitySchema](docs/sdks/models/README.md#putentityschema) - Save the entity schema config for a given dataset.
* [putEntitySchemaColumn](docs/sdks/models/README.md#putentityschemacolumn) - Save the entity schema of a single column for a given dataset.
* [putEntitySchemaMetric](docs/sdks/models/README.md#putentityschemametric) - Save the schema of a single metric for a given dataset.
* [updateModel](docs/sdks/models/README.md#updatemodel) - Update a model's metadata

### [monitor](docs/sdks/monitor/README.md)

* [deleteAnalyzer](docs/sdks/monitor/README.md#deleteanalyzer) - Delete the analyzer config for a given dataset.
* [deleteMonitor](docs/sdks/monitor/README.md#deletemonitor) - Delete the monitor for a given dataset.
* [getAnalyzer](docs/sdks/monitor/README.md#getanalyzer) - Get the analyzer config for a given dataset.
* [getMonitor](docs/sdks/monitor/README.md#getmonitor) - Get the monitor config for a given dataset.
* [getMonitorConfigV3](docs/sdks/monitor/README.md#getmonitorconfigv3) - Get the monitor config document for a given dataset.
* [getMonitorConfigV3Version](docs/sdks/monitor/README.md#getmonitorconfigv3version) - Get the monitor config document version for a given dataset.
* [listConstraints](docs/sdks/monitor/README.md#listconstraints) - List the constraints for a given dataset.
* [listMonitorConfigV3Versions](docs/sdks/monitor/README.md#listmonitorconfigv3versions) - List the monitor config document versions for a given dataset.
* [patchMonitorConfigV3](docs/sdks/monitor/README.md#patchmonitorconfigv3) - Patch an updated monitor config document for a given dataset.
* [putAnalyzer](docs/sdks/monitor/README.md#putanalyzer) - Save the analyzer config for a given dataset.
* [putMonitor](docs/sdks/monitor/README.md#putmonitor) - Save the monitor for a given dataset.
* [putMonitorConfigV3](docs/sdks/monitor/README.md#putmonitorconfigv3) - Save the monitor config document for a given dataset.
* [putRequestMonitorRunConfig](docs/sdks/monitor/README.md#putrequestmonitorrunconfig) - Put the RequestMonitorRun config into S3.
* [validateMonitorConfigV3](docs/sdks/monitor/README.md#validatemonitorconfigv3) - Validate the monitor config document for a given dataset.

### [schema](docs/sdks/schema/README.md)

* [getMonitorConfigSchema](docs/sdks/schema/README.md#getmonitorconfigschema) - Get the current supported schema of the monitor configuration

### [payment](docs/sdks/payment/README.md)

* [stripePaymentEndpoint](docs/sdks/payment/README.md#stripepaymentendpoint) - Endpoint for Stripe payment webhooks

### [provision](docs/sdks/provision/README.md)

* [provisionAWSMarketplaceNewUser](docs/sdks/provision/README.md#provisionawsmarketplacenewuser) - Create resources for a new user coming from AWS Marketplace
* [provisionDatabricksConnection](docs/sdks/provision/README.md#provisiondatabricksconnection) - Create resources for a new user coming from Databricks
* [provisionNewUser](docs/sdks/provision/README.md#provisionnewuser) - Create the resources that a new user needs to use WhyLabs via the website.
* [registerDatabricksConnection](docs/sdks/provision/README.md#registerdatabricksconnection) - Register databricks metadata, temporarily storing it against a UUID so that it can be used to provision a databricks connection after email authentication

### [search](docs/sdks/search/README.md)

* [whyLabsSearch](docs/sdks/search/README.md#whylabssearch) - WhyLabs Search
* [whyLabsSearchIndexing](docs/sdks/search/README.md#whylabssearchindexing) - WhyLabs Search Indexing

### [sessions](docs/sdks/sessions/README.md)

* [batchCreateReferenceProfileUpload](docs/sdks/sessions/README.md#batchcreatereferenceprofileupload) - Create multiple reference profile uploads for a given session.
* [claimGuestSession](docs/sdks/sessions/README.md#claimguestsession) - Claim a guest session, copying its model data into another org and expiring the session.
* [createDatasetProfileUpload](docs/sdks/sessions/README.md#createdatasetprofileupload) - Create an upload for a given session.
* [createReferenceProfileUpload](docs/sdks/sessions/README.md#createreferenceprofileupload) - Create a reference profile upload for a given session.
* [createSession](docs/sdks/sessions/README.md#createsession) - Create a new session that can be used to upload dataset profiles from whylogs for display in whylabs.
* [getSession](docs/sdks/sessions/README.md#getsession) - Get information about a session.
* [getSessionProfileObservatoryLink](docs/sdks/sessions/README.md#getsessionprofileobservatorylink) - Get observatory links for profiles in a given session. A max of 3 profiles can be viewed a a time.

### [subscription](docs/sdks/subscription/README.md)

* [getOrganizationSubscriptions](docs/sdks/subscription/README.md#getorganizationsubscriptions) - Get organization subscription details

### [user](docs/sdks/user/README.md)

* [createUser](docs/sdks/user/README.md#createuser) - Create a user.
* [getUser](docs/sdks/user/README.md#getuser) - Get a user by their id.
* [getUserByEmail](docs/sdks/user/README.md#getuserbyemail) - Get a user by their email.
* [updateUser](docs/sdks/user/README.md#updateuser) - Update a user.

### [azureMarketplace](docs/sdks/azuremarketplace/README.md)

* [activateAzureSubscription](docs/sdks/azuremarketplace/README.md#activateazuresubscription) - Endpoint to activate Azure Marketplace subscriptions
* [azureMarketplaceWebhook](docs/sdks/azuremarketplace/README.md#azuremarketplacewebhook) - Endpoint for Azure Marketplace webhooks

### [traces](docs/sdks/traces/README.md)

* [exportTracesJson](docs/sdks/traces/README.md#exporttracesjson) - Export traces into WhyLabs
* [exportTracesRaw](docs/sdks/traces/README.md#exporttracesraw) - Export traces into WhyLabs

### [transactions](docs/sdks/transactions/README.md)

* [commitTransaction](docs/sdks/transactions/README.md#committransaction) - Commit a log transaction
* [logTransaction](docs/sdks/transactions/README.md#logtransaction) - Add to a log transaction
* [startTransaction](docs/sdks/transactions/README.md#starttransaction) - Start a log transaction
* [transactionStatus](docs/sdks/transactions/README.md#transactionstatus) - Get the status of a log transaction
<!-- End Available Resources and Operations [operations] -->



<!-- Start Server Selection [server] -->
## Server Selection

## Server Selection

### Select Server by Index

You can override the default server globally using the `setServerIndex` option when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| # | Server | Variables |
| - | ------ | --------- |
| 0 | `https://api.whylabsapp.com` | None |




### Override Server URL Per-Client

The default server can also be overridden globally using the `setServerURL` option when initializing the SDK client instance. For example:
<!-- End Server Selection [server] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->



### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage 
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally 
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically. 
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release !

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
