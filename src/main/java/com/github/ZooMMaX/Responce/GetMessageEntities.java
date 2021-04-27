package com.github.ZooMMaX.Responce;

import org.json.JSONArray;
import org.json.JSONObject;
import com.github.ZooMMaX.Utils.Json;

public class GetMessageEntities {
	JSONObject [] jObj;
	JSONArray jArr;
	
	public GetMessageEntities(String json){
		this.jArr = Json.jObject(json).getJSONObject("message").getJSONArray("entities");
		for (Object jo : jArr){
			
		}
	}
}