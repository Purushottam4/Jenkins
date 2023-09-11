


import java.util.HashMap;
import java.util.Map;

class Test{

public static void main(String ...abb){


Character[] s = { 'a', 'b', 'a', 'h', 'h', 'u', 'u' };


Map<Character, Integer> map = new HashMap<Character, Integer>();
for(Character ss : s){

if(!map.containsKey(ss)){

map.put(ss , 1);

}
else{
map.put(ss, map.get(ss) + 1 );

}
}
System.out.println(map);
}


}


