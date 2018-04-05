package cn.edu.nju.impl;

import cn.edu.nju.AccountService;
import cn.edu.nju.PaymentHandleService;
import cn.edu.nju.PaymentService;
import cn.edu.nju.RiskAssessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author hiki on 2018-03-28
 */

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private AccountService accountService;

    @Autowired
    private PaymentHandleService paymentHandleService;

    @Autowired
    private RiskAssessService riskAssessService;


    public void payment() {

    }

    public BigDecimal refund() {
        return null;
    }
}
