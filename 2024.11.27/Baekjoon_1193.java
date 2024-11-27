import java.util.*;
import java.io.*;

public class Baekjoon_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int cross_count = 1;
        int prev_count_sum = 0;

        while(true) {
            if(X <= cross_count + prev_count_sum) {
                if(cross_count % 2 == 1) {
                    System.out.println(((cross_count + 1) - (X - prev_count_sum)) + "/" + (X - prev_count_sum));
                    break;
                } else {
                    System.out.println((X - prev_count_sum) + "/" + ((cross_count + 1) - (X - prev_count_sum)));
                    break;
                }
            } else {
                prev_count_sum += cross_count;
                cross_count++;
            }
        }
    }
}
