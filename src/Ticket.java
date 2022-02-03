import java.util.Random;

public class Ticket  {
  private  String arrival;
    private  String Departure;
    public String Create_PNR() {
        String PNR = "";
        Random rand = new Random();
        for (int i = 0; i < 6; i++) {
            int randomNumber = rand.nextInt(9);
            String number=String.valueOf(randomNumber);
            PNR=PNR+number;
        }
        return PNR;
    }

        public String SeatNO() {
            String SeatNO = "";
            Random rand = new Random();
            for (int i = 0; i < 3; i++) {
                int randomNumber = rand.nextInt(9);
                String number=String.valueOf(randomNumber);
                SeatNO=SeatNO+number;
            }
            return SeatNO;
        }





    String getArrival(){
        return arrival;

    }
    public void setArrival(String arrival){
        this.arrival=arrival;
    }

    String getDeparture(){
        return Departure;
    }
    public void setDeparture(String Departure){
        this.Departure=Departure;
    }

//    class create{


    }


//}
