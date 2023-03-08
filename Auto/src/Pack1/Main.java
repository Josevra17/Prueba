
package Pack1;

import Auto.Auto;

public class Main {
    public static void main (String[] args){
        Auto auto1 = new Auto();
        
        auto1.setMarca("AUDI");
        auto1.setModelo("AUDI RS26");
        auto1.setCaro(2020);
        auto1.setKlm(13.6);
        
        System.out.println("Marca: "+auto1.getMarca());
        System.out.println("Modelo: "+auto1.getModelo());
        System.out.println("Año: "+auto1.getCaro());
        System.out.println("KM recorrido: "+auto1.getKlm());
        
        
    }
    
}
