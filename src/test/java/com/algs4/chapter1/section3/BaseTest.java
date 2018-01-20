package com.algs4.chapter1.section3;

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
        // 1.3.4
        assertTrue(Parentheses.isBalanced("[()]{}{[()()]()}"));
        assertThat(Parentheses.isBalanced("[(])"), is(false));
    }

    @Test
    public void two() {
        // 1.3.5
        Stack<Integer> stack = new Stack<>();
        int n = 50;
        while (n > 0) {
            stack.push(n % 2);
            n = n / 2;
            StdOut.print(n + " ");
        }
        StdOut.println();
        for (int d : stack)
            StdOut.print(d + " ");//0 1 0 0 1 1
        StdOut.println();
        while (!stack.isEmpty())
            StdOut.print(stack.pop() + " ");//1 1 0 0 1 0
    }

    @Test
    public void three(){
        //1.3.37

    }
}