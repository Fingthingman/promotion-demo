package com.lea.demo.promotiondemo.pipeline;

import java.util.HashMap;
import java.util.Map;

public class PromotionPipelineFactory {

    static Map<BussinessEnum,PromotionPipeline> containers = new HashMap<>();

    public static PromotionPipeline getPromotionPipeline(BussinessEnum bussinessEnum){
        if(bussinessEnum == null){
            bussinessEnum = BussinessEnum.DEFAULT;
        }
        return containers.get(bussinessEnum);
    }

}
