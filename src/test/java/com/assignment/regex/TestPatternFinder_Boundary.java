package com.assignment.regex;

import org.junit.Assert;
import org.junit.Test;

public class TestPatternFinder_Boundary {
	
	    
	PatternFinder finder = new PatternFinderImpl();


	    
	    @Test
	    public void testFindNoOfOccurrences1Boundary() throws Exception{
	        String input = "";
	        /**
	         * Whether the implementation provides reads the right no of occurrences
	         */
	        Integer noFromFile = finder.findNoOfOccurrences(input);
	       
	        
	        Assert.assertEquals(noFromFile, new Integer(-1));
	        
	      
	        
	    }
	    
	    @Test
	    public void testFindNoOfOccurrences2() throws Exception{
	        String input = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
	        Integer no = finder.findNoOfOccurrences(input);
	         
	         Assert.assertEquals(no, new Integer(0));
	        
	    }
	    
	    
}
