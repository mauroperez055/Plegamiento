package plegamiento;

public class Tabla {
    
    Auto[] A;

    public Tabla() {
        this.A = new Auto[1117];
    }
    
    public int plegamiento (int clave){
       
       int m1 = clave / 1000;
       int m2 = clave % 1000;
       
       if( (m1 + m2) >= 1000 ){
           int m = (m1+m2) - 1000;
           return m;
       }
       else{
           return (m1+m2);
       }
        
    }
    
    public void insertar (Auto a){
        
        A[plegamiento(a.patente)] = a;
        
    }
    
}
