import java.util.*;
import java.io.*;

public class Baekjoon_13241 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());

        lcm(A, B);
    }

    public static void lcm(long A, long B) {
        long result = (A * B) / gcd(A, B);

        System.out.println(result);
    }

    public static long gcd(long A, long B) {
        if(B == 0) {
            return A;
        }

        return gcd(B, A % B);
    }
}
