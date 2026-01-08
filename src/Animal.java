public abstract class Animal {
    protected String nom;
    protected int age;
    public String color;
    private int height;


    public void setHeight(int height) {
            this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public void produireSon() {
        System.out.println("L'animal fait un son");
    }

    public String getNom() {
        return nom;
    }

    public static void display() {
        System.out.println("tous les animaux font du bruit");
    }

    public abstract void eat ();
    public abstract void eat (int amount);
}

