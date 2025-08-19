class Data{
    public static void main(String args[]){
        int side=10;
        int l=800;
        int b=900;
        int area=side*side;
        int area1=l*b;
        System.out.println("Area of square is :"+area);
        System.out.println("Area of rectangle is :"+area1);
        int result=area1/area;
        System.out.println("Number of square tiles :"+result);
    }
}