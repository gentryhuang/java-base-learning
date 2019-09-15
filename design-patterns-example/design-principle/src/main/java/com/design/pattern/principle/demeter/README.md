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
 
 
 