public class IntEqualityPrinter {
    //write method printEqual with 3 parameters of type int.
    //method shouldn't return anything
    //if one of the parameters is less than 0, print text "Invalid Value"
    //if all numbers are equal numbers print "All numbers are equal"
    //if all numbers are different print "All numbers are different"
    //otherwise print "Nither all are equal or diff"

    public static void printEqual (int a, int b, int c){
        if(a < 0 || b < 0 || c < 0){
            System.out.println("Invalid Value");
        } else if((a == b) && (b == c) && (c == a)){
            System.out.println("All numbers are equal");
        } else if((a != b) && (b != c) && (c != a)){
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

}
