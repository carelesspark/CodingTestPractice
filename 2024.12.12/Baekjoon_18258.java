import java.util.*;
import java.io.*;

public class Baekjoon_18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new ArrayDeque<>();
        
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String status = st.nextToken();

            if(status.equals("push")) {
                int x = Integer.parseInt(st.nextToken());
                deque.addFirst(x);
            } else if(status.equals("pop")) {
                sb.append(!deque.isEmpty() ? deque.pollLast() : -1).append("\n");
            } else if(status.equals("size")) {
                sb.append(deque.size()).append("\n");
            } else if(status.equals("empty")) {
                sb.append(deque.isEmpty() ? 1 : 0).append("\n");
            } else if(status.equals("front")) {
                sb.append(!deque.isEmpty() ? deque.getLast() : -1).append("\n");
            } else if(status.equals("back")) {
                sb.append(!deque.isEmpty() ? deque.getFirst() : -1).append("\n");
            }
        }
        System.out.println(sb);
    }
}
