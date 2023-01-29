package com.minji.study;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.List;

public class JsonObject {

    public static void main(String[] args) {

        /* JSON 데이터 생성 */
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("KEY-1", "minji_key-1");
        jsonObject.put("KEY-2", "minji_key-2");

        JSONObject data = new JSONObject();
        data.put("BANK_CD", "088");
        data.put("SEARCH_ACCT_NO", "1231231234");
        data.put("ACNM_NO", "123456");
        data.put("ICHE_AMT", "0");
        data.put("TRSC_SEQ_NO", "0000001");

        JSONArray req_array = new JSONArray();
        req_array.add(data);

        jsonObject.put("REQ_DATA", req_array);

        System.out.println(jsonObject.toString());



    }


}
