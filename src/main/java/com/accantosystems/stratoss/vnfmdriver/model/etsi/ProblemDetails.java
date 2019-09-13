package com.accantosystems.stratoss.vnfmdriver.model.etsi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Represents the general "ProblemDetails" data structure from IETF RFC 7807
 */
@Data
@JsonInclude(value = JsonInclude.Include.NON_EMPTY, content = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(description = "Request used to execute lifecycle")
public class ProblemDetails {

    @ApiModelProperty(value = "Status", required = true, notes = "The HTTP status code for this occurrence of the problem.")
    private Integer status;
    @ApiModelProperty(value = "Detail", required = true, notes = "A human-readable explanation specific to this occurrence of the problem.")
    private String detail;
    @ApiModelProperty(value = "Type", dataType = "URI", notes = "A URI reference according to IETF RFC 3986 [5] that identifies the problem type. It is encouraged that the URI provides human-readable documentation for the problem (e.g. using HTML) when dereferenced. When this member is not present, its value is assumed to be \"about:blank\"")
    private String type;
    @ApiModelProperty(value = "Title", notes = "A short, human-readable summary of the problem type. It should not change from occurrence to occurrence of the problem, except for purposes of localization. If type is given and other than \"about:blank\", this attribute shall also be provided.")
    private String title;
    @ApiModelProperty(value = "Instance", dataType = "URI", notes = "A URI reference that identifies the specific occurrence of the problem. It may yield further information if dereferenced.")
    private String instance;

    // Optionally can contain other implementation-specific attributes

}
