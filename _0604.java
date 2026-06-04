import java.util.Scanner;

public class _0604 {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Scanner sc = new Scanner(System.in);

        int[] scores = new int[5];
        int sum = 0;

        System.out.println("학생 5명의 점수를 입력하세요.");

        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "번 학생 점수: ");
            scores[i] = sc.nextInt();
            sum += scores[i];
        }

        double avg = (double) sum / scores.length;

        System.out.println("\n===== 결과 =====");

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "번 학생: " + scores[i] + "점");
        }

        System.out.println("총점: " + sum);
        System.out.println("평균: " + avg);

        if (avg >= 90) {
            System.out.println("학점: A");
        } else if (avg >= 80) {
            System.out.println("학점: B");
        } else if (avg >= 70) {
            System.out.println("학점: C");
        } else if (avg >= 60) {
            System.out.println("학점: D");
        } else {
            System.out.println("학점: F");
        }

        sc.close();


        Student s1 = new Student("만두", 20);
        Student s2 = new Student("고양이", 22);

        s1.introduce();
        s2.introduce();
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.println("안녕하세요. 저는 " + name + "이고 " + age + "살입니다.");
    }
}