
package plegamiento;


public class Plegamiento {

    public static void main(String[] args) {
        
        Auto a1, a2, a3;
        Tabla tHash = new Tabla();
        
        tHash.insertar(a1 = new Auto(170321, "FIAT Palio"));
        tHash.insertar(a2 = new Auto(312180, "FORD Fiesta"));
        tHash.insertar(a3 = new Auto(230295, "TOYOTA Hilux"));
        
        
        System.out.println("");
        System.out.println("El " + a1.marca + " ocupa el indice n° " + tHash.plegamiento(a1.patente));
        System.out.println("----------------------------------------------------------");
        System.out.println("El " + a2.marca + " ocupa el indice n° " + tHash.plegamiento(a2.patente));
        System.out.println("----------------------------------------------------------");
        System.out.println("El " + a3.marca + " ocupa el indice n° " + tHash.plegamiento(a3.patente));
        System.out.println("----------------------------------------------------------");

    }
    
}
