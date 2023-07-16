

public class CheckOut{

    
    public double duration;
    public int Sum1;
    public int Sum2;
    public double total_fees;
     public double total_income=0;

    CheckOut()
    {
        duration=0.0;
        Sum1=0;
        Sum2=0;
    }

    void  Calculate_fees(ParkIn p , ParkOut m){

     Sum1=((m.end_hour)-(p.start_hour));

     Sum2=(((m.end_min)-(p.start_min))/60);

      duration=Sum1+Sum2+1;
      
      total_fees=(5*duration);

      System.out.println("total fees = "+ total_fees + ".");
      
      
    }


    void Calculate_total_income(){
        
        total_income=total_income+total_fees;
        System.out.println("total income = "+ total_income + ".");
    
}

}