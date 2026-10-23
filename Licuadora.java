public class Licuadora implements EquipoCocina {
private boolean encendida = false;
    private int intensidad = 5;

    @Override
    public void encender() {
        encendida = true;
        System.out.println("Licuadora encendida.");
    }

    @Override
    public void apagar() {
        encendida = false;
        System.out.println("Licuadora apagada.");
    }

    @Override
    public void preparar() {
        if (encendida) {
            System.out.println("Manejo de niveles de licuado " + intensidad + ".");
        }
    }

    @Override
    public void ajustarIntensidad() {
        if (encendida && intensidad < 10) {
            intensidad++;
            System.out.println("Intensidad de la Licuadora: " + intensidad);
        }
    }
}