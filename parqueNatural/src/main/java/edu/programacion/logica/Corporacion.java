package edu.programacion.logica;

	
	import javax.swing.JOptionPane;
	import java.io.*;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.StringTokenizer;
	
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
	     
//	    public void ingresarParque(){
//	        nombre = JOptionPane.showInputDialog(null, "Ingrese nombre: ", "Registro Parques", JOptionPane.INFORMATION_MESSAGE);
//	        fecha = JOptionPane.showInputDialog(null, "Ingrese fecha: ", "Registro Parques", JOptionPane.INFORMATION_MESSAGE);
//	        ubicacion = JOptionPane.showInputDialog(null, "Ingrese ubicacion: ", "Registro Parques", JOptionPane.INFORMATION_MESSAGE);
//	        resolucion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese resolución con el que fue registrado /n"
//	                + "como parque natural: ", "Registro Parques", JOptionPane.INFORMATION_MESSAGE));
//	        extension = Double.parseDouble (JOptionPane.showInputDialog(null, "Ingrese extensión del parque: ", "Registro Parques", JOptionPane.INFORMATION_MESSAGE));
//	        altura = Double.parseDouble (JOptionPane.showInputDialog(null, "Ingrese altura del parque: ", "Registro Parques", JOptionPane.INFORMATION_MESSAGE));
//	        temperatura = Double.parseDouble (JOptionPane.showInputDialog(null, "Ingrese temperatura de la zona: ", "Registro Parques", JOptionPane.INFORMATION_MESSAGE));
//	        estado = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "Ingrese estado del parque: ", "Registro Parques", JOptionPane.INFORMATION_MESSAGE));
	//} 
//	    public Corporacion(String nombre, String fecha, String ubicacion, int resolucion, double extension, double altura, double temperatura, boolean estado){
//	       
//	        this.nombre = nombre;
//	        this.fecha = fecha;
//	        this.ubicacion = ubicacion;
//	        this.resolucion = resolucion;
//	        this.extension = extension;
//	        this.altura = altura;
//	        this.temperatura = temperatura;
//	        this.estado = estado;
//	    }
//	    public void grabarParque(){
//	        FileWriter fw = null;
//	        PrintWriter pw = null;
//	        try{
//	            fw = new FileWriter ("parque.txt", true);
//	            pw = new PrintWriter(fw);
//	            pw.println(nombre + ";" + fecha + ";" + ubicacion + ";" + resolucion + ";" + extension + ";" + altura + ";" + temperatura + ";" + estado);
//	        }
//	        catch (Exception err){
//	        
//	            JOptionPane.showMessageDialog(null, "Error " + err.toString(), "Error en Archivo",
//	                    JOptionPane.ERROR_MESSAGE);
//	        }
//	        finally{
//	            try{
//	                if(fw != null)
//	                    fw.close();
//	            }
//	            catch (Exception er1){
//	                JOptionPane.showMessageDialog(null, "Error al cerrar archivo" + er1.toString(), "Error en Archivo",
//	                    JOptionPane.ERROR_MESSAGE);
//	            }
//	        }
//	    }
//	    public void leerParque(){
//	        File fi = null;
//	        FileReader fr = null;
//	        BufferedReader br = null;
//	        String datos;
//	        try{
//	            fi = new File("parque.txt");
//	            fr = new FileReader(fi); 
//	            br = new BufferedReader (fr); 
//	       
//	            while((datos = br.readLine()) != null){
//	             
//	             divideRegistro(datos, ";"); 
//	            }
//	        }catch(Exception err2){
//	                   
//	                     JOptionPane.showMessageDialog(null, "Error de lectura " + err2.toString(), "Error",
//	                    JOptionPane.ERROR_MESSAGE);
//	                    
//	                    }
//	            finally {
//	                    try{
//	                    
//	                        if (fr !=null){
//	                            fr.close();
//	                        
//	                        }
//	                    
//	                    }
//	                    catch(Exception err3){
//	                    
//	                         JOptionPane.showMessageDialog(null, "Error de lectura " + err3.toString(), "Error",
//	                    JOptionPane.ERROR_MESSAGE);
//	                    
//	                    }
//	                    
//	                    }
//	        }
//	     public void divideRegistro(String linea, String carac) {
	//    
//	        StringTokenizer st = new StringTokenizer(linea, carac);
//	        while (st.hasMoreTokens()){
//	            nombre = st.nextToken();
//	            fecha = st.nextToken();
//	            ubicacion = st.nextToken();
//	            resolucion = Integer.parseInt(st.nextToken());
//	            extension = Double.parseDouble(st.nextToken());
//	            altura = Double.parseDouble(st.nextToken());
//	            temperatura = Double.parseDouble(st.nextToken());
//	            estado = Boolean.parseBoolean(st.nextToken());
//	            JOptionPane.showMessageDialog(null, "Nombre  Parque: " + nombre+ "\n Fecha: "+ fecha +"\n ubicacion: " + ubicacion + "\n Resolución parque natural: " + resolucion 
//	                    + "\n extensión del parque: " + extension + "\n extensión del parque: " + extension + "\n Altura del parque: " + altura
//	                    + "\n Temperatura del parque: " + temperatura, "¿El parque se encuentra abierto o cerrado?" + estado, JOptionPane.INFORMATION_MESSAGE);
//	            
//	            
//	        }
//	        }

	   
	}

}
