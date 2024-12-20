import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class Baekjoon_1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int max = 0;

        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++) {
            String book = br.readLine();
            map.put(book, map.getOrDefault(book, 0) + 1);
            max = Math.max(max, map.get(book));
        }

        List<String> list = new ArrayList<>();
        
        for(Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() == max) {
                list.add(entry.getKey());
            }
        }
        
        Collections.sort(list);    
        System.out.println(list.get(0));
    }
}
