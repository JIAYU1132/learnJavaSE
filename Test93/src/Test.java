public class Test {
    // 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写
    public boolean isPalindrome(String s) {
        int cur = 0;
        int prev = s.length() - 1;
        while (cur < prev) {
            while (cur < prev && !Character.isLetterOrDigit(s.charAt(cur))) {
                cur++;
            }
            while (cur < prev && !Character.isLetterOrDigit(s.charAt(prev))) {
                prev--;
            }
            if (Character.toLowerCase(s.charAt(cur)) != Character.toLowerCase(s.charAt(prev))) {
                return false;
            }
            cur++;
            prev--;
        }
        return true;
    }
}
