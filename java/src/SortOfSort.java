public class SortOfSort {
    public static void sortOfSort(int[] array){
        int beginning = 0;
        int max = array[0];
        int end = array.length;
        int counter = 0;
        int index = 0;
        boolean start = false;
        boolean temp;
        boolean ending = true;
        while(end !=  beginning) {
            max = array[beginning];
            for(int i = beginning; i < end - 1; i++){
                if(array[i] > max){
                    max = array[i];
                    index = i;
                }
            }
            if(counter % 2 == 0) {
                temp = ending;
                ending = start;
                start = temp;
                if(start){
                    array[index] = array[beginning];
                    array[beginning] = max;
                    beginning = beginning + 1;
                }
                if (ending) {
                    array[index] =  array[end-1];
                    array[end-1] = max;
                    end = end - 1;
                }
            }
            else{
                if(start){
                    array[index] = array[beginning];
                    array[beginning] = max;
                    beginning = beginning + 1;
                }
                if (ending) {
                    array[index] = array[end-1];
                    array[end-1] = max;
                    end = end - 1;
                }
            }
            counter++;
        }
        for(int j = 0; j < array.length;j++){
            System.out.print(array[j] + " ");
        }
    }
}
