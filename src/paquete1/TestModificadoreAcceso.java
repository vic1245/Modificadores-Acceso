package paquete1;

import paquete1.Clase1;
import paquete1.ClaseHija;

public class TestModificadoreAcceso {
    public static void main(String[] args) {
       Clase1 clase1 = new Clase1("Publico");
        System.out.println("clase1 = " + clase1.getAtributoPrivado());
    }
}
