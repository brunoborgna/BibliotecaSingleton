package abstractfactory;

public class UsuarioFactory implements AbstractFactory{
    @Override
    public InterfazUI crearInterfazUI() {
        return new UsuarioUI();//crea interfaz usuario
    }

    @Override
    public MetodoEnvio crearMetodoEnvio() {
        return new EnvioNormal();//crea envio normal
    }
}
