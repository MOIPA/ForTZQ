package HelloWorld;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("hello world!\n");

//        SaySomeThing saySomeThing = new SaySomeThing();
//        saySomeThing.sayName();
//        SaySomeThing saySomeThing2 = new SaySomeThing();
//        saySomeThing2.sayName();
//        SaySomeThing.staticMethod();

        ShopCart cartOne = new ShopCart();
        ShopCart cartTwo = new ShopCart();
        ShopCart cartThree = new ShopCart();

        cartOne.totalMoney=100;
        cartTwo.totalMoney=200;
        cartThree.totalMoney=300;

        cartOne.printTotalMoney();
        cartTwo.printTotalMoney();
        cartThree.printTotalMoney();

        int totalMoney = cartOne.getTotalMoney();

    }

    public static void test() {
        System.out.print("obj");
    }
}
class SaySomeThing {

    private int val = 0;

    public void sayName() {
        System.out.print("name\n");
    }

    public static void staticMethod() {
        System.out.print("i am static!");
    }

}

/**
 * 购物车模板
 * @totalMoney: 全部价格
 * @totalItem: 全部商品数量
 */
class ShopCart {
    static int totalMoney = 0;
    int totalItems = 0;

    // 打印总价
    public void printTotalMoney(){
        System.out.println("总价格是："+ totalMoney);
    }

    public int getTotalMoney(){
        return totalMoney;
    }

    // 打印购物车是几个轮子的
    public static void printInfo(){
        System.out.println("四个轮子");
    }
}