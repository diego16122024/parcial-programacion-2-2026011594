public class ComisionPersonalizada implements EstrategiaComision {
    private final int n; // letras de tu primer nombre

    public ComisionPersonalizada(String primerNombre) {
        this.n = primerNombre.length();
    }

    @Override
    public double calcularComision(double montoVenta) {
        return montoVenta * (5 + n) / 100.0;
    }
}
