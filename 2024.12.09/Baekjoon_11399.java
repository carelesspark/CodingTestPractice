import java.util.*;
import java.io.*;

public class Baekjoon_11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] temp = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            temp[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(temp);
        int total = 0;

        for(int i = 0; i < N; i++) {
            for(int j = 0; j <= i; j++) {
                total += temp[j];
            }
        }

        System.out.println(total);
    }
}
