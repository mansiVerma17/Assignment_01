class Data{
    public static void main(String args[]){
        int l=5;
        int b=8;
        int l1=200;
        int b1=400;
        int tile=l*b;
        int room=l1*b1;

        System.out.println("Tiles :"+tile);
        System.out.println("Room :"+room);

        int result=room/tile;
        System.out.println("Result :"+result);
        
    }
}