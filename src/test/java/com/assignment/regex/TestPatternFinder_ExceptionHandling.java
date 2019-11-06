package com.assignment.regex;

import org.junit.Assert;
import org.junit.Test;

import com.assignment.common.AssignmentException;

public class TestPatternFinder_ExceptionHandling {
	PatternFinder finder = new PatternFinderImpl();
	
	@Test(expected=AssignmentException.class)
    public void testFindNoOfOccurrences1Boundary() throws Exception{
        String input = null;
        /**
         * Whether the implementation provides reads the right no of occurrences
         */
        Integer noFromFile;
		noFromFile = finder.findNoOfOccurrences(input);
    }
}
