package ru.zoommax.TelegramMultiBotApi.Types;

import org.json.JSONObject;

public class InputMediaDocument {
    JSONObject jsonObject;
    public InputMediaDocument(JSONObject jObj){
        this.jsonObject=jObj;
    }
}
