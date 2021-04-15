public class MegaBytesConverter {
    //write a method called printMegaBytesAndKiloBytes
    // with one parameter of type int with the name kiloBytes
        //method should return void
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        //and needs to calculate the megabytes and remaining kilobytes from the kiloBytes parameter
        //1 MB = 1024 KB
        //1000 bytes = 1,024,000 bytes
        //1000 bytes / 1,024,000 bytes
        //needs to print message "XX KB = YY MB AND ZZ KB"

        //converting from kb to mb divide by 1024

        if(kiloBytes < 0){
            System.out.println("Invalid Value");
            return;
        }
        int conversion = kiloBytes / 1024; //if kilobytes == 2500 then this equals 2 but how do I get the remainder I just got it
        int remainder = kiloBytes % 1024;
        System.out.println( kiloBytes + " KB = " + conversion + " MB and " + remainder + " KB");




    }
}

//this one passed in udemy
