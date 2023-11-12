/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SegmentWeight {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("segment")
    public Segment segment;

    public SegmentWeight withSegment(Segment segment) {
        this.segment = segment;
        return this;
    }
    
    /**
     * Entity weight value for each entity
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("weights")
    public java.util.Map<String, Double> weights;

    public SegmentWeight withWeights(java.util.Map<String, Double> weights) {
        this.weights = weights;
        return this;
    }
    
    public SegmentWeight(){}
}
