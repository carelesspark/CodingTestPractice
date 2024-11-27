import java.util.*;
import java.io.*;

public class Baekjoon_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int repeat = Integer.parseInt(br.readLine());
        int[][] temp = new int[repeat][2];

        for(int i = 0; i < repeat; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            temp[i][0] = Integer.parseInt(st.nextToken());
            temp[i][1] = Integer.parseInt(st.nextToken());
        }


        for(int i = 0; i < repeat; i++) {
            int k = 1;
            for(int j = 0; j < repeat; j++) {
                if(i == j) {
                    continue;
                }

                if(temp[i][0] < temp[j][0] && temp[i][1] < temp[j][1]) {
                    k++;
                }
            } 
            sb.append(k).append(" ");
        }

        System.out.println(sb);
    }
}

