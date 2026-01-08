public class Main {

    private static Object cow;

    public static void main(String[] args) {
        Cow c = new Cow("vachra", 5);
        System.out.println("Nom de l'animal : " + c.getNom());
        c.produireSon();
        Animal.display();
        Dog dog = new Dog("toto", 5);
        dog.eat();
        c.eat();

        dog.eat();
        dog.eat(5);

        c.eat();
        c.eat(3);

        //System.out.println(dog.height);
        //System.out.println(c.height);//private inaccessible en dehors de la classe
       //System.out.println(dog.color);
        //System.out.println(c.age);
    }
}
