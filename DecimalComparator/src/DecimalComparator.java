public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double a, double b){
        double num1 = (int) (a * 1000);
        double num2 = (int) (b * 1000);

        if(num1 == num2){
            return true;
        }
        return false;
    }
}

//solved but why after typecasting to int the program worked?
