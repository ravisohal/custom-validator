package com.sohal.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sohal.api.AccountTransferRequest;
import com.sohal.api.WireRequest;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TransferRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-16T12:45:47.431Z")

public class TransferRequest  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("requestHeader")
  private RequestHeader requestHeader = null;

  @JsonProperty("movemoneyRequest")
  private MoveMoneyRequest movemoneyRequest = null;

  public TransferRequest requestHeader(RequestHeader requestHeader) {
    this.requestHeader = requestHeader;
    return this;
  }

  /**
   * Get requestHeader
   * @return requestHeader
  **/
  @ApiModelProperty(required = true, value = "Transfer request header")
  @NotNull

  @Valid

  public RequestHeader getRequestHeader() {
    return requestHeader;
  }

  public void setRequestHeader(RequestHeader requestHeader) {
    this.requestHeader = requestHeader;
  }

  public TransferRequest movemoneyRequest(MoveMoneyRequest movemoneyRequest) {
    this.movemoneyRequest = movemoneyRequest;
    return this;
  }

  /**
   * Get movemoneyRequest
   * @return movemoneyRequest
  **/
  @ApiModelProperty(required = true, value = "Transfer request body")
  @NotNull
  @WireRequest
  @AccountTransferRequest
  @Valid

  public MoveMoneyRequest getMovemoneyRequest() {
    return movemoneyRequest;
  }

  public void setMovemoneyRequest(MoveMoneyRequest movemoneyRequest) {
    this.movemoneyRequest = movemoneyRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferRequest transferRequest = (TransferRequest) o;
    return Objects.equals(this.requestHeader, transferRequest.requestHeader) &&
        Objects.equals(this.movemoneyRequest, transferRequest.movemoneyRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestHeader, movemoneyRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferRequest {\n");
    
    sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
    sb.append("    movemoneyRequest: ").append(toIndentedString(movemoneyRequest)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

