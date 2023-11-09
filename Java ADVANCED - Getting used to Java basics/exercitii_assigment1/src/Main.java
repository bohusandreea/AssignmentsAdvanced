// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // ex 1
        System.out.println("Hello world!");

        /*Create all of the primitives (except long and double) with different values. Concatenate them into a string and print it to the screen so it will print: H3110 w0r1d 2.0 true*/
        byte zero = 0;
        int nr = 311, y = 1;
        float x = 2.0f;
        boolean a = true;

        String output = "H" + nr + zero + " " + "w" + zero + "r" + y + "d" + " " + x + " " + true;
        System.out.println(output);

        /*Change the variables in the first section, so that each if statement resolves as true.*/

        String a1 = new String("Wow");
        String b = "Wow";
        String c = a1;
        String d = c;

        boolean b1 = a1 != b;
        boolean b2 = d.equals(b);
        boolean b3 = c.equals(a1);

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }

        /*Change the values in numbers so it will not raise an error. */
        int[] numbers1 = {1, 2, 3};
        int len = numbers1.length;
        char[] chars = new char[len];
        chars[numbers1.length - 1] = 'y';
        System.out.println("Done!");

        /*Loop through and print out all even numbers, each in a separate line, from the numbers list in the same order they are received. Don't print any numbers that come after 237 in the sequence.
         */
        int[] numbers = {
                951, 402, 984, 651, 360, 69, 408, 319, 601, 485, 980, 507, 725, 547, 544,
                615, 83, 165, 141, 501, 263, 617, 865, 575, 219, 390, 984, 592, 236, 105, 942, 941,
                386, 462, 47, 418, 907, 344, 236, 375, 823, 566, 597, 978, 328, 615, 953, 345,
                399, 162, 758, 219, 918, 237, 412, 566, 826, 248, 866, 950, 626, 949, 687, 217,
                815, 67, 104, 58, 512, 24, 892, 894, 767, 553, 81, 379, 843, 831, 445, 742, 717,
                958, 609, 842, 451, 688, 753, 854, 685, 93, 857, 440, 380, 126, 721, 328, 753, 470,
                743, 527};
        // Your code goes here
        for (int el : numbers) {
            if (el % 2 == 0)
                System.out.println(el);
            if (el == 237)
                break;
        }

        /*In this exercise, you will try to catch problematic code. I will create a problematic code block. I want you to wrap the problematic code in the try block, then make it print "Problem with code detected" if the exception is thrown.
NOTE: Use ArrayIndexOutOfBoundsException as exception, or Exception as the exception.
*/
        try{
            int[] arr = new int[10];
            System.out.println(arr[9001]);
        }catch(Exception ArrayIndexOutOfBoundsException )
        {
            System.out.println("Problem with code detected");
        }

    /*Write code in the tutorial codeto throw an IllegalArgumentException if (n < 0). It should show "Error" as description. HINT: Look at expected output, and at second code snippet.*/

        int n = -1;
        if(n<0)
        {throw new IllegalArgumentException("Error");}

    }
}