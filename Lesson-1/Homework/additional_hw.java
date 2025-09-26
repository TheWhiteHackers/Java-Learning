/*
INTERFACES

an abstract class that doesn't have a body

interface IceCream {
    public void vanilla(); // interface method (does not have a body)
    public void chocolate(); // interface method (does not have a body)
}


interface must be implemented (kinda like inheritance) 

ex.

class MyIceCreamShop implements IceCream{
    public void vanilla(){
        System.out.println("homemade");
    }
}

cannot create objs
body is provided by the implement class
cannot contain a constructor

supports multiple interfaces


 */