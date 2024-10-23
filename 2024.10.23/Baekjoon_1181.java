import java.util.*;
import java.io.*;

public class Baekjoon_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int T = Integer.parseInt(br.readLine());
        String[] arr = new String[T];
        
        for(int i = 0; i < T; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String s1, String s2) {
                if(s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                } else {
                    return s1.length() - s2.length();
                }
            }
        });

        String[] newArr = Arrays.stream(arr).distinct().toArray(String[]::new);
        
        
        for(String result : newArr) {
            System.out.println(result);
        }
        
    }    
}
