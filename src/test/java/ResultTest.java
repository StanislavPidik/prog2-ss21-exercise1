import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ResultTest {

    @Test
    @DisplayName("test 1 - grade is less then 38")
    void gradeLessThen38() {

        List<Integer> list1 = Arrays.asList(2, 27, 37);
        List<Integer> expected = Arrays.asList(27, 37);
        List<Integer> actual = Result.gradingStudents(list1);

        assertTrue(expected.size() == actual.size()
                && expected.containsAll(actual)
                && actual.containsAll(expected));
    }

    @Test
    @DisplayName("test 2 - difference to the next multiple of 5 is 4,")
    void diffNextMult5Is4() {

        List<Integer> list1 = Arrays.asList(7, 41, 46, 51, 56, 71, 91, 96);
        List<Integer> expected = Arrays.asList(41, 46, 51, 56, 71, 91, 96);
        List<Integer> actual = Result.gradingStudents(list1);

        assertTrue(expected.size() == actual.size()
                && expected.containsAll(actual)
                && actual.containsAll(expected));
    }

    @Test
    @DisplayName("test 3 - difference to the next multiple of 5 is 3,")
    void diffNextMult5Is3() {

        List<Integer> list1 = Arrays.asList(7, 42, 47, 52, 57, 72, 92, 97);
        List<Integer> expected = Arrays.asList(42, 47, 52, 57, 72, 92, 97);
        List<Integer> actual = Result.gradingStudents(list1);

        assertTrue(expected.size() == actual.size()
                && expected.containsAll(actual)
                && actual.containsAll(expected));
    }

    @Test
    @DisplayName("test 4 - difference to the next multiple of 5 is 2,")
    void diffNextMult5Is2() {

        List<Integer> list1 = Arrays.asList(7, 43, 48, 53, 58, 73, 93, 98);
        List<Integer> expected = Arrays.asList(45, 50, 55, 60, 75, 95, 100);
        List<Integer> actual = Result.gradingStudents(list1);

        assertTrue(expected.size() == actual.size()
                && expected.containsAll(actual)
                && actual.containsAll(expected));
    }

    @Test
    @DisplayName("test 5 - difference to the next multiple of 5 is 1,")
    void diffNextMult5Is1() {

        List<Integer> list1 = Arrays.asList(7, 44, 49, 54, 59, 74, 94, 99);
        List<Integer> expected = Arrays.asList(45, 50, 55, 60, 75, 95, 100);
        List<Integer> actual = Result.gradingStudents(list1);

        assertTrue(expected.size() == actual.size()
                && expected.containsAll(actual)
                && actual.containsAll(expected));
    }

    @Test
    @DisplayName("test 6 - difference to the next multiple of 5 is 0,")
    void diffNextMult5Is0() {

        List<Integer> list1 = Arrays.asList(7, 45, 50, 55, 60, 75, 95, 100);
        List<Integer> expected = Arrays.asList(45, 50, 55, 60, 75, 95, 100);
        List<Integer> actual = Result.gradingStudents(list1);

        assertTrue(expected.size() == actual.size()
                && expected.containsAll(actual)
                && actual.containsAll(expected));
    }



}
