import Model.Box;
import Model.Shop;
import Model.ShopKeeper;
//import Strategy.DefualtStrategy;
import Strategy.OptimisedStrategy;

import java.util.*;

class client{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Space Dimension");
        int length = sc.nextInt();
        int width = sc.nextInt();

        Shop shop = new Shop("Kirana" , length , width);
        ShopKeeper keeper = new ShopKeeper(shop , new OptimisedStrategy());
        int boxId = 1;
        
        while(true)
        {
            System.out.println("Enter box dimension: ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if(x==-1||y==-1) //Input Stop conditoin
            {
                shop.printSpace();
                break;
            }
            
            keeper.boxRequest(new Box(boxId,x,y));
            boxId++;
        }
    }
}