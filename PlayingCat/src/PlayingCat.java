public class PlayingCat {
    //write method isCatPlaying that has 2 parameters
    //method needs to return true if cat is playing; flase if not playing
    //1st parameter represents boolean named summer
    //2nd parameter represents temperature with the name tmprature

    public static boolean isCatPlaying (boolean summer, int temperature){
        if(summer && (temperature >= 25) && (temperature <= 45)){
            return true;
        } else if (!summer && (temperature >= 25) && (temperature <= 35)){
            return true;
        }
        return false;
    }
}
