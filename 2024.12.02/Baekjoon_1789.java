import java.io.*;
import java.util.*;

public class Baekjoon_1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long S = Long.parseLong(br.readLine());
        long sum = 0;
        long i = 0;

        while (sum <= S) {
            i++;
            sum += i;
        }

        System.out.println(i - 1);
    }
}