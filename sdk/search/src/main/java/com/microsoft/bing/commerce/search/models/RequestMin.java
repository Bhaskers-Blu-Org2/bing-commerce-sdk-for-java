// Copyright (c) Microsoft Corporation.
// Licensed under the MIT license.

/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bing.commerce.search.models;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Aggregation type for getting the min value of a field. Only applicable to
 * numeric data.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = RequestMin.class)
@JsonTypeName("Min")
public class RequestMin extends RequestFieldAggregationBase {
}

