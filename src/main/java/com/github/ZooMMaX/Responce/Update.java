package com.github.ZooMMaX.Responce;

import com.github.ZooMMaX.Utils.Json;

public class Update {
	String json;
	
	public Update(String json){
		this.json=json;
	}
	
	public GetMessage getMessage() {
		return new GetMessage(json);
	}
	
	public long update_id(){
		return Json.jObject(json).getLong("update_id");
	}
}
