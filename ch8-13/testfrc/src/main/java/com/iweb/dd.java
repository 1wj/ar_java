package com.iweb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @file: ch8-13
 * @version: 2021.1
 * @Description: TODO
 * @Author: Wj
 * @Date: 2022/5/31 11:36
 */
public class dd {
    public static void main(String[] args) {
        List<String> list=new ArrayList();
        list.add("qa");
        list.add("qf");
        list.add("qs");

        JSONObject jsonObject = new JSONObject();
        jsonObject.fluentPut("process_step",list);

        JSONArray process_step = jsonObject.getJSONArray("process_step");
        jsonObject.get("process_step");

        System.out.println("1=="+process_step);
        System.out.println("2=="+jsonObject.get("process_step"));
    }
}
