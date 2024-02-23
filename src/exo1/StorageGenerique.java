package exo1;

import java.util.ArrayList;
import java.util.List;

public class StorageGenerique<T> {
    private List<T> elements;

    public StorageGenerique() {}
    public StorageGenerique(List<T> elements) {
        this.elements = elements;
    }

    public void addElement(T element){
        this.elements.add(element);
    }

    public T getElement(int index){
        try {
            return  this.elements.get(index);
        }catch(IndexOutOfBoundsException e){
            System.out.println("Error: " + e.getMessage());
            
            return null;
        }

    }

    public void removeElement(int index){
        try {
            this.elements.remove(index);
        }catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public int getSize(){
        return this.elements.size();
    }

    public List<T> getElements() {
        return elements;
    }
}
