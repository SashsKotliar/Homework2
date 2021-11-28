public class Exercise4 {
    public static void main(String[] args) {
        int [] array = {1, 6, 6, 4, 29, 29, 9};
        int counter = sameNumbersSearcher(array);
        int[] arrayWithoutSameNumbers = arrayWithoutSameNumbers(array,counter);
        printArray(arrayWithoutSameNumbers);
    }
    public static int sameNumbersSearcher (int [] fullArray){
        int counter = 0;
        for (int i = 0; i < fullArray.length; i++){
            for (int j = i+1 ; j < fullArray.length; j++){
                if (fullArray[i] == fullArray[j]){
                    counter++;
                    break;
                }
            }
        }
        return counter;
    }

    public static int[] arrayWithoutSameNumbers (int[] fullArray, int counter){
        int [] arrayWithoutSameNumbers = new int[fullArray.length-counter];
        int index = 0;
        for (int i = 0; i<fullArray.length; i++){
            if (index == arrayWithoutSameNumbers.length){
                break;
            }
            for (int j = 0; j < arrayWithoutSameNumbers.length; j++){
                if (fullArray[i] == arrayWithoutSameNumbers[j] && j <= index){
                    break;
                }
                else if (fullArray[i] != arrayWithoutSameNumbers[j] && j == index){
                    arrayWithoutSameNumbers[index] = fullArray[i];
                    index++;
                    break;
                }
            }
        }

        return arrayWithoutSameNumbers;
    }

    public static void printArray(int[] arrayWithoutSameNumbers){
        for (int i = 0; i < arrayWithoutSameNumbers.length; i++){
            System.out.print(arrayWithoutSameNumbers[i] + ", ");
        }
    }
}
