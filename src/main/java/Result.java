import java.util.ArrayList;
import java.util.List;


public class Result {

    private static final int MINIMAL_GRADE_FOR_ROUND = 40 - 2;// minimum to round up
    private static final int LIMIT_ROUND_UP = 3;// limit to round up
    private static final int MINIMAL_GRADE = 0;// limit to round up
    private static final int MAXIMAL_GRADE = 100;// limit to round up

    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> gradesToReturn = new ArrayList<>();

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

        return gradesToReturn;
    }

    public static void main(String[] args) {


    }


}
