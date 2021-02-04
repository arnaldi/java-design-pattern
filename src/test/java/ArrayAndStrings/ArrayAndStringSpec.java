package ArrayAndStrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayAndStringSpec {

    @Test
    void stringHasAllUniqueChars(){
        String testStringTrue = "abcdefgh";
        String testStringFalse = "abcdefgha";
        StringChecker stringChecker = new StringChecker(testStringTrue);
        StringChecker stringCheckerFalse = new StringChecker(testStringFalse);
        Assertions.assertTrue(stringChecker.isUnique());
        Assertions.assertFalse(stringCheckerFalse.isUnique());
    }

    void reverseCStyleStringTest(){
        
    }
}
