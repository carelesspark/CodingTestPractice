import java.util.*;
import java.io.*;

public class Baekjoon_10867 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] temp = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            temp[i] = Integer.parseInt(st.nextToken());
        }
        
        int[] arr = Arrays.stream(temp).distinct().sorted().toArray();

        StringBuilder sb = new StringBuilder();
        for(int n : arr) {
            sb.append(n).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
