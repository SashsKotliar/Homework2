public class Exercise6 {
    public static void main(String[] args) {
        int[] arr1 = {20, 30, 23, 16};
        int[] arr2 = {10, 15, 30, 11, 12};
        int counter = 0;
        counter = sameNumAmountCheck(arr1, arr2, counter);
        if (!arrCheckForDiff(arr1, arr2)) {
            int[] intersectionArray = sameNumbers(arr1, arr2, counter);
            printArray(intersectionArray);
        } else {
            System.out.println("The arrays are absolutely different");
        }
    }

    public static boolean arrCheckForDiff(int[] arr1, int[] arr2) {
        boolean differentArrays = true;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    differentArrays = false;
                    break;
                }
            }
        }
        return differentArrays;
    }

    public static int sameNumAmountCheck(int[] arr1, int[] arr2, int counter) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static int[] sameNumbers(int[] arr1, int[]arr2, int counter) {
        int [] intersection = new int[counter];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                   do{
                       intersection[counter - 1] = arr1[i];
                       counter = counter - 1;
                   } while (counter > intersection.length);
                }
            }
        }
        return intersection;
    }

    public static void printArray(int[] intersectionArray){
        System.out.println("The intersection array is: ");
        for (int i = 0; i < intersectionArray.length; i++){
            System.out.print(intersectionArray[i] + ", ");
        }
    }
}
