public class RegularTicket extends Ticket {

//    private String PNR_NO;
//    private String Seat_no;
    private String Ac_Details;
    private String Flight_time;
    private float TicketFare;


    String getAc_Details(){
        return Ac_Details;
    }
    public void Ac_Details(String Ac_Details){
        this.Ac_Details=Ac_Details;
    }

    String getFlight_time(){
        return Flight_time;
    }
    public void setFlight_time(String Flight_time){

        this.Flight_time=Flight_time;
    }
    float getTicketFare(){

        return TicketFare;
    }
    public void setTicketFare(float TicketFare){

        this.TicketFare=TicketFare;
    }

}
