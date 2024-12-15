import java.util.*;
import java.io.*;

public class Baekjoon_28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String status = st.nextToken();

            if(status.equals("1")) {
                deque.addFirst(Integer.parseInt(st.nextToken()));
            } else if(status.equals("2")) {
                sb.append(!deque.isEmpty() ? deque.pop() : -1).append("\n");
            } else if(status.equals("3")) {
                sb.append(deque.size()).append("\n");
            } else if(status.equals("4")) {
                sb.append(deque.isEmpty() ? 1 : 0).append("\n");
            } else if(status.equals("5")) {
                sb.append(!deque.isEmpty() ? deque.getFirst() : -1).append("\n");
            }
        }

        System.out.println(sb);
    }
}
