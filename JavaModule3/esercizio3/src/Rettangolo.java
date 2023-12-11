public class Rettangolo extends Forma{
    private double base;
    private double altezza;
    public Rettangolo(double base, double altezza){
        this.altezza = altezza;
        this.base = base;
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
    @Override
    public void calcoloArea(){
        double area = base * altezza;
        System.out.println("area del rettangolo: " + area);
    }
}
