package Factory;

public class LogisticaLibro {

    public Libro1 crearLibro(String tipo, String titulo, String autor){
        if (tipo.equalsIgnoreCase("Fisico")||(tipo.equalsIgnoreCase("Físico"))) {
            return new LibroFisico(titulo, autor);
        }else if (tipo.equalsIgnoreCase("Digital")){
            return new LibroDigital(titulo, autor);
        }else{
            System.out.println("ERROR01 TIPO: '"+ tipo+"' NO VÁLIDO");
            return null;
        }
    }
}
