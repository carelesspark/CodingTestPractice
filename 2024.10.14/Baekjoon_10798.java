import java.util.*;
import java.io.*;

public class Baekjoon_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char[][] temp = new char[5][15];

        for(int i = 0; i < 5; i++){
            String answer = br.readLine();
            for(int j = 0; j < answer.length(); j++){
                temp[i][j] = answer.charAt(j);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int j = 0; j < 15; j++){
            for(int i = 0; i < 5; i++){
                if(temp[i][j] != '\0'){
                    sb.append(temp[i][j]);
                }
            }
        }

        System.out.println(sb);
        
    }
}
