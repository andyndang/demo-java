/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DTOEbsVolumeTypeDTO {
    GENERAL_PURPOSE_SSD("GENERAL_PURPOSE_SSD"),
    THROUGHPUT_OPTIMIZED_HDD("THROUGHPUT_OPTIMIZED_HDD");

    @JsonValue
    public final String value;

    private DTOEbsVolumeTypeDTO(String value) {
        this.value = value;
    }
}
