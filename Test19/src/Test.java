public class Test {
    public static void main (String[] args) {
        //打印乘法口诀表
        int mul = 1;
        for(int i = 1; i < 10; i++) {
            for(int j = 1; j <= i; j++) {
                mul = i * j;
                System.out.print(j + "*" + i + "=" + mul + " ");
                //println输出中自带\n,print中不带
            }
            System.out.println();
            }
    }
}
