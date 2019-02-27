package pac1;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Mani {

	

	public static void main(String[] args) {
		ArrayList<String> o3=null;
		
			 Simulation o1 = new Simulation();
			try {
				ArrayList<String> o2= o1.loaditems("Phase-1.txt");
				//System.out.println(o2);
				o3=o2;
				//o1.toString();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
			
			o1.loadU1(o3);
			
	}

}
