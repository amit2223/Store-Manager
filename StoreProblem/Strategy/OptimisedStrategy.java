package Strategy;
import java.util.*;
import Model.Box;
import Model.Shop;

public class OptimisedStrategy implements Strategy {

    List<Box> boxes = new ArrayList<>();
    Shop shop;

    public OptimisedStrategy(Shop shop)
    {
        this.shop = shop;
    }

    @Override
    public boolean acceptOrReject(Box box) {
        
        int totalBoxes = boxes.size();
        int storeWidth = shop.getWidth();
        int storeLength = shop.getLength();

        // First Five box will be added directly. We can change it according to our requirement.
        if(totalBoxes <= 4)
        {
            putInOrder(box);
            return true;
        }

        double medianRent;
        if(totalBoxes%2==0)
            medianRent = (boxes.get((totalBoxes-1)/2).getRent() + boxes.get(totalBoxes/2).getRent())/2;
        
        else    
            medianRent = boxes.get(totalBoxes/2).getRent();
    
        double thresoldRatio = medianRent/(storeLength*storeWidth);
        double currentRatio = box.getRent()/(box.getLength()*box.getWidth());

        if(currentRatio >= thresoldRatio)
        {
            if(totalBoxes == 30)
                deleteFirstBox();
            
            putInOrder(box);
            System.out.println("medianPerUnitSquare: "+ thresoldRatio +" rentPerUnitSquare: " + currentRatio);
            return true;
        }

        return false;
    }

    private void deleteFirstBox()
    {
        int firstBoxIndex = 0;
        for(int b=1;b<30;b++)
        {
            if(boxes.get(b).getId() < boxes.get(firstBoxIndex).getId())
                firstBoxIndex = b;
        }
        
        boxes.remove(firstBoxIndex);
    }

    // Binary search to find appropirate index for new element to insert.
    private void putInOrder(Box box)
    {
        int lo = 0, hi = boxes.size() -1;

        if(hi>=0 && boxes.get(hi).getRent() <= box.getRent() )
        {
            boxes.add(box);
            return;
        }

        int correctIndex = 0;
        
        while(lo<=hi)
        {
            int mid = (lo+hi)/2;

            if(boxes.get(mid).getRent() < box.getRent())
                lo=mid+1;
            else
            {
                correctIndex = mid;
                hi=mid-1;
            }
        }

        boxes.add(correctIndex, box);
    }
}
