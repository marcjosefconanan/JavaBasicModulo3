//1.Classe Veicolo:
//	Definire una classe chiamata Veicolo che contenga i seguenti metodi:
//L’unico field obbligatorio è velocita che verrà usato nei metodi.
//	accelerare(int valore): aumenta la velocità del veicolo.
//	decelerare(int valore): diminuisce la velocità del veicolo.
//	fermarsi(): arresta il veicolo.
public class Veicolo {
    private double velocita;
    public Veicolo (double velocita){
        this.velocita = velocita;
    }
    public double getVelocita() {
        return velocita;
    }
    public void setVelocita(double velocita) {
        this.velocita = velocita;
    }
    public void accelerare(int num) {
        velocita += num;
    }
    public void decelerare(int num){
        velocita -= num;
    }
    public void fermarsi (int num){
        velocita = 0;
    }
}