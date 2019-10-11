package com.main;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import com.assignment.regex.TestDummy;
import com.assignment.regex.TestPatternFinder;



public class TestCasesExecutor {
	
	@Test
	public void testMain() throws Exception{
		JUnitCore junit = new JUnitCore();
		junit.addListener(new TextListener(System.out));
		Result result = junit.run(TestPatternFinder.class, TestDummy.class);
		resultReport(result);
	}
	
	public static void resultReport(Result result) throws IOException {
	    System.out.println("Finished... Result: Failures: " +
	      result.getFailureCount() + ". Ignored: " +
	      result.getIgnoreCount() + ". Tests run: " +
	      result.getRunCount() + ". Time: " +
	      result.getRunTime() + "ms." );
	    String res = "";
	    res += "Total="+result.getRunCount()+"\nFailed="+result.getFailureCount()+"\nIgnore="+result.getIgnoreCount()+"\nExecTime="+result.getRunTime();
	    FileUtils.write(new File("output.txt"), res);
	}

}
