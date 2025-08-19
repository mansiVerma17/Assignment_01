/*
How many tiles whose length and breadth are 13 cm and 7cm respectively are needed to cover a rectangular region whose length and breadth are 520 cm and 140cm ?
*/
class Data{
    public static void main(String args[]){
        int tiles_length=13;
        int tiles_breadth=7;
        int region_length=520;
        int region_breadth=140;
        int area1=tiles_length*tiles_breadth;
        int area2=region_length*region_breadth;
        int result=area2/area1;
        System.out.println("Area of the one tile is :"+area1);
        System.out.println("Area of the room is :"+area2);
        System.out.println("Result is :"+result);
        


    }
}