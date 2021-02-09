package edu.programacion.logica;

import java.util.ArrayList;
import java.util.List;
	
public class Corporacion {
	private List<ParqueNatural> parques;
	    
	Corporacion(){
	    parques = new ArrayList<>();
	}
	
	 public List<ParqueNatural> getParques() {
		 return parques;
	}
	 
	public void ingresarParque(ParqueNatural parqueNatural){
		parques.add(parqueNatural);
	}
	     

}
