package com.algs4.chapter1.section1.practice;

import edu.princeton.cs.algs4.StdDraw;

/******************************************************************************
 *  Compilation:  javac RightTriangle.java
 *  Execution:    java RightTriangle
 *  Dependencies: StdDraw.java
 *
 *  Draws a right triangle and a circumscribing circle.
 *
 ******************************************************************************/

/**
 * <p> 绘制一个直角三角形和一个外接圆。 </p>
 * @author donny
 *
 */
public class RightTriangle { 

    public static void main(String[] args) {
        StdDraw.square(.5, .5, .5);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.line(.5, .5, .9, .5);
        StdDraw.line(.9, .5, .5, .8);
        StdDraw.line(.5, .8, .5, .5);
        StdDraw.circle(.7, .65, .25);
    }
}
