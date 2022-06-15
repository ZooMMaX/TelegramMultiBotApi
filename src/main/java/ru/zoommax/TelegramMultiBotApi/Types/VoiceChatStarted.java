package ru.zoommax.TelegramMultiBotApi.Types;

import org.json.JSONObject;

public class VoiceChatStarted {
    JSONObject jsonObject;

    public VoiceChatStarted(JSONObject jObj){
        this.jsonObject=jObj;
    }
}
