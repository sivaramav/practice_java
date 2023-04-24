package com.practice.creational;

import java.util.ArrayList;
import java.util.List;

public class Builder {
	
	
	public static void main(String[] args) {
		
		Pizza pizza = new PizzaBuilder()
			    .setDough("thin crust")
			    .setSauce("tomato")
			    .setCheese("mozzarella")
			    .addTopping("mushrooms")
			    .addTopping("peppers")
			    .build();
		
		
		System.out.println(pizza);
		
		
	}

}



 class Pizza {
    private String dough;
    private String sauce;
    private String cheese;
    private List<String> toppings;

    public Pizza(String dough, String sauce, String cheese, List<String> toppings) {
        this.dough = dough;
        this.sauce = sauce;
        this.cheese = cheese;
        this.toppings = toppings;
    }

	public String getDough() {
		return dough;
	}

	public String getSauce() {
		return sauce;
	}

	public String getCheese() {
		return cheese;
	}

	public List<String> getToppings() {
		return toppings;
	}

	@Override
	public String toString() {
		return "Pizza [dough=" + dough + ", sauce=" + sauce + ", cheese=" + cheese + ", toppings=" + toppings + "]";
	}
	
	
    
}

 
 
  class PizzaBuilder {
	    private String dough;
	    private String sauce;
	    private String cheese;
	    private List<String> toppings = new ArrayList<>();

	    public PizzaBuilder setDough(String dough) {
	        this.dough = dough;
	        return this;
	    }

	    public PizzaBuilder setSauce(String sauce) {
	        this.sauce = sauce;
	        return this;
	    }

	    public PizzaBuilder setCheese(String cheese) {
	        this.cheese = cheese;
	        return this;
	    }

	    public PizzaBuilder addTopping(String topping) {
	        toppings.add(topping);
	        return this;
	    }

	    public Pizza build() {
	        return new Pizza(dough, sauce, cheese, toppings);
	    }
	}

