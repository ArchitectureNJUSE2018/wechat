package cn.edu.nju;

import java.math.BigDecimal;

/**
 * @author hiki on 2018-03-28
 */

public interface PaymentService {

    void payment();

    BigDecimal refund();
}
