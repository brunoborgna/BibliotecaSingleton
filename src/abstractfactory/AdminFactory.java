package abstractfactory;

public class AdminFactory implements AbstractFactory{

    @Override
    public InterfazUI crearInterfazUI() {
        return new AdminUI();//crea la interfaz admin
    }

    @Override
    public MetodoEnvio crearMetodoEnvio() {
        return new EnvioExpress();//crea un envio express
    }
}
