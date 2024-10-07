import java.util.*;
import java.io.*;

public class Baekjoon_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int total = fac(N) / (fac(K) * fac(N - K));

        System.out.println(total);

    }

    public static int fac(int num){
        if(num == 1 || num == 0){
            return 1;
        }

        return num * fac(num - 1);
    }
}
