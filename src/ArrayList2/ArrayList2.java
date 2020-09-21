package ArrayList2;

public class ArrayList2 {
    private Object[] arr=new Object[1024];
    private int posi=0;

    public void add(Object obj){
        arr[posi]=obj;
        posi++;
    }
    public void delete(int index){
        for(int i=index+1;i<=posi-1;i++){
            arr[i-1]=arr[i];
        }
        posi--;
    }
    public void updata(int index,Object obj){
        arr[index]=obj;
    }
    public Object find(int index){
        return arr[index];
    }
    public void insert(int index,Object obj){
        for(int i=posi;i>index;i--){
            arr[i+1]=arr[i];
        }
        arr[index+1]=obj;
        posi++;
    }

    public void print(){
        for(int i=0;i<=posi-1;i++){
            System.out.println(arr[i]);
        }
    }
}
