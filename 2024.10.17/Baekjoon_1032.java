import java.util.*;
import java.io.*;

public class Baekjoon_1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        char[][] temp = new char[N][50];

        for(int i = 0; i < N; i++) {
            String fileName = br.readLine();
            for(int j = 0; j < fileName.length(); j++) {
                temp[i][j] = fileName.charAt(j);
            }
        }

        for(int i = 1; i < N; i++) {
            for(int j = 0; j < temp[i].length; j++) {
                if(temp[0][j] != temp[i][j]) {
                    temp[0][j] = '?';
                }
            }
        }

        for(int i = 0; i < temp[0].length; i++) {
            if(temp[0][i] != '\0') {
                sb.append(temp[0][i]);
            }
        }
        
        System.out.println(sb);
        
    }
}
