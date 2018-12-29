package com.keerte.boot.mmall.seller.api.common;

/**
 * @Description
 * @Author 王传鑫
 * @Date 2018/12/29
 */
public interface BaseService<T,ID> {
    T get(ID id);
    Integer save(T sellerInfo);
    Integer update(T sellerInfo);
    Integer delete(ID id);
}
