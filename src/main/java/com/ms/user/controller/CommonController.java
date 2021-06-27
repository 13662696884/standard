package com.ms.user.controller;

import com.ms.user.constant.CommonConstant;
import com.ms.user.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 * @Description:
 * @date 2021/6/25 0025
 */
@Controller
@RequestMapping(CommonConstant.COMMON_PATH)
public class CommonController {

    @Autowired
    private CommonService commonService;

    @RequestMapping(CommonConstant.SEND_MESSAGE_PATH)
    public void sendMessage(String mobile) {
        commonService.sendMessage(mobile);
    }
}
