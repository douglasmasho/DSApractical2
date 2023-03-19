public class Algos {
    public static void Swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] BubbleSort(int[] arr, int nElems){ //Neighbors
        for(int i = 0; i < nElems; i++){
            for(int j = 0; j < nElems - 1; j++){
                if(arr[j] > arr[j+1]) { //if element is greater than neighbor, swap them
                    Swap(j, j+1, arr);
                }
            }
        }

        return  arr;
    }

    public static int[] SelectionSort(int[] arr, int nElems){ //selecting the minimum
        for(int i = 0; i < nElems -1 ; i++){
            int max = arr[i+1];
            int maxIndex = i+1;
            for(int j = i+2; j < nElems; j++){ //find the maximum in the unsorted array
                if(arr[j] > max){
                    max = arr[j];
                    maxIndex = j;
                }
            }
            //once you find the maximum, compare with arr[i]. If it is less than arr[i], swap them.
            if(max > arr[i]){
                Swap(maxIndex, i, arr);
            }
        }

        return arr;
    }

    public static int[] InsertionSort(int[] arr, int nElems){
        for(int i = 1; i < nElems; i++){
            int temp = arr[i];
            int hole = i;

            while(hole > 0 && arr[hole-1] > temp){
                arr[hole] = arr[hole -1];
                hole--;
            }
            arr[hole] = temp;
        }
        return arr;
    }
}
