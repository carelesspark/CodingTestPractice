import java.util.*;
import java.io.*;

public class Baekjoon_17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        HashMap<String, String> adrPw = new HashMap<>();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String address = st.nextToken();
            String password = st.nextToken();
            adrPw.put(address, password);
        }

        for(int i = 0; i < M; i++) {
            String address = br.readLine();
            sb.append(adrPw.get(address)).append("\n");
        }

        System.out.println(sb);
    }
}
