import java.util.*;
import java.io.*;

public class Baekjoon_2748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        if (n == 0) {
            sb.append(0);
        } else {
            long[] temp = new long[n + 1];

            temp[0] = 0;
            temp[1] = 1;

            for (int i = 2; i <= n; i++) {
                temp[i] = temp[i - 1] + temp[i - 2];
            }

            sb.append(temp[n]);
        }

        System.out.println(sb);
    }
}
