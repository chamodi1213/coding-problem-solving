import java.util.*;
import java.util.stream.Collectors;

public class DuplicateNumbers {

    public static void main(String[] args) {
        List<Integer> listNum =  Arrays.asList(12,56,12, 34, 23, 56);
        List<String> strList = Arrays.asList("bean", "zac", "alpha", "beta", "gamma");
        duplicateNumbers(listNum);

//        Double avg = listNum.stream().mapToInt(i -> i).average().getAsDouble();
//        System.out.println(avg);
//        System.out.println(listNum.stream().mapToInt(i -> i).average());
//        System.out.println(listNum.stream().mapToInt(i -> i).summaryStatistics().getAverage());
//        System.out.println(listNum.stream().sorted((a,b) -> b-a).collect(Collectors.toList()));
//        System.out.println(strList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.joining(",")));
    }

    public static void duplicateNumbers(List<Integer> numList){
//        Set<Integer> uniqueList = new HashSet<>();
//        numList.stream().filter(i -> !uniqueList.add(i)).collect(Collectors.toSet())
//                .forEach(System.out::println);

        List<Integer> uList = new ArrayList<>();
        List<Integer> dList = numList.stream().filter(i -> {
            if(uList.contains(i)) return true;
            uList.add(i);
            return false;
        }).collect(Collectors.toList());

        System.out.println(dList);
    }
}
