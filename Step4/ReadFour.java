package Step4;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour
{
    /**
     * Yes, you can look at the other 
     * examples in this lab to build your solution here.
     */
        public static void main(String[] args)
        {
            int[] values = { 4, 10, 3, 13, 49, 11, 45, 79, 24 };
            int runningTotal = 0;

            for (int value : values) {
                runningTotal += value;
                System.out.println("Running Total: " + runningTotal);
            }
        }
}

            // Print out a running total of all the
            // values in the input file.

