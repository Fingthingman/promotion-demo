package com.lea.demo.promotiondemo.result;

import com.lea.demo.promotiondemo.ActivityEnum;
import com.lea.demo.promotiondemo.handler.BasePromotionResult;

import java.math.BigDecimal;
import java.util.Map;

/**
 * 计算价格输入
 */
public class CalculateResult {

    /**
     * 用户Id
     */
    private Long userId;
    /**
     * 平台Id
     */
    private Long platformId;
    /**
     * 店铺Id
     */
    private Long shopId;
    /**
     * 活动优惠集合 key->活动类型  values->具体活动计算结果
     */
    private Map<ActivityEnum, BasePromotionResult> results;
    /**
     * 总优惠
     */
    private BigDecimal totalDiscounts;
    
}
