import java.util.*;
import java.util.Calendar;

public class ParkIn{ 

   public static int parking_Size=0;
   public Garage_owner garage;
   public int configuration;
   public int start_hour;
   public int start_min;
   

   ParkIn(Garage_owner garage )
   {
       this.garage=garage;
      

   }
  
      
  


   public void park_in(){

    System.out.println("please enter the nubmer of configuration ");
    System.out.println("number 1 attend to first come first served ,number 2 best fit ");
    Scanner configuration= new Scanner(System.in);
    int conf=configuration.nextInt();


    if(parking_Size== garage.Get_max())
    {
        System.out.println("No avaliable slots");
        return;
    }
    System.out.println("please enter the name of the car ");
    Scanner name = new Scanner(System.in);
    String n=name.nextLine();

    System.out.println("please enter the unique number of the car ");
    Scanner number = new Scanner(System.in);
    int no=number.nextInt();

    System.out.println("please enter the model of the car ");
    Scanner model = new Scanner(System.in);
    int m=model.nextInt();

    System.out.println("please enter the width of the car ");
    Scanner w = new Scanner(System.in);
    double ww=w.nextDouble();

    System.out.println("please enter the length of the car ");
    Scanner d = new Scanner(System.in);
    double dd=d.nextDouble();
    Vechile obj=new Vechile(n ,no,m,ww,dd);

   

    if(conf==1)
    {
        
        
        for(int i=0;i< garage. Get_max();i++)
        {
          if(garage.slot[i].IsEmpty())
          {
            garage.slot[i].SetParked(obj);
            garage.slot[i].Set_is_empty(false);
            parking_Size++;

            System.out.println("go to slot number "+i);
            start_hour=Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
            start_min=Calendar.getInstance().get(Calendar.MINUTE);
  
            System.out.println("start_hour "+Calendar.getInstance().get(Calendar.HOUR_OF_DAY)+":"+
            Calendar.getInstance().get(Calendar.MINUTE));

            break;

          }
        
        
         
        }
        
        
    }

    else if(conf==2)
    {  // 3 2   5 3
      int minIndx = -1;
      Double minWid = 100000000.0;
      Double minLen = 100000000.0;
      for(int i = 0;i<garage.Get_max();i++){
        if(garage.slot[i].IsEmpty()){
          if(garage.slot[i].GetWidth()>=obj.GetWidth()&&garage.slot[i].Getdepth()>=obj.Getdepth()){
            if((garage.slot[i].GetWidth() * garage.slot[i].Getdepth()) <= (minWid*minLen) ){
              minWid = garage.slot[i].GetWidth();
              minLen = garage.slot[i].Getdepth();
              minIndx = i;
            }
          }
        }
      }
      if(minIndx == -1){
        System.out.println("no avalabil slots");
        return;
      }
      else{
        System.out.println("go to slot number "+minIndx);
        garage.slot[minIndx].SetParked(obj);
        garage.slot[minIndx].Set_is_empty(false);
        parking_Size++;

        start_hour=Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        start_min=Calendar.getInstance().get(Calendar.MINUTE);

        System.out.println("start_hour "+Calendar.getInstance().get(Calendar.HOUR_OF_DAY)+":"+
        Calendar.getInstance().get(Calendar.MINUTE));
      }
     
    }
  
   }
}