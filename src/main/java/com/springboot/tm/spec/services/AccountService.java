package com.springboot.tm.spec.services;

import com.springboot.tm.spec.dto.AccountRequestDTO;
import com.springboot.tm.spec.dto.AccountResponseDTO;

public interface AccountService {

    public AccountResponseDTO createAccount(AccountRequestDTO accountRequestDTO);

    public AccountResponseDTO inquireAccount(String accountNumber);

}
