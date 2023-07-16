import java.util.*;
class Garage_owner{    
    private int max_size;
    public Parking_slot slot[] =null;
    
   
  
    
    Garage_owner(int s){
      max_size=s;
      
      slot=new Parking_slot[max_size];
      Scanner obj = new Scanner(System.in) ;
      System.out.println("please enter the dimentions of your slots");
      for(int i=0;i<max_size;i++)
      {

        System.out.print("enter slot number " + (i+1) + " width: ");
        double w=obj.nextDouble();
        obj = null;
        obj = new Scanner(System.in);
        System.out.print("enter slot number " + (i+1) + " depth: ");
        double d=obj.nextDouble();
        obj = null;
        obj = new Scanner(System.in);
        slot[i]= new Parking_slot(w,d);
          
      }
  
    }
    
    

    public int Get_max(){
      return max_size;
    }
    public void Set_max(int max)
    {
      this.max_size=max;
    }
    
    
    

    
  
  }