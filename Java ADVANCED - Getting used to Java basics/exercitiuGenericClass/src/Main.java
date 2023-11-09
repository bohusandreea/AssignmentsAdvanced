// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        /*Create a Generic class which accepts String and Integer datatype at a time. Create a object for the same. Pass in 30 and "I love Generic types" has parameters. print the both in next next line*/
        Generic<Integer, String> test = new Generic<Integer, String>(30,"I love Generic types");
        System.out.println(test.getVariable1());
        System.out.println(test.getVariable2());

    }
    }
