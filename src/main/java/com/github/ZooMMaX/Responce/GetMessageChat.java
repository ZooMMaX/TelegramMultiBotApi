package com.github.ZooMMaX.Responce;

import com.github.ZooMMaX.Utils.Json;

import org.json.JSONObject;

public class GetMessageChat {
	JSONObject jObj;
	
	public GetMessageChat(String json){
		this.jObj=Json.jObject(json).getJSONObject("message").getJSONObject("chat");
	}
	
	public long id(){
		return jObj.getLong("id");
	}
	
	public String last_name(){
		return  jObj.getString("last_name");
	}
	
	public String first_name(){
		return jObj.getString("first_name");
	}
	
	public  String username(){
		return jObj.getString("username");
	}
	
	public String type(){
		return  jObj.getString("type");
	}
}