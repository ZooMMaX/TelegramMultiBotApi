package ru.zoommax.Utils;

import org.json.JSONArray;
import org.json.JSONObject;

public class Json {
	
	public static JSONObject jObject(String json){
		return new JSONObject(json);
	}
	
	public static JSONArray jArray(String json, String key){
		return jObject(json).getJSONArray(key);
	}
}
