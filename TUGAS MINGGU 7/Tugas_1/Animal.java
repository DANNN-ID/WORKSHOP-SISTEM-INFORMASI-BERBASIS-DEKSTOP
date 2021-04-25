package Tugas_1;
/*
    @author : AHMAD WILDAN
    NIM     : E41201452
    GOL     : TIF B - BONDOWOSO
*/
public class Animal {
    public void makeNoise() {
        System.out.println("talk");
    }
    
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeNoise();
        Dog dog = new Dog();
        dog.makeNoise();
        
        Animal animaldog = new Dog();
        animaldog.makeNoise();
        
        if(animal instanceof Animal) {
            System.out.println("Animal is Animal");
        }
        
        if (dog instanceof Animal) {
            System.out.println("dog is Animal");
        }
        
        if (animaldog instanceof Animal) {
            System.out.println("animalDog is Animal");
        }
        
        if (animal instanceof Dog) {
            System.out.println("animal is Dog");
        }
    }
}

class Dog extends Animal {
    @Override
    public void makeNoise(){
        System.out.println("Bark");
    }
}