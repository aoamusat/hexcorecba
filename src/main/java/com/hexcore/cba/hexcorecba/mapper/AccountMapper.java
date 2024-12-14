package com.hexcore.cba.hexcorecba.mapper;

import com.hexcore.cba.hexcorecba.dto.AccountDTO;
import com.hexcore.cba.hexcorecba.entity.Account;

public class AccountMapper {
    public static Account mapToAccount(AccountDTO accountDTO) {
        Account account = new Account();
        account.setId(accountDTO.getId());
        account.setAccountName(accountDTO.getAccountName());
        account.setAccountNumber(accountDTO.getAccountNumber());
        account.setAccountType(accountDTO.getAccountType());
        account.setBalance(accountDTO.getBalance());
        account.setEmail(accountDTO.getEmail());
        account.setPhoneNumber(accountDTO.getPhoneNumber());
        account.setIsActive(accountDTO.isActive());
        return account;
    }

    public static AccountDTO mapToAccountDTO(Account account) {
        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setId(account.getId());
        accountDTO.setAccountName(account.getAccountName());
        accountDTO.setAccountNumber(account.getAccountNumber());
        accountDTO.setAccountType(account.getAccountType());
        accountDTO.setBalance(account.getBalance());
        accountDTO.setEmail(account.getEmail());
        accountDTO.setPhoneNumber(account.getPhoneNumber());
        accountDTO.setActive(account.getIsActive());
        return accountDTO;
    }
}
