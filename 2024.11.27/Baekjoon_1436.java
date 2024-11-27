import java.util.*;
import java.io.*;

public class Baekjoon_1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int temp = 0;
        int value = 0;
        while(true) {
            value++;

            if(Integer.toString(value).contains("666")) {
                temp++;
                if(N == temp) {
                    System.out.println(value);
                    break;
                }
            }
        }

    }
}