package com.iweb.泛型;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class T2 {
    public static void main(String[] args) {
        List<Map<String,Object>> list=new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Map<String,Object> map=new HashMap<>();
                if(i==0){
                    map.put("sno","1001");
                    map.put("sname","张三");
                    map.put("sage",20);
                    map.put("ssex","男");
                }
                else if(i==1){
                    map.put("sno","1002");
                    map.put("sname","李四");
                    map.put("sage",21);
                    map.put("ssex","女");
                }
                else if(i==2){
                    map.put("sno","1003");
                    map.put("sname","王五");
                    map.put("sage",22);
                    map.put("ssex","男");
                }
            list.add(map);
        }
        for (Map<String, Object> map : list) {
            System.out.println(map);
        }

    }
}
