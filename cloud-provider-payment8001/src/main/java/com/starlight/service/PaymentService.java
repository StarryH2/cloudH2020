package com.starlight.service;

import com.starlight.entities.Payment;

/**
 * @author HeWei
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(Long id);

}
