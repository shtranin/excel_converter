import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class IndexConverterUtil {

    private static final int NUMBER_OF_LETTERS = 26;

    public static Map<Number, String> convert(List<? extends  Number> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            System.out.println("list is empty");
            return Map.of();
        }

        Map<Number, String> result = new LinkedHashMap<>();
        for (Number number : numbers) {

            if (isNumberValid(number)) {
                String columnName = computeName(number.intValue());
                result.put(number,columnName);
            }
            else {
                result.put(number,"invalid index");
            }
        }
        return result;
    }

    private static String computeName(int index) {
        StringBuilder columnName = new StringBuilder();
        while (index > 0) {
            index--;
            columnName.insert(0, (char) ('A' + index % NUMBER_OF_LETTERS));
            index /= NUMBER_OF_LETTERS;
        }
        return columnName.toString();
    }

    private static boolean isNumberValid(Number number) {
        return number instanceof Integer && number.intValue() > 0;
    }
}