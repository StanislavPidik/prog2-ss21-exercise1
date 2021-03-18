import java.util.ArrayList;
import java.util.List;

//  https://github.com/StanislavPidik/prog2-ss21-exercise1.git

public class Result {

    private static final int MINIMAL_GRADE_FOR_ROUND = 40 - 2;// minimum to round up
    private static final int LIMIT_ROUND_UP = 3;// limit to round up
    private static final int MINIMAL_GRADE = 0;// limit to round up
    private static final int MAXIMAL_GRADE = 100;// limit to round up
    private static final int MINIMAL_GRADE_COUNT = 1;// limit to round up
    private static final int MAXIMAL_GRADE_COUNT = 60;// limit to round up

    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> gradesToReturn = new ArrayList<>();

        if (grades == null || grades.isEmpty()) {
            System.out.println("List is empty of null - grade list wil be returned without change!");
            return grades;

        } else if (grades.get(0) == (grades.size() - 1) && grades.get(0) >= MINIMAL_GRADE_COUNT && grades.get(0) <= MAXIMAL_GRADE_COUNT) {
            for (int i = 1; i < grades.size(); i++) {


                int grade = grades.get(i);
                int next = 0;
                int mod = 0;
                int tens = 0;

                if (grade >= MINIMAL_GRADE && grade <= MAXIMAL_GRADE) {
                    if (grade >= MINIMAL_GRADE_FOR_ROUND) {
                        mod = grade % 10;
                        tens = grade - mod;
                        if (mod > 5) {
                            next = tens + 10;
                        } else {
                            next = tens + 5;
                        }
                        if (next - grade < LIMIT_ROUND_UP) {
                            grade += next - grade;
                        }
                    }
                } else {
                    System.out.println("Wrong grade(s) inside the list - grade list wil be returned without change!");
                    return grades;
                }
                gradesToReturn.add(grade);
            }
        } else {
            System.out.println("Wrong student count - grade list wil be returned without change!");
            return grades;
        }
        return gradesToReturn;
    }

    public static void main(String[] args) {


    }


}
