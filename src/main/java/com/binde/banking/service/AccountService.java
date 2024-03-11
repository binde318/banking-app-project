package com.binde.banking.service;

import com.binde.banking.dto.AccountDto;
import com.binde.banking.entity.Account;

import java.util.List;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccountById(Long id);
    AccountDto deposit(Long id, double amount);
    AccountDto withdraw(Long id, double amount);
    List<AccountDto> getAllAccount();
    void deleteAccount(Long id);
}
