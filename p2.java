/*
The area of a rectangle is 96 cm^2. If the breadth of the rectangle is 8cm, find its length and perimeter.
*/
class Data{
    public static void main(String args[]){
        int area=96;
        int breadth=8;
        int length=area-breadth;
        System.out.println("Length of area of rectangle is :"+length);
        int perimeter=2*(length+breadth);
        System.out.println("Perimetr of the rectangle is :"+perimeter);
        
    }
}