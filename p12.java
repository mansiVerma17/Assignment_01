class Data{
    public static void main(String args[]){
        int h=13;
        int side1=12;
        int side2=((h*h)-(side1*side1));
        System.out.println(side2);
        double square=Math.sqrt(side2);
        System.out.println(square);

        double area=0.5*(side1*square);
        System.out.println("area"+area);

    }
}