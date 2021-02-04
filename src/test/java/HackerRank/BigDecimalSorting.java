package HackerRank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class BigDecimalSorting {

    @Test
    public void BigDecimalSortSpec(){
        String[] inputs = {"9", "-100", "50"};
        String[] expected = {"-100", "9", "50"};
        Comparator<String> compareByBigdecimalValue = (String s1, String s2) -> new BigDecimal(s1).compareTo(new BigDecimal(s2));
        Arrays.sort(inputs,compareByBigdecimalValue);
        for (String s: inputs) {
            System.out.println(s);
        }

        Assertions.assertArrayEquals(expected,inputs);
    }
}
