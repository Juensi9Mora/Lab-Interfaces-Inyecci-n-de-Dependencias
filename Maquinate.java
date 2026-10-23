public class MaquinaTe implements EquipoCocina {
    private boolean encendida = false;
    private int intensidad = 1;

    @Override
    public void encender() {
        encendida = true;
        System.out.println("Máquina de té encendida, calentando agua.");
    }

    @Override
    public void apagar() {
        encendida = false;
        System.out.println("Máquina de té apagada.");
    }

    @Override
    public void preparar() {
        if (encendida) {
            System.out.println("Preparando té con intensidad " + intensidad + ".");
        }
    }

    @Override
    public void ajustarIntensidad() {
        if (encendida && intensidad < 5) {
            intensidad++;
            System.out.println("Intensidad del té: " + intensidad);
        }
    }
}
