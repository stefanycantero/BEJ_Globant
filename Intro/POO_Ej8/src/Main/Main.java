package Main;
import Servicio.CadenaServicio;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        CadenaServicio f1 = new CadenaServicio();
        String frase;
        boolean verificarContiene;
        
        f1.crear();
        System.out.println("Frase invertida:");
        System.out.println(f1.invertirFrase());
        
        System.out.println("Ingrese una letra a buscar:");
        System.out.println("La letra se repite: "+f1.vecesRepetido(sc.nextLine())+" veces.");
        
        System.out.println("Ingrese una frase para comparar:");
        frase = sc.nextLine();
        f1.compararLongitud(frase);
        
        System.out.println("Las frases unidas: "+f1.unirFrases(frase));
        
        System.out.println("Ingrese una letra para reemplazar:");
        System.out.println(f1.reemplazar(sc.nextLine()));
        
        System.out.println("Ingrese una letra para verificar:");
        verificarContiene = f1.contener(sc.nextLine());
        System.out.println(verificarContiene);
        
    }
}
