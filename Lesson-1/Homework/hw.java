/* Research inheritance, polymorphism, arrayList, stacks, queue, suppliers, for fun: hashmaps*/

/*
INHERITANCE

Important because it allows you to use properties and methods from a class without redefining them.

subclass = child
superclass = parent

to inherit from a class use "extends"

ex. class Car (superclass) -> class Car extends Vehicle (subclass)

*/
////////////////////////////////////////////////////////////////////////////////
/* 
POLYMORPHSM

Many classes that are related to eachother by inheritance

ex. class Animal w/ animalSound() -> class Pig extends Animal
                                  -> class Dog extends Animal
                                  -> class Cat extends Animal
    and then they all use the animalSound method


*/
////////////////////////////////////////////////////////////////////////////////
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
////////////////////////////////////////////////////////////////////////////////
/*
STACKS

Linear data structure that follows the Last in First Out (LIFO) principle

    import java.util.Stack
    Stack<Integer> s = new Stack<>(); - creates an empty stack
    s.push(1); - pushes elements onto the stack
    s.push(2);
    s.push(3);
    s.push(4);

    s.pop() - removes and returns the top element from the stack
    s.peek() - returns the top element from the stack
    s.empty() - checks if the stack is empty
    s.size() - finds the number of elements in the stack
    s.search() - determines whether an obj exists in the stack and returns the position, if element is not found returns -1

*/
////////////////////////////////////////////////////////////////////////////////
/*
QUEUE

Elements are proccess in the order they were insterted, First In First Out (FIFO) principle

    public interface Queue extends Collection
    Queue<obj> q = new LinkedList<obj>(); - we cannot use queue directly since it is a interface
                       new PriorityQueue
                       new PriorityBlockingQueue

    q.add() - adds element to the end, if q is full throws an exception
    q.offer() - adds element to the end, if q is full returns false
    q.remove()  - removes and returns element at the front of q
    q.poll() - removes and returns element at the front of the queue, if empty returns null
    q.element() - returns the element at the front w/o removing it, if q is empty returns an exception
    q.peek() - returns the element at the front w/o removing it, if q is empty returns null


*/
////////////////////////////////////////////////////////////////////////////////
/*
SUPPLIERS

You don't need to suppy a value but you get a result

    import java.util.function.Supplier

        get() - the only function

    Supplier<Double> randomValue = () -> Math.random();
    System.out.println(randomValue.get());

*/
////////////////////////////////////////////////////////////////////////////////
/*
HASHMAPS

stores items in value/key pairs, where each key maps to a specific value

import java.util.HashMap; -  import the HashMap class
HashMap<String, String> captialCities = new HashMap<>();

capitalCities.put("England", "London") - adds key/value pair
capitalCities.get("England") - gets the value
capitalCities.remvoe("England") - removes the pair
capitalCities.clear() - removes everything
capitalCities.size() - finds the number of items

.keySet() for only the keys
.value() for only the values

*/