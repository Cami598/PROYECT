package edu.programacion.logica;

	import java.time.LocalDate;

	public class ParqueNatural {
	   
	    
	     private String nombre; 
	     private LocalDate fecha;
	     private Integer noResolucion;
	     private Double extension, altura, temperatura;
	     private boolean estaCerrado;
	     private String ubicacion;

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public LocalDate getFecha() {
	        return fecha;
	    }

	    public void setFecha(LocalDate fecha) {
	        this.fecha = fecha;
	    }

	    public Integer getNoResolucion() {
	        return noResolucion;
	    }

	    public void setNoResolucion(Integer noResolucion) {
	        this.noResolucion = noResolucion;
	    }

	    public Double getExtension() {
	        return extension;
	    }

	    public void setExtension(Double extension) {
	        this.extension = extension;
	    }

	    public Double getAltura() {
	        return altura;
	    }

	    public void setAltura(Double altura) {
	        this.altura = altura;
	    }

	    public Double getTemperatura() {
	        return temperatura;
	    }

	    public void setTemperatura(Double temperatura) {
	        this.temperatura = temperatura;
	    }

	    public boolean isEstaCerrado() {
	        return estaCerrado;
	    }

	    public void setEstaCerrado(boolean estaCerrado) {
	        this.estaCerrado = estaCerrado;
	    }

	    public String getUbicacion() {
	        return ubicacion;
	    }

	    public void setUbicacion(String ubicacion) {
	        this.ubicacion = ubicacion;
	    }
	}


