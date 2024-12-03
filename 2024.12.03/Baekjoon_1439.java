import java.io.*;
import java.util.*;

public class Baekjoon_1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        int zero = 0;
        int one = 0;

        if(S.charAt(0) == '1') {
            one++;
        } else {
            zero++;
        }

        for(int i = 1; i < S.length(); i++) {
            if(S.charAt(i - 1) != S.charAt(i)) {
                if(S.charAt(i) == '1') {
                    one++;
                } else {
                    zero++;
                }
            }
        }

        System.out.println(Math.min(zero, one));
    }
}
