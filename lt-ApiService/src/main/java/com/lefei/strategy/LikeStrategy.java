package com.lefei.strategy;

/**
 * 点赞策略
 *
 */
public interface LikeStrategy {

    /**
     * 点赞
     *
     * @param typeId 类型id
     */
    void like(Integer typeId);
}
