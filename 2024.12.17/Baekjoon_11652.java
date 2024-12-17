import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class Baekjoon_11652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<Long, Integer> map = new HashMap<>();
        List<Long> list = new ArrayList<>();
        int max = 0;

        for(int i = 0; i < N; i++) {
            long num = Long.parseLong(br.readLine());
            map.put(num, map.getOrDefault(num, 0) + 1);
            max = Math.max(max, map.get(num));
            
        }

        for(Entry<Long, Integer> entry : map.entrySet()) {
            if(max == entry.getValue()) {
                list.add(entry.getKey());
            }
        }

        Collections.sort(list);
        System.out.println(list.get(0));
    }
}
