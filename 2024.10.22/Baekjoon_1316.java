import java.util.*;
import java.io.*;


public class Baekjoon_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int count = T;
        
        for(int i = 0; i < T; i++) {
            String word = br.readLine();

            int[] arr = new int[26];
            for(int j = 0; j < word.length(); j++) {
                if(arr[word.charAt(j) - 'a'] == 0) {
                    arr[word.charAt(j) - 'a']++;
                } else if(word.charAt(j) != word.charAt(j - 1)) { 
                    count--;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
