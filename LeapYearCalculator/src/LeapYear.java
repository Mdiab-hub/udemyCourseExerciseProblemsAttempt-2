public class LeapYear {
    public static boolean isleapYear(int year) {
//        if (year >= 1 && year <= 9999) {
//            if ((year % 4 == 0) && (year % 400 == 0)) {
//                return true;
//            } else if (year % 100 == 0) {
//                return true;
//            }
//            return true;
//        }
//        return false;

//        if(year >= 1 && year <= 9999){
//            return true;
//        }
//        return false;


    if(year >= 1 && year <= 9999){
//                if ((year % 4 == 0) && (year % 400 == 0)){
//                    if(year % 100 == 0){
//                        return true;
//                    }
//                    return true;
//                }
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    return true;
                }
                return false;
            }
            return true;
        }
                return true;
            }

            //step 5
        return false;


        }

}
