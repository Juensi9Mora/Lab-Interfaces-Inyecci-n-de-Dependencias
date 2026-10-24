public class Exprimidor implements EquipoCocina {
    @Override
    public void encender() {
        System.out.println("Exprimidor encendido.");
    }

    @Override
    public void ajustarIntensidad() {
        System.out.println("Ajustando la intensidad del exprimidor...");
    }

    @Override
    public void preparar() {
        System.out.println("Exprimidor preparando jugo de naranja fresco.");
    }

    @Override
    public void apagar() {
        System.out.println("Exprimidor apagado.");
    }
}
