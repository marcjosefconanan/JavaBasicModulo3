//2.Classe Automobile:
//	Estendere la classe Automobile che estende la classe Veicolo.
//	La classe Automobile dovrebbe avere un campo per la velocità attuale e implementare i metodi ereditati da Veicolo.
public class Automobile extends Veicolo{
    public Automobile(double velocita ){
        super(velocita);
    }
    @Override
    public void fermarsi(int num) {
        super.fermarsi(num);
    }
    @Override
    public void accelerare(int num) {
        super.accelerare(num);
    }
    @Override
    public void decelerare(int num) {
        super.decelerare(num);
    }
}