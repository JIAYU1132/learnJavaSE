public class Test {
//    你的朋友正在使用键盘输入他的名字 name。偶尔，在键入字符 c 时，按键可能会被长按，而字符可能被输入
//1 次或多次。你将会检查键盘输入的字符 typed。如果它对应的可能是你的朋友的名字（其中一些字符可能被长
//    按），那么就返回 True。
public boolean isLongPressedName(String name, String typed) {
    int n = name.length();
    int t = typed.length();
    if (t < n) {
        return false;
    }
    int i = 0;
    int j = 0;
    while (i < n && j < t) {
        if (name.charAt(i) == typed.charAt(j)) {
            i++;
            j++;
        } else if(typed.charAt(j) == typed.charAt(j + 1)) {
            j++;
        } else {
            return false;
        }
    }
    return i == n;//判断 name 中每个字母已经判断完了
}
}
