package com.ramos.picpay.services;

import com.ramos.picpay.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    @Autowired
    private UserService userService;
    @Autowired
    private TransactionRepository repository;

    public void createTransaction(TransactionDTO transaction){

    }
}
