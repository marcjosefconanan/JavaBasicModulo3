public class MakeString {
    private String string;

    private int position;

    public MakeString(String string, int position) {
        this.string = string;
        this.position = position;
    }

    public String unicodeChar() {
        StringBuilder result = new StringBuilder();

        if (position < 0 || position >= string.length()) {
            result.append("Errore: posizione non valida");
        } else {
            char character = string.charAt(position);
            result.append("Carattere in Unicode: ").append(Integer.toHexString(character));
        }

        return result.toString();
    }
    public String getString() {
        return string;
    }
    public void setString(String string) {
        this.string = string;
    }
    public int getPosition() {
        return position;
    }
    public void setPosition(int position) {
        this.position = position;
    }
}
