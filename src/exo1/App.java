package exo1;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("======================Working With Integers==========================");
        StorageGenerique<Integer> c1 = new StorageGenerique<>(new ArrayList<>());
        //add elements
        c1.addElement(1);
        c1.addElement(2);
        c1.addElement(3);
        c1.addElement(4);
        c1.addElement(5);
        //get elements
        System.out.println("c1 -> elements = " + c1.getElements());
        //get an element by index
        System.out.println("Element = " + c1.getElement(2));
        //remove an element
        c1.removeElement(2);
        c1.removeElement(3);
        //get elements
        System.out.println("c1 -> elements = " + c1.getElements());
        //get elements collection's size
        System.out.println("Size = " + c1.getSize());

        System.out.println("======================Working With Doubles==========================");
        StorageGenerique<Double> c2 = new StorageGenerique<>(new ArrayList<>());
        //add elements
        c2.addElement(1.0);
        c2.addElement(2.2);
        c2.addElement(3.6);
        c2.addElement(4.5);
        c2.addElement(5.9);
        c2.addElement(6.2);
        //get elements
        System.out.println("c2 -> elements = " + c2.getElements());
        //get an element by index
        System.out.println("Element = " + c2.getElement(2));
        //remove an element
        c2.removeElement(2);
        c2.removeElement(3);
        //get elements
        System.out.println("c2 -> elements = " + c2.getElements());
        //get elements collection's size
        System.out.println("Size = " + c2.getSize());


        System.out.println("======================Working With Strings==========================");
        StorageGenerique<String> c3 = new StorageGenerique<>(new ArrayList<>());
        //add elements
        c3.addElement("Ahmed");
        c3.addElement("Achraf");
        c3.addElement("John");
        c3.addElement("Jane");
        c3.addElement("Mark");
        c3.addElement("Marie");

        //get elements
        System.out.println("c3 -> elements = " + c3.getElements());
        //get an element by index
        System.out.println("Element = " + c3.getElement(3));
        //remove an element
        c3.removeElement(2);
        //get elements
        System.out.println("c3 -> elements = " + c3.getElements());
        //get elements collection's size
        System.out.println("Size = " + c3.getSize());

    }
}
