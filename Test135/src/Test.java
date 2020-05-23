public class Test {
    public static void main(String[] args) {
        String str = "hello word";
        //替换所有指定内容
        System.out.println(str.replaceAll("l","-"));
        //替换首个内容
        System.out.println(str.replaceFirst("l","-"));
    }
}
