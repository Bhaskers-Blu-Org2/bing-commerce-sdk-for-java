// Copyright (c) Microsoft Corporation.
// Licensed under the MIT license.

/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bing.commerce.search.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Defines an equivalence condition for a Boolean field. It can appear in a
 * filter, a boost, or a filter aggregation.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = BoolCondition.class)
@JsonTypeName("BoolCondition")
public class BoolCondition extends EquivalenceConditionBase {
    /**
     * The value (true or false) to compare the field against.
     */
    @JsonProperty(value = "value")
    private Boolean value;

    /**
     * Get the value (true or false) to compare the field against.
     *
     * @return the value value
     */
    public Boolean value() {
        return this.value;
    }

    /**
     * Set the value (true or false) to compare the field against.
     *
     * @param value the value value to set
     * @return the BoolCondition object itself.
     */
    public BoolCondition withValue(Boolean value) {
        this.value = value;
        return this;
    }

}

