public class Triangolo implements Forma {
    private TipoForma tipoDiForma;

    public Triangolo(TipoForma tipoForma){
        this.tipoDiForma = tipoForma;
    }
    public TipoForma getTipoDiForma(){
        return tipoDiForma;
    }
    @Override
    public void calcoloArea() {
        double area = TipoForma.TRIANGOLO.getBase() * TipoForma.TRIANGOLO.getAltezza() / 2;
        System.out.println("l'area del triangolo : " + area);
    }
}