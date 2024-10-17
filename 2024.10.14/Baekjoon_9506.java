import java.util.*;
import java.io.*;

public class Baekjoon_9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());

            if(n == -1) {
                return;
            }

            int[] temp = new int[n];
            int j = 0;

            for(int i = 1; i <= n; i++) {
                if(i == n) {
                    break;
                } else {
                    if(n % i == 0) {
                        temp[j] = i;
                        j++;
                    }
                }
            }

            int sum = Arrays.stream(temp).sum();
            if(sum == n) {
                System.out.print(n + " = " + temp[0]);
                for(int i = 1; i < temp.length; i++) {
                    if(temp[i] != 0) {
                        System.out.print(" + " + temp[i]);
                    }
                }
            } else {
                System.out.print(n + " is NOT perfect.");
            }
            System.out.println();
        }
    }
}
