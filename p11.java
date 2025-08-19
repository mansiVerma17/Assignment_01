class Data{
    public static void main(String args[]){
        double h=8;
        double b=5;
       double area=320;
        double triangle=0.5*(h*b);
        double result=area/triangle;
        System.out.println(result);
        double square=Math.sqrt(result);
        System.out.println(square);
        double h1=h*square;
        double b1=b*square;
        System.out.println(h1);
        System.out.println(b1);


    }
}