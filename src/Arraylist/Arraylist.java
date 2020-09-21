package Arraylist;

public class Arraylist {
    private Object[] obj=new Object[1024]; // this.obj 如果不new 初始化对象数组实例，obj就是null 空值
    private int posi=0;

    public void add(Object obj){

        this.obj[posi] = obj;
        posi++;
    }
    public void delete(int index){
        for(int i = index + 1;i<=posi-1;i++){
            obj[i-1]=obj[i];
        }
        posi--;
    }
    public void update(int index,Object obj){
        this.obj[index]=obj;
    }
    public Object find(int posi){
        return this.obj[posi];
    }
    public void insert(int index,Object obj){
        for(int i =posi;i>index;i--){
            this.obj[i+1]=this.obj[i];
        }
        this.obj[index+1]=obj;
        posi++;
    }
    public void print(){
        for(int i=0;i<=posi-1;i++){
            System.out.println(obj[i]);
        }
    }
}
