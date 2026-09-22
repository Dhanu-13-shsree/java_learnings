import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        System.out.println(Arrays.binarySearch(arr,3));
        System.out.println(Arrays.sort(arr));
        System.out.println(Arrays.fill(arr,3));

        int[] arr2= {1,2,3,4,5};
        System.out.println(Arrays.equals(arr,arr2));
    
    }
}
