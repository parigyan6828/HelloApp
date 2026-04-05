/**
 * HelloApp.java – A simple Java application that Displays "Hello, World!" to
 * the console.
 *
 * This is the first step in the HelloApp journey, where we start with a basic
 * "Hello, World!" program. The application consists of a single class with a
 * main method that serves as the entry point for the program. The main method
 * uses the System.out.println() function to print the message "Hello, World!"
 * to the console. This application demonstrates fundamental Java concepts such
 * as class declaration, the main method, and standard output.
 *
 * @author Somanshu
 * @version 1.0
 */

/**
 * Key Java Concepts Used:
 * 1. Class Declaration – Defines a blueprint for objects
 * 2. Main Method – Entry point for program execution
 * 3. Static Keyword – Method belongs to the class, not instances
 * 4. String Argument Array – Command-line arguments parameter
 * 5. System.out.println() – Standard output stream for printing
 */

public class helloapp {

    public static void main(String[] args) {
        
        // If no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Use StringBuilder to build the greeting
        StringBuilder names = new StringBuilder();

        // Enhanced for loop to process multiple names
        for (String name : args) {
            names.append(name).append(", ");
        }

        // Remove trailing ", " using substring
        String result = names.substring(0, names.length() - 2);

        // Print final greeting
        System.out.println("Hello, " + result + "!");
    }

}