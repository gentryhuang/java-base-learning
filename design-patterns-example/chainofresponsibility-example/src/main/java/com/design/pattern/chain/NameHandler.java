package com.design.pattern.chain;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.ObjectUtils;

/**
 * NameHandler 用户名处理器
 *
 * @author shunhua
 * @date 2019-10-04
 */
@Slf4j
public class NameHandler extends Handler {

    /**
     * 校验用户名
     * @param user
     */
    @Override
    protected void handle(User user) {
        if(StringUtils.isNotBlank(user.getName())){
            log.info("用户名符合要求");
            // 如果有下一个校验器就继续执行，注意这个链的顺序是由客户端决定的
            if(!ObjectUtils.isEmpty(super.handler)){
                super.handler.handle(user);
                return;
            }else {
                log.info("完成注册");
            }
            return;
        }
        log.info("用户名校验不通过，结束校验");
    }
}