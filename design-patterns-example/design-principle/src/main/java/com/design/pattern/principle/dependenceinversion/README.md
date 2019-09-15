# 依赖倒置原则
## 定义
  高层模块不应该依赖低层模块，二者都应该依赖其抽象。
## 优点
  可以减少类间的耦合性、提高系统稳定性，增强代码可读性和可维护性，可降低修改程序造成的风险。
## 细节描述
  抽象不应该依赖细节，细节应该依赖抽象。针对接口编程而不要针对实现编程。  
## 简单需求说明
  某同学想要学习某一课程，最简单的方式直接在Person中编写一个方法即可，但是如果以后想要学习其他课程就
  需要修改Person类。为了解耦，我们可以把课程抽象出去，高层对底层的依赖，这样Person依赖的就是抽象，我
  们针对接口编程，而不是针对实现编程。
## coding

### 非面向抽象编程

```text
缺点：应用依赖具体的实现，对于后续需求变更更加不适用
```  
**实体类**
```java
package com.design.pattern.principle.dependenceinversion;

import lombok.extern.slf4j.Slf4j;

/**
 * Person
 *
 * @author shunhua
 * @date 2019-09-02
 */
@Slf4j
public class Person {

    public void learnJavaCourse(){
        log.info("学习Java课程");
    }
    
    public void learnPythonCourse(){
        log.info("学习Python课程");
    }
}
```
**应用**
```java
package com.design.pattern.principle;

import com.design.pattern.principle.dependenceinversion.PythonCourse;
import com.design.pattern.principle.dependenceinversion.JavaCourse;
import com.design.pattern.principle.dependenceinversion.Person;
import org.junit.Test;

/**
 * DependeceinversionTest
 *
 * @author shunhua
 * @date 2019-09-02
 */
public class DependeceinversionTest {

    @Test
    public void test(){
        Person person = new Person();
        person.studyJava();
        person.studyPython();
    }
}
```
### 面向接口编程

```text
这里使用接口方法传参的方式
```

**课程接口**
```java
package com.design.pattern.principle.dependenceinversion;

/**
 * ICourse
 *
 * @author shunhua
 * @date 2019-09-02
 */
public interface ICourse {
    /**
     * 学习课程
     */
    void learnCourse();
}

```

**Java课程**
```java
package com.design.pattern.principle.dependenceinversion;

import lombok.extern.slf4j.Slf4j;

/**
 * JavaCourse
 *
 * @author shunhua
 * @date 2019-09-02
 */
@Slf4j
public class JavaCourse implements ICourse {

    @Override
    public void learnCourse() {
        log.info("gentryhuang is learning java");
    }
}
```

**Python课程**
```java
package com.design.pattern.principle.dependenceinversion;

import lombok.extern.slf4j.Slf4j;

/**
 * PythonCourse
 *
 * @author shunhua
 * @date 2019-09-02
 */
@Slf4j
public class PythonCourse implements ICourse {

    @Override
    public void learnCourse() {
        log.info("gentryhuang is learning python");
    }
}
```
**实体**
```java
package com.design.pattern.principle.dependenceinversion;

import lombok.extern.slf4j.Slf4j;

/**
 * Person
 *
 * @author shunhua
 * @date 2019-09-02
 */
@Slf4j
public class Person {

    public void learnCource(ICourse course){
        course.learnCourse();
    }
}
```

**应用**
```java
package com.design.pattern.principle;

import com.design.pattern.principle.dependenceinversion.PythonCourse;
import com.design.pattern.principle.dependenceinversion.JavaCourse;
import com.design.pattern.principle.dependenceinversion.Person;
import org.junit.Test;

/**
 * DependeceinversionTest
 *
 * @author shunhua
 * @date 2019-09-02
 */
public class DependeceinversionTest {
   @Test
    public void test(){
       Person person = new Person();
       person.learnCource(new JavaCourse());
       person.learnCource(new PythonCourse());
   }
}
```