package Model;

import Strategy.Strategy;

public class ShopKeeper {
    private Shop shop;
    private Strategy strategy;
    private double profit;

    public ShopKeeper(Shop shop , Strategy strategy)
    {
        this.shop = shop;
        this.strategy = strategy;
        profit = 0;
    }

    public void boxRequest(Box box)
    {
        if(box.getLength()<=0 || box.getWidth()<=0)
        {
            System.out.println("Invalid dimensions");
            return;
        }

        if(shop.checkAvailablity(box) && strategy.acceptOrReject(box))
        {
            shop.fill(box);
            profit += box.getRent();
            System.out.println("Box accepted, Total Profit: "+profit);
            return ;
        }

        System.out.println("Box rejected");
    }

    public double getProfit() {
        return profit;
    }
}
