package cn.itcast.day07.demo04;

import java.util.ArrayList;

/*
数组的长度不可以发生改变。
但是ArrayList集合的长度是可以随意变化的。

对于ArrayList来说，有一个尖括号<E>代表泛型。
泛型：也就是装在集合当中的所有元素，全都是统一的什么类型。
注意：泛型只能是【引用类型】，不能是基本类型。

注意事项：
对于ArrayList<String>集合来说，直接打印list得到的不是地址值，而是【内容】，因为内部进行了toString处理
如果内容是空，得到的是空的中括号[]。
对于ArrayList<自定义类>集合来说，直接打印list或list.get(i)得到的是地址值。
 */
public class Demo02ArrayList {

    public static void main(String[] args) {
        // 创建了一个ArrayList集合，集合的名称是list，里面装的全都是String字符串类型的数据
        // 备注：从JDK 1.7+ 开始，右侧的尖括号内部可以不写内容，但是<>本身还是要写的
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list); // []

        // 向集合当中添加一些数据，需要用到add方法。
        list.add("癞疙宝");
        System.out.println(list);

        list.add("大便蛮王");
        list.add("孙笑川");
        System.out.println(list); // [癞疙宝, 大便蛮王, 孙笑川]

        // add方法有【返回值】，是【boolean】类型
        System.out.println(list.add("激光笔")); // true

//      list.add(100); // 错误写法！因为创建的时候尖括号泛型已经规定了是字符串，添加进去的元素就必须都是字符串
    }

}
