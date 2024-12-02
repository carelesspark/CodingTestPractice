import java.io.*;
import java.util.*;

public class Baekjoon_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashSet<String> hashSet = new HashSet<>();

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            String status = st.nextToken();

            if(status.equals("enter")) {
                hashSet.add(name);
            } else if (status.equals("leave")) {
                hashSet.remove(name);
            }
        }

        List<String> list = new ArrayList<>(hashSet);
        Collections.sort(list, Comparator.reverseOrder());

        for(String temp : list) {
            System.out.println(temp);
        }   
    }   
}
