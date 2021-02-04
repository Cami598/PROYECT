package edu.programacion.logica;


	import javax.swing.JOptionPane;
	
	public class Parque {
	    
	    private String ubicacion, area, zonaParqueo, tipo, fecha, oriundo, nacional, extranjero;
	    private String nombre, identificacion, direccion, telefono;
	    private double saldo, valorCancelado;
	    private int numero, capacidad, cantidad;
	    private boolean disponibilidad;
	    private String cargo;
	    Cabaña cab = new Cabaña();
	    Cabaña [] arr;
	    Perssonal [] arrP;
	    
	    public void ingresarDatosCabaña(){
	   
	    ubicacion = (JOptionPane.showInputDialog(null, "¿Cuál es la ubicación de la cabaña?", "Datos Cabaña", JOptionPane.PLAIN_MESSAGE));
	    numero = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Número de la cabaña?", "Datos Cabaña", JOptionPane.PLAIN_MESSAGE));
	    capacidad = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Capacidad de personas en esa cabaña?", "Datos Cabaña", JOptionPane.PLAIN_MESSAGE));
	    disponibilidad = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "¿La cabaña esta ocupada o disponible?", "Datos Cabaña", JOptionPane.PLAIN_MESSAGE));
	    
	  }
	        public void mostrarDatosCabaña(){
	  
	  JOptionPane.showMessageDialog(null, "Ubicación: " + ubicacion + "\n Número" + numero + "\n Capacidad de personas: " + capacidad + "\n La cabaña esta: " + disponibilidad ,
	          "Datos Cabaña", JOptionPane.INFORMATION_MESSAGE);
	  }
	        public void ingresarDatosPerssonal(){
	    nombre = (JOptionPane.showInputDialog(null, "Nombre del trabajador", "Datos Personal", JOptionPane.PLAIN_MESSAGE));
	    identificacion = (JOptionPane.showInputDialog(null, "Identificación del trabajador", "Datos Personal", JOptionPane.PLAIN_MESSAGE));
	    direccion = (JOptionPane.showInputDialog(null, "Dirección del trabajador", "Datos Personal", JOptionPane.PLAIN_MESSAGE));
	    telefono = (JOptionPane.showInputDialog(null, "Teléfono del trabajador", "Datos Personal", JOptionPane.PLAIN_MESSAGE)); 
	    area = (JOptionPane.showInputDialog(null, "¿Cuál es el área de trabajo del trabajador?", "Datos Personal", JOptionPane.PLAIN_MESSAGE));
	    zonaParqueo = (JOptionPane.showInputDialog(null, "¿Cuál es la zona de parqueo del trabajador?", "Datos Personal", JOptionPane.PLAIN_MESSAGE));
	    saldo = Double.parseDouble(JOptionPane.showInputDialog(null, "¿Saldo del trabajador?", "Datos Personal", JOptionPane.PLAIN_MESSAGE));
	    cargo = JOptionPane.showInputDialog(null, "Ingrese cargo GESTION o VIGILANCIA: ", "Datos Personal", JOptionPane.INFORMATION_MESSAGE);
	    
	  }
	        public void mostrarDatosPerssonal(){
	  
	  JOptionPane.showMessageDialog(null, "Nombre del Trabajador: " + nombre + "\n Identificacion" + identificacion + "\n Dirección: " + direccion + "\n Teléfono: " + telefono 
	          + "Área de trabajo: " + area + "\n Zona Parqueo" + zonaParqueo + "\n Saldo: " + saldo + "\n El cargo del empleado es: " + cargo ,
	          "Datos Personal", JOptionPane.INFORMATION_MESSAGE);
	  }
	         public void ingresarDatosVisitante(){
	    nombre = (JOptionPane.showInputDialog(null, "Nombre del Visitante: ", "Datos Visitantes", JOptionPane.PLAIN_MESSAGE));
	    identificacion = (JOptionPane.showInputDialog(null, "Identificación del Visitante", "Datos Visitantes", JOptionPane.PLAIN_MESSAGE));
	    direccion = (JOptionPane.showInputDialog(null, "Dirección del Visitante", "Datos Visitantes", JOptionPane.PLAIN_MESSAGE));
	    telefono = (JOptionPane.showInputDialog(null, "Teléfono del Visitante", "Datos Visitantes", JOptionPane.PLAIN_MESSAGE)); 
	    tipo = (JOptionPane.showInputDialog(null, "¿Qué tipo de visitante es?", "Datos Visitantes", JOptionPane.PLAIN_MESSAGE));
	    fecha = (JOptionPane.showInputDialog(null, "Fecha de ingreso: ", "Datos Visitantes", JOptionPane.PLAIN_MESSAGE));
	    cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cantidad de visitantes?", "Datos Visitantes", JOptionPane.PLAIN_MESSAGE));
	    valorCancelado = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor total cancelado", "Datos Visitantes", JOptionPane.PLAIN_MESSAGE));
	    
	  }
	        public void mostrarDatosVisitante(){
	  
	  JOptionPane.showMessageDialog(null, "Nombre del visitante: " + nombre + "\n Identificacion" + identificacion + "\n Dirección: " + direccion + "\n Teléfono: " + telefono 
	          + "\n Visitante: " + tipo + "\n Fecha de Ingreso: " + fecha+ "\n Cantidad de visitantes: " + cantidad + "\n Valor total cancelado: " + valorCancelado,
	          "Datos Visitantes", JOptionPane.INFORMATION_MESSAGE);
	  }
	        
	        
	        public boolean disponibilidadCabaña(){
	            int i, cabañaDisponible ;
	            for(i = 0; i < arr.length;i++){
	                if (arr[i].getDisponibilidad() == true){
	                    cabañaDisponible = +1;
	                }
	            }
	        return false;
	        }
	        
	        public String cargoPersonal(){
	            int i, opcion=0;
	            String  cargo = "";
	            switch (opcion) {
	                
	                case 0: 
	                    cargo = "Vigilancia";
	                    break;
	                    
	                case 1:
	                    cargo = "gestion";
	                    break;
	                    
	                default: JOptionPane.showMessageDialog(null, "Opción no valida", "Error", JOptionPane.ERROR_MESSAGE);
	                break;
	           }      
	            for(i = 0; i < arrP.length;i++){
	                if (arrP[i].getPersonal().equals(cargo)){
	                    cargo = cargo + arrP[i].getNombre() + ";";
	                }
	                 JOptionPane.showMessageDialog(null, "Datos según cargo: " + cargo, "Cargo Personal", JOptionPane.INFORMATION_MESSAGE);
	            }
	            
	        return cargo;
	        
	        }
	        
	        public double saldoPesonal(){
	       
	            int i, opcion=0;
	            String  cargo = "";
	            switch (opcion) {
	                
	                case 0: 
	                    cargo = "Vigilancia";
	                    break;
	                    
	                case 1:
	                    cargo = "gestion";
	                    break;
	                    
	                default: JOptionPane.showMessageDialog(null, "Opción no valida", "Error", JOptionPane.ERROR_MESSAGE);
	                break;
	           }      
	            for(i = 0; i < arrP.length;i++){
	                if (arrP[i].getSaldoPersonal().equals(cargo)){
	                    saldo = cargo + arrP[i].getNombre() + ";";
	                }
	                 JOptionPane.showMessageDialog(null, "Datos según cargo: " + cargo, "Cargo Personal", JOptionPane.INFORMATION_MESSAGE);
	            }
	            
	        return cargo;
	        
	        
	        }
	        
	        
	         public double valorIngreso(){
	        
	            int ingreso = 3;
	            switch (ingreso) {
	            
	            case 0: 
	                        oriundo = "2.000";
	                    break;
	                case 1: 
	                        nacional = "9.000";
	                    break;
	                case 2: 
	                        extranjero = "13.500";
	                    break;
	                case 3:  
	                    break;
	                default: JOptionPane.showMessageDialog(null, "Opción no valida", "Error", JOptionPane.ERROR_MESSAGE);
	                    break;
	            
	            }    
	            //return valorCancelado;
	        return 0;
	            
	        
	        }
	    
	}


