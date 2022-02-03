public class Tourist_Ticket extends Ticket {
    private String Ac_Details;
    private String Flight_time;
    private float TicketFare;

    String getAc_Details() {
        return Ac_Details;
    }

    public void Ac_Details(String Ac_Details) {
        this.Ac_Details = Ac_Details;
    }

    String getFlight_time() {
        return Flight_time;
    }

    public void setFlight_time(String Flight_time) {
        this.Flight_time = Flight_time;
    }

    float getTicketFare() {
        return TicketFare;
    }

    public void setTicketFare(float TicketFare) {
        this.TicketFare = TicketFare;
    }




        String food;
        String water;
        String snacks;


        public Tourist_Ticket(String food, String snacks, String water) {
            this.food = food;
            this.snacks = snacks;
            this.water = water;
        }

        void print1() {
            System.out.print("\t|\t" + " Food Detail: " + "\t|\t" + food + "\t|\t" + snacks +"\t|\t" + water + "\t|\t");
        }
    }





