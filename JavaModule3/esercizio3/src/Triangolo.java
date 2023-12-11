public class Triangolo extends Forma{
    private double base;
    private double altezza;
    private double area;
    public Triangolo(double base, double altezza, double area){

        this.base = base;
        this.altezza = altezza;
        this.area = area;
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
    public void calcoloArea(){
        double area = base * altezza / 2;
        System.out.println("area del triangolo : " + area);
    }
}

