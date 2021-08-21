package com.starlight.mapper;

import com.starlight.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author HeWei
 */
@Mapper
public interface PaymentMapper {

    /**
     *
     * @param payment
     * @return
     */
    public int create(Payment payment);

    /**
     *
     * @param id
     * @return
     */
    public Payment getPaymentById(@Param("id") Long id);
}
