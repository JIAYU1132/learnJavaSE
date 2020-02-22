public class Test {
    //给定一组字符，使用原地算法将其压缩。
    //压缩后的长度必须始终小于或等于原数组长度。
    //数组的每个元素应该是长度为1 的字符（不是 int 整数类型）。
    //在完成原地修改输入数组后，返回数组的新长度。

    public int compress(char[] chars) {
        int write = 0;
        int temp = 0;
        for (int read = 0; read < chars.length; read++) {
            if (read + 1 == chars.length || chars[read] != chars[read + 1]) {
                chars[write++] = chars[temp];
                if (read > temp) {
                    for (char c : ("" + (read - temp + 1)).toCharArray()) {
                        chars[write++] = c;
                    }
                }
                temp = read + 1;
            }
        }
        return write;
    }
}
