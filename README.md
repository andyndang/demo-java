# Songbird

<!-- Start SDK Installation -->
## SDK Installation

### Gradle

```groovy
implementation 'ai.whylabs.WhyLabs:Songbird:1.1.0'
```
<!-- End SDK Installation -->

## SDK Example Usage
<!-- Start SDK Example Usage -->
```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.PostMonitorConfigValidationJobResponse;
import ai.whylabs.WhyLabs.models.operations.PostMonitorConfigValidationJobSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            PostMonitorConfigValidationJobResponse res = sdk.admin.postMonitorConfigValidationJob(new PostMonitorConfigValidationJobSecurity("corrupti") {{
                apiKeyAuth = "";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage -->

<!-- Start SDK Available Operations -->
## Available Resources and Operations


### [admin](docs/admin/README.md)

* [postMonitorConfigValidationJob](docs/admin/README.md#postmonitorconfigvalidationjob) - Create a monitor config validation job for all configs

### [apiKey](docs/apikey/README.md)

* [createApiKey](docs/apikey/README.md#createapikey) - Generate an API key for a user.
* [getApiKey](docs/apikey/README.md#getapikey) - Get an api key by its id
* [listApiKeys](docs/apikey/README.md#listapikeys) - List API key metadata for a given organization and user
* [revokeApiKey](docs/apikey/README.md#revokeapikey) - Revoke the given API Key, removing its ability to access WhyLabs systems

### [databricks](docs/databricks/README.md)

* [getConnection](docs/databricks/README.md#getconnection) - Get the connection metadata for a given org
* [listJobs](docs/databricks/README.md#listjobs) - List all of the jobs in a workspace.
* [refreshConnection](docs/databricks/README.md#refreshconnection) - Refresh metadata for a workspace connection.
* [runJob](docs/databricks/README.md#runjob) - Run an existing job in a given databricks workspace.
* [updateConnection](docs/databricks/README.md#updateconnection) - Update the connection metadata for a given org

### [datasetMetadata](docs/datasetmetadata/README.md)

* [deleteDatasetMetadata](docs/datasetmetadata/README.md#deletedatasetmetadata) - Delete dataset metadata for the specified dataset
* [getDatasetMetadata](docs/datasetmetadata/README.md#getdatasetmetadata) - Get dataset metadata for the specified dataset
* [putDatasetMetadata](docs/datasetmetadata/README.md#putdatasetmetadata) - Put dataset metadata for the specified dataset

### [datasetProfile](docs/datasetprofile/README.md)

* [createReferenceProfile](docs/datasetprofile/README.md#createreferenceprofile) - Returns data needed to uploading the reference profile
* [deleteAnalyzerResults](docs/datasetprofile/README.md#deleteanalyzerresults) - Deletes a set of analyzer results
* [deleteDatasetProfiles](docs/datasetprofile/README.md#deletedatasetprofiles) - Deletes a set of dataset profiles
* [deleteReferenceProfile](docs/datasetprofile/README.md#deletereferenceprofile) - Delete a single reference profile
* [getReferenceProfile](docs/datasetprofile/README.md#getreferenceprofile) - Returns a single reference profile
* [listReferenceProfiles](docs/datasetprofile/README.md#listreferenceprofiles) - Returns a list for reference profiles
* [listSegments](docs/datasetprofile/README.md#listsegments) - Returns a list of segments

### [featureWeights](docs/featureweights/README.md)

* [getColumnWeights](docs/featureweights/README.md#getcolumnweights) - Get column weights for the specified dataset
* [putColumnWeights](docs/featureweights/README.md#putcolumnweights) - Put column weights for the specified dataset

### [featureFlags](docs/featureflags/README.md)

* [getFeatureFlags](docs/featureflags/README.md#getfeatureflags) - Get feature flags for the specified user/org

### [internal](docs/internal/README.md)

* [createMembership](docs/internal/README.md#createmembership) - Create a membership for a user, making them apart of an organization. Uses the user's current email address.
* [createOrganization](docs/internal/README.md#createorganization) - Create an organization
* [createUser](docs/internal/README.md#createuser) - Create a user.
* [deleteOrganization](docs/internal/README.md#deleteorganization) - Delete an org
* [getAWSMarketplaceMetadata](docs/internal/README.md#getawsmarketplacemetadata) - Get marketplace metadata for an org if any exists.
* [getApiKey](docs/internal/README.md#getapikey) - Get an api key by its id
* [getConnection](docs/internal/README.md#getconnection) - Get the connection metadata for a given org
* [getDefaultMembershipForEmail](docs/internal/README.md#getdefaultmembershipforemail) - Get the default membership for a user.
* [getFeatureFlags](docs/internal/README.md#getfeatureflags) - Get feature flags for the specified user/org
* [getMemberships](docs/internal/README.md#getmemberships) - Get memberships for a user.
* [getMembershipsByEmail](docs/internal/README.md#getmembershipsbyemail) - Get memberships for a user given that user's email address.
* [getMembershipsByOrg](docs/internal/README.md#getmembershipsbyorg) - Get memberships for an org.
* [getMonitorConfigV3Version](docs/internal/README.md#getmonitorconfigv3version) - Get the monitor config document version for a given dataset.
* [getNotificationSettings](docs/internal/README.md#getnotificationsettings) - Get notification settings for an org
* [getOrganization](docs/internal/README.md#getorganization) - Get the metadata about an organization.
* [getUser](docs/internal/README.md#getuser) - Get a user by their id.
* [getUserByEmail](docs/internal/README.md#getuserbyemail) - Get a user by their email.
* [listApiKeys](docs/internal/README.md#listapikeys) - List API key metadata for a given organization and user
* [listJobs](docs/internal/README.md#listjobs) - List all of the jobs in a workspace.
* [listMonitorConfigV3Versions](docs/internal/README.md#listmonitorconfigv3versions) - List the monitor config document versions for a given dataset.
* [listOrganizations](docs/internal/README.md#listorganizations) - Get a list of all of the organization ids.
* [listSegments](docs/internal/README.md#listsegments) - Returns a list of segments
* [~~partiallyUpdateOrg~~](docs/internal/README.md#partiallyupdateorg) - Update some fields of an organization to non-null values :warning: **Deprecated**
* [partiallyUpdateOrganization](docs/internal/README.md#partiallyupdateorganization) - Update some fields of an organization to non-null values
* [postMonitorConfigValidationJob](docs/internal/README.md#postmonitorconfigvalidationjob) - Create a monitor config validation job for all configs
* [provisionAWSMarketplaceNewUser](docs/internal/README.md#provisionawsmarketplacenewuser) - Create resources for a new user coming from AWS Marketplace
* [provisionDatabricksConnection](docs/internal/README.md#provisiondatabricksconnection) - Create resources for a new user coming from Databricks
* [provisionNewUser](docs/internal/README.md#provisionnewuser) - Create the resources that a new user needs to use WhyLabs via the website.
* [putRequestMonitorRunConfig](docs/internal/README.md#putrequestmonitorrunconfig) - Put the RequestMonitorRun config into S3.
* [refreshConnection](docs/internal/README.md#refreshconnection) - Refresh metadata for a workspace connection.
* [registerDatabricksConnection](docs/internal/README.md#registerdatabricksconnection) - Register databricks metadata, temporarily storing it against a UUID so that it can be used to provision a databricks connection after email authentication
* [removeMembershipByEmail](docs/internal/README.md#removemembershipbyemail) - Removes membership in a given org from a user, using the user's email address.
* [runJob](docs/internal/README.md#runjob) - Run an existing job in a given databricks workspace.
* [setDefaultMembership](docs/internal/README.md#setdefaultmembership) - Sets the organization that should be used when logging a user in
* [stripePaymentEndpoint](docs/internal/README.md#stripepaymentendpoint) - Endpoint for Stripe payment webhooks
* [updateConnection](docs/internal/README.md#updateconnection) - Update the connection metadata for a given org
* [updateMembershipByEmail](docs/internal/README.md#updatemembershipbyemail) - Updates the role in an membership
* [updateNotificationSettings](docs/internal/README.md#updatenotificationsettings) - Update notification settings for an org
* [~~updateOrg~~](docs/internal/README.md#updateorg) - Update an existing organization :warning: **Deprecated**
* [updateOrganization](docs/internal/README.md#updateorganization) - Update an existing organization
* [updateUser](docs/internal/README.md#updateuser) - Update a user.
* [whyLabsSearch](docs/internal/README.md#whylabssearch) - WhyLabs Search
* [whyLabsSearchIndexing](docs/internal/README.md#whylabssearchindexing) - WhyLabs Search Indexing

### [log](docs/log/README.md)

* [logAsync](docs/log/README.md#logasync) - Like /log, except this api doesn't take the actual profile content. It returns an upload link that can be used to upload the profile to.
* [logReference](docs/log/README.md#logreference) - Returns a presigned URL for uploading the reference profile to.

### [membership](docs/membership/README.md)

* [createMembership](docs/membership/README.md#createmembership) - Create a membership for a user, making them apart of an organization. Uses the user's current email address.
* [createOrganizationMembership](docs/membership/README.md#createorganizationmembership) - Create a membership for a user, making them apart of an organization. Uses the user's current email address.
* [getDefaultMembershipForEmail](docs/membership/README.md#getdefaultmembershipforemail) - Get the default membership for a user.
* [getMemberships](docs/membership/README.md#getmemberships) - Get memberships for a user.
* [getMembershipsByEmail](docs/membership/README.md#getmembershipsbyemail) - Get memberships for a user given that user's email address.
* [getMembershipsByOrg](docs/membership/README.md#getmembershipsbyorg) - Get memberships for an org.
* [listOrganizationMemberships](docs/membership/README.md#listorganizationmemberships) - List organization memberships
* [removeMembershipByEmail](docs/membership/README.md#removemembershipbyemail) - Removes membership in a given org from a user, using the user's email address.
* [removeOrganizationMembership](docs/membership/README.md#removeorganizationmembership) - Removes membership in a given org from a user, using the user's email address.
* [setDefaultMembership](docs/membership/README.md#setdefaultmembership) - Sets the organization that should be used when logging a user in
* [updateMembershipByEmail](docs/membership/README.md#updatemembershipbyemail) - Updates the role in an membership
* [updateOrganizationMembership](docs/membership/README.md#updateorganizationmembership) - Updates the role in an membership

### [models](docs/models/README.md)

* [createModel](docs/models/README.md#createmodel) - Create a model with a given name and a time period
* [deactivateModel](docs/models/README.md#deactivatemodel) - Mark a model as inactive
* [deleteEntitySchema](docs/models/README.md#deleteentityschema) - Delete the entity schema config for a given dataset.
* [deleteEntitySchemaColumn](docs/models/README.md#deleteentityschemacolumn) - Delete the entity schema of a single column for a given dataset.
* [deleteEntitySchemaMetric](docs/models/README.md#deleteentityschemametric) - Delete the schema of a single metric for a given dataset.
* [getEntitySchema](docs/models/README.md#getentityschema) - Get the entity schema config for a given dataset.
* [getEntitySchemaColumn](docs/models/README.md#getentityschemacolumn) - Get the entity schema of a single column for a given dataset.
* [getModel](docs/models/README.md#getmodel) - Get a model metadata
* [listModels](docs/models/README.md#listmodels) - Get a list of all of the model ids for an organization.
* [putEntitySchema](docs/models/README.md#putentityschema) - Save the entity schema config for a given dataset.
* [putEntitySchemaColumn](docs/models/README.md#putentityschemacolumn) - Save the entity schema of a single column for a given dataset.
* [putEntitySchemaMetric](docs/models/README.md#putentityschemametric) - Save the schema of a single metric for a given dataset.
* [updateModel](docs/models/README.md#updatemodel) - Update a model's metadata

### [monitor](docs/monitor/README.md)

* [deleteAnalyzer](docs/monitor/README.md#deleteanalyzer) - Delete the analyzer config for a given dataset.
* [deleteMonitor](docs/monitor/README.md#deletemonitor) - Delete the monitor for a given dataset.
* [getAnalyzer](docs/monitor/README.md#getanalyzer) - Get the analyzer config for a given dataset.
* [getMonitor](docs/monitor/README.md#getmonitor) - Get the monitor config for a given dataset.
* [getMonitorConfigV3](docs/monitor/README.md#getmonitorconfigv3) - Get the monitor config document for a given dataset.
* [getMonitorConfigV3Version](docs/monitor/README.md#getmonitorconfigv3version) - Get the monitor config document version for a given dataset.
* [listMonitorConfigV3Versions](docs/monitor/README.md#listmonitorconfigv3versions) - List the monitor config document versions for a given dataset.
* [patchMonitorConfigV3](docs/monitor/README.md#patchmonitorconfigv3) - Patch an updated monitor config document for a given dataset.
* [putAnalyzer](docs/monitor/README.md#putanalyzer) - Save the analyzer config for a given dataset.
* [putMonitor](docs/monitor/README.md#putmonitor) - Save the monitor for a given dataset.
* [putMonitorConfigV3](docs/monitor/README.md#putmonitorconfigv3) - Save the monitor config document for a given dataset.
* [putRequestMonitorRunConfig](docs/monitor/README.md#putrequestmonitorrunconfig) - Put the RequestMonitorRun config into S3.
* [validateMonitorConfigV3](docs/monitor/README.md#validatemonitorconfigv3) - Validate the monitor config document for a given dataset.

### [notificationSettings](docs/notificationsettings/README.md)

* [addNotificationAction](docs/notificationsettings/README.md#addnotificationaction) - Add new notification action
* [deleteNotificationAction](docs/notificationsettings/README.md#deletenotificationaction) - Delete notification action
* [disableNotificationAction](docs/notificationsettings/README.md#disablenotificationaction) - Disable notification action
* [enableNotificationAction](docs/notificationsettings/README.md#enablenotificationaction) - Enable notification action
* [getNotificationAction](docs/notificationsettings/README.md#getnotificationaction) - Get notification action for id
* [getNotificationSettings](docs/notificationsettings/README.md#getnotificationsettings) - Get notification settings for an org
* [listNotificationActions](docs/notificationsettings/README.md#listnotificationactions) - List notification actions for an org
* [putNotificationAction](docs/notificationsettings/README.md#putnotificationaction) - Add new notification action
* [testNotificationAction](docs/notificationsettings/README.md#testnotificationaction) - Test a notification action
* [updateNotificationAction](docs/notificationsettings/README.md#updatenotificationaction) - Update notification action
* [updateNotificationSettings](docs/notificationsettings/README.md#updatenotificationsettings) - Update notification settings for an org
* [getEmailNotificationActionPayload](docs/notificationsettings/README.md#getemailnotificationactionpayload) - Get dummy notification action payload
* [getPagerDutyNotificationActionPayload](docs/notificationsettings/README.md#getpagerdutynotificationactionpayload) - Get dummy notification action payload
* [getSlackNotificationActionPayload](docs/notificationsettings/README.md#getslacknotificationactionpayload) - Get dummy notification action payload

### [organizations](docs/organizations/README.md)

* [createOrganization](docs/organizations/README.md#createorganization) - Create an organization
* [deleteOrganization](docs/organizations/README.md#deleteorganization) - Delete an org
* [getAWSMarketplaceMetadata](docs/organizations/README.md#getawsmarketplacemetadata) - Get marketplace metadata for an org if any exists.
* [getOrganization](docs/organizations/README.md#getorganization) - Get the metadata about an organization.
* [listOrganizations](docs/organizations/README.md#listorganizations) - Get a list of all of the organization ids.
* [~~partiallyUpdateOrg~~](docs/organizations/README.md#partiallyupdateorg) - Update some fields of an organization to non-null values :warning: **Deprecated**
* [partiallyUpdateOrganization](docs/organizations/README.md#partiallyupdateorganization) - Update some fields of an organization to non-null values
* [~~updateOrg~~](docs/organizations/README.md#updateorg) - Update an existing organization :warning: **Deprecated**
* [updateOrganization](docs/organizations/README.md#updateorganization) - Update an existing organization

### [payment](docs/payment/README.md)

* [stripePaymentEndpoint](docs/payment/README.md#stripepaymentendpoint) - Endpoint for Stripe payment webhooks

### [provision](docs/provision/README.md)

* [provisionAWSMarketplaceNewUser](docs/provision/README.md#provisionawsmarketplacenewuser) - Create resources for a new user coming from AWS Marketplace
* [provisionDatabricksConnection](docs/provision/README.md#provisiondatabricksconnection) - Create resources for a new user coming from Databricks
* [provisionNewUser](docs/provision/README.md#provisionnewuser) - Create the resources that a new user needs to use WhyLabs via the website.
* [registerDatabricksConnection](docs/provision/README.md#registerdatabricksconnection) - Register databricks metadata, temporarily storing it against a UUID so that it can be used to provision a databricks connection after email authentication

### [schema](docs/schema/README.md)

* [getMonitorConfigSchema](docs/schema/README.md#getmonitorconfigschema) - Get the current supported schema of the monitor configuration

### [search](docs/search/README.md)

* [whyLabsSearch](docs/search/README.md#whylabssearch) - WhyLabs Search
* [whyLabsSearchIndexing](docs/search/README.md#whylabssearchindexing) - WhyLabs Search Indexing

### [sessions](docs/sessions/README.md)

* [batchCreateReferenceProfileUpload](docs/sessions/README.md#batchcreatereferenceprofileupload) - Create multiple reference profile uploads for a given session.
* [claimGuestSession](docs/sessions/README.md#claimguestsession) - Claim a guest session, copying its model data into another org and expiring the session.
* [createDatasetProfileUpload](docs/sessions/README.md#createdatasetprofileupload) - Create an upload for a given session.
* [createReferenceProfileUpload](docs/sessions/README.md#createreferenceprofileupload) - Create a reference profile upload for a given session.
* [createSession](docs/sessions/README.md#createsession) - Create a new session that can be used to upload dataset profiles from whylogs for display in whylabs.
* [getSession](docs/sessions/README.md#getsession) - Get information about a session.

### [user](docs/user/README.md)

* [createUser](docs/user/README.md#createuser) - Create a user.
* [getUser](docs/user/README.md#getuser) - Get a user by their id.
* [getUserByEmail](docs/user/README.md#getuserbyemail) - Get a user by their email.
* [updateUser](docs/user/README.md#updateuser) - Update a user.
<!-- End SDK Available Operations -->

### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage 
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally 
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically. 
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release !

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
