import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(bf.readLine());
        int[] intArr = new int[N];

        for(int i = 0; i < N; i++){
            intArr[i] = Integer.parseInt(bf.readLine());
        }

        Arrays.sort(intArr);

        for(int i = 0; i < N; i++){
            sb.append(intArr[i]).append("\n");
        }

        System.out.println(sb);
    }
}
