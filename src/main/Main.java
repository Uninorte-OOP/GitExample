/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import core.Dog;
import core.Cat;
import core.Person;

/**
 *
 * @author edangulo
 */
public class Main {
    
    public static void main(String[] args) {
        Person person = new Person(1548845899L, "Juan Perez", 23);
        System.out.println(person);
        
        Dog dog = new Dog("Lucas", 5, 0.84, 26.14, "labrador");
        System.out.println(dog);
        
        Cat cat = new Cat("Michi", 3, 0.38, 11.68, true);
        System.out.println(cat);
    }
    
}
