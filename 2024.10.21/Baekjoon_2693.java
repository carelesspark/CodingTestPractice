import java.util.*;
import java.io.*;

public class Baekjoon_2693 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int[] temp = new int[10];

            for(int j = 0; j < 10; j++) {
                int N = Integer.parseInt(st.nextToken());
                temp[j] = N;
            }

            Arrays.sort(temp);

            System.out.println(temp[7]);
        }
    }
}