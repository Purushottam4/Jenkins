import java.util.*;

public class B{

public static void main(String ...ddd){

String s = "Purushottam";

String []a = s.split("");

Map<String , Integer> map = new HashMap<String , Integer>();

for(String ss : a){
if(!map.containsKey(ss)){
map.put(ss,1);
}
else{
map.put(ss,map.get(ss) + 1);
}

}
System.out.println(map);

Set<String> set =map.keySet();

for(String i : set){
if(map.get(i)>1){
System.out.println(i + " : " + map.get(i));

}
}

System.out.println("-----------------------");


for(int  i=0; i<=7; i++){

for(int j = 7 ; j>i ; j--){

System.out.print(" ");


}

for(int j = 1 ; j<i ; j++){

System.out.print("*");


}

for(int k = 1 ; k<i ; k++){

System.out.print("*");


}
System.out.println();

}




}


}