package com.hexcore.cba.hexcorecba.dto;

import lombok.Data;

@Data
public class AccountDTO {

    private Long id;
    private String accountNumber;
    private String accountName;
    private String accountType;
    private Double balance;
    private String email;
    private String phoneNumber;
}
