package lesson_16;

import java.util.StringTokenizer;

public class StringToken {
    public static void main(String[] args) {
        String s = "Welcome to Mr.Numan Yaman";

        StringTokenizer st = new StringTokenizer(s,"a",false);

        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
