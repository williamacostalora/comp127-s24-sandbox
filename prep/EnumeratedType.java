package prep;

enum Grade {A, B, C, D, F}

public class EnumeratedType {
    public static void main(String[] args) {
        Grade stu1Grade = Grade.A;

        System.out.println(stu1Grade);
        System.out.println(stu1Grade.ordinal());
        System.out.println(stu1Grade.name());
    }
}
