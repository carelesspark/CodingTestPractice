import java.util.*;
import java.io.*;

public class Baekjoon_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] score = new String[20][3];
        String[] gradeAlpha = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
        double[] scoreNum = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};

        double gradeTotal = 0;
        double scoreSum = 0;

        for(int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            score[i][0] = st.nextToken();
            score[i][1] = st.nextToken();
            score[i][2] = st.nextToken();

            if(score[i][2].equals("P")){
                continue;
            }
            gradeTotal += Double.parseDouble(score[i][1]);

            for(int j = 0; j < gradeAlpha.length; j++) {
                if(gradeAlpha[j].equals(score[i][2])) {
                    if(score[i][2].equals("P")) {
                        break;
                    }

                    scoreSum += scoreNum[j] * Double.parseDouble(score[i][1]);
                    break;
                }
            }
        }

        

        for(int i = 0; i < 20; i++) {
            
        }
        
        double result = scoreSum / gradeTotal;
        System.out.printf("%.6f", result);  
    }
}
