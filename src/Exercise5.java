public class Exercise5 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 85, 6, 2};
        int index = topSearcher(arr);
        System.out.println(index);
    }

    public static int topSearcher(int[] arr) {
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
                   if (arr[i] > arr[max]){
                       max = i;
            }
        }
        boolean increase = true;
        for (int k = 0; k < max; k++) {
            if (arr[k] > arr [k+1]){
                increase = false;
                break;
            }
        }
        boolean decrease = true;
        for (int j = max; j < arr.length - 1; j++){
            if (arr[j] < arr[j + 1]){
                decrease = false;
                break;
            }
        }
        if (!decrease || !increase){
            max = -1;
        }
        return max;
    }
}