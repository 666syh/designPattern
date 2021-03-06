### 用继承带来的麻烦：
#### 对象的继承关系是在编译时就定义好了，所以无法再运行时改变从父类继承的实现，子类的实现与它的父类有非常紧密的依赖关系，以至于父类实现中的任何变化必然会导致子类发生变化，当你需要复用子类时，如果继承下来的实现不适合解决问题，则父类必须重写或被其他更适合的类替换，这种依赖关系限制了灵活性并最终限制了复用性
---
## 合成/聚合复用规则（CARP）
* 尽量使用合成/聚合，尽量不要使用类继承
* 合成（Composition）和聚合（Aggregation）都是关联的特殊种类，聚合表示一种弱的‘拥有’关系，体现的是A对象可以包含B对象，但B对象不是A对象的一部分；合成则是一种强的‘拥有’关系，体现了严格的部分和整体的关系，部分和整体的声明周期一样。
* 比方说大雁有两个翅膀，翅膀和大雁是部分和整体的关系，并且它们的生命周期是相同的，于是大雁和翅膀就是合成关系；而大雁是群居动物，所以每只大雁都是属于一个雁群，一个雁群可以有多只大雁，所以大雁和雁群是聚合关系
* 使用合成/聚合复用规则的好处是：有助于保持每个类被封装，并被集中在单个任务上，这样类和类继承层次会保持较小规模，并且不太可能增长为不可控制的庞然大物。
---
## 桥接模式
* 将抽象部分与它的实现部分分离，使它们都可以独立地变化
* 实现系统可能有多角度分类，每一种分类都有可能变化，那么就把这种多角度分离出来让它们独立变化，减少它们之间的耦合