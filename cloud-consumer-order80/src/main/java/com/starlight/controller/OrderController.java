package com.starlight.controller;

import com.starlight.entities.Payment;
import com.starlight.results.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author HeWei
 */
@RestController
@RequestMapping("/order/")
public class OrderController {

    private static final  String URL = "http://localhost:8001/payment/get/1";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("get")
    public CommonResult<Payment> getPayment(){
        CommonResult forObject = restTemplate.getForObject(URL, CommonResult.class);
        return forObject;
    }
}
