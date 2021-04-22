public class TeenNumberChecker {
    //a number is "teen" if it is in the range 13-19(inclusive)
    //write a method named hasTeen with 3 parameters of type int
    //The method should return boolean and it needs to return true
    //if one of the parameters is in range 13(inclusive) - 19(inclusive). Otherwise return false.

    public static boolean hasTeen(int a, int b, int c){
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)){
            return true;
        }
        return false;
    }

    //write another method isTeen with 1 parameter of type int
    //the method should return boolean and it needs to retrun true if the parameter is in range
    //13(inclusive) - 19(inclusive)
    public static boolean isTeen(int d){
        if(d >= 13 && d <= 19){
            return true;
        }
        return false;
    }
}
