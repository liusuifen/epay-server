package com.example.epayserver.controller;
import	java.lang.annotation.Retention;
import	java.security.acl.Group;

import com.alipay.api.AlipayApiException;
import com.example.epayserver.pojo.AlipayBean;
import com.example.epayserver.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private PayService payService;

    /**
     * 阿里支付
     * @param totalAmount
     * @param subject
     * @param outTradeNo
     * @param body
     * @return
     * @throws AlipayApiException
     */
    @PostMapping(value = "alipay")
    public String alipay(String outTradeNo, String subject, String totalAmount, String body) throws AlipayApiException {
        AlipayBean alipayBean = new AlipayBean();
        alipayBean.setOut_trade_no(outTradeNo);
        alipayBean.setSubject(subject);
        alipayBean.setTotal_amount(totalAmount);
        alipayBean.setBody(body);
        return payService.aliPay(alipayBean);
    }
}
