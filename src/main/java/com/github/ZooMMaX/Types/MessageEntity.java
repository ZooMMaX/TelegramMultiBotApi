package com.github.ZooMMaX.Types;

import org.json.JSONArray;
import org.json.JSONObject;

public class MessageEntity {
    JSONObject jsonObject;

    public MessageEntity(JSONArray jArr){
        this.jsonObject = jArr.getJSONObject(0);
    }
}
