public class BarkingDog {
    //write method shouldWakeUp that has two parameters;
    //1st parameter should be of type boolean
    //          and be named barking it represents if our dog is currently barking
    //2nd parameter represents hour of day
    //          and is type int with the name hourOfDay and has valid range 0-23

    //we have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
//        if(hourOfDay > 0 && hourOfDay < 23){
//            if(barking && (hourOfDay < 8 || hourOfDay > 22)){
//                if(hourOfDay == 8 && hourOfDay == 22){
//                    return false;
//                }
//
//                return true;//is this true or false?
//            }
//
//
//            return false;
//        }
//        return false;

//        if(!barking && (hourOfDay > 0 && hourOfDay < 23) && (barking && (hourOfDay < 8 && hourOfDay > 22))){
//            return true;
//        } else {
//            return false;
//        }
        //didn't pass udemy

        if(barking && ((hourOfDay < 8 && hourOfDay >= 0) || (hourOfDay > 22 && hourOfDay <= 23))){
            return true;
        }
        return false;
    }
}
