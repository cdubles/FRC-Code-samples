abstract class animal { // abstract means we can not make an object out of animal and would have to use a subclass
    protected String name; // name used for any animals we make
    protected int hunger = 10; // a value that all animals will have

    public animal() {// this is the constructor, it is ran when the class is first initialized in an object
        System.out.println("I am an animal");
    }

    public void eat() { // method that is part of the animal class to decrease the hunger value
        if (hunger > 0) {
            hunger--;
        }
        System.out.println(this.name + " " + hunger);
    }
}

// making a subclass of animal
class dog extends animal { // the dog class inherits all of the information from the animal class above.
    public dog(String name) { // dog class constructor
        this.name = name;
        System.out.println("i am a dog named " + name);
    }

    public void animalSound() {
        System.out.println(name+" says: bow wow");
      }
}

class cat extends animal {
    public cat(String name) {
        this.name = name;
        System.out.println("I am a cat named " + name);
    }
    public void animalSound() {
        System.out.println(name+" says: meow");
      }
}

public class sample3 {
    // classes
    // this lesson will teach you how to make and use classes

    public static void main(String[] args) {
        dog Oscar = new dog("Oscar");
        cat Rex = new cat("Rex");
        Oscar.eat(); //calls Oscars eat method that was made in the animal superclass
        Rex.eat();
        Rex.eat();
        Oscar.animalSound(); //calls Oscars sound method that was made in the dog subclass
        Rex.animalSound();
    }
}