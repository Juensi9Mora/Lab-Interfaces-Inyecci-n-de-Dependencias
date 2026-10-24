public class TestPreparadorBebidas {
    public static void main(String[] args) {
        System.out.println("--- CONFIGURACIÓN 1: Cafetera + Licuadora ---");
        PreparadorBebidas preparador1 = new PreparadorBebidas(new Cafetera(), new Licuadora());
        preparador1.prepararBebida();
        preparador1.apagarEquipos();

        System.out.println("\n--- CONFIGURACIÓN 2: MaquinaTe + Exprimidor ---");
        PreparadorBebidas preparador2 = new PreparadorBebidas(new MaquinaTe(), new Exprimidor());
        preparador2.prepararBebida();
        preparador2.apagarEquipos();
    }
}