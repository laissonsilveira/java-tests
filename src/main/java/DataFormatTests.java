import java.text.DecimalFormat;

public class DataFormatTests {

    private static final String pattern = "#,###,##0.00";
    private static DecimalFormat df = new DecimalFormat(pattern);

    public static void main(String[] args) {

        String originalValue = "31.9506949314182233484805837029";
        double number = Double.parseDouble(originalValue);
        System.out.println("pattern -> " + pattern);
        System.out.println("originalValue -> " + originalValue);
        System.out.println("Double.parseDouble() -> " + number);
        System.out.println("DecimalFormat.format() -> " + df.format(number));
    }

}
