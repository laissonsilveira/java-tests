package mapstruct;

public class TestDto {

    private String name;
    private Double number;

    public TestDto(String name, Double numberString) {
        this.name = name;
        this.number = numberString;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }
}