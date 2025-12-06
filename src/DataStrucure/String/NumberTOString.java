package DataStrucure.String;

import java.util.HashMap;
import java.util.Map;

public class NumberTOString {
    public static void main(String[] args) {
        int num=-234;
        Map<Integer,Character> map=new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, (char) ('0' + i));
        }


            num+= num*(-2);
            String s=converter(num, " ",map);
        System.out.println(s);


    }

    private static String converter(int num, String str,Map<Integer,Character> map) {

        if(num<=0){
            return str;
        }
        int last_num=num%10;
        Character ch=map.get(last_num);
        str=ch+str;

        return converter(num/10,str, map);
    }
}
