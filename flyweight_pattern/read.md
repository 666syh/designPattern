# 享元模式
* 引出：大部分网站结构相似度很高，而且都不是高访问量的网站，如果分成多个虚拟空间来处理，相当于一个相同网站的实例对象很多，这是造成服务器的大量资源浪费，如果整合到一个网站中，共享其相关代码和数据，那么对于硬盘、内存、CPU、数据库空间等服务器资源都可以达成共享，减少服务器资源，而对于代码，由于是一份实例，维护和扩展都更加容易
* 享元模式：运用共享技术有效地支持大量细粒度的对象
* 在享元对象内部并且不随环境改变而改变的共享部分，可以成为是享元对象的内部状态，而随环境改变而改变的，不可以共享的状态就是外部状态了
* 享元模式可以避免大量非常相似类我的开销。在程序设计中，有时需要生成大量细粒度的类实例来表示数据。如果发现这些实例除了几个参数外基本都是相同的，有时就能够受大幅度地减少需要实例化的类的数量。如果能把这些参数类实例的外边，在方法调用时架构它们传递进来，就可以通过共享大幅度地减少单个实例的数目
* 享元模式执行时需要的状态是由内部的也可能有外部的，内部状态存储于具体享元类对象中，而外部对象则应该考虑由客户端对象存储或计算，当调用享元类对象操作时，将该状态传递给它