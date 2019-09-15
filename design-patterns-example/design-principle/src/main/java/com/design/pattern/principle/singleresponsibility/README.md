# 单一职责原则

## 定义
  不要存在多于一个导致类变更的原因。体现在一个类/接口/方法只负责一项职责。
## 优点
  降低类的复杂度、提高类的可读性，提高系统的可维护性，降低变更引起的风险。
## 详解
  在类的级别上，可以定义不同的类实现不同的功能，在接口级别上，可以根据功能抽象出不同的接口，然后按需要实现一个或多个接口。方法级别上，可以做到不同的方法实现不同的操作。
## 要点讲解
```text
1. 实际应用中，类不采用单一职责，接口和方法采用单一职责。
2. 定义：单一职责规定 一个类，接口或者方法，只有一个变化的原因
3. 优点：降低类的复杂性，提高可读性，维护时风险降低
4. 实际应用，受依赖，组合，聚合这些关系影响，同时受控于项目规模，项目周期，技术人员水平，对进度把控等影响。应适当的应用单一职责原则
```
## 简单需求说明
  完成不同功能，并且使设计模块具有可读性和可维护性。可以使用不同的类或接口或方法去完成某一类功能，这样就显得单一，具有针对性。
  
### 类的单一职责原则

**实体类1**
```java
package com.design.pattern.principle.singleresponsibility;

import lombok.extern.slf4j.Slf4j;

/**
 * WalkBird
 *
 * @author shunhua
 * @date 2019-09-02
 */
@Slf4j
public class WalkBird {

    public void moveMode(String birdName){
        log.info(birdName + "陆地奔跑");
    }
}
```  
**实体类2**
```java
package com.design.pattern.principle.singleresponsibility;

import lombok.extern.slf4j.Slf4j;

/**
 * FlyBird
 *
 * @author shunhua
 * @date 2019-09-02
 */
@Slf4j
public class FlyBird {

    public void moveMode(String birdName){
        log.info(birdName + "用翅膀飞");
    }
}
``` 
**应用**
```java
public class Client {
    public static void main(String[] args) {
        WalkBird walkBird = new WalkBird();
        walkBird.birdMove("鸵鸟");

        FlyBird flyBird = new FlyBird();
        flyBird.birdMove("大雁");
    }
}
``` 

### 接口的单一职责

**接口1**
```java
/**
 * 这个接口和获取内容的接口有先后顺序，只有开始学习，才能获取内容，如果退出学习，就不能在获取内容了，
 * 由于职责不同，所以设计两个接口符合单一职责原则
 */
public interface IcourseAction {
    void beginStudy();
    void quitStudy();
}
```

**接口2**
```java
/**
 * 注，本接口主要是获取课程的内容
 */
public interface IcourseContent {
    String getCourseText();//获取课程文本内容
    byte[] getCourseVideo();//获取课程的视频
}
```

**实体类**
```java
@Slf4j
public class Course implements IcourseAction,IcourseContent{
    @Override
    public void beginStudy() {
      log.info("开始学习!");
    }

    @Override
    public void quitStudy() {
       log.info("学习完成！");
    }

    @Override
    public String getCourseText() {
        return "Java 资料";
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }
}
```

### 方法的单一职责

```java
public class Method {
    /**
     * 单一职责原则，修改用户的名称
     * @return
     */
    public String updateUserName(){
        return "";
    }

    /**
     * 单一职责原则,修改用户的密码
     * @return
     */
    public String updateUserPassWord(){
        return "";
    }

    /**
     * 不符合单一职责
     * @return
     */
    public String updateUserInfo(String userId,String gender){
        return " ";
    }
}
```

