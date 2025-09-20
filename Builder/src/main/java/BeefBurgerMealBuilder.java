/**
 * 3.具体建造者（ConcreteBuilder) 牛肉汉堡套餐
 */
public class BeefBurgerMealBuilder extends MealBuilder {
    @Override
    public void buildBurger() {
        meal.setBurger("牛肉汉堡");
    }

    @Override
    public void buildFries() {
        meal.setFries("大份薯条");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("中杯可乐");
    }
}

