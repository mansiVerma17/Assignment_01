/*
The perimeter of a rectangle is 230 cm.If the length of the rectangle is 70cm, find its breadth and area.
*/
class Data{
	public static void main(String args[]){
		int perimeter=230;
		int length=70;
		int breadth=(perimeter-2*length)/2;

		System.out.println("Breadth of the rectangle is :"+breadth);
		int area= length*breadth ;
		System.out.println("Area of the rectangle is :"+area);
}

}