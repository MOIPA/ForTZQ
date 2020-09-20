package Student;

public class ShuzuLearn {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;

        int[] arr2 = new int[5];

        arr2[0] = arr[0];
        arr2[1] = arr[1];
        arr2[2] = arr[2];
        arr2[3] = arr[3];
        arr2[4] = 5;

        for (int i = 0; i <= 4; i++) {
            System.out.println(arr[i]);
        }
//
//        MyArr.add(1);
//        MyArr.add(2);
//        MyArr.add(3);
//        MyArr.add(4);
//        MyArr.add(5);
//
//        MyArr.get(10);
    }
}

class MyArr{

}