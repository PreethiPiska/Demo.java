package com.tnsif.five;

//Base interface
interface Animal {
 void eat();
}

//Extended interface
interface Dog extends Animal {
 void bark();
}

//A class implementing the extended interface
class Labrador implements Dog {

 @Override
 public void eat() {
     System.out.println("Labrador eats food.");
 }

 @Override
 public void bark() {
     System.out.println("Labrador barks loudly.");
 }
}

//Main class to test
public class Interfaceextends {
 public static void main(String[] args) {
     Labrador lab = new Labrador();

     lab.eat();   // From Animal interface
     lab.bark();  // From Dog interface
 }
}
