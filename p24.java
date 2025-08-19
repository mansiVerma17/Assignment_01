class Data{
    public static void main(String args[]){
        int l=2000;
        int b=200;
        int h=75;
        int l1=25;
        int b1=10;
        double h1=7.5;
        int wall=l*b*h;
       double brick=l1*b1*h1;
        System.out.println("Wall "+wall);
        System.out.println("Brick "+brick);

        double result=wall/brick;
        System.out.println("Result :"+result);

        //cost of 1 brick is 900/1000=0.9
       double oneBrick=(900/1000)*result;

        System.out.println("Cost of the Brick "+oneBrick);

    }
}