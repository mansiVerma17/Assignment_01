class Data{
    public static void main(String args[]){
        int a=10;
        int b=9;
        int perimeter=36;
        int c=perimeter-a-b;
        System.out.println("Third value of the perimeter triangle is:"+c);
        int semiPerimeter=(a+b+c)/2;
        System.out .println("Semi perimeter of the triangle is:"+semiPerimeter);

        double result=Math.sqrt(semiPerimeter*(semiPerimeter-a)*(semiPerimeter-b)*(semiPerimeter-c));
        System.out.println("Result is :"+result);
    }
}