public class EqualSumChecker {
    //write a method hasEqualSum with 3 parameters of type int
    //should return boolean
    //and needs to return true if the sum of the first and second parameter
    //is equal to the third parameter. Otherwise, return false.

    public static boolean hasEqualSum (int a, int b, int c){
        
        if((a + b) == c){
            return true;
        }
        return false;
    }
}
