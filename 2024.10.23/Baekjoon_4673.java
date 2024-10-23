import java.util.*;
import java.io.*;

public class Baekjoon_4673 {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[10001];

        for(int i = 1; i <= 10000; i++) {
            arr[i] = d(i);
        }

        for(int i = 1; i <= 10000; i++) {
            int test = 0;

            for(int j = 1; j <= 10000; j++) {
                if(i != arr[j]) {
                    test++;
                }
            }

            if(test == 10000) {
                System.out.println(i);
            }
        }

    }

    public static int d(int n) {
        String temp = Integer.toString(n);
        int sum = 0;
        for(int i = 0; i < temp.length(); i++) {
            sum = sum + (temp.charAt(i) - '0');
        }

        int result = Integer.parseInt(temp) + sum;
        
        return result;
    }
}
