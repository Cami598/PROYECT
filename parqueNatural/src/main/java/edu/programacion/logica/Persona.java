package edu.programacion.logica;

public class Persona {
	
	    protected String nombre, identificacion, direccion, telefono;
	    
	    public Persona (String nombre, String identif, String direccion, String tel){
	    
	        this.nombre = nombre;
	        identificacion = identif;
	        this.direccion = direccion;
	        telefono = tel;
	    
	    }
	    

		public void setNombre (String nombre){
	    
	        this.nombre = nombre;
	    
	    }
	    
	    public String getNombre(){
	    
	        return nombre;
	        
	    }
	    
	    public void setIdentificiacion (String identif){
	    
	        identificacion = identif;
	    
	    }
	    
	    public String getIdentificacion(){
	    
	        return identificacion;
	        
	    }
	    
	    public void setDireccion (String dir){
	    
	        direccion = dir;
	    
	    }
	    
	    public String getDireccion(){
	    
	        return direccion;
	        
	    }
	     public void setTelefono (String tel){
	    
	        telefono = tel;
	    
	    }
	    
	    public String getTelefonon(){
	    
	        return telefono;
	        
	    }
	}


