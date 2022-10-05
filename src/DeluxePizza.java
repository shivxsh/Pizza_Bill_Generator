public class DeluxePizza extends Pizza{
//Deluxe Pizzas come with extra cheese and extra toppings.    
    public DeluxePizza(boolean isVeg){
        super(isVeg);
        super.addExtraCheese();
        super.addExtraToppings();
    }

    //Overriding the super class's functions because 
    //In deluxe pizzas, extra cheese and toppings are default.
    //Hence, in the main class, if we try to add more, 
    //the bill will be wrong. So hence, we change the existing 
    //function as an empty function. So now, even if the user
    //tries to add extra toppings and cheese to the deluxe pizza
    //No extra amount will be charged.
    
    @Override
    public void addExtraCheese(){}

    @Override
    public void addExtraToppings(){}

    
}
