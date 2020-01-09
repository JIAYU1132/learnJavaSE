import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查找的数");
        int toFind = scanner.nextInt();
        int num = binarySearch(arr,toFind);
        System.out.println("它的下标为" + num);
    }

    public static int binarySearch(int arr[] , int toFind) {
        int left = 0;
        int right = arr.length - 1;
        while(right >= left) {
            int mid = (right + left) / 2;
            if(toFind < arr[mid]) {
                right = mid - 1;
            } else if(toFind > arr[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
