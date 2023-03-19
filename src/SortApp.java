import java.util.Scanner;

public class SortApp {
    public static void main(String[] args) {
        Scanner firstScanner = new Scanner(System.in);
        System.out.println("Please choose the size of the Integer Array");
        int size = Integer.parseInt(firstScanner.nextLine());
        Array array1 = new Array(size);
        array1.insert();
        System.out.println("Your array: ");
        array1.display();

        boolean showMenu = true;
        while(showMenu){
            showMenu = menu(array1);
        }
    }

    public static boolean shouldContinue(Scanner scanner){
        System.out.print("Do you want to continue? (Y/N): ");
        return (scanner.nextLine().toUpperCase().equals("Y")) ? true : false;
    }

    public static boolean menu(Array array1){
        System.out.println("What would you like to do with the integers?:");
        System.out.println("b: Sort in ascending order with Bubble Sort >");
        System.out.println("i: Sort in ascending order with Insertion Sort >");
        System.out.println("s: Sort descending order with Selection Sort >");
        System.out.println("q: Quit >");

        Scanner newScanner = new Scanner(System.in);
        switch (newScanner.nextLine()){
            case "b":
                long startTime = System.currentTimeMillis();
                int[] result = Algos.BubbleSort(array1.getArr(), array1.getNElems());
                long endTime = System.currentTimeMillis();
                long executionTime = endTime - startTime;
                for(int i: result){
                    System.out.print(i + ",");
                }
                System.out.println(" ");
                System.out.println("The execution time was: " + executionTime);
                return shouldContinue(newScanner);
            case "i":
                long startTime2 = System.currentTimeMillis();
                int[] result2 = Algos.InsertionSort(array1.getArr(), array1.getNElems());
                long endTime2 = System.currentTimeMillis();
                long executionTime2 = endTime2 - startTime2;
                for(int i: result2){
                    System.out.print(i + ",");
                }
                System.out.println(" ");
                System.out.println("The execution time was: " + executionTime2);
                return shouldContinue(newScanner);
            case "s":
                long startTime3 = System.currentTimeMillis();
                int[] result3 = Algos.SelectionSort(array1.getArr(), array1.getNElems());
                long endTime3 = System.currentTimeMillis();
                long executionTime3 = endTime3 - startTime3;
                for(int i: result3){
                    System.out.print(i + ",");
                }
                System.out.println(" ");
                System.out.println("The execution time was: " + executionTime3);
                return shouldContinue(newScanner);
            case "q":
                return false;
            default:
                return shouldContinue(newScanner);
        }
    }
}


