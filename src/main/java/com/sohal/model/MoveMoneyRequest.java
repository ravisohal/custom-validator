package com.sohal.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MoveMoneyRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-16T12:45:47.431Z")

public class MoveMoneyRequest  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("serviceType")
  private String serviceType = null;

  @JsonProperty("operationType")
  private BigDecimal operationType = null;

  @JsonProperty("fromEntity")
  private TransferEntity fromEntity = null;

  @JsonProperty("toEntity")
  private TransferEntity toEntity = null;

  @JsonProperty("wireExternalRefNumber")
  private String wireExternalRefNumber = null;

  public MoveMoneyRequest serviceType(String serviceType) {
    this.serviceType = serviceType;
    return this;
  }

  /**
   * Get serviceType
   * @return serviceType
  **/
  @ApiModelProperty(example = "xfer", required = true, value = "")
  @NotNull

  public String getServiceType() {
    return serviceType;
  }

  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }

  public MoveMoneyRequest operationType(BigDecimal operationType) {
    this.operationType = operationType;
    return this;
  }

  /**
   * Get operationType
   * @return operationType
  **/
  @ApiModelProperty(example = "42.0", required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getOperationType() {
    return operationType;
  }

  public void setOperationType(BigDecimal operationType) {
    this.operationType = operationType;
  }

  public MoveMoneyRequest fromEntity(TransferEntity fromEntity) {
    this.fromEntity = fromEntity;
    return this;
  }

  /**
   * Get fromEntity
   * @return fromEntity
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TransferEntity getFromEntity() {
    return fromEntity;
  }

  public void setFromEntity(TransferEntity fromEntity) {
    this.fromEntity = fromEntity;
  }

  public MoveMoneyRequest toEntity(TransferEntity toEntity) {
    this.toEntity = toEntity;
    return this;
  }

  /**
   * Get toEntity
   * @return toEntity
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TransferEntity getToEntity() {
    return toEntity;
  }

  public void setToEntity(TransferEntity toEntity) {
    this.toEntity = toEntity;
  }

  public MoveMoneyRequest wireExternalRefNumber(String wireExternalRefNumber) {
    this.wireExternalRefNumber = wireExternalRefNumber;
    return this;
  }

  /**
   * Get wireExternalRefNumber
   * @return wireExternalRefNumber
  **/
  @ApiModelProperty(example = "1234567", value = "")


  public String getWireExternalRefNumber() {
    return wireExternalRefNumber;
  }

  public void setWireExternalRefNumber(String wireExternalRefNumber) {
    this.wireExternalRefNumber = wireExternalRefNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoveMoneyRequest moveMoneyRequest = (MoveMoneyRequest) o;
    return Objects.equals(this.serviceType, moveMoneyRequest.serviceType) &&
        Objects.equals(this.operationType, moveMoneyRequest.operationType) &&
        Objects.equals(this.fromEntity, moveMoneyRequest.fromEntity) &&
        Objects.equals(this.toEntity, moveMoneyRequest.toEntity) &&
        Objects.equals(this.wireExternalRefNumber, moveMoneyRequest.wireExternalRefNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceType, operationType, fromEntity, toEntity, wireExternalRefNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveMoneyRequest {\n");
    
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    fromEntity: ").append(toIndentedString(fromEntity)).append("\n");
    sb.append("    toEntity: ").append(toIndentedString(toEntity)).append("\n");
    sb.append("    wireExternalRefNumber: ").append(toIndentedString(wireExternalRefNumber)).append("\n");
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

