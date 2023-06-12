public abstract class Animal_21060120140057 {
    protected int legs;

    protected Animal_21060120140057(int legs) {
        this.legs = legs;
    }

    public abstract void eat();

    public void walk() {
        System.out.println("Binatang ini berjalan dengan " + legs + " kaki");
    }

    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal_21060120140057 a = new Fish();
        Animal_21060120140057 e = new Spider();
        Pet p = new Cat();

        d.eat();
        d.walk();
        c.eat();
        c.walk();
        a.eat();
        a.walk();
        e.eat();
        e.walk();
        p.play();
    }
}

class Spider extends Animal_21060120140057 {
    public Spider() {
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("laba-laba ini memakan nyamuk");
    }
}

interface Pet {
    void play();
}

class Cat extends Animal_21060120140057 implements Pet {
    private String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        this("");
    }

    @Override
    public void eat() {
        System.out.println("The cat is eating.");
    }

    @Override
    public void play() {
        System.out.println("The cat is playing.");
    }

    public String getName() {
        return name;
    }
}

class Fish extends Animal_21060120140057 {
    public Fish() {
        super(0);
    }

    @Override
    public void eat() {
        System.out.println("The fish is eating.");
    }

    @Override
    public void walk() {
        System.out.println("Fish cannot walk.");
    }
}
