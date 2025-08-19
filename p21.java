class Data{
    public static void main(String args[]){
        int l=15;
        int b=8;
        int h=5;
        //1m=100cm
        //15*100=1500
        int l1=1500;
        int b1=1000;
        int h1=800;
        int brick=l*b*h;
        int wall=l1*b1*h1;
        System.out.println("Brick "+brick);
        System.out.println("Wall "+wall);
        int result=wall/brick;
        System.out.println("Result "+result);
    }
}