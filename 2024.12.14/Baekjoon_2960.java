import java.util.*;
import java.io.*;

public class Baekjoon_2960 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        boolean[] temp = new boolean[N + 1];

        int count = 0;
        for(int i = 2; i <= N; i++) {
            for(int j = i; j <= N; j+=i) {
                if(temp[j] == false) {
                    count++;
                    temp[j] = true;
                }

                if(count == K) {
                    System.out.println(j);
                    return;
                }
            }
        }
    }
}
