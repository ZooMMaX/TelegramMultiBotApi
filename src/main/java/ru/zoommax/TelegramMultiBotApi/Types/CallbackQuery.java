package ru.zoommax.TelegramMultiBotApi.Types;

import org.json.JSONObject;

public class CallbackQuery {
    JSONObject jsonObject;

    public CallbackQuery(JSONObject jObj){
        this.jsonObject=jObj;
    }
}
