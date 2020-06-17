public class Test {
    //实现方法 compareTo, 能够实现按照字典序比较字符串大小
    public static void main(String[] args) {
        String str1 = "ac";
        String str2 = "AA";
        System.out.println("AA".compareTo(str2));
        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str1));
        //前小于后, 返回值小于 0
        //前大于后, 返回值大于 0
        //两者相等,返回值为 0
    }
}
