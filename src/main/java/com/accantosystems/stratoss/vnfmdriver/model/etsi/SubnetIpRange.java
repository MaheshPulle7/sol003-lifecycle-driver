package com.accantosystems.stratoss.vnfmdriver.model.etsi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Represents a subnet defined as an IP address range.
 */
@Data
@JsonInclude(value = JsonInclude.Include.NON_EMPTY, content = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(description = "Represents a subnet defined as an IP address range.")
public class SubnetIpRange {

    @ApiModelProperty(name = "Lowest IP Address", required = true, notes = "Lowest IP address belonging to the range.")
    private String minIpAddress;
    @ApiModelProperty(name = "Highest Subnet Id", required = true, notes = "Highest IP address belonging to the range.")
    private String maxIpAddress;

}
