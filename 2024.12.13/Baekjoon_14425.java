import java.util.*;
import java.io.*;

public class Baekjoon_14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        HashSet<String> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();

        int N = Integer.parseInt(st.nextToken()); 
        int M = Integer.parseInt(st.nextToken()); 
        
        for(int i = 0; i < N; i++) {
            String name = br.readLine();
            set.add(name);
        }

        for(int i = 0; i < M; i++) {
            String temp = br.readLine();
            if(set.contains(temp)) {
                list.add(temp);
            }
        }

        System.out.println(list.size());
        
    
    
    }
}
