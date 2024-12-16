import java.util.*;
import java.io.*;

public class Baekjoon_9613 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int[] temp = new int[N];
            for(int j = 0; j < N; j++) {
                temp[j] = Integer.parseInt(st.nextToken());
            }

            long sum = 0;
            for(int j = 0; j < N - 1; j++) {
                for(int h = j + 1; h < N; h++) {
                    sum += gcd(temp[j], temp[h]);
                }
            }
            sb.append(sum).append("\n");
        }

        System.out.println(sb);
    }

    public static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
}
