public class ButtonPhone extends LandPhone {

    public String Brand;

     public ButtonPhone(String Name, int year, String color, String Brand){
         super(Name,year,color);
         this.Brand = Brand;

     }

     void SMS(){
         System.out.println( " By using "+Name+ " we can send SMS");
     }

}
