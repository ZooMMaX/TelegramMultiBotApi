package ru.zoommax.TelegramMultiBotApi.Types;

import org.json.JSONObject;

public class ProximityAlertTriggered {
    JSONObject jsonObject;

    public ProximityAlertTriggered(JSONObject jObj){
        this.jsonObject=jObj;
    }
}
