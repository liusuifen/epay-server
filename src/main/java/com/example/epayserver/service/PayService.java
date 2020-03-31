package com.example.epayserver.service;

import com.alipay.api.AlipayApiException;
import com.example.epayserver.pojo.AlipayBean;
import org.springframework.stereotype.Service;

public interface PayService {

    /**
     * 支付宝支付接口
     *
     * @param alipayBean
     * @return
     * @throws AlipayApiException
     */
    String aliPay(AlipayBean alipayBean) throws AlipayApiException;

}
