package com.sohal.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.UUID;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestHeader
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-16T12:45:47.431Z")

public class RequestHeader  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("transactionID")
  private UUID transactionID = null;

  @JsonProperty("clientRefNumber")
  private String clientRefNumber = null;

  @JsonProperty("transactionDateTime")
  private OffsetDateTime transactionDateTime = null;

  @JsonProperty("customerID")
  private String customerID = null;

  public RequestHeader transactionID(UUID transactionID) {
    this.transactionID = transactionID;
    return this;
  }

  /**
   * Get transactionID
   * @return transactionID
  **/
  @ApiModelProperty(example = "d290f1ee-6c54-4b01-90e6-d701748f0851", required = true, value = "")
  @NotNull

  @Valid

  public UUID getTransactionID() {
    return transactionID;
  }

  public void setTransactionID(UUID transactionID) {
    this.transactionID = transactionID;
  }

  public RequestHeader clientRefNumber(String clientRefNumber) {
    this.clientRefNumber = clientRefNumber;
    return this;
  }

  /**
   * Get clientRefNumber
   * @return clientRefNumber
  **/
  @ApiModelProperty(example = "0123456789", required = true, value = "")
  @NotNull(message = "{requestHeader.clientRefNumber.notNull}")
  @Size(min = 1, max = 10, message = "{requestHeader.clientRefNumber.size}")

  public String getClientRefNumber() {
    return clientRefNumber;
  }

  public void setClientRefNumber(String clientRefNumber) {
    this.clientRefNumber = clientRefNumber;
  }

  public RequestHeader transactionDateTime(OffsetDateTime transactionDateTime) {
    this.transactionDateTime = transactionDateTime;
    return this;
  }

  /**
   * Get transactionDateTime
   * @return transactionDateTime
  **/
  @ApiModelProperty(example = "2016-08-29T09:12:33.001Z", required = true, value = "")
  @NotNull

  @Valid

  public OffsetDateTime getTransactionDateTime() {
    return transactionDateTime;
  }

  public void setTransactionDateTime(OffsetDateTime transactionDateTime) {
    this.transactionDateTime = transactionDateTime;
  }

  public RequestHeader customerID(String customerID) {
    this.customerID = customerID;
    return this;
  }

  /**
   * Get customerID
   * @return customerID
  **/
  @ApiModelProperty(example = "1234567887654321", required = true, value = "")
  @NotNull(message = "{requestHeader.customerID.notNull}")
  @Size(min = 1, max = 16, message = "{requestHeader.customerID.size}")

  public String getCustomerID() {
    return customerID;
  }

  public void setCustomerID(String customerID) {
    this.customerID = customerID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestHeader requestHeader = (RequestHeader) o;
    return Objects.equals(this.transactionID, requestHeader.transactionID) &&
        Objects.equals(this.clientRefNumber, requestHeader.clientRefNumber) &&
        Objects.equals(this.transactionDateTime, requestHeader.transactionDateTime) &&
        Objects.equals(this.customerID, requestHeader.customerID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionID, clientRefNumber, transactionDateTime, customerID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestHeader {\n");
    
    sb.append("    transactionID: ").append(toIndentedString(transactionID)).append("\n");
    sb.append("    clientRefNumber: ").append(toIndentedString(clientRefNumber)).append("\n");
    sb.append("    transactionDateTime: ").append(toIndentedString(transactionDateTime)).append("\n");
    sb.append("    customerID: ").append(toIndentedString(customerID)).append("\n");
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

