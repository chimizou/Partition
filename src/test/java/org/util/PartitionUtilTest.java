package org.util;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Classe de test de Partition.
 */
public class PartitionUtilTest {

    Integer[] arrayToConvert = new Integer[]{1, 2, 3, 4, 5};
    Object[] arrayOfObjectsToConvert = new Object[]{"1", 2, "mot", "Ceci est une phrase", 5};

    @Test
    public void testPartitionArrayOfIntegersSizeOne() {
        List<List<Integer>> arrayResult = PartitionUtil.partition(Arrays.asList(arrayToConvert), 1);
        List<List<Integer>> expectedArrayResult = Arrays.asList(Arrays.asList(1), Arrays.asList(2), Arrays.asList(3), Arrays.asList(4), Arrays.asList(5));

        assertEquals(expectedArrayResult, arrayResult);
        assertEquals(5, arrayResult.size());
        assertEquals(1, arrayResult.get(0).size());
    }

    @Test
    public void testPartitionArrayOfIntegersSizetwo() {
        List<List<Integer>> arrayResult = PartitionUtil.partition(Arrays.asList(arrayToConvert), 2);
        List<List<Integer>> expectedArrayResult = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5));

        assertEquals(expectedArrayResult, arrayResult);
        assertEquals(3, arrayResult.size());
        assertEquals(2, arrayResult.get(0).size());
        assertEquals(1, arrayResult.get(2).size());
    }

    @Test
    public void testPartitionArrayOfIntegersSizethree() {
        List<List<Integer>> arrayResult = PartitionUtil.partition(Arrays.asList(arrayToConvert), 3);
        List<List<Integer>> expectedArrayResult = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5));

        assertEquals(expectedArrayResult, arrayResult);
        assertEquals(2, expectedArrayResult.size());
        assertEquals(3, arrayResult.get(0).size());
        assertEquals(2, arrayResult.get(1).size());
    }

    @Test
    public void testPartitionArrayOfIntegersSizeTen() {
        List<List<Integer>> arrayResult = PartitionUtil.partition(Arrays.asList(arrayToConvert), 10);
        List<List<Integer>> expectedArrayResult = Arrays.asList(Arrays.asList(1, 2, 3, 4, 5));

        assertEquals(expectedArrayResult, arrayResult);
        assertEquals(1, expectedArrayResult.size());
        assertEquals(5, expectedArrayResult.get(0).size());
    }

    @Test
    public void testPartitionArrayOfObjectsSizeOne() {
        List<List<Object>> arrayResult = PartitionUtil.partition(Arrays.asList(arrayOfObjectsToConvert), 1);
        List<List<Object>> expectedArrayResult = Arrays.asList(Arrays.asList((Object) "1"), Arrays.asList((Object) 2), Arrays.asList((Object) "mot"), Arrays.asList((Object) "Ceci est une phrase"), Arrays.asList((Object) 5));

        assertEquals(expectedArrayResult, arrayResult);
        assertEquals(5, expectedArrayResult.size());
        assertEquals(1, expectedArrayResult.get(0).size());
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void testPartition_ListNull_ExceptionThrown() {
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("la liste ne doit pas être nul.");
        List<List<Integer>> arrayResult = PartitionUtil.partition(null, 2);
    }

    @Test
    public void testPartition_SizeZero_ExceptionThrown() {
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("la taille doit être strictement supérieur à 0.");
        List<List<Integer>> arrayResult = PartitionUtil.partition(Arrays.asList(arrayToConvert), 0);
    }

    @Test
    public void testPartition_SizeNegative_ExceptionThrown() {
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("la taille doit être strictement supérieur à 0.");
        List<List<Integer>> arrayResult = PartitionUtil.partition(Arrays.asList(arrayToConvert), -111);
    }

}