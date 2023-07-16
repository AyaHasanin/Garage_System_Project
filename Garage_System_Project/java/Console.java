import java.util.*;
public class Console {

    public Vechile v=new Vechile();
    public Garage_owner g=new Garage_owner(4);
    public ParkIn p=new ParkIn(g);
    public ParkOut o=new ParkOut(g);
    public CheckOut c=new CheckOut();
    public Display d=new Display();
    public Boolean flag=true;
    int number; 

    Console(){}


    void console(){
        while(flag){
            System.out.println("choose the action you want to do: ");
            System.out.println(" ");
            System.out.println("1-park in ");
            System.out.println("2-park out ");
            System.out.println("3-display available slots ");
            System.out.println("4-display fees ");
            System.out.println("5-display total income ");
            System.out.println("6-exit ");

            Scanner number= new Scanner(System.in);
            int no=number.nextInt();


            if(no== 1){
                p.park_in();
            }
            else if(no == 2){
                o.park_out();
            }
            else if(no == 3){
                d.dispaly(g);
            }
            else if(no == 4){
                c.Calculate_fees( p ,o);
            }
            else if(no == 5){
                c.Calculate_total_income();
            }
            else if (no == 6){
                flag = false;
                System.out.println("exit");
            }

        }



    }

}
