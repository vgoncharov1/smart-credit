package ru.smart.calculator.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.smart.calculator.model.Account;

@RestController
@RequestMapping
public class HelloController {

  @GetMapping(value = "/hello-world", produces = MediaType.APPLICATION_JSON_VALUE)
  public Account hello(@RequestParam String name) {

    Account account = new Account();
    account.setName(name);
    account.setAmount(5555555d);

    return account;
  }
}
