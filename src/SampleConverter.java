import java.util.List;
import java.util.Map;

public class SampleConverter {
    private static final List<Number> numbers = List.of(-1,0,1.1,5,5,26,27,28,100,200,18679);

    public static void main(String[] args) {
        Map<Number,String> convertedNames = IndexConverterUtil.convert(numbers);
        print(convertedNames);
    }

    private static void print(Map<Number,String> convertedNames) {
        for (Map.Entry<Number,String> entry : convertedNames.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}