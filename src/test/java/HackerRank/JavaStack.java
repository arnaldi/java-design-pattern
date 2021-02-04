package HackerRank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;
import java.util.function.Predicate;

public class JavaStack {

    @Test
    void checkIfBalanced(){
        String input = "{}()";
        String wrongInput = "{}[()";
        Stack<Character> charStack = new Stack<>();
        Predicate<String> reverseBracketPredicate = (String s) -> {
            for(Character c : input.toCharArray()){
                if(c == '{' || c == '(' || c == '['){
                    charStack.push(c);
                    continue;
                }
                if(charStack.isEmpty()){
                    return  false;
                }

                char temp = 0;
                switch (c){
                    case '}':
                        temp = charStack.pop();
                        if(temp == '[' || temp == '(')
                            return false;
                        break;
                    case ']':
                        temp = charStack.pop();
                        if(temp == '{' || temp == '(')
                            return false;
                        break;
                    case ')':
                        temp = charStack.pop();
                        if(temp == '[' || temp == '{')
                            return false;
                        break;
                }



            }
            return charStack.empty();
        };
        boolean checkBalanceResult = checkReverseBracket(input);
        Assertions.assertTrue(checkBalanceResult);
        Assertions.assertFalse(checkReverseBracket(wrongInput));
        Assertions.assertTrue(reverseBracketPredicate.test(input));

    }

    boolean checkReverseBracket(String input){
        char leftCurlyBracket = '{';
        char leftSquareBracket = '[';
        char leftRoundBracket = '(';

        Stack<Character> charStack = new Stack<>();
        char[] rightBracket = {'}',']',')'};
        for(Character c : input.toCharArray()){
            if(c == '{' || c == '(' || c == '['){
                charStack.push(c);
                continue;
            }
            if(charStack.isEmpty()){
                return  false;
            }

            char temp = 0;
            switch (c){
                case '}':
                    temp = charStack.pop();
                    if(temp == '[' || temp == '(')
                        return false;
                    break;
                case ']':
                    temp = charStack.pop();
                    if(temp == '{' || temp == '(')
                        return false;
                    break;
                case ')':
                    temp = charStack.pop();
                    if(temp == '[' || temp == '{')
                        return false;
                    break;
            }



        }

    return charStack.empty();
    }
}
