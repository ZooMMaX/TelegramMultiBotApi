package com.github.ZooMMaX;

public class GetMessage{

    String json;
    public GetMessage(String json){
        //System.out.println(json);
        this.json=json;
    }
    public String messageId(){

        return Json.jObject(json).get("message_id").toString();
    }
    public String messageText(){
        return Json.jObject(json).getString("text");
    }
}
