import java.io.*;
import java.util.*;

public class Baekjoon_1259 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            StringBuilder sb = new StringBuilder();

            String n = br.readLine();
            
            if(n.equals("0")){
                break;
            }

            
            String reversedN = sb.append(n).reverse().toString();

            if(n.equals(reversedN)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
