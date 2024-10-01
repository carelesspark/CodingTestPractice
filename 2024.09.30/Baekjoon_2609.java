import java.io.*;
import java.util.*;

public class Baekjoon_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int d = temp(A, B);

        System.out.println(d);
        System.out.println((A * B) / d);
    }

    public static int temp(int A, int B){
        while(B != 0){
            int r = A % B;
            A = B;
            B = r;
        }

        return A;
    }
}
