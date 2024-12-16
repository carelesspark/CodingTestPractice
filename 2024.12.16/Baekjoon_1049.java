import java.util.*;
import java.io.*;

public class Baekjoon_1049 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] six = new int[M];
        int[] one = new int[M];

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            six[i] = Integer.parseInt(st.nextToken());
            one[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(six);
        Arrays.sort(one);

        if(N <= 6) {
            System.out.println(Math.min(six[0], one[0] * N));
        } else {
            int a = 0;
            if(N % 6 == 0) {
                a = six[0] * (N / 6);
            } else {
                a = six[0] * ((N / 6) + 1);
            }       
            int b = ((N / 6) * six[0]) + ((N % 6) * one[0]);
            int temp = Math.min(a, b);
            int c = one[0] * N;
            System.out.println(Math.min(temp, c));
        }
    }    
}
