public class Test {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int left = 0;
        int right =  arr.length - 1;
        while(left < right) {
            int num = arr[left];
            arr[left] = arr[right];
            arr[right] = num;
            left++;
            right--;
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
