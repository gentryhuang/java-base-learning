package com.design.pattern.flyweight;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.ObjectUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * PresentationFactory   报告工厂
 *
 * @author shunhua
 * @date 2019-09-23
 */
@Slf4j
public class PresentationFactory {
    /**
     *  此处应用了 final修饰 引用成员变量，引用对象的内容可以修改，但是引用地址不可以修改。这里作为报告池。
     */
    private static final Map<String,Presentation> PRESENTATION_MAP = new HashMap<>(16);

    /**
     * 这里不考虑安全问题
     * @param department
     * @return
     */
    public static Presentation getPresentation(String department){
        // 先从报告池中获取
       Presentation leaderPresentation =  PRESENTATION_MAP.get(department);
       // 报告池中没有再创建一个，然后放到报告池中
       if(ObjectUtils.isEmpty(leaderPresentation)){
           leaderPresentation = new Presentation(department);
           log.info("----------- 报告池中没有需先创建----------");
           PRESENTATION_MAP.put(department,leaderPresentation);
           leaderPresentation.setContent("部门：" + department +" 汇报...");
           leaderPresentation.report();

       }
       return leaderPresentation;
    }





}