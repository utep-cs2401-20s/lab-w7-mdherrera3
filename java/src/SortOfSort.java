public class SortOfSort {
    public static void sortOfSort(int[] array){
        int beginning = 0;
        int max = array[0];
        int end = array.length - 1;
        int counter = 0;
        while(end !=  beginning) {
            for(int i = end; i > beginning; i--){
                if(array[i] > max){
                    max = array[i];
                }
            }
            if(counter % 2 == 0 ){

            }
            counter++;
        }
    }
}
