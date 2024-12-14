package com.hexcore.cba.hexcorecba.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexcore.cba.hexcorecba.dto.AccountDTO;
import com.hexcore.cba.hexcorecba.service.AccountService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
    private AccountService accountService;

    public AccountController(AccountService accountService) {
        super();
        this.accountService = accountService;
    }

    // Create the REST API
    @PostMapping
    public ResponseEntity<AccountDTO> createAccount(@RequestBody @Valid AccountDTO accountDto) {
        return new ResponseEntity<>(accountService.createAccount(accountDto), HttpStatus.CREATED);
    }
}
