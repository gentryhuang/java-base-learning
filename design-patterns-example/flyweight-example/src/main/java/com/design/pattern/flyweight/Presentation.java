package com.design.pattern.flyweight;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * Presentation  报告类
 *
 * @author shunhua
 * @date 2019-09-23
 */
@Data
@Slf4j
public class Presentation {
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
    public Presentation(String department){
        this.department = department;
    }

    /**
     * 报告内容
     */
    public void report() {
      log.info(content);
    }
}