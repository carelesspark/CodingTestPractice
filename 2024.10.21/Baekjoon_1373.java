import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Baekjoon_1373 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();

        BigInteger change = new BigInteger(n , 2);

        String result = change.toString(8);

        System.out.println(result);
    }
}
