package com.test;

import com.itcast.domain.Account;
import com.itcast.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class SSMTest {

    @Autowired
    private AccountService accountService;

    @Test
    public  void run1(){
        List<Account> list = accountService.findAll();
        for (Account account : list) {
            System.out.println(account);
        }
    }

    @Test
    public  void run2(){
        Account account=new Account();
        account.setName("程序员");
        account.setMoney(8989);
        accountService.saveAccount(account);
    }
}
