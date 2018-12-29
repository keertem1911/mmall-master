package com.keerte.boot.mmall.sell.server;

import com.keerte.boot.mmall.seller.api.entity.SellerInfo;
import com.keerte.boot.mmall.seller.server.MmallSellServerApplication;
import com.keerte.boot.mmall.seller.server.service.SellerService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

/**
 * @Description
 * @Author 王传鑫
 * @Date 2018/12/29
 */
@SpringBootTest(classes = MmallSellServerApplication.class)
@RunWith(SpringRunner.class)
@Slf4j
public class test {
    @Autowired
    private SellerService sellerService;
    @Test
    public void test(){
        Integer id = sellerService.save(new SellerInfo(UUID.randomUUID().toString().replace("-", ""), "bob", "admin", "******", "110"));
        log.info("id={}",id);
    }
}
