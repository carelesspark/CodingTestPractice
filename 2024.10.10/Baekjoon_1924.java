import java.util.*;
import java.io.*;

public class Baekjoon_1924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());

        int[] cal = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int totalDays = 0;

        for(int i = 1; i < month; i++) {
            totalDays += cal[i];
        }

        totalDays += day;

        System.out.println(week[totalDays % 7]);
    }
}