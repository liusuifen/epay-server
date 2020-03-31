package com.example.epayserver.service.impl;

import com.example.epayserver.service.TradeService;
import org.springframework.stereotype.Service;

@Service
public class TradeServiceImpl implements TradeService {
    @Override
    public boolean hasProcessed(String orderId) {
        return false;
    }
}
