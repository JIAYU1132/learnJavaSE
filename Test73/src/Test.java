public class Test {
    //实现函数 ToLowerCase() ，该函数接收一个字符串参数 str ，并将该字符串中的大写字母转换成小写字母，
    //之后返回新的字符串 。

    public static String ToLowerCase(String str) {
         String result = "";
         for (int i = 0; i < str.length(); i++) {
             char c = str.charAt(i);
             if (c <= 90 && c >= 65) {
                 c += 32;
             }
             result += c;
         }
         return result;
     }
}
