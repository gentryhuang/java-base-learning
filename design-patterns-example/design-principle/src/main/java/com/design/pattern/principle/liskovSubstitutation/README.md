# 里氏替换原则

## 定义
 如果对每一个类型为T1的对象o1，都有类型为T2的对象o2，使得以T1定义的所有程序P在所有的对象o1都替换成o2时，程序P的行为没有发生变化，那么类型T2是类型T1的子类型。
## 定义扩展
 一个软件实体如果适用一个父类的话，那一定适用于其子类，所有引用父类的地方必须能透明地使用其子类的对象，子类对象能够替换父类对象，而程序逻辑不变。（反对子类重写父类）
## 特点
```text
◆引申意义：子类可以扩展父类的功能，但不能改变父类原有的功能。
◆含义1：子类可以实现父类的抽象方法，但不能覆盖父类的非抽象方法。
◆含义2：子类中可以增加自己特有的方法。
◆含义3：当子类的方法重载父类的方法时，方法的前置条件（即方法的输入/入参）要比父类方法的输入参数更宽松。（入参宽松）
◆含义4：当子类的方法实现父类的方法时（重写/重载或实现抽象方法），方法的后置条件（即方法的输出/返回值）要比父类更严格或相等。（出参严谨）

（前两条，约定子类最好不要重写父类的方法，如果一定要重写的话，可以使用组合聚合等方法实现）

（后两条,约定了子啊重载或实现父类方法的条件）
```
## 优点
 - 约束了继承泛滥，很多非子类父类关系的类，没必要使用继承关系
 - 加强程序的可维护性，降低需求变更时引起的风险

 
## coding
 
### 里氏替换原则

#### 继承关系判别（是否是真正意义的继承）

```text
子类行为规则应与父类行为规则一致，如果子类达不到这一点，则会违背里氏替换原则，违背里氏替换原则会怎样？继承逻辑混乱，代码不便于维护
```

#### 入参控制

```text
重载的时候入参要更加宽松，可以不引起逻辑混乱
```

**父类**
```java
import java.util.HashMap;

public class Base {
    public void method(HashMap hashMap){
        System.out.println("执行父类HashMap方法");
    }
}
```

**子类**
```java
import java.util.HashMap;
import java.util.Map;

public class Child extends  Base{
    
    //    @Override
    //    public void method(HashMap hashMap) {
    //        System.out.println("执行子类的HashMap方法");
    //    }

    /**
     * 子类重载
     * 重载的时候入参 Map比 Hashmap宽松，此时执行的时候会执行父类，不执行重载的类
     * @param Map
     */
    public void method(Map Map) {
        System.out.println("执行子类Map方法");
    }
}
```

#### 出参控制 

```text
子类的出参如果包含父类，会直接报错
```

**父类**
```java
package com.design.pattern.principle.liskovSubstitutation.outputmethod;

import java.util.Map;

/**
 * Base
 *
 * @author shunhua
 * @date 2019-09-15
 */
public abstract class Base {
    public abstract Map method();
}
```

**子类**
```java
package com.design.pattern.principle.liskovSubstitutation.outputmethod;

import java.util.HashMap;
import java.util.Map;

/**
 * Child
 *
 * @author shunhua
 * @date 2019-09-15
 */
public class Child extends Base {

    /**
     * 子类的出参如果包含父类，会直接报错。
     * @return
     */
   /* @Override
    public Object method() {
        return null;
    }*/

    /**
     * 父类的出参包含子类的出参是可以的
     * @return
     */
   @Override
   public HashMap method(){
       return new HashMap(2);
   }
}
```



