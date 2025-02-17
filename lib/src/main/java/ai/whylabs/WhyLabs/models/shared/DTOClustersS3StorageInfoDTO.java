/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DTOClustersS3StorageInfoDTO {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cannedAcl")
    public String cannedAcl;

    public DTOClustersS3StorageInfoDTO withCannedAcl(String cannedAcl) {
        this.cannedAcl = cannedAcl;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("destination")
    public String destination;

    public DTOClustersS3StorageInfoDTO withDestination(String destination) {
        this.destination = destination;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("enableEncryption")
    public Boolean enableEncryption;

    public DTOClustersS3StorageInfoDTO withEnableEncryption(Boolean enableEncryption) {
        this.enableEncryption = enableEncryption;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("encryptionType")
    public String encryptionType;

    public DTOClustersS3StorageInfoDTO withEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("endpoint")
    public String endpoint;

    public DTOClustersS3StorageInfoDTO withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("kmsKey")
    public String kmsKey;

    public DTOClustersS3StorageInfoDTO withKmsKey(String kmsKey) {
        this.kmsKey = kmsKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("region")
    public String region;

    public DTOClustersS3StorageInfoDTO withRegion(String region) {
        this.region = region;
        return this;
    }
    
    public DTOClustersS3StorageInfoDTO(){}
}
