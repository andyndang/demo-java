/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DTOJobsNewClusterDTO {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("artifactPaths")
    public String[] artifactPaths;

    public DTOJobsNewClusterDTO withArtifactPaths(String[] artifactPaths) {
        this.artifactPaths = artifactPaths;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("autoScale")
    public DTOClustersAutoScaleDTO autoScale;

    public DTOJobsNewClusterDTO withAutoScale(DTOClustersAutoScaleDTO autoScale) {
        this.autoScale = autoScale;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("autoTerminationMinutes")
    public Integer autoTerminationMinutes;

    public DTOJobsNewClusterDTO withAutoTerminationMinutes(Integer autoTerminationMinutes) {
        this.autoTerminationMinutes = autoTerminationMinutes;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("awsAttributes")
    public DTOClustersAwsAttributesDTO awsAttributes;

    public DTOJobsNewClusterDTO withAwsAttributes(DTOClustersAwsAttributesDTO awsAttributes) {
        this.awsAttributes = awsAttributes;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("clusterLogConf")
    public DTOClustersClusterLogConfDTO clusterLogConf;

    public DTOJobsNewClusterDTO withClusterLogConf(DTOClustersClusterLogConfDTO clusterLogConf) {
        this.clusterLogConf = clusterLogConf;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("clusterName")
    public String clusterName;

    public DTOJobsNewClusterDTO withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("customTags")
    public java.util.Map<String, String> customTags;

    public DTOJobsNewClusterDTO withCustomTags(java.util.Map<String, String> customTags) {
        this.customTags = customTags;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dataSecurityMode")
    public DTOJobsDataSecurityModeDTO dataSecurityMode;

    public DTOJobsNewClusterDTO withDataSecurityMode(DTOJobsDataSecurityModeDTO dataSecurityMode) {
        this.dataSecurityMode = dataSecurityMode;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("driverNodeTypeId")
    public String driverNodeTypeId;

    public DTOJobsNewClusterDTO withDriverNodeTypeId(String driverNodeTypeId) {
        this.driverNodeTypeId = driverNodeTypeId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("enableElasticDisk")
    public Boolean enableElasticDisk;

    public DTOJobsNewClusterDTO withEnableElasticDisk(Boolean enableElasticDisk) {
        this.enableElasticDisk = enableElasticDisk;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("initScripts")
    public java.util.Map<String, Object>[] initScripts;

    public DTOJobsNewClusterDTO withInitScripts(java.util.Map<String, Object>[] initScripts) {
        this.initScripts = initScripts;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("instancePoolId")
    public String instancePoolId;

    public DTOJobsNewClusterDTO withInstancePoolId(String instancePoolId) {
        this.instancePoolId = instancePoolId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("nodeTypeId")
    public String nodeTypeId;

    public DTOJobsNewClusterDTO withNodeTypeId(String nodeTypeId) {
        this.nodeTypeId = nodeTypeId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("numWorkers")
    public Integer numWorkers;

    public DTOJobsNewClusterDTO withNumWorkers(Integer numWorkers) {
        this.numWorkers = numWorkers;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("policyId")
    public String policyId;

    public DTOJobsNewClusterDTO withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("runtimeEngine")
    public String runtimeEngine;

    public DTOJobsNewClusterDTO withRuntimeEngine(String runtimeEngine) {
        this.runtimeEngine = runtimeEngine;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sparkConf")
    public java.util.Map<String, String> sparkConf;

    public DTOJobsNewClusterDTO withSparkConf(java.util.Map<String, String> sparkConf) {
        this.sparkConf = sparkConf;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sparkEnvVars")
    public java.util.Map<String, String> sparkEnvVars;

    public DTOJobsNewClusterDTO withSparkEnvVars(java.util.Map<String, String> sparkEnvVars) {
        this.sparkEnvVars = sparkEnvVars;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sparkVersion")
    public String sparkVersion;

    public DTOJobsNewClusterDTO withSparkVersion(String sparkVersion) {
        this.sparkVersion = sparkVersion;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sshPublicKeys")
    public java.util.Map<String, Object>[] sshPublicKeys;

    public DTOJobsNewClusterDTO withSshPublicKeys(java.util.Map<String, Object>[] sshPublicKeys) {
        this.sshPublicKeys = sshPublicKeys;
        return this;
    }
    
    public DTOJobsNewClusterDTO(){}
}
