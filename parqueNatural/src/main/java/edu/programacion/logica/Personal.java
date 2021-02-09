package edu.programacion.logica;

	
public class Personal extends Persona {
	    
    private String cargo;
    private double saldo;
    private String area, zonaParqueo;
    
   
    public Personal(String nombre, String identif, String direccion, String tel, String area, String parqueo, double saldo, String cargo) {
        super(nombre, identif, direccion, tel);
        
        this.area = area;
        zonaParqueo = parqueo;
        this.saldo = saldo;
        this.cargo = cargo;
    }
    
    public void setPersonal (String gestion_vigilante){
    
        cargo = gestion_vigilante;
    
    }
    
    public String getPersonal(){
    
        return cargo;
        
    }
    
    public void setSaldoPersonal (double sueldo){
    
        saldo = sueldo;
    
    }
    
    public double getSaldoPersonal(){
    
        return saldo;
        
    }
    
    public void setAreaPersonal (String area){
    
        this.area = area;
    
    }
    
    public String getAreaPersonal(){
    
        return area;
        
    }
    
    public void setZonaPersonal (String parqueo){
    
        zonaParqueo = parqueo;
    
    }
	    
    public String getZonaPersonal(){
    
        return zonaParqueo;
        
    }
    
      /*  public void mostrarPersonal(){
    
        JOptionPane.showMessageDialog(null, "Identificación: " + identificacion + "\n Nombre: " +nombre+
          "\n Dirección: " + direccion+ "Télefono: " + telefono + "Área de Trabajo: " + area + "Zona de parqueo del trabajador: " + zonaParqueo + "Sueldo: " + saldo +
                "\n Tipo de Ocupación: " +cargo,  "Datos del personal del Parque", JOptionPane.INFORMATION_MESSAGE);
    
    }*/
	    
}


