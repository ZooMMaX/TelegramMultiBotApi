package ru.zoommax.TelegramMultiBotApi.Types;

import org.json.JSONObject;

public class BotCommand {
    JSONObject jsonObject;

    public BotCommand(JSONObject jObj){
        this.jsonObject=jObj;
    }
}
