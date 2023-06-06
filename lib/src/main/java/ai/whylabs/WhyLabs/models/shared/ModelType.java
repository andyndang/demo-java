/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ModelType - The [ModelType] of the dataset
 */
public enum ModelType {
    CLASSIFICATION("CLASSIFICATION"),
    REGRESSION("REGRESSION"),
    EMBEDDINGS("EMBEDDINGS"),
    LLM("LLM"),
    RANKING("RANKING"),
    MODEL_OTHER("MODEL_OTHER"),
    DATA_SOURCE("DATA_SOURCE"),
    DATA_STREAM("DATA_STREAM"),
    DATA_TRANSFORM("DATA_TRANSFORM"),
    DATA_OTHER("DATA_OTHER");

    @JsonValue
    public final String value;

    private ModelType(String value) {
        this.value = value;
    }
}
