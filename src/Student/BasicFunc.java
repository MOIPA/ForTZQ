package Student;

public class BasicFunc {
    public static void main(String[] args) {

        // int String long float

        int a = 1;
        // static 方法调用的方法也是static
        sayHi();

        Car car = new Car();
        String name = "benz";
        //String int 等基础类型都是浅拷贝
        car.setCarName(name);
        int num = 10;
        changeNum(num);
        System.out.println(num);

        int[] array = {10, 2, 3};
        int[] arr = new int[10];
        System.out.println("def:"+arr[0]);
        changeArray(array);
        System.out.println(array[0]);

        changeObj(car);
        System.out.println(car.getCarName());
    }

    public static void sayHi(){
        System.out.println("hi");
    }

    public static void changeNum(int num){
        num=3;
    }

    public static void changeArray(int[] arr) {
        arr[0]=1;
    }

    public static void changeObj(Car car) {
        car.setCarName("changed car name");
    }

}

class Car{

    private String carName;

    public String getCarName(){
        return this.carName;
    }

    public void setCarName(String name) {
        this.carName = name;
    }

}
