# 迪米特法则（最少知道原则）

## 定义
 一个对象应该对其他对象保持最少的了解（比如包的权限，修饰的关键字）。尽量降低类与类之间的耦合。
## 优点
 降低类之间的耦合。
## 强调
 只关心出现在成员变量、方法的入参和出参中的类，不关心方法体内部的类。
## 简单需求说明
 公司老板想了解某个业务组的项目情况，老板直接找到TeamLeader，不需要关心项目组其他成员。而TeamLeader需要让组内
 某个成员进行整理资料，然交给自己，自己再交给老板。
 
## coding
 
### 迪米特法则反例

**老板类**
```java
import java.util.ArrayList;
import java.util.List;

/**
 * 此处设计不合理，只访问朋友类（成员变量中的类，输入中出现的类，输出中出现的类）
 * 成员方法中的类不需要引入(Member)
 */
public class Boss {
    public void findMembers(){
        TeamLeader leader = new TeamLeader();
        List<Member> list = new ArrayList<Member>();
        for(int i= 0;i<10;i++){
            list.add(new Member());
        }
        leader.countMember(list);

    }
}
```

**主管类**
```java
import java.util.List;

@Slf4j
public class TeamLeader {
    public void countMember(List list){
       log.info("当前项目组的成员数："+list.size());
    }
}
```

**项目组成员类**
```java
public class Member {
    // ..
}
``` 

**应用类**
```java
public class Client{
    public static void main(String[] args){
      Boss boss = new Boss();
      boss.findMembers();
    }
}
```

### 迪米特法则正例

**老板类**
```java
package com.design.pattern.principle.demeter;

/**
 * Boss
 *
 * @author shunhua
 * @date 2019-09-03
 */
public class Boss {
    /**
     * 对Member不需要见，只关心TeamLeader
     * @param teamLeader
     */
    public void findProject(TeamLeader teamLeader){
        teamLeader.findProject();
    }
}
```

**主管类**
```java
package com.design.pattern.principle.demeter;

import lombok.extern.slf4j.Slf4j;

/**
 * TeamLeader
 *
 * @author shunhua
 * @date 2019-09-03
 */
@Slf4j
public class TeamLeader {
    /**
     * 关注Member
     */
    public void findProject(){
        Member member  = new Member();
        log.info(String.valueOf(member));
    }
}
```
**成员类**
```java
package com.design.pattern.principle.demeter;

/**
 * Member
 *
 * @author shunhua
 * @date 2019-09-03
 */
public class Member {
    // ..
}
```

**应用**
```java
package com.design.pattern.principle;

import com.design.pattern.principle.demeter.Boss;
import com.design.pattern.principle.demeter.TeamLeader;
import org.junit.Test;

/**
 * DemeterTest
 *
 * @author shunhua
 * @date 2019-09-03
 */
public class DemeterTest {

    @Test
    public void test(){
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.findProject(teamLeader);
    }

}
```
 
 
