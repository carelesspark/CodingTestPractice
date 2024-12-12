import java.util.*;
import java.io.*;

public class Baekjoon_2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] temp = new int[N];

        for(int i = 0; i < N; i++) {
            temp[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(temp);
        int max = 0;
        for(int i = 0; i < N; i++) {
            int weight = temp[i] * (N - i);
            if(max < weight) {
                max = weight;
            }
        }

        System.out.println(max);
    }
}
