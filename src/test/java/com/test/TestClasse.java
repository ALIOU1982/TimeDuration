/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import com.mycompany.timeduration.*;
/**
 *
 * @author mathilda
 */
public class TestClasse {

    public TestClasse() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void TestToString() {
        TimeDuration t = new TimeDuration();
        assertEquals("12 minutes 12 secondes", t.timeConvert(732));
        assertEquals("2 heures 0 minutes 42 secondes", t.timeConvert(7242));
        assertEquals("15 minutes 0 secondes", t.timeConvert(900));
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
