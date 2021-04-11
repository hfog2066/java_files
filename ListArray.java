import java.util.ArrayList;
import java.util.List;

public class ListArray{
    
    public static void main(String[] args){
	// Define a Array List
	ArrayList<String> list = new ArrayList<String>();

	// Add elements
	list.add("Learn");
	list.add("C_Language");
	list.add("Java");
	list.add("Python");

	// Get an iterator and go through the list.
	for (int i=0; i<list.size(); i++){
	    
	    System.out.println(list.get(i));
	}
    }
}
    

