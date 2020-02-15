public class Test {
    //给定一个字符串 S，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的位置发生反转。
    public String reverseOnlyLetters(String S) {
        char[] chars = S.toCharArray();
        int left = 0;
        int right = S.length() - 1;
        while (left < right) {
                while (!Character.isLetter(S.charAt(right)) && left < right) {
                    right--;
                }
                while (!Character.isLetter(S.charAt(left)) &&left < right) {
                    left++;
                }
                char tmp = chars[left];
                chars[left] = chars[right];
                chars[right] = tmp;
                left++;
                right--;
            }
            return new String(chars);
        }
    }

