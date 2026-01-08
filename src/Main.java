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
    }
}
