package com.example.myfirstweb.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

@Component
public interface AccountMapper {

    @Update("update tb_account set money=money-#{txnMoney} where account_name=#{accountName}")
    void incrMoney(@Param("accountName") String account, @Param("txnMoney") Integer txnMoney);

    @Update("update tb_account set money=money+#{txnMoney} where account_name=#{accountName}")
    void decrMoney(@Param("accountName") String account, @Param("txnMoney") Integer money);

}
