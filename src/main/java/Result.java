import java.util.ArrayList;
import java.util.List;



public class Result {

    private static final int MINIMAL_GRADE = 40-2;// minimum to round up


    public static List<Integer> gradingStudents(List<Integer> grades){

        List<Integer> gradesToReturn = new ArrayList<>();

        for (int i = 1; i < grades.size(); i++) {



            int grade = grades.get(i);

            int next = 0;
            int mod = 0;
            int tens = 0;

            if (grade >= MINIMAL_GRADE) {

            }

            gradesToReturn.add(grade);
        }

        return gradesToReturn;
    }

    public static void main(String[] args) {


    }


}
