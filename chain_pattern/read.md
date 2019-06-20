# 职责链模式
使多个对象都有机会处理请求，从而避免请求的发送者和接受者之间的耦合关系，将这个对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止
* 使接受者和发送者都没有对方的明确信息，且链中的对象自己并不知道链的结构。结果是职责链可简化对象的相互连接，它们仅需要保持一个指向其后继者的引用，而不管保持它所有的候选接受者的引用，这就大大降低了耦合度