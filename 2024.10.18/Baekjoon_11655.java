import java.util.*;
import java.io.*;

public class Baekjoon_11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();

        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if(ch >= 'A' && ch <= 'Z') {
                char rot13 = (char)((ch - 'A' + 13) % 26 + 'A');
                sb.append(rot13);
            } else if (ch >= 'a' && ch <= 'z') {
                char rot13 = (char)((ch - 'a' + 13) % 26 + 'a');
                sb.append(rot13);
            } else {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());    
    }
}
