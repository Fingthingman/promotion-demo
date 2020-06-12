package com.lea.demo.promotiondemo.result;

import com.lea.demo.promotiondemo.ActivityEnum;

import java.math.BigDecimal;

public class BasePromontionResult {

    /**
     * 活动Id
     */
    private Long activityId;
    /**
     * 活动类型
     */
    private ActivityEnum activityType;
    /**
     * 活动总优惠
     */
    private BigDecimal totalDiscount;


}
