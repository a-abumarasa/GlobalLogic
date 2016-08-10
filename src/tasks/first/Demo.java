package tasks.first;

/**
 *
 * Demo to find first non repeated char
 */
public class Demo {   
    public static void main(String[] args) { 
        String testString = "Streets";
        char firstNonRepeatedChar = StringProcessor.findFirstNonRepeatedChar(testString);
        System.out.println(String.format("First non repeated character of the string \"%s\": is '%s'", testString , firstNonRepeatedChar));
    }
}