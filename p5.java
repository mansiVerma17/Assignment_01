/*. If it costs 1600 rs. to fence a rectangular park of length 20 m at the rate of 25 rs. per m², find the breadth of the park and its perimeter. Also, find the area of the field.*/
class Data{
    public static void main(String args[]){
        double length=20;
        double area=1600/25;
        System.out.println("Area of rectangle park is :"+area);
        double breadth=area/length;
        System.out.println("Breadth of the rectanglar park is :"+breadth);
        double perimeter=2*(length+breadth);
        System.out.println("Perimeter of rectangle park is :"+perimeter);


    }
}