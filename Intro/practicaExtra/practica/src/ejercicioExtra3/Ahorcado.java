package ejercicioExtra3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ahorcado {
    private List<String> palabraLista = new ArrayList<>();
    private List<String> auxiliar = new ArrayList<>();
    private int intentos;
    private String palabra;

    private int longitud;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Ahorcado() {
    }

    public Ahorcado(List<String> palabraLista, List<String> auxiliar, int intentos, String palabra) {
        this.palabraLista = palabraLista;
        this.auxiliar = auxiliar;
        this.intentos = intentos;
        this.palabra = palabra;

    }

    public void crearJuego(){

        System.out.println("Ingrese la palabra a adivinar:");
        this.palabra = leer.nextLine().toLowerCase();

        System.out.println("Ingrese la cantidad de jugadas posibles:");
        this.intentos = leer.nextInt();



        this.longitud = palabra.length();

        for (int i = 0; i < longitud; i++) {
            palabraLista.add(palabra.substring(i,i+1));
        }

        for (int i = 0; i < longitud; i++) {
            auxiliar.add("_");
        }
    }

    public void longitudPalabra(){
        System.out.println(this.longitud);
    }

    public void ingresarLetra(){
        String letra;
        System.out.println("Ingrese una letra");
        letra = leer.next().toLowerCase();
        boolean noEsta = true;

        for (int i = 0; i < longitud; i++) {
            if(palabraLista.get(i).equals(letra)){
                //**System.out.println("Se encontro la letra en el indice:" + (i+1));
                auxiliar.set(i,letra);

                noEsta = false;
            }
        }

        if(noEsta){
            intentos = intentos -1;
            System.out.println("No se encontro la letra, te quedan "+intentos);
        }
    }


    public void juego(){
        System.out.println("Bienvenido al juego del Ahorcado!!");
        crearJuego();
        while (intentos!=0 && !palabraLista.equals(auxiliar)){
            ingresarLetra();
            for (int i = 0; i < longitud; i++) {
                System.out.print(auxiliar.get(i));
            }
            System.out.println("");
        }

        if(intentos == 0){
            System.out.println("Perdiste! La palabra era "+palabra);
        }else {
            System.out.println("");
            System.out.println("-----------------------------------------------------");
            System.out.println("Ganaste!");
        }

    }





    public List<String> getPalabraLista() {
        return palabraLista;
    }

    public void setPalabraLista(List<String> palabraLista) {
        this.palabraLista = palabraLista;
    }

    public List<String> getAuxiliar() {
        return auxiliar;
    }

    public void setAuxiliar(List<String> auxiliar) {
        this.auxiliar = auxiliar;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }



    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
}
