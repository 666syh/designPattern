# 访问者模式
* 表示一个作用于某对象结构中的各元素的操作，它使你可以在不改变各元素的类的前提下定义作用于这些元素的新操作
* 访问者模式适用于数据结构相对稳定的系统，它把数据结构和作用于结构上的操作之间的耦合度解开，使得操作集合可以相对自由地演化
* 访问者模式的目的是要把处理从数据结构分离出来。很多系统可以按照算法和数据结构分开，如果这样的系统有比较稳定的数据结构，又有易于变化的算法的话，使用访问者模式就是比较合适的，因为访问者模式使得算法操作的增加变得容易。反之，如果这样的系统的数据结构对象易于变化，经常要有新的数据对象增加进来，就不适合使用访问者模式
* 访问者模式的优点就是增加新的操作很容易，因为增加新的操作就意味着要增加一个新的访问者，访问者模式将有关行为集中起来到一个访问对象中