import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.println(reverse("test this"));

//        int[] arr = {2,4,5,7,9,12,25,26,30,32,36,40,45,50,52,60,100};
//        System.out.println(binarySearch(arr, 26));

        FInterface fInterface = ( a,  b) -> a*b;
        System.out.println(fInterface.multiply(12,10));
    }

    public static String reverse(String inStr) {
        StringBuilder outStr = new StringBuilder(inStr);
//        for(int i=inStr.length()-1; i>=0; i--) {
//            outStr.append(inStr.charAt(i));
//        }
        return outStr.reverse().toString();
    }

    public static boolean stringContainsVowels(String input) {
        return input.toLowerCase().matches(".*[aeiou].*");
    }

    public static int binarySearch(int[] arr, int value) {
        int low = 0;
        int high = arr.length - 1;
        int key = -1;
        while(low <= high) {
            int mid = (low+high)/2;
            System.out.println("mid="+mid);
            if(arr[mid] == value) {
                key = mid;
                break;
            }
            if(arr[mid] > value) {
                high = mid -1;
            }
            else {
                low = mid + 1;
            }
        }
        return key;
    }

    public static boolean sameElements(Object[] array1, Object[] array2) {
        Set<Object> uniqueElements1 = new HashSet<>(Arrays.asList(array1));
        Set<Object> uniqueElements2 = new HashSet<>(Arrays.asList(array2));

        // if size is different, means there will be a mismatch
        if (uniqueElements1.size() != uniqueElements2.size()) return false;

        for (Object obj : uniqueElements1) {
            // element not present in both?
            if (!uniqueElements2.contains(obj)) return false;
        }
        return true;
    }

    public static void collections() {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("we");
        Set<String> set1 = new HashSet<>(list1);
        boolean anymatch = set1.stream().anyMatch(e -> e.equals("we"));
        List<String> linkedList = new LinkedList<>();
        List<String> vector = new Vector<>();
        Vector<String> stack = new Stack<>();

        Queue<String> queue = new LinkedList<>();
        Queue<String> queue2 = new PriorityQueue<>();
        Deque<String> deque1 = new ArrayDeque<>();
        Deque<String> deque2 = new LinkedList<>();

        Set<String> set = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        SortedSet<String> sortedSet = new TreeSet<>();

        Map<String, String> hashMap = new HashMap<>();
        Map<String, String> hashtable = new Hashtable<>();
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        SortedMap<String, String> sortedMap = new TreeMap<>();
    }

}