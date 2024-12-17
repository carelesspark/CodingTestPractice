import java.util.*;
import java.io.*;

public class Baekjoon_3036 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] temp = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            temp[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i < N; i++) {
            int num = gcd(temp[0], temp[i]);
            sb.append(temp[0] / num).append("/").append(temp[i] / num).append("\n");
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
