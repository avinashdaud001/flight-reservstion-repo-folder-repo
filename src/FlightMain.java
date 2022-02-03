import java.util.Scanner;

public class FlightMain {
    public static void main(String[] args) {


        Contact avi=new Contact();
        RegularTicket avi2=new RegularTicket();
        avi2.Create_PNR();
        avi2.SeatNO();
        avi2.setFlight_time("3.22");
        avi2.Ac_Details("not available");
        avi2.setTicketFare(2000.00f);
        Tourist_Ticket avi3=new Tourist_Ticket(" Chicken Cilli","samosa,eggs "," Chilled Water Available");

        avi3.Create_PNR();
        avi3.SeatNO();
        avi3.setFlight_time("4.00");
        avi3.Ac_Details("exclusive Available");
        avi3.setTicketFare(5000.00f);
        Passenger avi4=new Passenger();
        avi4.setFlight_name("INDIAN AIRLINE");
        avi4.Flight_No();
        avi.setArrival(avi.arrival);
        avi.setDeparture(avi.departure);
avi.setFlightDate(avi.FlightDate);



        avi.show4();

        avi4.setName(avi.name);
        avi4.show1();
        int choice;
        System.out.println("Enter Flight Ticket Type Which you want(For Regular Press 1 & For Tourist Press 2)");
        Scanner m=new Scanner(System.in);
        choice=m.nextInt();
        avi.show();


avi.print();



        System.out.println("Date: "+avi.getFlightDate());
        System.out.println("Passenger ID: "+avi4.AadharCard_No);
        System.out.println();
        System.out.println("||Flight Detail||");
        System.out.print  ( "\t|\t" +" Flight_Name: "+ avi4.getFlight_name());
        System.out.print  ( "\t|\t" +"Flight_Number: "+ avi4.Flight_No());
        System.out.print  ( "\t|\t" +"Arrival: "+ avi.getArrival());
        System.out.println ("\t|\t" +"Departure: "+ avi.getDeparture());

        switch (choice) {

            case 1:
                System.out.println("||REGULAR TICKET||");
                System.out.print("\t|\t" + "PNR_NO: " + avi2.Create_PNR());
                System.out.print("\t|\t" + "Seat_NO: " + avi2.SeatNO());
                System.out.print("\t|\t" + "Time: " + avi2.getFlight_time());
                System.out.print("\t|\t" + "AC_Detail: " + avi2.getAc_Details());
                System.out.println("\t|\t" + "Fare: " + avi2.getTicketFare());
                System.out.println("NOTE: Food Facility Not Available For regular Ticket");
                break;
            case 2:
                System.out.println("||Tourist Ticket||");
                System.out.print("\t|\t" + "PNR_NO: " + avi3.Create_PNR());
                System.out.print("\t|\t" + "Seat_NO: " + avi3.SeatNO());
                System.out.print("   \t|\t" + "Time: " + avi3.getFlight_time());
                System.out.print("\t|\t" + "AC_Detail: " + avi3.getAc_Details());
                System.out.println("\t|\t" + "Fare: " + avi3.getTicketFare());
                avi3.print1();
                break;
            default:
                System.out.println("please enter valid option");
        }



    }
}
