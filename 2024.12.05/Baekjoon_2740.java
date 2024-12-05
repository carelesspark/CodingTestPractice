import java.io.*;
import java.util.*;

public class Baekjoon_2740 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] tempA = new int[N][M];
        
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < M; j++) {
                tempA[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine(), " ");

        M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] tempB = new int[M][K];

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < K; j++) {
                tempB[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] result = new int[tempA.length][tempB[0].length];

        for(int i = 0; i < tempA.length; i++) {
            for(int j = 0; j < tempB[0].length; j++) {
                for(int k = 0; k < tempB.length; k++) {
                    result[i][j] += tempA[i][k] * tempB[k][j];
                }
            }
        }

        for(int[] row : result) {
            for(int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
