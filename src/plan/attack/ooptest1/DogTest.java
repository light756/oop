package plan.attack.ooptest1;

public class DogTest {
    static void main() {
        //狗——三头犬
        Dog hellDog = new Dog();
        hellDog.name = "三头犬";
        hellDog.age = 3;
        hellDog.weight = 20.5;
        hellDog.color = "黑色";
        hellDog.eat();
        hellDog.sleep();
        hellDog.run();
        System.out.println(hellDog.name);
        System.out.println(hellDog.age);
        System.out.println(hellDog.weight);
        System.out.println(hellDog.color);
    }
}
