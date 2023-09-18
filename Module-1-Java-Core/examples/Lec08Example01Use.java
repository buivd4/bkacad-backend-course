import Lec08Example.Lec08Example01Ex;
import Lec08Example.Lec08Example01;

// Class to which the package belongs
class Lec08Example01Use {
 
    // main driver method
    public static void main(String arg[])
    {
 
        // Creating an object of Demo class
        Lec08Example01 father = new Lec08Example01();
        Lec08Example01Ex child = new Lec08Example01Ex();

        // Calling the functions show() and view()
        // using the object of Demo class
        father.show();
        child.show();
    }
}

