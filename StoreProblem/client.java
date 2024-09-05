import Model.Box;
import Model.Shop;
import Model.ShopKeeper;
import Strategy.OptimisedStrategy;

import java.util.*;

class client{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Space Dimension");
        int length = sc.nextInt();
        int width = sc.nextInt();

        Shop shop = new Shop("Kirana" , length , width);
        ShopKeeper keeper = new ShopKeeper(shop , new OptimisedStrategy(shop));
        int boxId = 1;
        
        while(true)
        {
            System.out.println("Enter box dimensions and rent: ");
            int x = sc.nextInt();

            if(x==-1) //Input Stop conditoin
            {
                shop.printSpace();
                break;
            }
            int y = sc.nextInt();
            double rent = sc.nextDouble();
    
            keeper.boxRequest(new Box(boxId,x,y,rent));
            boxId++;
        }
    }
}
