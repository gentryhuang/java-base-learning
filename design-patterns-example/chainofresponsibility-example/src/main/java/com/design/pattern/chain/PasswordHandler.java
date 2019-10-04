package com.design.pattern.chain;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.ObjectUtils;

/**
 * PasswordHandler 密码验证器
 *
 * @author shunhua
 * @date 2019-10-04
 */
@Slf4j
public class PasswordHandler extends Handler {

    @Override
    protected void handle(User user) {
        if(StringUtils.isNotBlank(user.getPassword()) && user.getPassword().length() >5){
            log.info("密码符合要求");
            if(!ObjectUtils.isEmpty(super.handler)){
                super.handler.handle(user);
                return;
            }else {
                log.info("完成注册");
            }
            return;
        }
        log.info("密码验证不通过，验证结束");
    }
}