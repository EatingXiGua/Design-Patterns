public class TestBuilder {

    public static void main(String[] args) {

        //创建指导者
        MealDirector director=new MealDirector();

        //执导建造牛肉套餐
        director.setMealBuilder(new BeefBurgerMealBuilder());
        director.constructMeal();
        Meal meal = director.getMeal();
        System.out.println("牛肉套餐："+meal.toString());

        //鸡肉套餐
        director.setMealBuilder(new ChickenMealBuilder());
        director.constructMeal();
        Meal meal2 = director.getMeal();
        System.out.println("鸡肉套餐："+meal2.toString());

        //虾肉套餐
        director.setMealBuilder(new ShrimpMealBuilder());
        director.constructMeal();
        Meal meal3 = director.getMeal();
        System.out.println("虾肉套餐："+meal3.toString());
    }


}
