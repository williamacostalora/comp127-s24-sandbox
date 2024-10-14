package Lec25_Streams;

import java.util.List;
import java.util.LinkedList;
import java.util.Random;
import static java.util.stream.Collectors.toList;

public class StreamsDemo {
    public static void main(String[] args) {
        long startTime, endTime;
        
        // generate some students
        startTime = System.nanoTime();
        List<Student> students = generateRandomStudents(100_000);
        endTime = System.nanoTime();
        printExecutionSummary(startTime, endTime, 
                              students, 
                              "Initial number of students");        

        // students with GPA less than 2.0, non-parallel fashion
        startTime = System.nanoTime();
        List<Student> lowGpaStudents = getLowGpaStudents(students);
        endTime = System.nanoTime();
        printExecutionSummary(startTime, endTime, 
                              lowGpaStudents, 
                              "NP, Number of low GPA students");

        // students with GPA less than 2.0, parallel fashion
        startTime = System.nanoTime();
        List<Student> lowGpaStudents2 = getLowGpaStudents_parallel(students);
        endTime = System.nanoTime();
        printExecutionSummary(startTime, endTime, 
                              lowGpaStudents2, 
                              " P, Number of low GPA students");
    }
    
    private static List<Student> generateRandomStudents(int num) {
        List<Student> students = new LinkedList<>();
        
        Random rand = new Random();
        for(int i=0; i<num; i++) {
            students.add(new Student(""+i, rand.nextDouble(4.0)));
        }

        return students;
    }

    private static List<Student> getLowGpaStudents(List<Student> students) {
        return students.stream()
                       .filter(s -> s.getGpa() <= 2.0)
                       .collect(toList());
    }

    private static List<Student> getLowGpaStudents_parallel(List<Student> students) {
        return students.parallelStream()
                       .filter(s -> s.getGpa() <= 2.0)
                       .collect(toList());
    }

    private static void printExecutionSummary(long startTime, long endTime, 
                                              List<Student> students,
                                              String label) {
        long duration = (endTime - startTime)/1000000;
        System.out.println(label + ": " + students.size() + " (" + duration + "ms)");
    }
}
