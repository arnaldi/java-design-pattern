package HackerRank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class LambdaChecker {

    @Test
    void checkIsOdd(){

            Function<Integer, String> isOddF = (i) -> { if (i%2 == 0){
                return "false";
            }else{
                return "true";

            }};
            String resultOdd = isOddF.apply(5);
            String resultEven = isOddF.apply(4);
        Assertions.assertEquals("true",resultOdd);
        Assertions.assertEquals("false",resultEven);

    }

    @Test
    void checkIsPrime(){
        Predicate<Integer> isPrime = n -> IntStream.range(2, (int) Math.sqrt(n+1))
                .noneMatch(i -> n%i == 0);
        boolean isNotPrimeResult = isPrime.test(30);
        Assertions.assertFalse(isNotPrimeResult);

        List<Integer> intList = Arrays.asList(3,4,5,6,7,8,10);
        intList.stream().forEach((Integer i ) -> System.out.println((int) Math.sqrt(i+1)));

    }

    @Test
    void checkIspalindrome(){
        Predicate<Integer> isPalindrome = n -> IntStream.iterate(n, e -> e/10).limit(1l).filter(f -> f >0).map(e -> e%10).reduce(0, (c,e) -> c*10+e) == n;
        Predicate<Integer> isPalindromeUseStringBuilder = n -> Integer.toString(n).equals( new StringBuilder(Integer.toString(n)).reverse().toString());
        boolean isPalindromeResult = isPalindromeUseStringBuilder.test(898);
        Assertions.assertTrue(isPalindromeResult);
    }
}
