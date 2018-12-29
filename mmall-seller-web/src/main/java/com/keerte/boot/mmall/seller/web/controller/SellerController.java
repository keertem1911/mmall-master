package com.keerte.boot.mmall.seller.web.controller;

import com.keerte.boot.mmall.seller.api.entity.SellerInfo;
import com.keerte.boot.mmall.seller.api.service.SellerFeigonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @Description
 * @Author 王传鑫
 * @Date 2018/12/29
 */
@RestController()
public class SellerController {

    @Autowired
    private SellerFeigonService sellerFeigonService;

    @GetMapping("/info/{id}")
    public SellerInfo getUser(@PathVariable("id")String id){
        return sellerFeigonService.getUser(id);
    }
    @PostMapping(value = "/info",consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    String saveUser(SellerInfo sellerInfo){
        sellerInfo.setId(UUID.randomUUID().toString().replaceAll("-",""));
        return sellerFeigonService.saveUser(sellerInfo);
    }
    @PutMapping(value = "/info",consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    SellerInfo updateUser(SellerInfo sellerInfo){
        return sellerFeigonService.updateUser(sellerInfo);
    }
    @DeleteMapping("/info/{id}")
    String deleteUser(@PathVariable("id")String id){
        return sellerFeigonService.deleteUser(id);
    }

}
