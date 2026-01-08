public class Dog extends Animal {
    public Dog (String nom , int age ) {
          super(nom, age);


    }

    @Override
    public void eat() {
        System.out.println("the dog is eating");

    }
}
