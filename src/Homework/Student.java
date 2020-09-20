package Homework;

public class Student {
    private String name="";
    private int age=0;

    // 入参类型是String
    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getName(){
        return name;
    }

    //出参类型是int
    public int getAge(){
        return age;
    }
    public void printInfo(){
        System.out.println("名字："+name+ "年龄："+age );
    }

}
