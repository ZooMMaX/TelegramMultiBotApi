package ru.zoommax.TelegramMultiBotApi.Types;

import org.json.JSONObject;

public class MessageId {
    JSONObject jsonObject;

    public MessageId(JSONObject jObj){
        this.jsonObject=jObj;
    }

    public Long message_id(){
        return jsonObject.getLong("message_id");
    }
}
