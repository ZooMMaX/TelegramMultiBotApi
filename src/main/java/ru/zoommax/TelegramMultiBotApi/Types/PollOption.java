package ru.zoommax.TelegramMultiBotApi.Types;

import org.json.JSONObject;

public class PollOption {
    JSONObject jsonObject;

    public PollOption(JSONObject jObj){
        this.jsonObject=jObj;
    }
}