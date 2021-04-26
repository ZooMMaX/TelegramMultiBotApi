package com.github.ZooMMaX;

public class Update {
    String json;

    public Update(String json){
        this.json=json;
         /*class gm{
             public String messageId(){
                 return Json.jObject(json).get("message_id").toString();
             }
             public String messageText(){
                 return Json.jObject(json).getString("text");
             }
         }*/
         //messageText = new GetMessage(json).messageText();
         //messageId = new GetMessage(json).messageId();
        //System.out.println(json);

    }

    public GetMessage getMessage() {
        return new GetMessage(json);
    }



    /*public String getMessageText(){
         return messageText;
    }
    public String getMessageId(){
         return messageId;
    }*/
}
