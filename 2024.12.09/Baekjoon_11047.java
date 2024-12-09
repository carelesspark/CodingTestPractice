import java.util.*;
import java.io.*;

public class Baekjoon_11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int temp = 0;
        int[] coinValue = new int[N];

        for(int i = 0; i < N; i++) {
            coinValue[i] = Integer.parseInt(br.readLine());

            if (coinValue[i] <= K) {
                temp++;
            }
        }

        int total = 0;
        for(int i = temp - 1; i >= 0; i--) {
            if(K % coinValue[i] == 0) {
                total += K / coinValue[i];
                break;
            }

            total += K / coinValue[i];
            K %= coinValue[i];
        }

        System.out.println(total);
    }
}
