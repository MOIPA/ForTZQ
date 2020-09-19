package Student;

public class Student {
    String name = "";
    private int age = 0;

    public void printInfo(){
        System.out.println("名字："+name+"  年龄："+age);
    }

    public void setAge(int age){
        if (age<0){
            System.out.println("输入的年龄负的 不行");
        }
        else {
            this.age = age;
        }
    }

}
