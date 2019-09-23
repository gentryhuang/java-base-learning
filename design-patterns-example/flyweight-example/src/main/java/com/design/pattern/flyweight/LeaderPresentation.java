package com.design.pattern.flyweight;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * LeaderPresentation
 *
 * @author shunhua
 * @date 2019-09-23
 */
@Data
@Slf4j
public class LeaderPresentation extends Presentation {
    /**
     * 报告相关部门
     */
    private String department;
    /**
     * 汇报内容
     */
    private String content;

    /**
     * 通过外部状态属性进行构造
     * @param department
     */
    public LeaderPresentation(String department){
        this.department = department;
    }

    /**
     * 报告内容
     */
    @Override
    public void report() {
      log.info(content);
    }
}