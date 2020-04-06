package org.util;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Classe de test de PartitionUtil.
 */
public class PartitionUtilTest {

    Integer[] arrayToConvert = new Integer[]{1, 2, 3, 4, 5};
    Integer[] emptyArray = new Integer[]{};

    @Test
    public void testPartitionArrayOfIntegers_SizeOne() {
        List<List<Integer>> arrayResult = PartitionUtil.partition(Arrays.asList(arrayToConvert), 1);
        List<List<Integer>> expectedArrayResult = Arrays.asList(Arrays.asList(1), Arrays.asList(2), Arrays.asList(3), Arrays.asList(4), Arrays.asList(5));

        assertEquals(expectedArrayResult, arrayResult);
    }

    @Test
    public void testPartitionArrayOfIntegers_SizeTwo() {
        List<List<Integer>> arrayResult = PartitionUtil.partition(Arrays.asList(arrayToConvert), 2);
        List<List<Integer>> expectedArrayResult = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5));

        assertEquals(expectedArrayResult, arrayResult);
    }

    @Test
    public void testPartitionArrayOfIntegers_SizeThree() {
        List<List<Integer>> arrayResult = PartitionUtil.partition(Arrays.asList(arrayToConvert), 3);
        List<List<Integer>> expectedArrayResult = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5));

        assertEquals(expectedArrayResult, arrayResult);
    }

    @Test
    public void testPartitionArrayOfIntegers_SizeTen() {
        List<List<Integer>> arrayResult = PartitionUtil.partition(Arrays.asList(arrayToConvert), 10);
        List<List<Integer>> expectedArrayResult = Arrays.asList(Arrays.asList(1, 2, 3, 4, 5));

        assertEquals(expectedArrayResult, arrayResult);
    }

    @Test
    public void testPartitionArrayOfIntegers_EmptyList() {

        List<List<Integer>> arrayResult = PartitionUtil.partition(Arrays.asList(emptyArray), 1);
        List<List<Object>> expectedArrayResult = Arrays.asList(Arrays.asList());

        assertEquals(expectedArrayResult, arrayResult);
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void testPartition_ListNull_ExceptionThrown() {
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("la liste ne doit pas être nulle.");
        List<List<Integer>> arrayResult = PartitionUtil.partition(null, 2);
    }

    @Test
    public void testPartition_SizeZero_ExceptionThrown() {
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("la taille doit être strictement supérieure à 0.");
        List<List<Integer>> arrayResult = PartitionUtil.partition(Arrays.asList(arrayToConvert), 0);
    }

    @Test
    public void testPartition_SizeNegative_ExceptionThrown() {
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("la taille doit être strictement supérieure à 0.");
        List<List<Integer>> arrayResult = PartitionUtil.partition(Arrays.asList(arrayToConvert), -111);
    }

}