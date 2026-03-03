package com.springboot.tm.spec.services;

import com.springboot.tm.spec.dto.AccountRequestDTO;
import com.springboot.tm.spec.dto.AccountResponseDTO;
import com.springboot.tm.spec.dto.TransactionRequestDTO;
import com.springboot.tm.spec.dto.TransactionResponseDTO;

public interface DebitService {

    public TransactionResponseDTO debit(TransactionRequestDTO transactionRequestDTO);

}
