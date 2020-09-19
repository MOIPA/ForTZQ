package Student;

public class MyMainClass {
    public static void main(String[] args) {
        Student tzq = new Student();
        Student tr = new Student();

        tr.name = "唐锐";
        tzq.name = "汤子晴";
        tzq.setAge(-1000);

        tr.printInfo();
        tzq.printInfo();
    }
    // 作业测试 00
}
