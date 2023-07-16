
public class Parking_slot{
  
    private double width_slot;
    private double depth_slot;
    private Vechile parked;
    private boolean Empty=true;
    Parking_slot(double w ,double d){
      width_slot=w;
      depth_slot=d;
  
    }
  
    public double GetWidth(){
      return width_slot;
    }
    public void SetWidth(int Width)
    {
      this.width_slot=Width;
    }
    
    public double Getdepth(){
      return depth_slot;
    }
    public void Setdepth(int depth)
    {
      depth_slot=depth;
    }
  
    public Vechile GetParked(){
      return parked;
    }
    public void SetParked(Vechile obj)
    {
      parked=obj;
    }
    public boolean IsEmpty(){
      return Empty;
    }
    public void Set_is_empty( boolean emp)
    {
      Empty=emp;
    }
    
}
  