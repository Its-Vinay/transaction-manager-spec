package com.springboot.tm.spec.services;

import com.springboot.tm.spec.dto.*;

public interface FundTransferService {

    public TransactionResponseDTO fundTransfer(TransferRequestDTO transferRequestDTO);

}
