package com.keerte.boot.mmall.seller.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SellerInfo implements Serializable {


    private static final long serialVersionUID = 6361299990819869834L;
    private String id;

    private String name;

    private String account;

    private String pwd;

    private String phone;
}