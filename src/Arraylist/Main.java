package Arraylist;


public class Main {
    public static void main(String[] args ){
        Arraylist arraylist=new Arraylist();
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(4);
        arraylist.add(5);

        arraylist.delete(2);
        arraylist.insert(1,10);
//        arraylist.find(3);

        arraylist.print();
    }
}
