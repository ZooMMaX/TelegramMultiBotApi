package com.github.ZooMMaX.Types;

import com.github.ZooMMaX.Utils.Json;
import org.json.JSONObject;

public class Chat {
    JSONObject jsonObject;

    public Chat(JSONObject jObj){
        this.jsonObject = jObj;
    }

    public long id(){
        return jsonObject.getLong("id");
    }

    public String type(){
        return jsonObject.getString("type");
    }

    public String title(){
        return jsonObject.getString("title");
    }

    public String username(){
        return jsonObject.getString("username");
    }

    public String first_name(){
        return jsonObject.getString("first_name");
    }

    public String last_name(){
        return jsonObject.getString("last_name");
    }

    public ChatPhoto photo(){
        return new ChatPhoto();
    }

    public String bio(){
        return jsonObject.getString("bio");
    }

    public String description(){
        return jsonObject.getString("description");
    }

    public String invite_link(){
        return jsonObject.getString("invite_link");
    }

    public Message pinned_message(){
        return new Message(jsonObject.getJSONObject("pinned_message"));
    }

    public ChatPermissions permissions(){
        return new ChatPermissions();
    }

    public long slow_mode_delay(){
        return jsonObject.getLong("slow_mode_delay");
    }

    public long message_auto_delete_time(){
        return jsonObject.getLong("message_auto_delete_time");
    }

    public String sticker_set_name(){
        return jsonObject.getString("sticker_set_name");
    }

    public boolean can_set_sticker_set(){
        return jsonObject.getBoolean("can_set_sticker_set");
    }

    public long linked_chat_id(){
        return jsonObject.getLong("linked_chat_id");
    }

    public ChatLocation location(){
        return new ChatLocation();
    }
}
