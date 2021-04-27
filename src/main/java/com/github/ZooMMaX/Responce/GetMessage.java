package com.github.ZooMMaX.Responce;

import com.github.ZooMMaX.Utils.Json;

import org.json.JSONObject;

public class GetMessage{
	String json;
	JSONObject jObj;
	
	public GetMessage(String json){
		this.json=json;
		this.jObj=Json.jObject(json).getJSONObject("message");
	}
	
	public String message_id(){
		return jObj.get("message_id").toString();
	}
	
	public String text(){
		return jObj.getString("text");
	}
	
	public long date(){
		return jObj.getLong("date");
	}
	
	public GetMessageChat getChat(){
		return new GetMessageChat(json);
	}
	
	public GetMessageFrom getFrom(){
		return new GetMessageFrom(json);
	}
}
