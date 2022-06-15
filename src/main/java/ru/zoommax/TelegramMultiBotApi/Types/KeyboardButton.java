package ru.zoommax.TelegramMultiBotApi.Types;

import org.json.JSONObject;

public class KeyboardButton {
    JSONObject jsonObject;

    public KeyboardButton(JSONObject jObj){
        this.jsonObject=jObj;
    }
}
