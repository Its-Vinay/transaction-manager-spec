package com.springboot.tm.spec.services;

import com.springboot.tm.spec.dto.AccountRequestDTO;
import com.springboot.tm.spec.dto.AccountResponseDTO;
import com.springboot.tm.spec.dto.TransactionInquiryDTO;

import java.util.List;

public interface TranInquiryService {

    public List<TransactionInquiryDTO> retrieveTran(String accountNumber);

}
