package prep;

enum Grade {A, B, C, D, F}

public class EnumeratedType {
    public static final String[] Grade2 = {"A", "B", "C", "D", "F"};

    public static void main(String[] args) {
        Grade stu1Grade = Grade.A;

        System.out.println(stu1Grade);
        System.out.println(stu1Grade.ordinal());
        System.out.println(stu1Grade.name());

        EnumeratedType.Grade2[0] = "Aminus";
        // EnumeratedType.Grade2 = {"Aminus"};
        String stu2Grade = Grade2[0];
        System.out.println(stu2Grade);
    }
}
