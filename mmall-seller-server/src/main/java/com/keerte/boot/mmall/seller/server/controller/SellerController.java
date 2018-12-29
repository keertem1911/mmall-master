package com.keerte.boot.mmall.seller.server.controller;

import com.keerte.boot.mmall.seller.api.entity.SellerInfo;
import com.keerte.boot.mmall.seller.server.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @Description
 * @Author 王传鑫
 * @Date 2018/12/29
 */
@RestController
public class SellerController {


    @Autowired
    private SellerService sellerService;
    @GetMapping("/info/{id}")
    public SellerInfo getUser(@PathVariable("id")String id){
        return sellerService.get(id);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/info",consumes = MediaType.APPLICATION_JSON_VALUE)
    String saveUser(@RequestBody  SellerInfo sellerInfo){
        int result= sellerService.save(sellerInfo);
        return result+"";
    }
    @RequestMapping(method = RequestMethod.PUT,value = "/info",consumes = MediaType.APPLICATION_JSON_VALUE)
    SellerInfo updateUser(@RequestBody  SellerInfo sellerInfo){
        int result=sellerService.update(sellerInfo);
        return sellerService.get(sellerInfo.getId());
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/info/{id}")
    String deleteUser(@PathVariable("id")String id){
        int result=sellerService.delete(id);
        return result+"";
    }

}
