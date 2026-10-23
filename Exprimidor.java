public class Exprimidor implements EquipoCocina {
private boolean encendida = false;
    private int intensidad = 2;

    @Override
    public void encender() {
        encendida = true;
        System.out.println("Exprimidor encendido.");
    }

    @Override
    public void apagar() {
        encendida = false;
        System.out.println("Exprimidor apagado.");
    }

    @Override
    public void preparar() {
        if (encendida) {
            System.out.println("Calibrar fuerza del Exprimidor " + intensidad + ".");
        }
    }

    @Override
    public void ajustarIntensidad() {
        if (encendida && intensidad < 5) {
            intensidad++;
            System.out.println("Intensidad del Exprimidor: " + intensidad);
        }
    }
}
