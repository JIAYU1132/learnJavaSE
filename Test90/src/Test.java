public class Test {
    //给定两个二进制字符串，返回他们的和
    public String addBinary(String a, String b) {
        int m = a.length() - 1;
        int n = b.length() - 1;
        int ca = 0;
        StringBuilder res = new StringBuilder();
        while (m > -1 || n > -1) {
            int sum = ca;
            sum += m > -1 ? a.charAt(m--) - '0' : 0;
            sum += n > -1 ? b.charAt(n--) - '0' : 0;
            res.append(sum % 2);
            ca = sum / 2;
        }
        res.append(ca == 0 ? "" : ca);
        return res.reverse().toString();
    }
}
