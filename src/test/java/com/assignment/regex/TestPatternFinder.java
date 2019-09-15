package com.assignment.regex;

import java.io.File;
import java.io.FileInputStream;
import java.sql.DriverManager;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;

public class TestPatternFinder {
    static Properties properties = null;
    
    static{
        try {
            properties = TestUtil.getForProblem1();
        }
        catch(Exception e){
            //should never happen
            e.printStackTrace();
            System.out.println("here");
        }

    }
    
PatternFinder finder = new PatternFinderImpl();


    
    @Test
    public void testFindNoOfOccurrences1() throws Exception{
        String input = "www";
        /**
         * Whether the implementation provides reads the right no of occurrences
         */
        Integer noFromFile = finder.findNoOfOccurrences(input);
        /**
         * Whether the test test giver is able to save information into database
         */
        Integer noFromDatabase = TestUtil.getNoOfOccurrencesFromDb(input);
        
        Assert.assertEquals(noFromFile, noFromDatabase);
        
        Integer answer = Integer.parseInt((String)properties.get("testcase1"));
        Assert.assertEquals(noFromFile, answer);
        
    }
    
    @Test
    public void testFindNoOfOccurrences2() throws Exception{
        String input = "qwerty";
        Integer no = finder.findNoOfOccurrences(input);
         Integer answer = Integer.parseInt((String)properties.get("testcase2"));
         Assert.assertEquals(no, answer);
        
    }
    
    @Test
    public void testFindNoOfOccurrences3() throws Exception{
        String input = "abc";
        Integer no = finder.findNoOfOccurrences(input);
         Integer answer = Integer.parseInt((String)properties.get("testcase3"));
         Assert.assertEquals(no, answer);
        
    }
}
