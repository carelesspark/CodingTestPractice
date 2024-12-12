import java.io.*;
import java.util.*;

public class Baekjoon_1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); 
        Integer[] A = new Integer[N];
        Integer[] B = new Integer[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(A);
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(B, Collections.reverseOrder());

        int total = 0;
        for(int i = 0; i < N; i++) {
            total += A[i] * B[i];
        }

        System.out.println(total);
    }
}
