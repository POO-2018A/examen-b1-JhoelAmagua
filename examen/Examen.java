package examen;
import java.util.*;

public class Examen {

    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        Libro [] libros = new Libro [11];
        Libro libro;
        Autor [] autores = new Autor [11];
        Autor autor;
        int opcion =0;
        int cont=0;
        String titulo;
        String nombreautor;
        String pais;
        int anio;
        int fav;
        int contfav=0;
        boolean favorito=true;
        int contlibros=0;
        Autor [] contautores = new Autor [11];
        
        while(opcion!=4){
            System.out.println("       BIBLIOTECA PERSONAL");
            System.out.println("1.- Ingresar un nuevo libro");
            System.out.println("2.- Imprimir lista de favoritos");
            System.out.println("3.- Libros de cada autor");
            System.out.println("4.- Salir");
            System.out.println("Ingrese una opcion: ");
            opcion = lector.nextInt();
                    if(opcion==1){
                        cont++;
                        
                    }
            switch(opcion){
                    case 1: 
                    if(cont>=11){
                            System.out.println("Biblioteca llena, no se puede ingresar mas libros");
                            break;
                    }
                    lector.nextLine();
                    System.out.println("Ingrese el titulo del libro: ");
                    titulo=lector.nextLine();
                    System.out.println("Ingrese el nombre del autor: ");
                    nombreautor = lector.nextLine();
                    System.out.println("Ingrese el pais del autor: ");
                    pais = lector.nextLine();
                    System.out.println("Ingrese el año del libro: ");
                    anio=lector.nextInt();
                    System.out.println("Si quieres agregar a lista de favoritos digite 1, caso contrario digite 0: ");
                    fav = lector.nextInt();
                    if(fav == 1){
                        favorito=true;
                    }else{
                        favorito=false;
                    }
                    if(favorito==true){
                        contfav++;
                    }
                    autor = new Autor (nombreautor,pais);
                    libro = new Libro (titulo, autor, anio, favorito);
                    libros[contlibros]=libro;
                    autores[contlibros]=autor;
                    contlibros++;
                    contautores [contlibros]=autor;
                    break;
                    
                case 2:
                    if(contlibros==0){
                        System.out.println("Aun no a ingresado libros");
                    }else{
                    System.out.println("    LIBROS FAVORITOS:");
                    for(int i=0; i<contlibros; i++ ){
                        if(libros[i].isFavorito()==true){
                         System.out.println("LIBRO "+(i+1)+libros[i]);
                            }
                        }
                    }
                   
                    break;
                    
                case 3:
                    int numautor=0;
                    int c=0;
                    System.out.println("AUTORES: ");
                    for(int i=0; i<contlibros; i++){
                        System.out.println("Autor "+(i+1)+":"+autores[i]);
                    }
                    System.out.println("Seleccione el numero de autor del que decea saber el numero de libros");
                    for(int j=0; j<contlibros; j++){
                        System.out.println("Autor: "+(j+1));
                    }
                    numautor=lector.nextInt();
                    
                        for(int j=0; j<contlibros; j++){
                            if(contautores[numautor].equals(autores[j])){
                                c++;
                            }                              
                        }
                    
                    System.out.println("El autor "+(numautor)+" tiene: "+(c)+" libros registrados");
                    break;
                    
                case 4:
                    System.out.println("Gracias");
                    break;
                    
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
    }
    
}
