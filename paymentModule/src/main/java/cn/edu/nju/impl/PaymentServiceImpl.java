package cn.edu.nju.impl;

import cn.edu.nju.AccountService;
import cn.edu.nju.PaymentHandleService;
import cn.edu.nju.PaymentService;
import cn.edu.nju.RiskAssessService;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

/**
 * @author hiki on 2018-03-28
 */

public class PaymentServiceImpl implements PaymentService {

    private AccountService accountService;

    private PaymentHandleService paymentHandleService;

    private RiskAssessService riskAssessService;


    public void payment() {

    }

    public BigDecimal refund() {
        return null;
    }
}
