import java.util.*;
import java.io.*;

public class Baekjoon_2167 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] temp = new int[N][M];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < M; j++) {
                temp[i][j] = Integer.parseInt(st.nextToken());
            }
        } 

        int K = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int h = 0; h < K; h++) {
            st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int sum = 0;

            for(int a = i - 1; a < x; a++) {
                for(int b = j - 1; b < y; b++) {
                    sum += temp[a][b];
                }
            }

            sb.append(sum).append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }    
}
