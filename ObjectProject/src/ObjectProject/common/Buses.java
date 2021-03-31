package ObjectProject.common;

import java.util.Random;

import ObjectProject.views.*;


public class Buses extends Write{
    public Buses(String Select1, String Select2) {
        super(Select1, Select2);
    }

    public int Hour() {
        Random rand = new Random();
        int hour = 1 + rand.nextInt(24);
        if(hour == 24)
            hour = 0 ;
        return hour;
    }

    public int Minutes() {
        Random rand = new Random();
        int minutes =  rand.nextInt(61);
        if(minutes == 60)
            minutes = 1;
        return minutes;
    }



    public String toString() {
        int Hour = Hour();
        int Minutes = Minutes();
        int divideHour = (Hour/10);
        int divideMinutes = (Minutes/10);
        if((divideHour == 0 && Hour < 10) && (divideMinutes == 0 && Minutes < 10))
            return "Bus goes to " + getSelect1() + " to " + getSelect2() + " at 0" + Hour + ":0" + Minutes;
        else if(divideHour == 0 && Hour < 10)
            return "Bus goes to " + getSelect1() + " to " + getSelect2() + " at 0" + Hour + ":" + Minutes;
        else if(divideMinutes == 0 && Minutes < 10)
            return "Bus goes to " + getSelect1() + " to " + getSelect2() + " at " + Hour + ":0" + Minutes;
        else
            return "Bus goes to " + getSelect1() + " to " + getSelect2() + " at " + Hour + ":" + Minutes;
    }

}