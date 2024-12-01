import java.io.*;
import java.util.*;

public class Baekjoon_11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        
        int bitSet = 0;

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String command = st.nextToken();
            int x = 0;

            if (st.hasMoreTokens()) {
                x = Integer.parseInt(st.nextToken());
            }

            switch (command) {
                case "add":
                    bitSet |= (1 << (x - 1));
                    break;
                case "remove":
                    bitSet &= ~(1 << (x - 1));
                    break;
                case "check":
                    sb.append((bitSet & (1 << (x - 1))) != 0 ? 1 : 0).append('\n');
                    break;
                case "toggle":
                    bitSet ^= (1 << (x - 1));
                    break;
                case "all":
                    bitSet = (1 << 20) - 1;
                    break;
                case "empty":
                    bitSet = 0;
                    break;
            }
        }
        System.out.print(sb);
    }

}
