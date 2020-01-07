public class Test {
    public static void main(String[] args) {
        int [] arr = {9,2,3,5,6,8};
        int num = 0;
        for(int bound = 0; bound < arr.length; bound++) {
            for(int cur = 0; cur < arr.length - 1 - bound; cur++){
                if(arr[cur] > arr[cur + 1]) {
                    num = arr[cur];
                    arr[cur] = arr[cur + 1];
                    arr[cur + 1] = num;
                }
            }
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
