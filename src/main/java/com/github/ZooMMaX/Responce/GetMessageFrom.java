package com.github.ZooMMaX.Responce;

import com.github.ZooMMaX.Utils.Json;

import org.json.JSONObject;

public class GetMessageFrom {
	JSONObject jObj;
	
	public GetMessageFrom(String json){
		this.jObj = Json.jObject(json).getJSONObject("message").getJSONObject("from");
	}
	
	public String language_code(){
		return jObj.getString("language_code");
	}
	
	public String last_name(){
		return jObj.getString("last_name");
	}
	
	public long id(){
		return jObj.getLong("id");
	}
	
	public boolean is_bot(){
		return jObj.getBoolean("is_bot");
	}
	
	public String first_name(){
		return jObj.getString("first_name");
	}
	
	public String username(){
		return jObj.getString("username");
	}
}