import java.util.Random;
import java.util.Scanner;

public class Flight extends Address{
    private String Flight_name;
//    private String Flight_NO;
    public String arrival;
    public String Departure;

        protected String  Flight_No() {
            String  Flight_No = "";
            Random rand = new Random();
            for (int i = 0; i < 4; i++) {
                int randomNumber = rand.nextInt(9);
                String number=String.valueOf(randomNumber);
                Flight_No= Flight_No+number;
            }
            return Flight_No;
        }





    String getFlight_name(){
        return Flight_name;
    }
    public void setFlight_name(String Flight_name){
        this.Flight_name=Flight_name;
    }

    public String getArrival(){
        return arrival;
    }
    public void setArrival(String arrival){
        this.arrival=arrival;
    }

    public String getDeparture(){
        return Departure;
    }
    public void setDeparture(String Departure){
        this. Departure= Departure;
    }

}
