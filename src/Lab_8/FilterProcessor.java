package Lab_8;
import java.util.List;
import java.util.stream.Collectors;

public class FilterProcessor {
    @DataProcessor
    public  List<String> longStrings(List<String> strings){
        List<String> result;
        result = strings.parallelStream().filter(str -> str.length()>5).collect(Collectors.toList());
    return result;
    }
}
