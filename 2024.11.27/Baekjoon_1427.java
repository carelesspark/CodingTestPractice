import java.util.*;
import java.io.*;

public class Baekjoon_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        
        char[] temp = input.toCharArray();

        Arrays.sort(temp);

        System.out.println(sb.append(temp).reverse().toString());
    }
}
