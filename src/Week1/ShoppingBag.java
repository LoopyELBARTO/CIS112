package Week1;

public class ShoppingBag {

    public int numOfItems;
    public double itemCost;
    public double totalCost;
    private double taxRate;

    public ShoppingBag(double taxRate){
        this.taxRate = taxRate;
    }

    public void place(int numItems, double itemCost){
        double costOfPurchase = numItems * itemCost;
        numOfItems = numOfItems + numItems;
        totalCost = totalCost + costOfPurchase;
    }

    public int getNumOfItems(){
        return numOfItems;
    }

    public double getItemCost(double itemCost){
        return itemCost;
    }

    public double totalCost(){
        return ((taxRate / 100) * getTotalCost()) + getTotalCost();
    }

    public double getTotalCost(){
        return totalCost;
    }
    public String toString(){
        return String.format("The bag contains %d items.  The retail cost of the items is $%.2f.\n" +
                "The total cost of the items is $%.2f", getNumOfItems(), getTotalCost(), totalCost());
    }

}
