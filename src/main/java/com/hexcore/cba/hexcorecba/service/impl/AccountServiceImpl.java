package com.hexcore.cba.hexcorecba.service.impl;

import org.springframework.stereotype.Service;

import com.hexcore.cba.hexcorecba.dto.AccountDTO;
import com.hexcore.cba.hexcorecba.entity.Account;
import com.hexcore.cba.hexcorecba.mapper.AccountMapper;
import com.hexcore.cba.hexcorecba.repository.AccountRepository;
import com.hexcore.cba.hexcorecba.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        super();
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDTO createAccount(AccountDTO accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account newAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDTO(newAccount);
    }

}
