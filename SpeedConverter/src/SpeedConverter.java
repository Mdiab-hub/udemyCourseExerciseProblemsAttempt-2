public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour <= 0){
            return -1;
        }
            return Math.round(kilometersPerHour * 0.621371);

    }

    public static void printConversion(double kilometersPerHour){
        long milesPerHour = Math.round(kilometersPerHour * 0.621371);


        if(kilometersPerHour <= 0){
            System.out.println("Invalid Value");
            return;
        }

        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }
}

//this code works but get an error in udemy "Method call printConversion(90.75) printed a value of "95.75 km/h = 59 mi/h", but "95.75 km/h = 60 mi/h" was expected."
// Idk How to throw an exception for that.
