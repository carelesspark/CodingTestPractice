import java.util.*;
import java.io.*;

public class Baekjoon_10825 {
    static class Student {
        String name;
        int kor;
        int eng;
        int math;
    
        public Student(String name, int kor, int eng, int math) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        List<Student> students = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            int kor = Integer.parseInt(st.nextToken());
            int eng = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());

            students.add(new Student(name, kor, eng, math));
        }

        Collections.sort(students, (s1, s2) -> {
            if(s1.kor != s2.kor) {
                return s2.kor - s1.kor;
            } else if(s1.eng != s2.eng) {
                return s1.eng - s2.eng;
            } else if(s1.math != s2. math) {
                return s2.math - s1.math;
            } else {
                return s1.name.compareTo(s2.name);
            }
        });
        

        for(Student student : students) {
            sb.append(student.name).append("\n");
        }

        System.out.println(sb);
    }
}
