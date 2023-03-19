import java.util.Random;

public class Array {
    private int[] arr;
    private int nElems;

    public Array(int max){
        arr = new int[max];
        nElems = 0;
    }

    public int[] getArr(){
        return  arr;
    }

    public int getNElems(){
        return nElems;
    }
    public void insert(){
        Random n = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = n.nextInt(99 - 1);
            nElems++;
        }
    }

    public void display(){
        for (int i: arr){
            System.out.println(i);
        }
    }


}
