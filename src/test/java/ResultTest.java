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
    @Test
    @DisplayName("test 7 - grade is 0")
    void gradeIs0() {

        List<Integer> list1 = Arrays.asList(2, 37, 0);
        List<Integer> expected = Arrays.asList(37, 0);
        List<Integer> actual = Result.gradingStudents(list1);

        assertTrue(expected.size() == actual.size()
                && expected.containsAll(actual)
                && actual.containsAll(expected));
    }
    @Test
    @DisplayName("test 8 - grade is negativ number")
    void gradeIsNegativ() {

        List<Integer> list1 = Arrays.asList(2, 37, -3);
        List<Integer> expected = Arrays.asList(2, 37, -3); //list wil be returned without change
        List<Integer> actual = Result.gradingStudents(list1);

        assertTrue(expected.size() == actual.size()
                && expected.containsAll(actual)
                && actual.containsAll(expected));
    }
    @Test
    @DisplayName("test 9 - grade is greater then 100")
    void gradeIsMore100() {

        List<Integer> list1 = Arrays.asList(2, 37, 102);
        List<Integer> expected = Arrays.asList(2, 37, 102); //list wil be returned without change
        List<Integer> actual = Result.gradingStudents(list1);

        assertTrue(expected.size() == actual.size()
                && expected.containsAll(actual)
                && actual.containsAll(expected));
    }
    @Test
    @DisplayName("test 10 - correct student count grade count")
    void testCorrectStudentVsGarage() {

        List<Integer> list1 = Arrays.asList(1, 37);
        List<Integer> expected = Arrays.asList(37);
        List<Integer> actual = Result.gradingStudents(list1);

        assertTrue(expected.size() == actual.size()
                && expected.containsAll(actual)
                && actual.containsAll(expected));
    }

    @Test
    @DisplayName("test 11 - incorrect student count vs grade count")
    void testIncorrectStudentVsGarage() {

        List<Integer> list1 = Arrays.asList(2, 37);
        List<Integer> expected = Arrays.asList(2, 37); //list wil be returned without change
        List<Integer> actual = Result.gradingStudents(list1);

        assertTrue(expected.size() == actual.size()
                && expected.containsAll(actual)
                && actual.containsAll(expected));
    }
    @Test
    @DisplayName("test 12 - incorrect student count vs grade count")
    void testIncorrectStudentVsGarageNegative() {

        List<Integer> list1 = Arrays.asList(-2, 37);
        List<Integer> expected = Arrays.asList(-2, 37); //list wil be returned without change
        List<Integer> actual = Result.gradingStudents(list1);

        assertTrue(expected.size() == actual.size()
                && expected.containsAll(actual)
                && actual.containsAll(expected));
    }
    @Test
    @DisplayName("test 13 - student count to high")
    void testStudentCountToHigh() {

        List<Integer> list1 = Arrays.asList(62, 49,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1);
        List<Integer> expected = Arrays.asList(62, 49,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1); //list wil be returned without change
        List<Integer> actual = Result.gradingStudents(list1);

        assertTrue(expected.size() == actual.size()
                && expected.containsAll(actual)
                && actual.containsAll(expected));
    }
    @Test
    @DisplayName("test 14 - empty list")
    void emptyList() {

        List<Integer> list1 = Arrays.asList();
        List<Integer> expected = Arrays.asList();
        List<Integer> actual = Result.gradingStudents(list1);

        assertTrue(expected.size() == actual.size()
                && expected.containsAll(actual)
                && actual.containsAll(expected));
    }
    @Test
    @DisplayName("test 15 - null list")
    void nullList() {

        List<Integer> list1 =null;
        List<Integer> expected = null;
        List<Integer> actual = Result.gradingStudents(list1);

        assertTrue(actual==null);
    }


}
