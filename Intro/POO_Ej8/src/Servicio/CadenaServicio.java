package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

public class CadenaServicio {

    Scanner sc = new Scanner(System.in);

    Cadena cadena = new Cadena();

    public Cadena crear() {
        System.out.println("Ingrese una frase: ");
        cadena.setFrase(sc.nextLine());
        cadena.setLongitud(cadena.getFrase().length());
        return cadena;
    }

    public int mostrarVocales() {

        int vocales = 0;

        for (int i = 0; i < cadena.getLongitud(); i++) {
            String letra = cadena.getFrase().substring(i, i + 1);

            if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
                vocales++;
            }
        }

        return vocales;
    }

    public String invertirFrase() {

        String fraseInvertida = "";

        for (int i = cadena.getLongitud() - 1; i >= 0; i--) {

            fraseInvertida += cadena.getFrase().charAt(i);
        }

        return fraseInvertida;
    }

    public int vecesRepetido(String letra) {

        int veces = 0;

        for (int i = 0; i < cadena.getLongitud(); i++) {
            String caracter = cadena.getFrase().substring(i, i + 1);

            if (caracter.equals(letra)) {
                veces++;
            }
        }

        return veces;
    }

    public void compararLongitud(String frase) {

        int longitudFrase1 = cadena.getLongitud();
        int longitudFrase2 = frase.length();

        if (longitudFrase1 > longitudFrase2) {
            System.out.println("La frase 1 tiene mas caracteres.");
        } else {
            System.out.println("La frase 2 tiene mas caracteres.");
        }
    }

    public String unirFrases(String frase) {

        String nuevaFrase = cadena.getFrase() + " " + frase;

        return nuevaFrase;
    }

    public String reemplazar(String letra) {

        String fraseModificada = "";

        for (int i = 0; i < cadena.getLongitud(); i++) {

            if (cadena.getFrase().substring(i, i + 1).equals("a")) {
                fraseModificada += letra;
                cadena.getFrase().substring(i + 1, cadena.getLongitud());
            } else {
                fraseModificada += cadena.getFrase().substring(i, i + 1);
            }
        }

        return fraseModificada;
    }

    public boolean contener(String letra) {
        
        boolean contiene = false;

        for (int i = 0; i < cadena.getLongitud(); i++) {
            String caracter = cadena.getFrase().substring(i, i + 1);

            if (caracter.equals(letra)) {
                contiene = true;
            }
        }

        return contiene;
    }
}
