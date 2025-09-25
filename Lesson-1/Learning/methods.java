// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
        Person p1  = new Person(5.6, 10, "Bob");
        System.out.println(p1.getAge());
        p1.setAge(12);
        System.out.println(p1.getAge());
        System.out.println(p1);
        Animal a = new Animal(1000, "crocodile", true, "Larry"); 
        System.out.println(a);
	}
}

class Person {
    private double height;
    private int age;
    private String name;
    public Person(double h, int a, String n) {
        height = h;
        age = a;
        name = n;
    }

    //getter
    public int getAge() {
        return age;
    }

    //setter
    public void setAge(int a) {
        age = a;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        height = h;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public String toString() {
        return "Hi my name is " + name + " I am " + age + " years old and my height is " +  height + ".";
    }
}


// height, age, name
// Make a new class Animal with the following characteristics: weight, species, isReptile, name. And for each of the characteristics a respective getter and setter method

class Animal {
    // private to support encapsulation
    private double weight;
    private String species;
    private boolean isReptile;
    private String name;
    // these variables are special variables called Instance variables

    // con
    public Animal(double weight, String species, boolean isReptile, String name){
        //this keyword tells java to look for the specific instance variable
        //without this then java finds the nearest instance i.e. the one above this line
        this.weight = weight;
        this.species = species;
        this.isReptile = isReptile;
        this.name = name;
    }
    
    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }
    
    public boolean getIsReptile(){
        return isReptile;
    }

    public void setIsReptile(boolean isReptile){
        this.isReptile = isReptile;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        //ternary operator
        return "This is a " + species + (isReptile ? ", a reptile, " : ", ") + "his name is " + name + ", he weighs " + weight + " lbs.";
    }
}



// Make a to string in the form "This is a crocodile, a reptile, his name is Larry, he weighs 1000.0 lbs."