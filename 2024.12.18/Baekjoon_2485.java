import java.util.*;
import java.io.*;

public class Baekjoon_2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] locate = new int[N];

        for(int i = 0; i < N; i++) {
            locate[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(locate);
        int[] gap = new int[N - 1];
        for(int i = 0; i < N - 1; i++) {
            gap[i] = locate[i + 1] - locate[i];
        }

        int value = gap[0];
        for(int i = 1; i < gap.length; i++) {
            value = gcd(value, gap[i]);
        }

        int count = 0;
        for(int need : gap) {
            count += (need / value) - 1;
        }
        System.out.println(count);
    }

    public static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
