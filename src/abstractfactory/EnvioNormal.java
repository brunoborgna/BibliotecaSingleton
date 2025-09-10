package abstractfactory;

public class EnvioNormal implements MetodoEnvio{

    @Override
    public void enviar() {
        System.out.println("Enviando producto con metodo normal. Duracion estimada: 5-7 dias");
    }
}
