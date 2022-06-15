package ru.zoommax.TelegramMultiBotApi.Types;

import org.json.JSONObject;

public class ReplyKeyboardMarkup {
    JSONObject jsonObject;

    public ReplyKeyboardMarkup(JSONObject jObj){
        this.jsonObject=jObj;
    }
}
