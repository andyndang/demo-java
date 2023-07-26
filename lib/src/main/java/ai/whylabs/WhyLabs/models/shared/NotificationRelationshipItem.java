/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class NotificationRelationshipItem {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("datasetId")
    public String datasetId;

    public NotificationRelationshipItem withDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("itemDisplayName")
    public String itemDisplayName;

    public NotificationRelationshipItem withItemDisplayName(String itemDisplayName) {
        this.itemDisplayName = itemDisplayName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("itemId")
    public String itemId;

    public NotificationRelationshipItem withItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public NotificationRelationshipType type;

    public NotificationRelationshipItem withType(NotificationRelationshipType type) {
        this.type = type;
        return this;
    }
    
    public NotificationRelationshipItem(){}
}
