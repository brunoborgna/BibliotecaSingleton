package abstractfactory;

public class EnvioExpress implements MetodoEnvio{

    @Override
    public void enviar() {
        System.out.printf("Enviando producto con metodo express. Duracion estimada: 1-3 dias");
    }
}
