package noteio;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListConverter {
    public void givenUsingJava10_whenSetConvertedToList_thenCorrect() {
        int size = 20;
        Set<Integer> sourceSet = IntStream.range(0, size).boxed().collect(Collectors.toSet());
        System.out.println("sourceSet = " + sourceSet);
        List<Integer> targetList = List.copyOf(sourceSet);
        System.out.println("targetList = " + targetList);
    }
}
