// Copyright (c) Microsoft Corporation.
// Licensed under the MIT license.

/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bing.commerce.ingestion.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SchemaDetectionResponse model.
 */
public class SchemaDetectionResponse {
    /**
     * The index property.
     */
    @JsonProperty(value = "index")
    private ResponseIndex index;

    /**
     * The transformationConfig property.
     */
    @JsonProperty(value = "transformationConfig")
    private TransformationConfigResponse transformationConfig;

    /**
     * The warnings property.
     */
    @JsonProperty(value = "warnings")
    private List<String> warnings;

    /**
     * Get the index value.
     *
     * @return the index value
     */
    public ResponseIndex index() {
        return this.index;
    }

    /**
     * Set the index value.
     *
     * @param index the index value to set
     * @return the SchemaDetectionResponse object itself.
     */
    public SchemaDetectionResponse withIndex(ResponseIndex index) {
        this.index = index;
        return this;
    }

    /**
     * Get the transformationConfig value.
     *
     * @return the transformationConfig value
     */
    public TransformationConfigResponse transformationConfig() {
        return this.transformationConfig;
    }

    /**
     * Set the transformationConfig value.
     *
     * @param transformationConfig the transformationConfig value to set
     * @return the SchemaDetectionResponse object itself.
     */
    public SchemaDetectionResponse withTransformationConfig(TransformationConfigResponse transformationConfig) {
        this.transformationConfig = transformationConfig;
        return this;
    }

    /**
     * Get the warnings value.
     *
     * @return the warnings value
     */
    public List<String> warnings() {
        return this.warnings;
    }

    /**
     * Set the warnings value.
     *
     * @param warnings the warnings value to set
     * @return the SchemaDetectionResponse object itself.
     */
    public SchemaDetectionResponse withWarnings(List<String> warnings) {
        this.warnings = warnings;
        return this;
    }

}
