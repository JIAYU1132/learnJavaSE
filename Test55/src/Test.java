public class Test {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Array array = new Array();
        arr = array.Init(arr);
        array.printArray(arr);
        arr = array.transformArray(arr);
        array.printArray(arr);
        System.out.println(array.sum(arr));
        System.out.println(array.avg(arr));
    }
}
