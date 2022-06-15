package ru.zoommax.TelegramMultiBotApi.Responce;

import org.json.JSONObject;
import ru.zoommax.TelegramMultiBotApi.Types.*;

public class Update {
	JSONObject jObj;
	
	public Update(String json){
		this.jObj = new JSONObject(json);
	}

	public long getUpdateID(){
		return jObj.getLong("update_id");
	}

	public Message getMessage(){
		return new Message(jObj);
	}
}
