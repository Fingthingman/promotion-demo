package com.lea.demo.promotiondemo.handler;

import java.util.Map;

public interface PromotionHandler<T extends BasePromotionInput> {

    /**
     *
     * @param input  各个活动计算具体的传入参数
     * @return Map<Long,BaseActivityResult> key->shopId, BaseActivityResult->各个活动具体计算结果
     * @throws Exception  异常抛出，外部统一处理
     */
    Map<Long, BasePromotionResult> execute(T input)throws Exception;
}
