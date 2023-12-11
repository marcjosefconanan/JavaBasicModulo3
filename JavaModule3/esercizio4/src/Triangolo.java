public class Triangolo extends Forma {

    private double base;
    private double altezza;
    private double area;

    public Triangolo(double base, double altezza, double lato) {
        this.base = base;
        this.altezza = altezza;
        this.area = lato;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    double calcolaArea() { // cambiato void a double.
        return (base * altezza) / 2; // Formula corretta per il triangolo
        // cambiato x,y,z
    }
}