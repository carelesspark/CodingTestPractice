import java.util.*;
import java.io.*;

public class Baekjoon_1057 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int jimin = Integer.parseInt(st.nextToken());
        int hansu = Integer.parseInt(st.nextToken());
        int count = 1;

        while (N != 1) {
            jimin = (jimin % 2 == 0) ? (jimin / 2) : ((jimin + 1) / 2);
            hansu = (hansu % 2 == 0) ? (hansu / 2) : ((hansu + 1) / 2);

            if(jimin == hansu) {
                System.out.println(count);
                return;
            }

            count++;
            N = (N % 2 == 0) ? (N / 2) : ((N + 1) / 2);
        }

        System.out.println(-1);
    }
}
