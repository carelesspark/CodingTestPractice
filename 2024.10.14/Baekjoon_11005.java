import java.util.*;
import java.io.*;

public class Baekjoon_11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        while (N > 0) {
            int temp = N % B;

            if(temp >= 10) {
                sb.append((char)('A' + (temp - 10)));
            } else {
                sb.append(temp);
            }

            N = N / B;
        }
    }
}
