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
 * TransferEntity
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-16T12:45:47.431Z")

public class TransferEntity  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("amount")
  private BigDecimal amount = null;

  @JsonProperty("precision")
  private BigDecimal precision = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("accountNumber")
  private String accountNumber = null;

  @JsonProperty("transitNumber")
  private String transitNumber = null;

  @JsonProperty("instNumber")
  private BigDecimal instNumber = null;

  public TransferEntity amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(example = "100.0", required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public TransferEntity precision(BigDecimal precision) {
    this.precision = precision;
    return this;
  }

  /**
   * Get precision
   * @return precision
  **/
  @ApiModelProperty(example = "2.0", value = "")

  @Valid

  public BigDecimal getPrecision() {
    return precision;
  }

  public void setPrecision(BigDecimal precision) {
    this.precision = precision;
  }

  public TransferEntity currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(example = "64", required = true, value = "")
  @NotNull


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public TransferEntity accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Get accountNumber
   * @return accountNumber
  **/
  @ApiModelProperty(example = "1234567", required = true, value = "")
  @NotNull


  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public TransferEntity transitNumber(String transitNumber) {
    this.transitNumber = transitNumber;
    return this;
  }

  /**
   * Get transitNumber
   * @return transitNumber
  **/
  @ApiModelProperty(example = "668", required = true, value = "")
  @NotNull


  public String getTransitNumber() {
    return transitNumber;
  }

  public void setTransitNumber(String transitNumber) {
    this.transitNumber = transitNumber;
  }

  public TransferEntity instNumber(BigDecimal instNumber) {
    this.instNumber = instNumber;
    return this;
  }

  /**
   * Get instNumber
   * @return instNumber
  **/
  @ApiModelProperty(example = "20.0", required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getInstNumber() {
    return instNumber;
  }

  public void setInstNumber(BigDecimal instNumber) {
    this.instNumber = instNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferEntity transferEntity = (TransferEntity) o;
    return Objects.equals(this.amount, transferEntity.amount) &&
        Objects.equals(this.precision, transferEntity.precision) &&
        Objects.equals(this.currencyCode, transferEntity.currencyCode) &&
        Objects.equals(this.accountNumber, transferEntity.accountNumber) &&
        Objects.equals(this.transitNumber, transferEntity.transitNumber) &&
        Objects.equals(this.instNumber, transferEntity.instNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, precision, currencyCode, accountNumber, transitNumber, instNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferEntity {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    transitNumber: ").append(toIndentedString(transitNumber)).append("\n");
    sb.append("    instNumber: ").append(toIndentedString(instNumber)).append("\n");
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

