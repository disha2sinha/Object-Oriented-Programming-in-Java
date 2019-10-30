class Varargs {
    // A method that takes variable number of integer
    // arguments.
    static void varargs(int... x) {
        System.out.println("Number of arguments: " + x.length);

        // using for each loop to display contents of x
        for (int i : x)
            System.out.print(i + " ");
        System.out.println();
    }

    // Driver code
    public static void main(String args[]) {
        // Calling the varargs method with different number
        // of parameters
        varargs(100); // one parameter
        varargs(1, 2, 3, 4,10,20); // four parameters
        varargs(); // no parameter
    }
}