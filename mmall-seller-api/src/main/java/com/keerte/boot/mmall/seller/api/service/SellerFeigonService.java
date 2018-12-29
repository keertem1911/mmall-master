package com.keerte.boot.mmall.seller.api.service;

import com.keerte.boot.mmall.seller.api.entity.SellerInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @Description
 * @Author 王传鑫
 * @Date 2018/12/29
 */
@FeignClient("mmall-seller-server")
public interface SellerFeigonService {
    @GetMapping("/info/{id}")
     SellerInfo getUser(@PathVariable("id")String id);
    @RequestMapping(method = RequestMethod.POST,value = "/info",consumes = MediaType.APPLICATION_JSON_VALUE)
     String saveUser(@RequestBody  SellerInfo sellerInfo);
    @RequestMapping(method = RequestMethod.PUT,value = "/info",consumes = MediaType.APPLICATION_JSON_VALUE)
    SellerInfo updateUser(@RequestBody SellerInfo sellerInfo);
    @RequestMapping(method = RequestMethod.DELETE,value = "/info/{id}")
    String deleteUser(@PathVariable("id")String id);

}
