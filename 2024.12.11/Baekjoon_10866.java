import java.util.*;
import java.io.*;

public class Baekjoon_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String status = st.nextToken();

            if(status.equals("push_front")) {
                deque.addFirst(Integer.parseInt(st.nextToken()));
            } else if(status.equals("push_back")) {
                deque.addLast(Integer.parseInt(st.nextToken()));
            } else if(status.equals("pop_front")) {
                sb.append(!deque.isEmpty() ? deque.pollFirst() : -1).append("\n");
            } else if(status.equals("pop_back")) {
                sb.append(!deque.isEmpty() ? deque.pollLast() : -1).append("\n");
            } else if(status.equals("size")) {
                sb.append(deque.size()).append("\n");
            } else if(status.equals("empty")) {
                sb.append(!deque.isEmpty() ? 0 : 1).append("\n");
            } else if(status.equals("front")) {
                sb.append(!deque.isEmpty() ? deque.getFirst() : -1).append("\n");
            } else if(status.equals("back")) {
                sb.append(!deque.isEmpty() ? deque.getLast() : -1).append("\n");
            }
        }

        System.out.println(sb);
    }
}
