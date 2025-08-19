class Data{
    public static void main(String args[]){
      int height=4;
      int slantHeight=5;
      double radius=Math.sqrt((slantHeight*slantHeight)-(height*height));
      System.out.println("Radius of cone is:"+radius);

      double area=(3.1416)*radius*radius;
      System.out.println("Area of the cone is :"+area);
      
      double cost=area*10;
      System.out.println("Cost of polishing the base is :"+cost);

    }
}