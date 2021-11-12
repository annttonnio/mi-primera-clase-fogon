public class Fogon {
    //quien cocina
    private String cocinero;
    //grados del fogon
    private int grados;
    //fogon encendido o no
    private boolean encendido;
    
    public Fogon(String cocineroActual, boolean encenderTrueFalse){
        cocinero = cocineroActual;
        grados = 0;
        encendido = encenderTrueFalse; 
    }
       
    public void encenderFogon(){
        if (encendido == false){
            encendido = true;
        }
        else {
            encendido = false;
            grados = 0;
        }
        
    }
    
        public boolean encendido() {
        return encendido;
    }
    
    public void ajustarGrados(int gradosDelFogon){ 
            grados = grados + gradosDelFogon;  
    }
    
    public void setCocinero(String cocineroDelFogon){
        cocinero = cocineroDelFogon;
    }

    public void imprimeDatos() {
        System.out.println (" Cocinero " + (cocinero) +". "+ " Temperatura del fogón " + (grados)
        + " grados. " + "Fogon encendido: " + (encendido)   );
    }
     
    public String returnDatos() {
        String estadoFogon;
            estadoFogon = ("Cocinero " + (cocinero) + ". " + " Temperatura del fogón " + (grados)+ " grados. " + " Fogon encendido: " + (encendido)  ); 
            return estadoFogon; 
        
    }
    
























}