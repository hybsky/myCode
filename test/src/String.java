import java.util.Arrays;

public class String {
    public static void main(String[] args) {
        java.lang.String str = "dfafd45246sba2fd323asf";
        System.out.println(str.charAt(1));
        System.out.println(Arrays.toString(str.toCharArray()));
        char[] cs = {'1','4','6'};
        java.lang.String s1 = new java.lang.String(cs,0,2);
        System.out.println(s1);
        System.out.println(str.startsWith("dfa",4));
        System.out.println(str.replace("fd","*"));
        System.out.println(str.replaceAll("\\d","*"));
        System.out.println(str.substring(4));
        System.out.println(str.substring(4,7));
        System.out.println(str.indexOf("a"));
        System.out.println(Arrays.toString(str.split("s",2)));
        System.out.println(str.indexOf("adasdfd"));
        java.lang.String s3 = "   d    fdfd fdfd       ";
        System.out.println(s3.trim());

        java.lang.String a = "a";
        java.lang.String b = "b";
        java.lang.String c = a + b + 1;
        System.out.println(c);

        //StringBuffer可变字符串
        StringBuffer sb = new StringBuffer();
        sb.append("1").append("fdfdafdafdafdsafdsfdfdasa");

        StringBuffer sb1 = new StringBuffer(32);
        System.out.println(sb.toString());

        //StringBuffer的兄弟StringBuilder：StringBuilder被视作StringBuffer的简易替换，
        //用在字符串缓冲区被单个线程使用的时候，建议优先使用
        //大多数实现中，StringBuilder比StringBuffer快
        StringBuilder sb2 = new StringBuilder();
    }
}
