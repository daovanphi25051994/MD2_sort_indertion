import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        InsertionSort insertionSort =new InsertionSort();
        ArrayList<Integer> listNumbers = new ArrayList<>();
        int[] listNumber = {3,6,1,5,7,2};
        insertionSort.sort(listNumber);
        for (int x : listNumber){
            System.out.println(x);
        }
    }
}
