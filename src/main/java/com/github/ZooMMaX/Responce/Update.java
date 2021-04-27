package com.github.ZooMMaX.Responce;

import com.github.ZooMMaX.Responce.UpdateId.GetUpdateId;

public class Update {
	String json;
	
	public Update(String json){
		this.json=json;
	}

	public GetUpdateId getUpdateId(){
		return new GetUpdateId(json);
	}
}
