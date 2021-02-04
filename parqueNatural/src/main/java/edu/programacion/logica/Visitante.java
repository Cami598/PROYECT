package edu.programacion.logica;

import javax.swing.JOptionPane;

	
public class Visitante extends Persona {
	   
	    private String tipo, fecha;
	    private int cantidad;
	    private double valorCancelado;
	    
	    
	    public Visitante (String nombre, String identif, String direccion, String tel, String tipo, String fecha, int cantidad, double valor) {
	        super(nombre, identif, direccion, tel);
	        
	        this.tipo = tipo;
	        this.fecha = fecha;
	        this.cantidad = cantidad;
	        valorCancelado = valor;
	    }

	     public void setTipo (String tipo){
	    
	        this.tipo = tipo;
	    
	    }
	    
	    public String getTipo(){
	    
	        return tipo;
	        
	    }
	    
	    public void setFecha (String fecha){
	    
	        this.fecha = fecha;
	    
	    }
	    
	    public String getFecha(){
	    
	        return fecha;
	        
	    }
	    
	    public void setCantidad (int cant){
	    
	        cantidad = cant;
	    
	    }
	    
	    public int getCantidad(){
	    
	        return cantidad;
	        
	    }
	        
	    public void setValor (double valor){
	    
	        valorCancelado = valor;
	    
	    }
	    
	    public double getValor(){
	    
	        return valorCancelado;
	        
	    } 
	       
	    
	}

