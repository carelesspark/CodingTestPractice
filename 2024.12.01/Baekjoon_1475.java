import java.io.*;
import java.util.*;

public class Baekjoon_1475 {
    public static void main(String[] args) throws IOException {
        int[] needSet = new int[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num = br.readLine();

        for (int i = 0; i < num.length(); i++) {
            int N = Character.getNumericValue(num.charAt(i));
            if (N == 6 || N == 9) {
                needSet[6]++;
            } else {
                needSet[N]++;
            }
        }

        needSet[6] = (needSet[6] + 1) / 2;

        int result = Arrays.stream(needSet).max().getAsInt();
        System.out.println(result);
    }
}
