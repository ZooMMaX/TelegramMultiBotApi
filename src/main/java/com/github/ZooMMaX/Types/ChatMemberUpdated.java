package com.github.ZooMMaX.Types;

import org.json.JSONObject;

public class ChatMemberUpdated {
    JSONObject jsonObject;

    public ChatMemberUpdated(JSONObject jObj){
        this.jsonObject=jObj;
    }
}
