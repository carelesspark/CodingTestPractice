import java.util.*;
import java.io.*;

public class Baekjoon_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());

        while (N != 1) {
            for(int i = 2; i <= N; i++){
                if(N % i == 0){
                    N = N / i;
                    sb.append(i).append("\n");
                    break;
                }
            }
        }
        if(sb.length() > 0){
            sb.deleteCharAt(sb.length() - 1);
        }
        System.out.println(sb);
    }
}
