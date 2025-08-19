class Data{
    public static void main(String args[]){
        int side=3;
        int l=15;
        int b=9;
        int h=12;
        int cube=side*side*side;
        int cuboid=l*b*h;
        System.out.println("cube :"+cube);
        System.out.println("cuboid :"+cuboid);
        int result=cuboid/cube;
        System.out.println("Result :"+result);

    }
}