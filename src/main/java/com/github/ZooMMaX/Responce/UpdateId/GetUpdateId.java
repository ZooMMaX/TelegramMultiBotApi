package com.github.ZooMMaX.Responce.UpdateId;

import com.github.ZooMMaX.Utils.Json;
import org.json.JSONObject;

public class GetUpdateId {
    JSONObject jObj;

    public GetUpdateId(String json){
        this.jObj = Json.jObject(json);
    }

    public long update_id(){
        return jObj.getLong("update_id");
    }
}
