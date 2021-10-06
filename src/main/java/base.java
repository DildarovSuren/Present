import staff.*;

public class base {

    public static void main(String[] args) {
        Cake cake1 = new Cake("Шарлотка",1.79,500,330.66);
        Candy candy1 = new Candy("Jelly",0.44,430,"Разноцветные");
        Marshmallow marshmallow1 = new Marshmallow("Каждый день",0.35,53,"Кислый");
        RotFront rotFront1 = new RotFront("Ротфронт",0.77,230,"Умеренный");
        SugarStick sugarStick1 = new SugarStick("Соломка с сахаром",0.33,79,"Средняя пачка");
        double totalWeight = cake1.getWeight() + candy1.getWeight() + marshmallow1.getWeight() + rotFront1.getWeight() + sugarStick1.getWeight();
        double totalPrice = cake1.getPrice() + candy1.getPrice() + marshmallow1.getPrice() + rotFront1.getPrice() + sugarStick1.getPrice();
        Box [] present = {cake1,candy1,marshmallow1,rotFront1,sugarStick1};
        for (Box someBox : present) {
            System.out.println(someBox.toString());
        }
        System.out.println("Общий вес подарка: " + totalWeight + " кг.");
        System.out.println("Общая сумма подарка: " + totalPrice + " рублей." );


    }
}
