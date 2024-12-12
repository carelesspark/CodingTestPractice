import java.util.*;
import java.io.*;

public class Baekjoon_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashMap<Integer, String> keyToValue = new HashMap<>();
        HashMap<String, Integer> valueToKey = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i = 1; i <= N; i++) {
            String name = br.readLine();
            keyToValue.put(i, name);
            valueToKey.put(name, i);
        }        


        for(int i = 0; i < M; i++) {
            String find = br.readLine();
            if(find.charAt(0) >= '0' && find.charAt(0) <= '9') {
                int num = Integer.parseInt(find);
                sb.append(keyToValue.get(num)).append("\n");
            } else {
                sb.append(valueToKey.get(find)).append("\n");
            }
        }

        System.out.println(sb);
    }
}
