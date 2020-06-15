public class Test {
    public static void main(String[] args) {
        //找到了返回位置的开始的下标
        String str = "hello word";
        //从头开始查找子字符串位置
        System.out.println(str.indexOf("ell"));
        //从指定位置查找子字符串位置
        System.out.println(str.indexOf("or", 2));
        //没找到返回 -1
        System.out.println(str.indexOf("oll"));
    }
}
