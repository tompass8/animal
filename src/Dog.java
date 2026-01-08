public class Dog extends Animal implements Pet {

    public Dog (String nom , int age ) {
          super(nom, age);
          this.color= "black";
            setHeight(6);
    }

    @Override
    public void eat() {
        System.out.println("the dog is eating");
    }

    @Override
    public void eat(int amount) {
        System.out.println("the dog is eating"+ amount);
    }

    public void play() {

    }
}
