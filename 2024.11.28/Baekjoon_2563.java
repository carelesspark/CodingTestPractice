import java.util.*;
import java.io.*;

public class Baekjoon_2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] temp = new int[100][100];

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for(int j = x; j < x + 10; j++) {
                for(int k = y; k < y + 10; k++) {
                    temp[j][k] = 1;
                }
            }
        }

        int value = 0;

        for(int i = 0; i < 100; i++) {
            for(int j = 0; j < 100; j++) {
                if(temp[i][j] == 1) {
                    value++;
                }
            }
        }

        System.out.println(value);
        
    }
}
