package ru.zoommax.TelegramMultiBotApi.Types;

import org.json.JSONObject;

public class MessageAutoDeleteTimerChanged {
    JSONObject jsonObject;

    public MessageAutoDeleteTimerChanged(JSONObject jObj){
        this.jsonObject=jObj;
    }
}
