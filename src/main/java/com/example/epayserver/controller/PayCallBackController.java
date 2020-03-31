package com.example.epayserver.controller;

import com.example.epayserver.service.WeChatPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class PayCallBackController {

    @Autowired
    private WeChatPayService wxPayService;

    @RequestMapping(value = "/wxpay/notify", method = {RequestMethod.POST, RequestMethod.GET})
    public String wxNotify(HttpServletRequest request, HttpServletResponse response) {
        try {
            return wxPayService.callBack(request, response);
        } catch (Exception e) {
            response.setHeader("Content-type", "application/xml");
            return "<xml>\n" +
                    "  <return_code><![CDATA[FAIL]]></return_code>\n" +
                    "  <return_msg><![CDATA[]]></return_msg>\n" +
                    "</xml>";
        }
    }
}
