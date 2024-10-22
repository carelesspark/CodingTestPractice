import java.util.*;
import java.io.*;

public class Baekjoon_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] temp = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for(String word : temp) {
            input = input.replace(word, "1");
        }

        System.out.println(input.length());
    }
}
