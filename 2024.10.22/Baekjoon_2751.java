import java.util.*;
import java.io.*;

public class Baekjoon_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int[] temp = new int[T];

        for(int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            temp[i] = n;
        }

        Arrays.sort(temp);

        for(int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
    }
}
