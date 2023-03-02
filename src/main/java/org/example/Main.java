package org.example;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import dto.ItemDto;
import netscape.javascript.JSObject;

import java.text.SimpleDateFormat;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        String valueCode = "{\"1\":\"男性\",\"2\":\"女性\"}";
        JSONObject jsonObject = JSON.parseObject(valueCode);

        System.out.println("");
    }
}