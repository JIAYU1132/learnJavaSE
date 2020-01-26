public class Array {
        public int[] Init(int[] arr) {
            //编写代码: 创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
            for (int i = 0; i < arr.length ; i++) {
                arr[i] = i + 1;
            }
            return arr;
        }

        public void printArray(int[] arr) {
            //编写代码: 实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值.
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        public int[] transformArray(int[] arr) {
            //编写代码: 实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 , 并设置到对应的数组元素上.
            int[] ret = new int[100];
            for (int i = 0; i < arr.length; i++) {
                ret[i] = arr[i] * 2;
            }
            return ret;
        }

        public int sum(int[] arr) {
            //编写代码: 实现一个方法 sum, 以数组为参数, 求数组所有元素之和.
            int tmp = 0;
            for (int i = 0; i < arr.length; i++) {
                tmp += arr[i];
            }
            return tmp;
    }

        public double avg(int[] arr){
            //编写代码: 实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值.
            return sum(arr) / arr.length;
        }
    }
