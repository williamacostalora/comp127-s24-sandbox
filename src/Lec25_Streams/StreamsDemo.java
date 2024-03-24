package Lec25_Streams;

import java.util.List;
import java.util.LinkedList;
import java.util.Random;
import static java.util.stream.Collectors.toList;

public class StreamsDemo {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        List<Student> students = generateRandomStudents(1_000_000);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime)/1000000;
        
        System.out.println("Number of students: " + students.size() + 
                           " (" + duration + "ms)");

        startTime = System.nanoTime();
        List<Student> lowGpaStudents = getLowGpaStudents(students);
        endTime = System.nanoTime();
        duration = (endTime - startTime)/1000000;
        System.out.println("Number of low GPA students: " + lowGpaStudents.size() + 
                           " (" + duration + "ms)");

        startTime = System.nanoTime();
        List<Student> lowGpaStudents2 = getLowGpaStudents2(students);
        endTime = System.nanoTime();
        duration = (endTime - startTime)/1000000;
        System.out.println("Number of low GPA students: " + lowGpaStudents2.size() + 
                            " (" + duration + "ms)");

    }
    
    private static List<Student> generateRandomStudents(int num) {
        List<Student> students = new LinkedList<>();
        
        Random rand = new Random();
        for(int i=0; i<num; i++) {
            students.add(new Student(""+i, rand.nextDouble(4.0)));
        }

        return students;
    }

    public static List<Student> getLowGpaStudents(List<Student> students) {
        return students.stream()
                       .filter(s -> s.getGpa() <= 2.0)
                       .collect(toList());
    }

    public static List<Student> getLowGpaStudents2(List<Student> students) {
        return students.parallelStream()
                       .filter(s -> s.getGpa() <= 2.0)
                       .collect(toList());
    }
}
