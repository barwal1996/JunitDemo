package com.paani.www;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;


import junit.framework.Assert;
import org.junit.Test;
public class SuiteTest2 {

	@Test		
    public void createAndSetName() {					
      				
        String actual= "Y";
        String expected = "Y";					
        				

        Assert.assertEquals(expected, actual);					
        System.out.println("Suite Test 2 is successful " + actual);							
    }		

}


