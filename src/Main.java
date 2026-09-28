public class Main {
    public static void main(String[] args) {
        Vendedor v = new Vendedor("Diego Emanuel Escobar Hernandez", 1000);
        v.camviar estrategia(new comisionpersonalizada("Diego"));
    }
