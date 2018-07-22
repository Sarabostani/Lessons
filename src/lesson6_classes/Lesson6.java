package lesson6_classes;

public class Lesson6 {

    /*
     * C programming language ( 1972 ) only had functions
     * 
     * OOP languages: C++ programming language( 1985 ) introduced classes C#
     * programming (1995) Java (1992)
     * 
     * 
     * Object Oriented Programming
     * 
     * Object : abstraction of multiple actions that define a type
     * 
     * int, boolean built-in primitive types
     * 
     * String : is a class (object)
     * 
     * 
     */
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal2 = new Animal();

        String sound = animal.getSound();

        animal.increaseWeight();

        int w = animal.getWeight();

        System.out.println(w);

        int w2 = animal2.getWeight();
        System.out.println(w2);

        System.out.println(sound);
    }

}
