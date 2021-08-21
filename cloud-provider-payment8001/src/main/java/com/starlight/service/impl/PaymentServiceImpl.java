package com.starlight.service.impl;

import com.starlight.entities.Payment;
import com.starlight.mapper.PaymentMapper;
import com.starlight.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author HeWei
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public int create(Payment payment)
    {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id)
    {
        return paymentMapper.getPaymentById(id);
    }
}
