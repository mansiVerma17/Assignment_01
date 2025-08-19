class Data{
    public static void main(String args[]){
        int l=1200;
        int b=240;
        int l1=24;
        int b1=15;
        int path=l*b;
        int brick=l1*b1;
        System.out.println("Path :"+path);
        System.out.println("Brick :"+brick);  
        int result  =path/brick;
        System.out.println("Result :"+result);
    }
}