package com.keerte.boot.mmall.seller.server.service.impl;

import com.keerte.boot.mmall.seller.api.entity.SellerInfo;
import com.keerte.boot.mmall.seller.server.dao.SellerInfoMapper;
import com.keerte.boot.mmall.seller.server.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author 王传鑫
 * @Date 2018/12/29
 */
@Service("SellerService")
public class SellerServiceImpl implements SellerService {
    @Autowired
    private SellerInfoMapper sellerInfoMapper;
    @Override
    public SellerInfo get(String s) {
        return sellerInfoMapper.selectByPrimaryKey(s);
    }

    @Override
    public Integer save(SellerInfo sellerInfo) {
        return sellerInfoMapper.insert(sellerInfo);
    }

    @Override
    public Integer update(SellerInfo sellerInfo) {
        return sellerInfoMapper.updateByPrimaryKey(sellerInfo);
    }

    @Override
    public Integer delete(String s) {
        return sellerInfoMapper.deleteByPrimaryKey(s);
    }
}
