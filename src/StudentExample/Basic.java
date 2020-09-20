package StudentExample;

/**
 * 基础学习
 */
public class Basic {

    // 主方法 入口函数 main  固定格式, args: 就是跑这个主程序的时候可以传递一些值或者参数。
    public static void main(String[] args){

        // 1. 变量  java是一个强类型语言，强类型就是每个数据都得有分类，这样的话就不会出现 数字和字符相加的情况
        // int String long double float
        // int 只能表示 -2147483648 到 2147483647 范围内的数字，超出的话就是溢出了，所以大的数字要用 long 或者 double
        float  numberOne =  11.0f;
        // 字符串 String
        // 字符： char
        String str = "hello";
        char ch = 'h';   // A: 65 B:66
        System.out.println(numberOne);
        System.out.println(str);
        System.out.println(ch);

//        float result = str*numberOne;
        float result2 = (int)ch* numberOne;

        System.out.println("A的ascall编号是："+(int)'A');

    }

}
