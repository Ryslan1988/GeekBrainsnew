import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static Java3HW6.Java3HW6.checkFourOreOne;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestHW6 {

    @Test
    public void test1OneOreFour() throws Exception {
        int[] ints = {1, 4};
        assertTrue(checkFourOreOne(ints), "1 и 4 присутствуют");
    }

    @Test
    public void test2OneOreFour() throws Exception {
        int[] ints = {1, 6, 7, 4, 3, 8, 9};
        assertTrue(checkFourOreOne(ints), "1 и 4 в большом массиве");
    }

    @Test
    public void test3OneOreFour() throws Exception {
        int[] ints = {1, 6, 7, 3, 8, 9};
        assertFalse(checkFourOreOne(ints), "только 1 в массиве");
    }

    @Test
    public void test4OneOreFour() throws Exception {
        int[] ints = {6, 7, 4, 8, 9};
        assertFalse(checkFourOreOne(ints), "только 4 в массиве");
    }

    @CsvFileSource(files = "test_files/testF.csv")
    @ParameterizedTest
    public void test5OneOreFour( int[] ints) throws Exception {

        assertFalse(checkFourOreOne(ints), "проверка поиска алгоритма совпадения 1 и 4");
    }

    @Test()
    public void isExceptionIsNo4() throws Exception {
        int[] ints = {2, 3, 5, 2, 2, 8,7,9};
        checkFourOreOne(ints);

    }
}
