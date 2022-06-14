package ru.zoommax.Types;

import org.json.JSONObject;

public class User {
    JSONObject jsonObject;

    public User(JSONObject jObj){
        this.jsonObject = jObj;
    }

    public long id(){
        return jsonObject.getLong("id");
    }

    public boolean is_bot(){
        return jsonObject.getBoolean("is_bot");
    }

    public String first_name(){
        return jsonObject.getString("first_name");
    }

    public String last_name(){
        return jsonObject.getString("last_name");
    }

    public String username(){
        return jsonObject.getString("username");
    }

    public String language_code(){
        return jsonObject.getString("language_code");
    }

    public boolean can_join_groups(){
        return jsonObject.getBoolean("can_join_groups");
    }

    public boolean can_read_all_group_messages(){
        return jsonObject.getBoolean("can_read_all_group_messages");
    }

    public boolean supports_inline_queries(){
        return jsonObject.getBoolean("supports_inline_queries");
    }

}
