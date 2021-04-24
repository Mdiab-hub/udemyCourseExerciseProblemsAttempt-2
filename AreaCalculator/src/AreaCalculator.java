public class AreaCalculator {
    //write method named area with one double parameter named radius
    //      method needs to return a double value that represents area of a circle
    //if parameter radius is negative then return -1.0 to represent invalid value

    //write overloded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.
    //      method needs to return an area of a rectangle
    //if either or both parameters is/are a negative return -1.0 to indicate value

    public static double area (double radius){
        if(radius < 0){
            return -1.0;
        }

        return radius * radius * Math.PI;
    }

    public static double area (double x, double y){
        if((x < 0 )||(y < 0)){
            return -1.0;
        }
        return x * y;
    }
}
