package com.ms.user.service.impl;

import com.ms.user.constant.CommonConstant;
import com.ms.user.service.CommonService;
import com.ms.user.util.MessageUtil;
import com.ms.user.util.StringUtil;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 * @Description:
 * @date 2021/6/25 0025
 */
@Service
public class CommonServiceImpl implements CommonService {

    @Override
    public Boolean sendMessage(String mobile) {
        String code = StringUtil.getRandomNumber();
        String message = CommonConstant.MESSAGE.replace("{}", code);
        return MessageUtil.send(mobile, message);
    }
}
