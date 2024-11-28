import java.util.*;
import java.io.*;

public class Baekjoon_1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            long W = Long.parseLong(st.nextToken());
            long E = Long.parseLong(st.nextToken());
            long result = 1;

            if(W >= E) {
                for(int j = 0; j < E; j++) {
                    result *= (W - j);
                    result /= (j + 1);
                }

                System.out.println(result);
            } else {
                for(int j = 0; j < W; j++) {
                    result *= (E - j);
                    result /= (j + 1);
                }
                System.out.println(result);
            }
        }
    }
}
