/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import sample.DateValidator;

/**
 *
 * @author DELL
 */
public class DateValidatorTest {
    
    @Test
    public void test() {
        
        DateValidator tester = new DateValidator();
        //Date Format test
        assertEquals(false, tester.checkDateFormat(""));
        assertEquals(false, tester.checkDateFormat("ab/cd/efgh"));
        assertEquals(false, tester.checkDateFormat("15\12/2016"));
        assertEquals(false, tester.checkDateFormat("1a/12/2016"));
        assertEquals(false, tester.checkDateFormat("10/12/201"));
        assertEquals(false, tester.checkDateFormat("3/1/2016"));
        assertEquals(false, tester.checkDateFormat("31/1/2016"));
        assertEquals(false, tester.checkDateFormat("3/31/2016"));
        assertEquals(false, tester.checkDateFormat("30/31/16"));
        assertEquals(true, tester.checkDateFormat("99/99/9999"));
        //Date Valid test
        assertEquals(false, tester.validateDate("99/99/9999"));
        assertEquals(false, tester.validateDate("13/12/2016"));
        assertEquals(false, tester.validateDate("11/31/2016"));
        assertEquals(false, tester.validateDate("02/29/2018"));
        assertEquals(true, tester.validateDate("02/29/2016"));
        assertEquals(true, tester.validateDate("12/31/2016"));
        //assertEquals(false, tester.validateDate("12/31/2016")); // check build in jenkins
    }
    
}
