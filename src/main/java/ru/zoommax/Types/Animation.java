package ru.zoommax.Types;

import org.json.JSONObject;

public class Animation {
    JSONObject jsonObject;

    public Animation(JSONObject jObj){
        this.jsonObject = jObj;
    }

    public String file_id(){
        return jsonObject.getString("file_id");
    }

    public String file_unique_id(){
        return jsonObject.getString("file_unique_id");
    }

    public Long width(){
        return jsonObject.getLong("width");
    }

    public Long height(){
        return jsonObject.getLong("height");
    }

    public Long duration(){
        return jsonObject.getLong("duration");
    }

    public PhotoSize thumb(){
        return new PhotoSize(jsonObject.getJSONArray("thumb"));
    }
}
