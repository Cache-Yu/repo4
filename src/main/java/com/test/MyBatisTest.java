package com.test;

import com.itcast.dao.AccountDao;
import com.itcast.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {
    @Test
    public void run1() throws IOException {
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();
        AccountDao dao = session.getMapper(AccountDao.class);

        List<Account> list = dao.findAll();

        for (Account account : list) {
            System.out.println(account);
        }


        session.close();
        is.close();
    }

    @Test
    public void run2() throws IOException {
        Account a=new Account();
        a.setName("test2");
        a.setMoney(999);
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();
        AccountDao dao = session.getMapper(AccountDao.class);

       dao.saveAccount(a);
session.commit();

        session.close();
        is.close();
    }
}
