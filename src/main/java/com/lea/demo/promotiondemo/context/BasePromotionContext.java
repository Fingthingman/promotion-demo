package com.lea.demo.promotiondemo.context;


import com.lea.demo.promotiondemo.input.CalculateInput;
import com.lea.demo.promotiondemo.handler.BasePromotionInput;
import com.lea.demo.promotiondemo.handler.PromotionHandler;

public abstract class BasePromotionContext<T extends BasePromotionInput> {
     /**
      * 下个节点Context
      */
     private BasePromotionContext next;
     /**
      * 对应处理器
      */
     private PromotionHandler<T> promotionHandler;

     /**
      * 判断是否执行该节点,主要处理业务互斥
      * @param input
      * @return
      */
     abstract Boolean support(CalculateInput input);

     /**
      * 组装处理器传入参数
      * @param input
      * @return
      */
     abstract T assembleCalculateParam(CalculateInput input);







}
