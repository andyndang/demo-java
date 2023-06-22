/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import ai.whylabs.WhyLabs.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeleteDatasetProfilesRequest {
    /**
     * Optional, scope deleting profiles uploaded prior to the timestamp
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=before_upload_timestamp")
    public Long beforeUploadTimestamp;

    public DeleteDatasetProfilesRequest withBeforeUploadTimestamp(Long beforeUploadTimestamp) {
        this.beforeUploadTimestamp = beforeUploadTimestamp;
        return this;
    }
    
    /**
     * The unique dataset ID in your company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=dataset_id")
    public String datasetId;

    public DeleteDatasetProfilesRequest withDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    
    /**
     * Your company's unique organization ID
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=org_id")
    public String orgId;

    public DeleteDatasetProfilesRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    /**
     * Optional, scope deleting profiles more recent than the timestamp
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=profile_end_timestamp")
    public Long profileEndTimestamp;

    public DeleteDatasetProfilesRequest withProfileEndTimestamp(Long profileEndTimestamp) {
        this.profileEndTimestamp = profileEndTimestamp;
        return this;
    }
    
    /**
     * Optional, scope deleting profiles older than the timestamp
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=profile_start_timestamp")
    public Long profileStartTimestamp;

    public DeleteDatasetProfilesRequest withProfileStartTimestamp(Long profileStartTimestamp) {
        this.profileStartTimestamp = profileStartTimestamp;
        return this;
    }
    
    public DeleteDatasetProfilesRequest(@JsonProperty("dataset_id") String datasetId, @JsonProperty("org_id") String orgId) {
        this.datasetId = datasetId;
        this.orgId = orgId;
  }
}
