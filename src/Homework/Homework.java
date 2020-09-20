package Homework;



public class Homework {

    //TODO 完成学生类 ， 使用学生类打印信息

    // 1. 新建学生类
    // 2. 学生类：私有的数据：名字，年龄， 其他类操作只能通过类的set，get方法
    // 3. 在主类里面 使用学生类
    public static void main(String[] args){

        // 直接使用类的话，会自动在本级别目录下找有没有这个类，如果使用了这个目录外的类 要用import才行
        Student tzq=new Student();
        Student tr=new Student();

        tzq.setName("汤子晴");
        tr.setName("唐锐");
        tzq.setAge(23);
        tr.setAge(23);

        tzq.printInfo();
        tr.printInfo();
    }
}
