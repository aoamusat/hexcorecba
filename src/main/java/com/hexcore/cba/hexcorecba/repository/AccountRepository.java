package com.hexcore.cba.hexcorecba.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexcore.cba.hexcorecba.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
    // Account findByAccountNumber(String accountNumber);

    // Account findByEmail(String email);

    // Account findByPhoneNumber(String phoneNumber);

    // // Find account by ID
    // public Optional<Account> findById(Long id);

    // // Find all accounts
    // public List<Account> findAll();

    // // Save or update account
    // public Account save(Account account);

    // // Delete account by ID
    // public void deleteById(Long id);

    // // Delete account
    // public void delete(Account account);

    // // Check if account exists by ID
    // public boolean existsById(Long id);

    // // Count total number of accounts
    // public long count();

    // // Delete all accounts
    // public void deleteAll();

    // // Save multiple accounts
    // public List<Account> saveAll(List<Account> accounts);

    // // Find accounts by IDs
    // public List<Account> findAllById(Iterable<Long> ids);
}
