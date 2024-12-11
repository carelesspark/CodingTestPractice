import java.io.*;
import java.util.*;

public class Baekjoon_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new ArrayDeque<>();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
    
        for(int i = 1; i <= N; i++) {
            deque.addLast(i);
        }
    
        sb.append("<");
        while (!deque.isEmpty()) {
            for(int i = 0; i < K - 1; i++) {
                deque.offer(deque.poll());
            }
            
            sb.append(deque.poll());
            if (!deque.isEmpty()) {
                sb.append(", ");
            }
        }
        sb.append(">");
        System.out.println(sb);
    }
}
