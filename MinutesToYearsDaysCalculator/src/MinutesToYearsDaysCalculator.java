public class MinutesToYearsDaysCalculator {
    //write method printYearsAndDays with parameter of type long named minutes
    //The method should not return anything(void) and it needs to calculate the years and days from the minutes parameter.
    //if parameter is less than 0, print text "Invalid Value"
    //otherwise if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d"

    //XX represents minutes
    //yy represents the calculated years
    //zz represents days

    //1 hour = 60 minutes
    //1 day = 24 hours
    //1 year = 365 days

    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
            return;
        }

        long year = minutes / 525600;
        long yearRemainder = minutes % 525600;
        long day = (minutes % 525600) / 1440; //why do we do mudolo by 525600 than divide by 1440
        long dayRemainder = minutes % 1440;

        System.out.println(year + " year");
        System.out.println(yearRemainder + " yearRemainder");
        System.out.println(day + " day");
//        System.out.println(dayRemainder + " dayRemainder");

        System.out.println(minutes + " min = " + year + " y and " + day + " d");

    }
}
