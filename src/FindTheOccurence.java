import java.util.HashMap;

public class FindTheOccurence {

       public void findCount(String str) {

           HashMap<Character,Integer> map = new HashMap<>();

           for(int i =0;i<str.length();i++) {
               char temp = str.charAt(i);
               if(map.containsKey(temp)){
                   int c = map.get(temp);
                   map.put(temp,c+1);
               }
               else {
                   map.put(temp,1);
               }

           }

           for(char it:map.keySet()){
               System.out.println(it+" "+map.get(it));
           }
       }


    public static void main(String[] args) {
        FindTheOccurence obj = new FindTheOccurence();
        String str = "google";
        obj.findCount(str);
    }
}
