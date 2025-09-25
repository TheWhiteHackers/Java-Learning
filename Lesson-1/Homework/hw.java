/* Research inheritance, polymorphism, arrayList, stacks, queue, suppliers, for fun: hashmaps*/

/*
INHERITANCE

Important because it allows you to use properties and methods from a class without redefining them.

subclass = child
superclass = parent

to inherit from a class use "extends"

ex. class Car (superclass) -> class Car extends Vehicle (subclass)

*/

/* 
POLYMORPHSM

Many classes that are related to eachother by inheritance

ex. class Animal w/ animalSound() -> class Pig extends Animal
                                  -> class Dog extends Animal
                                  -> class Cat extends Animal
    and then they all use the animalSound method


*/

/* 
ARRAYLIST

Resizable array - elements can be added and removed

import java.util.ArrayList; - imports the arraylist class
ArrayList<String> cars = new ArrayList<String>(); - create an ArrayList object 

you can also use methods like add(), get(), set(), remove() to manage elements

ex.     cars.add("BMW") -> cars.add(0, "BMW") - this adds it at the beginnng
        cars.get(0) - this gets the 1st element
        cars.set(0, "Mercedes") - changes the 1st element
        cars.remove(0) - removes 1st element
        cars.clear() - removes all elements
        cars.size() - finds the number of elements

you can also sort the array numerically and alphabetically
    import java.util.Collections; - imports the Collections class
    Collections.sort(cars); - sorts cars


*/

/*
STACKS
*/

/*
QUEUE
*/

/*
SUPPLIERS
*/

/*
HASHMAPS
*/