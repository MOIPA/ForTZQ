package StudentExample;

public class MyMainClass {
    public static void main(String[] args) {

        // 通过new 生成一个学生类的实例化对象
        Student tzq = new Student();
        Student tr = new Student();

        // 设置两个对象的属性
        tr.setName("唐锐");
        tzq.setName("汤子晴");
        tzq.setAge(-1000);

        // 调用两个对象的方法
        tr.printInfo();
        tzq.printInfo();
    }
    // 作业测试 00
}
