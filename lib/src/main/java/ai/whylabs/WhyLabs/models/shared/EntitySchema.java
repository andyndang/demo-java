/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EntitySchema - Entity schema for a dataset
 */

public class EntitySchema {
    /**
     * Column schema for a given column
     */
    @JsonProperty("columns")
    public java.util.Map<String, ColumnSchema> columns;

    public EntitySchema withColumns(java.util.Map<String, ColumnSchema> columns) {
        this.columns = columns;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    public SchemaMetadata metadata;

    public EntitySchema withMetadata(SchemaMetadata metadata) {
        this.metadata = metadata;
        return this;
    }
    
    /**
     * Schema for user-defined metrics (map of unique custom metric labels to their definitions)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metrics")
    public java.util.Map<String, MetricSchema> metrics;

    public EntitySchema withMetrics(java.util.Map<String, MetricSchema> metrics) {
        this.metrics = metrics;
        return this;
    }
    
    public EntitySchema(@JsonProperty("columns") java.util.Map<String, ColumnSchema> columns) {
        this.columns = columns;
  }
}
