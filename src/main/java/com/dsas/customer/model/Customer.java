package com.dsas.customer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
  @Id private String customerId;
  private String firstName;
  private String lastName;
  private Integer age;
  private String mobileNumber;
  private String emailId;
  private String membership;
  private BigInteger membershipPoints;
}
