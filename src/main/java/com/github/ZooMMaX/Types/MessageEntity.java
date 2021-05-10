package com.github.ZooMMaX.Types;

import org.json.JSONArray;
import org.json.JSONObject;

public class MessageEntity {
    JSONObject jsonObject;

    public MessageEntity(JSONArray jArr){
        this.jsonObject = jArr.getJSONObject(0);
    }
    
    public String type(){
    	return  jsonObject.getString("type");
    }
    
    public long offset(){
    	return  jsonObject.getLong("offset");
    }
    
    public long lenght(){
    	return jsonObject.getLong("lenght");
    }
    
    public String url(){
    	return jsonObject.getString("url");
    }
    
    public User user(){
    	return new User(jsonObject.getJSONObject("user"));
    }
    
    public String language(){
    	return jsonObject.getString("language");
    }
}
