import java.util.*;
import java.io.*;

public class Baekjoon_1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int tempE = 0;
        int tempS = 0;
        int tempM = 0;
        int year = 0;


        while (true) {
            year++;

            if(tempE >= 15) {
                tempE = 0;
            }

            if(tempS >= 28) {
                tempS = 0;
            }

            if(tempM >= 19) {
                tempM = 0;
            }

            tempE++;
            tempS++;
            tempM++;

            if(E == tempE && S == tempS && M == tempM) {
                break;
            }
        }

        System.out.println(year);
    }
}
