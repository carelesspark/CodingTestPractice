import java.util.*;
import java.io.*;

public class Baekjoon_1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num = Integer.parseInt(br.readLine());
        int[] temp = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            temp[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        int l = 0;
        int r = N - 1;

        Arrays.sort(temp);
        while (l < r) {
            int sum = temp[l] + temp[r];

            if(sum == num) {
                count++;
                l++;
                r--;
            } else if(sum < num) {
                l++;
            } else {
                r--;
            }
        }

        System.out.println(count);
    }
}