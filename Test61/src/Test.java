import java.lang.reflect.Array;
import java.util.Arrays;

class Test {
    //给定两个整型数组, 交换两个数组的内容.
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {2,3,4,5,6,7};
        int tmp = 0;
        for (int i = 0; i < arr1.length; i++) {
            tmp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = tmp;
        }
        System.out.println("arr1 : " + Arrays.toString(arr1));
        System.out.println("arr2 : " + Arrays.toString(arr2));
        }
    }
