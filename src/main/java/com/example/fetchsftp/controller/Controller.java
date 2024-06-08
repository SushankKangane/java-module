package com.example.fetchsftp.controller;

import com.example.common.entity.LoanEntity;
import com.example.common.repository.LoanEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    public final LoanEntityRepository  loanEntityRepository;

    @Autowired
    public Controller(LoanEntityRepository loanEntityRepository) {
        this.loanEntityRepository = loanEntityRepository;
        loanEntityRepository.save(LoanEntity.builder().loanId("1").build());
    }


}
