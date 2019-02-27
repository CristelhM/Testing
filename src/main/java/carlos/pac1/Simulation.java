package pac1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

public ArrayList<String> loaditems (String filename) throws FileNotFoundException {
	
	Scanner s = new Scanner(new File(filename));
	
	ArrayList<String> list = new ArrayList<String>(); 
	 while(s.hasNextLine()) {
		list.add(s.nextLine()); 
	 }
		//System.out.println(list);	
	 
	 return list;

}	

//public ArrayList<Rocket> loadU1 (ArrayList<String> lista) {	
public void loadU1 (ArrayList<String> lista) {
	for(String item: lista) {
		
		System.out.println(item);
	}
	
        //return lista;
	
}

}
