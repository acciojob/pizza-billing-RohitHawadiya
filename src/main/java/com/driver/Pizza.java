package com.driver;

public class Pizza {
    public boolean cheese;
    public boolean topping;

    public boolean bag;
    public boolean isBill;

    public int bagPrice;
    public  int basePrice;

    public int cheesePrice;

    public int toppingPrice;
    public int totalPrice;
    public String bill;

    public Pizza(Boolean isVeg){
        if(isVeg==true)
        {
            this.basePrice=300;
            this.toppingPrice=70;
        }
        else
        {
            this.basePrice=400;
            this.toppingPrice=120;
        }
        this.cheesePrice=80;
        this.bagPrice=20;
        this.cheese=false;
        this.topping=false;
        this.isBill=false;

        this.totalPrice=this.basePrice;
        this.bill="Base Price Of The Pizza: "+this.basePrice +"\n";
    }

    public int getPrice(){
       return this.totalPrice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(this.cheese==false)
        {
            this.totalPrice=this.totalPrice+this.cheesePrice;
            this.cheese=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(this.topping==false)
        {
            this.totalPrice=this.totalPrice+this.toppingPrice;
            this.topping=true;
        }
    }

    public void addTakeaway(){
        // your code goes here

        if(this.bag==false)
        {
            this.totalPrice=this.totalPrice+this.bagPrice;
            this.bag=true;
        }

    }

    public String getBill(){
        // your code goes here
       if(isBill==false)
       {
           if(this.cheese==true)
              this.bill=this.bill+"Extra Cheese Added: "+this.cheesePrice+"\n";
           if(this.topping==true)
               this.bill=this.bill+"Extra Toppings Added: "+this.toppingPrice+"\n";
           if(this.bag==true)
               this.bill=this.bill+"Paperbag Added: "+this.bagPrice+"\n";

           this.bill=this.bill+"Total Price: "+this.totalPrice+"\n";
           this.isBill=true;
       }
       return this.bill;
    }
}
