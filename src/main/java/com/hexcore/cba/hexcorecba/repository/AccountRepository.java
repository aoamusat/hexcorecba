package com.hexcore.cba.hexcorecba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexcore.cba.hexcorecba.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
