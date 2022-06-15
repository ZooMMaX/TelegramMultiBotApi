package ru.zoommax.TelegramMultiBotApi.Types;

import org.json.JSONObject;

public class ChatMember {
    JSONObject jsonObject;

    public ChatMember(JSONObject jObj){
        this.jsonObject=jObj;
    }
}
