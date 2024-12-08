import java.util.*;
import java.io.*;

public class Baekjoon_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            String temp = br.readLine();
            int count = 0;

            for(char s : temp.toCharArray()) {
                if(s == '(') {
                    count++;
                } else {
                    count--;
                }

                if(count < 0) {
                    break;
                }
            }

            if(count == 0) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }         
        }
        
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}
