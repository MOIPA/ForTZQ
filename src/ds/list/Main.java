package ds.list;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.add(6);

        myArrayList.delete(2);
        Object o = myArrayList.find(5);
        myArrayList.insert(1,100);

        myArrayList.printAllData();
    }
}
