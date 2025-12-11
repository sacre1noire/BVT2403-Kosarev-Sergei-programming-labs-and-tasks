package Lab_8;

import java.util.List;
import java.util.stream.Collectors;

public class UpperProcessor {
    @DataProcessor
    public List<String> upppString(List<String> strings){
        List<String> result;
        result=strings.parallelStream().map(s -> {
            return s.toUpperCase();
        }).collect(Collectors.toList());
    return result;
    }
}
