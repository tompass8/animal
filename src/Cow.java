public class Cow extends Animal {

    public Cow(String nom, int age) {
        super(nom, age);
    }

    @Override
    public void produireSon() {
        System.out.println(" Meuh ");
    }

    @Override
    public void eat() {
        System.out.println("the cow is eating");

    }
    @Override
    public void eat(int amount) {
        System.out.println("the cow is eating"+ amount); }
}
