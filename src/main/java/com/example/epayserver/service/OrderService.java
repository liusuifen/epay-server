package com.example.epayserver.service;

public interface OrderService {


    void finishOrder(String orderId);

    void failOrder(String orderId);
}
