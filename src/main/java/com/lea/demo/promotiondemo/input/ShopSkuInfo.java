package com.lea.demo.promotiondemo.input;

import java.math.BigDecimal;
import java.util.Map;

public class ShopSkuInfo {

    /**
     * skuId
     */
    private Long skuId;
    /**
     * 数量
     */
    private Integer num;
    /**
     * 商品初始价格
     */
    private BigDecimal price;
    /**
     * 扩展参数
     */
    private Map<String,Object> extendParam;
}
