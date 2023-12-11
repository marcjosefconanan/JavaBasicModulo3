public class MakeString {
    private String string;
    private int position;
    public MakeString(String string, int position) {
        this.string = string;
        this.position = position;
    }
    public String compareStrings(String otherString) {
        StringBuilder result = new StringBuilder("Le due stringhe sono ");

        int comparisonResult = this.string.compareTo(otherString);

        if (comparisonResult == 0) {
            result.append("uguali");
        } else {
            result.append("differenti");
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