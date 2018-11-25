package com.itcast.service;

import com.itcast.domain.Account;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface AccountService {
    //查询所有的账户
    public List<Account> findAll();

    //保存账户
    void saveAccount(Account account);
}
