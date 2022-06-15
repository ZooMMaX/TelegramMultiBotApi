package ru.zoommax.TelegramMultiBotApi.Types;

import org.json.JSONObject;

public class InlineKeyboardButton {
    JSONObject jsonObject;

    public InlineKeyboardButton(JSONObject jObj){
        this.jsonObject=jObj;
    }
}
