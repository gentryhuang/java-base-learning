# 开闭原则

## 定义
   一个软件实体如类、模块和函数应该对扩展开放，对修改关闭。 强调的是用抽象构建框架，用实现扩展细节。  
## 核心思想
   面向抽象编程，因为抽象是稳定的。  
## 理解
   不改变原先的业务逻辑，新增的功能点通过重写复用的方法进行编程。
## 优点
   提高软件系统的可复用性以及可维护性
## 简单需求说明
  软件实体ICourse，以及它的实现JavaCource实现了基本功能，如需要额外的功能可以对JavaCourse进行扩展即继承来添加，
  这样在不修改底层的ICourse和JavaCourse的前提下，做到功能的添加。即，越基层的模块影响范围越大，越高层的模块影响
  范围较小，总体实现了对扩展开放，对修改关闭，这样就可以有效解决影响范围。
## coding

### v1 基类

```text
需求：打印出原价以及课程其他信息
```

**接口**
```java
 package com.design.pattern.principle.openclose;
 
 /**
  * ICourse
  *
  * @author shunhua
  * @date 2019-09-01
  */
 public interface ICourse {
     /**
      * 获取课程id
      * @return
      */
     Integer getId();
     /**
      * 获取课程名称
      * @return
      */
     String getName();
     /**
      * 获取课程价格
      * @return
      */
     Double getPrice();
 }
```
**实体类 **
```java
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
```
**应用**
```java
   package com.design.pattern.principle;
   
   import com.design.pattern.principle.openclose.ICourse;
   import com.design.pattern.principle.openclose.JavaCourse;
   import com.design.pattern.principle.openclose.JavaDiscountCourse;
   import lombok.extern.slf4j.Slf4j;
   import org.junit.Test;
   
   /**
    * OpencloseTest
    *
    * @author shunhua
    * @date 2019-09-01
    */
   @Slf4j
   public class OpencloseTest {
   
       @Test
       public void testBase(){
           ICourse javaCourse = new JavaCourse(100,"Java从入门到放弃",200d);
           log.info(String.format("课程id: %d,课程名: %s, 课程价格：%f",
                   javaCourse.getId(),
                   javaCourse.getName(),
                   javaCourse.getPrice())
           );
       }
   }
```

### v2 

```text
需求：打印出原价和折扣后的价格以及课程其他信息（接口不应该随意发生变化，面向接口编程）
```

**接口**
```java
 package com.design.pattern.principle.openclose;
 
 /**
  * ICourse
  *
  * @author shunhua
  * @date 2019-09-01
  */
 public interface ICourse {
     /**
      * 获取课程id
      * @return
      */
     Integer getId();
     /**
      * 获取课程名称
      * @return
      */
     String getName();
     /**
      * 获取课程价格
      * @return
      */
     Double getPrice();
 }
```
**实体类 **
```java
package com.design.pattern.principle.openclose;

/**
 * JavaDiscountCourse
 *
 * @author shunhua
 * @date 2019-09-01
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    /**
     * 获取折扣价
     * @return
     */
    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }

    /**
     * 获取原价
     * @return
     */
    public Double getOriginPrice(){
        return super.getPrice();
    }

}
```
**应用**
```java
  package com.design.pattern.principle;
  
  import com.design.pattern.principle.openclose.ICourse;
  import com.design.pattern.principle.openclose.JavaCourse;
  import com.design.pattern.principle.openclose.JavaDiscountCourse;
  import lombok.extern.slf4j.Slf4j;
  import org.junit.Test;
  
  /**
   * OpencloseTest
   *
   * @author shunhua
   * @date 2019-09-01
   */
  @Slf4j
  public class OpencloseTest {
  
      @Test
      public void testBase(){
          ICourse javaCourse = new JavaCourse(100,"Java从入门到放弃",200d);
          log.info(String.format("课程id: %d,课程名: %s, 课程价格：%f",
                  javaCourse.getId(),
                  javaCourse.getName(),
                  javaCourse.getPrice())
          );
      }
  
      @Test
      public void testEx(){
          ICourse javaCource = new JavaDiscountCourse(100,"java从入门到放弃",200d);
         log.info(String.format("课程id: %d,课程名: %s, 课程原价：%f，课程折扣价格：%f",
                 javaCource.getId(),
                 javaCource.getName(),
                 ((JavaDiscountCourse) javaCource).getOriginPrice(),
                 javaCource.getPrice())
         );
      }
  
  }
```
