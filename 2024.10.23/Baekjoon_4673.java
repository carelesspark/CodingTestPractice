import java.util.*;
import java.io.*;

public class Baekjoon_4673 {
    public static void main(String[] args) throws IOException {
        boolean[] check = new boolean[10001];
        
        for(int i = 1; i <= 10000; i++) {
            int temp = d(i);

            if(temp <= 10000) {
                check[temp] = true;
            }
        }

        for(int i = 1; i <= 10000; i++) {
            if(!check[i]) {
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
