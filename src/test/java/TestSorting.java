import com.donatasd.utils.SortingUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * TODO Add file description
 *
 * @author Donatas Daubaras
 */
public class TestSorting {

    private static List<Integer> list = Arrays.asList(1,2,3,4,5);
    private static List<Integer> test = Arrays.asList(1,2,3,4,5);

    @Test
    public void TestInsertionSort() {
        Collections.shuffle(list);
        SortingUtils.insertionSort(list);
        Assert.assertEquals(test, list);
    }
}
