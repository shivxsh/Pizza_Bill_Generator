public class Pizza {
    private int price;
    private Boolean isVeg;
    private int extraCheese = 50;
    private int extraToppings = 100;
    private int takeAway = 80;
    private int basePizzaPrice;

    private Boolean isExtraCheeseAdded = false;
    private Boolean isExtraToppingsAdded = false;
    private Boolean isTakeAway = false;

/**Add-ons :
 * extra Cheese : $50
 * extra Toppings : $100
 * TakeAway : $80
 * Veg Pizza : $300
 * Non-Veg Pizza : $400
 */

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(this.isVeg){
            this.price = 300; 
        }   
        else{
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese(){
        isExtraCheeseAdded = true;
        this.price += extraCheese;
    }

    public void addExtraToppings(){
        isExtraToppingsAdded = true;
        this.price += extraToppings;
    }

    public void takeAway(){
        isTakeAway = true;
        this.price += takeAway;
    }

  
    public void getBill(){
        System.out.println("Pizza : " + basePizzaPrice);
        if(isExtraCheeseAdded){
            System.out.println("Extra Cheese : " + extraCheese);
        }
        if(isExtraToppingsAdded){
            System.out.println("Extra Toppings : " + extraToppings);
        }
        if(isTakeAway){
            System.out.println("Take Away Charge : " + takeAway);
        }
        System.out.println("Bill : " + this.price);
   
    }


}
