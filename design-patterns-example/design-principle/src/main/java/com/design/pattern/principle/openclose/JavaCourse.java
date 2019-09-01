package com.design.pattern.principle.openclose;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * JavaCourse
 *
 * @author shunhua
 * @date 2019-09-01
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class JavaCourse implements ICourse {
    /**
     * 课程id
     */
    private Integer id;
    /**
     * 课程名称
     */
    private String name;
    /**
     * 课程价格
     */
    private Double price;

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}