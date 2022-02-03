import java.util.Scanner;

public class Passenger extends Flight{
    public static String Name;
    public static long AadharCard_No;
    String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name=Name;
    }
    void show1(){
        Scanner avi=new Scanner(System.in);
        System.out.println("Enter Your AadharCard_No");
        AadharCard_No=avi.nextInt();



    }

}
