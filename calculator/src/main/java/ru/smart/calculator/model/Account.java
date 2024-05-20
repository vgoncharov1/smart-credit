package ru.smart.calculator.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Account.
 *
 * @author Vladimir Goncharov
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

  private String name;
  private Double amount;
}
