///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.mycompany.controller;
//
//import com.mycompany.models.Account;
//import com.mycompany.service.AccountService;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/account")
//public class AccountController {
//    @Autowired
//    AccountService accountService;
//    
//    @GetMapping("/all")
//    public List<Account> getAccountList()
//    {
//        return accountService.findAll();
//    }
//    @PostMapping("/register")
//    public Account addAccount(@RequestBody Account account)
//    {
//        return accountService.add(account);
//    }
//    @GetMapping("/{accountId}")
//    public Account getAccount(@PathVariable(name = "accountId")Integer accountId){
//        return accountService.findOne(accountId);
//    }
//      
//}
