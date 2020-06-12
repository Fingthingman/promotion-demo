package com.lea.demo.promotiondemo;


import com.lea.demo.promotiondemo.input.CalculateInput;
import com.lea.demo.promotiondemo.pipeline.BussinessEnum;
import com.lea.demo.promotiondemo.pipeline.PromotionPipeline;
import com.lea.demo.promotiondemo.pipeline.PromotionPipelineFactory;

public class Client {


    public static void run(CalculateInput input) {
        BussinessEnum bussinessEnum = (BussinessEnum) input.getExtendParam().get("bussiness");
        PromotionPipeline promotionPipeline = PromotionPipelineFactory.getPromotionPipeline(bussinessEnum);

    }
}
