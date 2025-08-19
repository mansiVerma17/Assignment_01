/*
Find the cost of tiling a rectangular plot of land 300 m long and 150 m wide at the rate of $6 per hundred square m. 
*/ 
class Data{
    public static void main(String args[]){
        int length=300;
        int width=150;
        int rate=6;
        int area =length*width;
        System.out.println("Area of the rectnagular plot is :"+area);
        //cost of 100m square is 6$

        int hundred_square=area/100;
        System.out.println("Area of the hundred square meter is:"+hundred_square);
        int cost=hundred_square*rate;
        System.out.println("Total cost of the tile of the rectangular plot is:"+cost);
        
    }
}