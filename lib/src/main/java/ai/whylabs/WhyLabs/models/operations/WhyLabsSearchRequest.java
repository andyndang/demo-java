/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import ai.whylabs.WhyLabs.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;

public class WhyLabsSearchRequest {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=query")
    public String query;

    public WhyLabsSearchRequest withQuery(String query) {
        this.query = query;
        return this;
    }
    
    public WhyLabsSearchRequest(@JsonProperty("query") String query) {
        this.query = query;
  }
}
