import java.util.*;
import java.io.*;

public class Baekjoon_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String status = st.nextToken();

            if(status.equals("push")) {
                deque.addLast(Integer.parseInt(st.nextToken()));
            } else if(status.equals("pop")) {
                sb.append(deque.isEmpty() ? -1 : deque.pollFirst()).append("\n");
            } else if(status.equals("size")) {
                sb.append(deque.size()).append("\n");
            } else if(status.equals("empty")) {
                sb.append(deque.isEmpty() ? 1 : 0).append("\n");
            } else if(status.equals("front")) {
                sb.append(deque.isEmpty() ? -1 : deque.peekFirst()).append("\n");
            } else if(status.equals("back")) {
                sb.append(deque.isEmpty() ? -1 : deque.peekLast()).append("\n");
            }
        }

        System.out.println(sb);
    }
}
