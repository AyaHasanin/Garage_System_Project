public class Vechile{
    private String model_name;
    public int unique_number;
    private int model_year;
    private double width;
    private double depth; 
    
    Vechile(String model_name , int unique_number , int model_year , double width ,double depth)
    {
      
      this.model_name=model_name;
      this.unique_number=unique_number;
      this.model_year=model_year;
      this.depth=depth;
      this.width=width;
      
    }

    Vechile()
    {

    }
    
    public double GetWidth(){
      return width;
    }
    public void SetWidth(int W)
    {
      this.width=W;
    }

    public double Getdepth(){
      return depth;
    }
    public void Setdepth(int d)
    {
      this.depth=d;
    }

    public int Get_Model_Year(){
      return model_year;
    }
    public void Set_Model_Yearh(int model)
    {
      this.model_year=model;
    }

    public String Get_Model_name(){
      return model_name;
    }
    public void Set_Model_name(String name)
    {
      this.model_name=name;
    }
    public int Get_unique_number(){
      return unique_number;
    }
    public void Set_unique_number(int number)
    {
      this.unique_number=number;
    }

}

