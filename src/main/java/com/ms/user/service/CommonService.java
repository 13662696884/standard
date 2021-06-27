package com.ms.user.service;

/**
 * @author Administrator
 * @Description:
 * @date 2021/6/25 0025
 */
public interface CommonService {

    /**
     * 发送短信
     * @param mobile
     * @return Boolean
     */
    Boolean sendMessage(String mobile);
}
