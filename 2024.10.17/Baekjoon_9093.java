import java.util.*;
import java.io.*;

public class Baekjoon_9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            String sen = br.readLine();

            String[] temp = sen.split(" ");
            for(int j = 0; j < temp.length; j++) {
                StringBuilder sb = new StringBuilder();

                sb.append(temp[j]);
                sb.reverse();
                temp[j] = sb.toString();
            }

            for(int j = 0; j < temp.length; j++) {
                if(j == temp.length - 1) {
                    System.out.print(temp[j]);
                } else {
                    System.out.print(temp[j] + " ");
                }
            }

            System.out.println();
        }
    }
}

