package ds.list;

public class MyArrayList implements IMyArrayList {

    private Object[] arr = new Object[5];
    private int interval = 10;

    // 第几个可以存放数据
    private int posi = 0;

    @Override
    public void add(Object obj) {

        // 如果原来的数组不够了 扩容原来的数组，新建一个数组，大小在原来的数组之上，把老数组的内容复制到新数组，然后老数组变成新数组；
        if (posi>=arr.length){
            Object[] newArr = new Object[10 + arr.length];
            for (int i=0;i<=arr.length-1;i++){
                newArr[i] = arr[i];
            }
            arr = newArr;
        }

        arr[posi] = obj;
        posi++;
    }

    @Override
    public void update(int posi, Object obj) {
        arr[posi] = obj;
    }

    @Override
    public Object delete(int index) {
        Object temp = arr[this.posi];
        for (int i = index + 1; i <= posi-1;i++) {
            arr[i - 1] = arr[i];
        }
        posi--;
        return temp;
    }

    @Override
    public Object find(int posi) {
        return arr[posi];
    }

    public void insert(int index, Object obj) {
        for (int i = posi; i >= index + 2; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index+1] = obj;
        posi++;
    }

    public void printAllData() {
        for (int i=0;i<=posi-1;i++){
            System.out.println((int)arr[i]);
        }
    }
}
