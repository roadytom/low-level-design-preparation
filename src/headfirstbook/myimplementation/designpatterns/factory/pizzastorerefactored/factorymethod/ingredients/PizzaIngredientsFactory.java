package headfirstbook.myimplementation.designpatterns.factory.pizzastorerefactored.factorymethod.ingredients;

public interface PizzaIngredientsFactory {
    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClams();
}
