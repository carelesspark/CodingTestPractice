import java.util.*;
import java.io.*;

public class Baekjoon_10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        HashSet<Integer> hash = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < N; i++) {  
            hash.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < M; i++) {  
            int randomCard = Integer.parseInt(st.nextToken());
            sb.append(hash.contains(randomCard) ? "1 " : "0 ");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    } 
}
