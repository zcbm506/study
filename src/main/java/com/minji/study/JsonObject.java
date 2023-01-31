package com.minji.study;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.List;

public class JsonObject {

    static String json;

    public static void main(String[] args) throws ParseException {

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

        JSONObject data2 = new JSONObject();
        data2.put("JSON_DATA", "{\"parsdate\":\"2023-01-30\",\"count\":8}");

        JSONArray req_array = new JSONArray();
        req_array.add(data);
        req_array.add(data2);

        jsonObject.put("REQ_DATA", req_array);

        json = jsonObject.toJSONString();

        System.out.println(json);

        JSONParser parser = new JSONParser();
        JSONObject univ = (JSONObject)parser.parse(json);

        //System.out.println(univ.toJSONString());

        JSONArray arr = (JSONArray)univ.get("REQ_DATA");

        //System.out.println(arr.toJSONString());

        JSONObject tmp = (JSONObject)arr.get(1);
        String jdata = (String)tmp.get("JSON_DATA");
        System.out.println(jdata);


        //String data를 json으로 변환 후 출력
        JSONParser jparser = new JSONParser();
        Object obj = jparser.parse(jdata);
        JSONObject fobj = (JSONObject) obj;

        System.out.println(fobj.get("parsdate"));
        System.out.println(fobj.get("count"));








    }


}
