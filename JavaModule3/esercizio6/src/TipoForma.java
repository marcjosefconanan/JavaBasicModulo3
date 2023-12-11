public enum TipoForma {
    TRIANGOLO(1,2),
    RETTANGOLO(1,2);
    private final double base;
    private final double altezza;

    TipoForma(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    public double getAltezza() {
        return altezza;
    }
    public double getBase() {
        return base;
    }
}
