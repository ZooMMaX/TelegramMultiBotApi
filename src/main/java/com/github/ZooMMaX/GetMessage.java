package com.github.ZooMMaX;

import org.json.JSONObject;

public class GetMessage{

    String json;
    JSONObject messageJobj;
    public GetMessage(String json){
        this.json=json;
        this.messageJobj=Json.jObject(json).getJSONObject("message");
    }
    
    public String messageId(){
        return messageJobj.get("message_id").toString();
    }
    
    public String messageText(){
        return messageJobj.getString("text");
    }
}
