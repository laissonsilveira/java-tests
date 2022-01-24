package mapstruct;

public class Test {

    private String name;
    private String numberString;

    public Test(String name, String numberString) {
        this.name = name;
        this.numberString = numberString;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberString() {
        return numberString;
    }

    public void setNumberString(String numberString) {
        this.numberString = numberString;
    }
}
