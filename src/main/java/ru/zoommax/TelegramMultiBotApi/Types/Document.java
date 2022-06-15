package ru.zoommax.TelegramMultiBotApi.Types;

import org.json.JSONObject;

public class Document {
    JSONObject jsonObject;

    public Document(JSONObject jObj){
        this.jsonObject = jObj;
    }
}
