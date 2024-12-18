import java.util.*;
import java.io.*;

public class Baekjoon_18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);
        int round = (int)Math.round(N * 0.15);

        for(int i = round; i < N - round; i++) {
            list2.add(list.get(i));
        }

        int sum = 0;
        for(Integer o : list2) {
            sum += o;
        }
        
        int res = (int)Math.round(sum / (double)list2.size());

        System.out.println(res);
    }    
}
