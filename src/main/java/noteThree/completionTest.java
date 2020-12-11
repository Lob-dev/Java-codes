package noteThree;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class completionTest {
    public static void main(String[] args) {

        System.out.println(completion(new String[]{"leo", "kiki", "eden"},new String[]{"leo", "kiki"}));

    }

    public static String completion(String[] participant, String[] completion){

        List<String> list = Arrays.stream(participant).collect(Collectors.toList());
        List<String> lists = Arrays.stream(participant).collect(Collectors.toList());

        List<String> list2 = Arrays.stream(completion).collect(Collectors.toList());

        lists.retainAll(list2); // 교집합 : 공통으로 포함된 요소만 lists 에 남겨둠.
        list.removeAll(lists);  // lists 가 가진 모든 요소를 list 에 넣어서 삭제.
        System.out.println("list = " + list);

        return "";
    }
}
