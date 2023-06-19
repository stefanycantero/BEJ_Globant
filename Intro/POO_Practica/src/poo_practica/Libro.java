package poo_practica;

import java.util.Scanner;

public class Libro {

    // atributos
    public String ISBN;
    public String titulo;
    public String autor;
    public int nroPaginas;

    // constructores
    public Libro() {
    }

    public Libro(String ISBN, String titulo, String autor, int nroPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.nroPaginas = nroPaginas;
    }

    // getters/setters
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNroPaginas() {
        return nroPaginas;
    }

    public void setNroPaginas(int nroPaginas) {
        this.nroPaginas = nroPaginas;
    }

    // métodos propios
    public void cargarLibro() {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ISBN:");
        ISBN = sc.next();
        System.out.println("Titulo:");
        titulo = sc.next();
        System.out.println("Autor:");
        autor = sc.next();
        System.out.println("Numero de paginas:");
        nroPaginas = sc.nextInt();
    }
    
    public void imprimirLibro(){
        System.out.println("ISBN: "+ISBN);
        System.out.println("Titulo: "+titulo);    
        System.out.println("Autor: "+autor);
        System.out.println("Numero de paginas: "+nroPaginas);        
    }

}
