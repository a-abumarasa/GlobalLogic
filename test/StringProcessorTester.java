/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import tasks.first.StringProcessor;

/**
 *
 * @author aabum
 */
public class StringProcessorTester {

    public StringProcessorTester() {
    }

    @Test
    public void normalTest1() {
        Object actualResult = StringProcessor.findFirstNonRepeatedChar("Streets");
        Object expectedResult = 'r';
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void normalTest2() {
        Object actualResult = StringProcessor.findFirstNonRepeatedChar("aaebbc");
        Object expectedResult = 'e';
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void repeatedStringTest() {
        Object actualResult = StringProcessor.findFirstNonRepeatedChar("abab");
        Object expectedResult = null;
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void emptyStringTest() {
        Object actualResult = StringProcessor.findFirstNonRepeatedChar("");
        Object expectedResult = null;
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void nullInputTest() {
        Object actualResult = StringProcessor.findFirstNonRepeatedChar(null);
        Object expectedResult = null;
        assertEquals(actualResult, expectedResult);
    }

}
