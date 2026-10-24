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
            System.out.println("Exprimidor preparando jugo de naranja fresco.");
        }
    }

    @Override
    public void ajustarIntensidad() {
        if (encendida) {
            System.out.println("Ajustando la intensidad del exprimidor...");
        }
    }
}