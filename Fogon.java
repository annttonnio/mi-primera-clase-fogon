public class Fogon {
    //quien cocina
    private String Cocinero;
    //grados del fogon
    private int grados;
    //fogon encendido o no
    private boolean encendido;
    
    public Fogon (String cocineroActual, boolean encenderTrueFalse){
        Cocinero = cocineroActual;
        grados = 0;
        encendido = encenderTrueFalse; 
    }
       
    public void encenderFogon(){
        encendido = true;
    }
    
    public void apagarFogon(){
        encendido = false;
        grados = 0;
    }
    
    public boolean encendido () {
        return encendido;
    }
    
    public void setGrados(int gradosDelFogon){
        grados = gradosDelFogon;
    }
    
    public void setCocinero(String cocineroDelFogon){
        Cocinero = cocineroDelFogon;
    }

    public void imprimeDatos () {
        System.out.println (" Cocinero " + (Cocinero) +". "+ " Temperatura del fogón " + (grados)
        + " grados. " + "Fogon encendido: " + (encendido)   );
    }
     
    public String returnDatos () {
        String estadoFogon;
            estadoFogon = ("Cocinero " + (Cocinero) + ". " + " Temperatura del fogón " + (grados)
        + " grados. " + " Fogon encendido: " + (encendido)  ); 
        return estadoFogon; 
        
    }
    
























}