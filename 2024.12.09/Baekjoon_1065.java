import java.util.*;
import java.io.*;

public class Baekjoon_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i = 1; i <= N; i++) {
            if(i >= 1 && i <= 99) {
                count++;
            } else if(i >= 100 && i <= 999) {
                String temp = String.valueOf(i);
                int value1 = Character.getNumericValue(temp.charAt(0)) - Character.getNumericValue(temp.charAt(1));
                int value2 = Character.getNumericValue(temp.charAt(1)) - Character.getNumericValue(temp.charAt(2));

                if(value1 == value2) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
