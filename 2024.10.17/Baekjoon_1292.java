import java.util.*;
import java.io.*;

public class Baekjoon_1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[] temp = new int[B];
        int idx = 0;

        for(int i = 1; i <= 1000; i++) {
            for(int j = 1; j <= i; j++) {
                if(idx < B) {
                    temp[idx] = i;
                    idx++;
                }
            }
        }

        int sum = 0;
        
        for(int i = A - 1; i < B; i++) {
            sum = sum + temp[i];
        }

        System.out.println(sum);
    }
}
