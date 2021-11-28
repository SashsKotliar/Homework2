import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 10;
        int[] arr = new int[size];
        System.out.println("Enter 10 numbers: ");
        for (int counter = 0; counter < size; counter++ ){
            arr[counter] = scanner.nextInt();
        }
        System.out.println("Stop!");
        double sum = 0;
        for (int i = 0; i < size; i++){
            sum = sum + arr[i];
        }
        double average = sum/10;
        for (int i = 0; i < size; i++){
            if (arr[i] > average){
                System.out.print(arr[i] + ", ");
            }
        }
    }
}

