import com.sun.org.apache.xpath.internal.functions.FuncSubstring;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("123456");
        list.add("123457");
        list.add("123458");
        String org = "123458";
        int code = -1;
        if (list.size() > 0){
            for (int i = 0; i < list.size(); i++) {
                String s = list.get(i);
                if (s.equals(org)){
                    code = 0;
                    System.out.println(code);
                }
            }
        }else{
            System.out.println("登陆名在系统无法匹配");
            code = -1;
            System.out.println(code);
        }
    }
}
