import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortOfSortTester {
    @Test
    public void sortTest1(){
        //simple Test
        int[] a = new int[] {0,2,4,5,1,7};
        int[] b = new int[] {4,2,1,0,5,7};
        SortOfSort sol = new SortOfSort();
        sol.sortOfSort(a);
        assertArrayEquals(a,b);
    }
    @Test
    public void sortTest2(){
        //duplicates
        int[] a = new int[] {4,2,3,4};
        int[] b = new int[] {2,1,4,4};
        SortOfSort sol = new SortOfSort();
        sol.sortOfSort(a);
        assertArrayEquals(a,b);
    }
    @Test
    public void sortTest3(){
        //empty array
        int[] a = new int[] {};
        int[] b = new int[] {};
        SortOfSort sol = new SortOfSort();
        sol.sortOfSort(a);
        assertArrayEquals(a,b);
    }
    @Test
    public void sortTest4(){
        //negatives
        int[] a = new int[] {-4,-2,-3,-1};
        int[] b = new int[] {-3,-4,-2,-1};
        SortOfSort sol = new SortOfSort();
        sol.sortOfSort(a);
        assertArrayEquals(a,b);
    }
    @Test
    public void sortTest5(){
        //negatives and positive and duplicates
        int[] a = new int[] {-7,-7,4,-7};
        int[] b = new int[] {-7,-7,-7,4};
        SortOfSort sol = new SortOfSort();
        sol.sortOfSort(a);
        assertArrayEquals(a,b);
    }

}
