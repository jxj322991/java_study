<!--
 * @Description:
 * @Author: jinxiaojian
 * @Email: jinxiaojian@youxin.com
 * @LastEditors: 靳肖健
 * @Date: 2019-03-31 22:32:09
 * @LastEditTime: 2019-05-13 15:38:25
 -->
### java 第 4 讲 类、包和接口
```
类（class）是组成 Java 程序的基本要素。
在接口中定义的方法具有 public, abstract 的特点（Java8 以前）。
在接口中定义的常量具有 public, static, final 的属性。
接口类型是引用类型。
抽象方法在子类中必须被实现，否则子类仍然是 abstract 的。
final 所修饰的变量，是只读量。
如果一个类被 abstract 所修饰，说明这个类不能被实例化。
static 变量可以表示全局变量。
使用 setter 及 getter 是一种好的编程习惯。
Java 编译器自动导入包 java.lang.\*。
如果一个方法的形式参数定义的是父类对象，那么调用这个方法时，可以使用子类对象作为实际参数。
子类对象可以被视为其父类的一个对象。
在构造方法中，使用 super()时，必须放在第一句。
在覆盖父类的方法的同时，使用 super 可以利用已定义好的父类的方法。
父类的非私有方法可以被子类自动继承。
所有的类都是通过直接或间接地继承 java.lang.Object 得到的。
继承可以实现代码重用，提高开发效率和可维护性。
一个类只能有一个直接父类。
类（class）是组成 Java 程序的基本要素。
类将变量与函数封装到一个类中。
方法（method）是类的功能，是用函数来表示的。
如果没有定义任何构造方法，系统会自动产生一个构造方法。
new 表示新建并初始化一个对象。
方法重载是多态（polymorphism）的一种方式。
Java 中的继承是通过 extends 关键字来实现的。
子类也可以重新定义与父类同名的方法，实现对父类方法的覆盖(Override)。
子类在构造方法中，可以用 super 来调用父类的构造方法。
将字段用 private 修饰，从而更好地将信息进行封装和隐藏。
一个字段被 static final 两个修饰符所限定时，它可以表示常量。
在类的声明中用 implements 子句来表示一个类使用某个接口。
一个文件中最多只能有一个 package 语句。
构造方法（constructor )与类名同名。
如果没有 extends 子句，则该类默认为 java.lang.Object 的子类。
包及子包的定义，实际上是为了解决名字空间、名字冲突。
同一包中的各个类，默认情况下可互相访问。
类的访问控制符或者为 public，或者默认。
在定义 final 局部变量时，也必须且只能赋值一次。
enum 表示枚举。
如果没有extends子句，则该类默认为java.lang.Object的子类。
```
