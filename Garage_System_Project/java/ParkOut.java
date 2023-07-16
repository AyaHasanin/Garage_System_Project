import java.util.*;
import java.util.Calendar;

public class ParkOut {

   public static int parking_Size=0;
   public Garage_owner gar;
   public int slot_number;
   public int end_hour;
   public int end_min;

   
   ParkOut( Garage_owner gar ){
    
    
    this.gar=gar;
    
   }


   public void park_out(){

   System.out.println("please enter the slot number you want to get out of the garage");
   
   Scanner slot_number = new Scanner(System.in);
    int slot_n=slot_number.nextInt();

    

    for(int i=0;i<=gar.Get_max();i++)
        {
          if(slot_n==i)
          {
            gar.slot[i].SetParked(null);
           System.out.println("the slot "+i+" is empty");

           parking_Size--;
            break;

            
          }
        
        
          
          
        }
   
        end_hour=Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        end_min=Calendar.getInstance().get(Calendar.MINUTE);

        System.out.println("end_hour "+Calendar.getInstance().get(Calendar.HOUR_OF_DAY)+":"+
        Calendar.getInstance().get(Calendar.MINUTE));


   }
   public int Get_slot_number(){
    return slot_number;
  }
  public void Set_slot_number(int slot_n)
  {
    this.slot_number=slot_n;
  }
        
}

