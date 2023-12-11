//3.Classe Moto:
//	Estendere la classe Moto che estende la classe Veicolo.
//	La classe Moto dovrebbe avere un campo per la velocità attuale e implementare i metodi ereditati da Veicolo.
public class Moto extends Veicolo{
    public Moto (double velocita){
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