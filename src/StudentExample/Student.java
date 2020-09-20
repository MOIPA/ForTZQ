package StudentExample;

/**
 * 学生类
 */
public class Student {

    // 在软件工程课里，类的属性就得是private 不然不符合设计规则
    private String name = "";
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
}
