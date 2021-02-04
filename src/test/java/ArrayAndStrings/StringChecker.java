package ArrayAndStrings;

public class StringChecker {

    private final String stringToCheck;

    public StringChecker(String testString) {
        this.stringToCheck = testString;
    }

    public boolean isUnique() {
        if(stringToCheck == null || stringToCheck.isEmpty()) return false;
        for(int i = 0; i < stringToCheck.length(); i++){
            char baseChar = stringToCheck.charAt(i);
            for(int j = i+1; j < stringToCheck.length(); j++){
                char tocheckChar = stringToCheck.charAt(j);
                if (tocheckChar == baseChar) return false;
            }
        }
        return true;
    }
}
