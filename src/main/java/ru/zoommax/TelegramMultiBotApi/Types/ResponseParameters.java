package ru.zoommax.TelegramMultiBotApi.Types;

import org.json.JSONObject;

public class ResponseParameters {
    JSONObject jsonObject;

    public ResponseParameters(JSONObject jObj){
        this.jsonObject=jObj;
    }
}
