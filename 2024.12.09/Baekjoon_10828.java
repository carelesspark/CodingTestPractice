import java.io.*;
import java.util.*;

public class Baekjoon_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String status = st.nextToken();

            if(status.equals("push")) {
                int X = Integer.parseInt(st.nextToken());
                stack.push(X);
            } else if(status.equals("pop")) {
                if(stack.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(stack.pop()).append("\n");
                }
            } else if(status.equals("size")) {
                sb.append(stack.size()).append("\n");
            } else if(status.equals("empty")) {
                sb.append(stack.isEmpty() ? 1 : 0).append("\n");
            } else if (status.equals("top")) {
                if(stack.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(stack.peek()).append("\n");
                }
            } 
        }
        System.out.println(sb);
    }     
}
