package com.algs4.chapter1.section2;

import com.algs4.chapter1.section2.practice.Base;
import com.algs4.chapter1.section3.practice.Parentheses;
import edu.princeton.cs.algs4.StdOut;
import org.junit.*;

import java.util.Stack;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class BaseTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void one() {
        //1.2.4
        String string1 = "hello";
        String string2 = string1;
        string1 = "world";
        StdOut.println(string1);
        StdOut.println(string2);
    }

    @Test
    public void two() {
        //1.2.5
        String s = "Hello World";
        s.toUpperCase();
        s.substring(6, 11);
        StdOut.println(s);
    }

    @Test
    public void three() {
        //1.2.6
        String s = "ACTGACG", t = "TGACGAC";
        if (s.length() == t.length() && (s.concat(s).indexOf(t) >= 0)) {
            StdOut.println("circular rotation!");
        }
    }

    @Test
    public void four() {
        //1.2.7
        StdOut.println(Base.mystery("12345"));
    }
}