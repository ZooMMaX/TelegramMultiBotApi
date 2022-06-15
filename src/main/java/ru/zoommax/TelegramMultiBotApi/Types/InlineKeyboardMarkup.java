package ru.zoommax.TelegramMultiBotApi.Types;

import org.json.JSONObject;

public class InlineKeyboardMarkup {
    JSONObject jsonObject;

    public InlineKeyboardMarkup(JSONObject jObj){
        this.jsonObject=jObj;
    }
}
