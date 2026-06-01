package bootcamp_27.Day3;
 import java.util.*;
public class groupanagrams {
    


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] strs = new String[n];

        for(int i = 0; i < n; i++) {
            strs[i] = sc.nextLine();
        }

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for(String s : strs) {

            char[] arr = s.toCharArray();
            Arrays.sort(arr);

            String key = new String(arr);

            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(s);
        }

        for(ArrayList<String> group : map.values()) {
            System.out.println(group);
        }
    }
}
