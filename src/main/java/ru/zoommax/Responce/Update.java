package ru.zoommax.Responce;

import ru.zoommax.Responce.UpdateId.GetUpdateId;

public class Update {
	String json;
	
	public Update(String json){
		this.json=json;
	}

	public GetUpdateId getUpdateId(){
		return new GetUpdateId(json);
	}
}
