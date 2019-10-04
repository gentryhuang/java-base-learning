package com.design.pattern.chain;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.ObjectUtils;

/**
 * EmailHandler 邮箱校验器
 *
 * @author shunhua
 * @date 2019-10-04
 */
@Slf4j
public class EmailHandler extends  Handler{

    @Override
    protected void handle(User user) {
        if(StringUtils.isNotBlank(user.getEmail())){
           log.info("邮箱符合要求");
           if(!ObjectUtils.isEmpty(super.handler)){
               super.handler.handle(user);
               return;
           }else {
               log.info("完成注册");
           }
           return;
        }
        log.info("邮箱验证不通过，验证结束");
    }
}