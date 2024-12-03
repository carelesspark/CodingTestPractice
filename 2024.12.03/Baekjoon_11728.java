import java.io.*;
import java.util.*;

public class Baekjoon_11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] temp = new int[N + M];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            temp[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < M; i++) {
            temp[i + N] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(temp);
        StringBuilder sb = new StringBuilder();
        
        for(int n : temp) {
            sb.append(n + " ");
        }
        System.out.println(sb);
    }
}
