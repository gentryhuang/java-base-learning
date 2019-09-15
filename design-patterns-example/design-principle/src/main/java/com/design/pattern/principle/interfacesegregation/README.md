# 接口隔离原则
## 定义
  用多个专门的接口，而不使用单一的总接口，客户端不应该依赖它不需要的接口。
## 注意点
 - 一个类对一个类的依赖应该建立在最小的接口上（这里的类是泛指，也代表接口）。
 - 建立单一接口，不要建立庞大臃肿的接口
 - 尽量细化接口，接口中的方法尽量少
 - 注意适度原则，一定要适度，虽然接口中的方法尽量少，但是也要有限度。
## 优点
  符合我们常说的高内聚低耦合的设计思想，从而使得类具有很好的可读性、可扩展性和可维护性。
## 和单一职责原则比较
   单一职责原则指的是类、接口和方法的职责是单一的，强调的是职责，如果职责是单一的那么在类或者接口中具有多个
   方法都是可以的，因为它们都是一类的，比如叫声，不同的动物有不同的叫。接口隔离原则注重地是对接口依赖的隔离。
## 简单需求说明
  使用统一的接口定义多个功能的方法，但是有的实现不一定会全部用到，最好是将这个统一的接口根据不同的维度进行拆分成多个接口，实现根据
  需要进行接口的实现。   

## coding

### 接口隔离原则反例

**接口**
```java
public interface IAnimalAction {
    void eat();
    void fly();
    void swim();
}
```
**狗实现类**
```java
public class DogCaseOne implements IAnimalAction{

    @Override
    public void eat() {

    }

    /**
     * 注：这里是空方法，狗不会飞，所以明显设计的不合理，最好不要有太多的空方法
     */
    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}
```
**鸟实现类**
```java
public class LarkCaseOne implements IAnimalAction{
    @Override
    public void eat() {

    }

    @Override
    public void fly() {

    }

    /**
     * 很明显，百灵鸟不会游泳，此处为空方法，设计不合理
     */
    @Override
    public void swim() {

    }
}
```
### 接口隔离原则正例

**吃东西接口**
```java
public interface IEat{
    /**
    * 吃东西
    */
    void eat();
}
```

**飞翔接口**
```java
public interface IFly{
    /**
    * 飞翔
    */
    void fly();
}
```
**游泳接口**
```java
public interface ISwim{
    /**
    * 游泳
    */
    void swim();
}
```

**狗实现类**
```java
/**
 * 狗只用实现 吃和游泳方法即可
 */
@Slf4j
public class DogCaseTwo implements IEat,ISwim{
    @Override
    public void eat() {
      log.info("狗吃东西!");
    }

    @Override
    public void swim() {
      log.info("狗游泳");
    }
}
```

**鸟实现类**
```java
/**
 * 鸟实现 吃和飞方法即可
 */
@Slf4j
public class LarkCaseTwo implements IEat,IFly{
    @Override
    public void eat() {
      log.info("鸟吃东西");
    }

    @Override
    public void fly() {
      log.info("鸟飞翔");
    }
}
```