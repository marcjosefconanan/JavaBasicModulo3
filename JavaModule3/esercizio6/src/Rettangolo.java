public class Rettangolo implements Forma {

    private TipoForma tipoForma;

    public Rettangolo(TipoForma tipoForma){
        this.tipoForma = tipoForma;
    }
    public TipoForma getTipoForma(){
        return tipoForma;
    }
    @Override
    public void calcoloArea(){
        double area = TipoForma.RETTANGOLO.getBase() * TipoForma.RETTANGOLO.getAltezza();
        System.out.println("l'area del rettangolo è :" + area);
    }

}