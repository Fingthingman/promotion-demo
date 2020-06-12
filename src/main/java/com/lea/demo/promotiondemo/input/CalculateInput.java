package com.lea.demo.promotiondemo.input;

import com.lea.demo.promotiondemo.ActivityEnum;

import java.util.List;
import java.util.Map;

/**
 * 计算价格输入
 */
public class CalculateInput {

    /**
     * 用户Id
     */
    private Long userId;
    /**
     * 平台Id
     */
    private Long platformId;
    /**
     * 商品计算信息 以店铺区分
     */
    private List<ShopInfo> shopInfos;
    /**
     *活动计算是否回溯
     */
    private Map<ActivityEnum,Boolean> recallMap;
    /**
     * 扩展参数
     */
    private Map<String,Object> extendParam;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPlatformId() {
        return platformId;
    }

    public void setPlatformId(Long platformId) {
        this.platformId = platformId;
    }

    public List<ShopInfo> getShopInfos() {
        return shopInfos;
    }

    public void setShopInfos(List<ShopInfo> shopInfos) {
        this.shopInfos = shopInfos;
    }

    public Map<String, Object> getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(Map<String, Object> extendParam) {
        this.extendParam = extendParam;
    }

    public Map<ActivityEnum, Boolean> getRecallMap() {
        return recallMap;
    }

    public void setRecallMap(Map<ActivityEnum, Boolean> recallMap) {
        this.recallMap = recallMap;
    }
}
