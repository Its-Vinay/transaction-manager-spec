package com.springboot.tm.spec.services;

import com.springboot.tm.spec.dto.AccountRequestDTO;
import com.springboot.tm.spec.dto.AccountResponseDTO;
import com.springboot.tm.spec.dto.TransactionInquiryDTO;

public interface TranInquiryService {

    public TransactionInquiryDTO retrieveTran(String accountNumber);

}
