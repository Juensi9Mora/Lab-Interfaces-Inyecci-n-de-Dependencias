public class TestAnalisis {
    
    static class PreparadorAcoplado {
        private Cafetera cafetera = new Cafetera();
        private Licuadora licuadora = new Licuadora();

        public void prepararBebida() {
            cafetera.encender();
            licuadora.encender();
            cafetera.ajustarIntensidad();
            licuadora.ajustarIntensidad();
            cafetera.preparar();
            licuadora.preparar();
        }
    }

    public static void main(String[] args) {
        PreparadorAcoplado preparador = new PreparadorAcoplado();
        preparador.prepararBebida();

        System.out.println("\n===== PROBLEMAS DETECTADOS =====");
        System.out.println("1. El preparador crea sus propios equipos con 'new' (acoplamiento fuerte).");
        System.out.println("2. No se puede usar otra máquina (como Té o Exprimidor) sin modificar la clase.");
        System.out.println("3. Es difícil de probar y extender.");
    }
}