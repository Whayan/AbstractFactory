import java.lang.reflect.InvocationTargetException;

public class GerenciadorFabricaContrato {
    public FabricaContrato obterFabrica(String tipoCliente) {
        try {
            Class<?> classeFabrica = Class.forName(tipoCliente);
            return (FabricaContrato) classeFabrica.getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException |
                 IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }
}
