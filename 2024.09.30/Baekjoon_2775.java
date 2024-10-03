import java.util.*;
import java.io.*;

public class Baekjoon_2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(bf.readLine());

        for(int i = 0; i < T; i++){
            int k = Integer.parseInt(bf.readLine());
            int n = Integer.parseInt(bf.readLine());

            int[][] apt = new int[k + 1][n + 1];

            for(int j = 1; j <= n; j++){
                apt[0][j] = j;
            }

            for(int j = 1; j <= k; j++){
                for(int h = 1; h <= n; h++){
                    apt[j][h] = apt[j][h - 1] + apt[j - 1][h];
                }
            }
            if(i == T - 1){
                sb.append(apt[k][n]);
            } else {
                sb.append(apt[k][n]).append("\n");
            }
            
        } 
        System.out.println(sb);
    }
}
