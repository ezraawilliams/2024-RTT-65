package org.ezrawilliams.introtojavabasics;

public class KBA3031_10Review {
    public static void main(String[] args) {
        int x=2;
        int y;
        for(y=0;y<10;++y){
            System.out.println("Before conditions: "+y);
            if(y % x==0)
                continue;
            else if (y==8)
                break;
            else
                System.out.print(y+" ");
            System.out.println("After conditions " +y);
        }
    }
}
