package com.algs4.chapter1.section1.practice;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Out;

/******************************************************************************
 *  Compilation:  javac Wget.java
 *  Execution:    java Wget url
 *  Dependencies: In.java Out.java
 *
 *  Reads in a URL specified on the command line and saves its contents
 *  in a file with the given name.
 *
 *  % java Wget http://introcs.cs.princeton.edu/java/data/codes.csv
 *
 ******************************************************************************/

/**
 * <p> 从命令行中指定的URL读取数据，并将其保存在同名文件中。 </p>
 * @author donny
 *
 */
public class Wget {

    public static void main(String[] args) {

        // read in data from URL
        String url = args[0];
        In in = new In(url);
        String data = in.readAll();

        // write data to a file
        String filename = url.substring(url.lastIndexOf('/') + 1);
        Out out = new Out(filename);
        out.println(data);
        out.close();
    }
}