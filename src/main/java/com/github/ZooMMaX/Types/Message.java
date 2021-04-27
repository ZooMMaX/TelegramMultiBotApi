package com.github.ZooMMaX.Types;

import org.json.JSONObject;

import java.security.PublicKey;

public class Message {
    JSONObject jsonObject;

    public Message(JSONObject jObj){
        this.jsonObject = jObj;
    }

    public long message_id(){
        return jsonObject.getLong("message_id");
    }

    public User from(){
        return new User(jsonObject.getJSONObject("from"));
    }

    public Chat sender_chat(){
        return new Chat(jsonObject.getJSONObject("sender_chat"));
    }

    public long date(){
        return jsonObject.getLong("date");
    }

    public Chat chat(){
        return new Chat(jsonObject.getJSONObject("chat"));
    }

    public User forward_from(){
        return new User(jsonObject.getJSONObject("forward_from"));
    }

    public Chat forward_from_chat(){
        return new Chat(jsonObject.getJSONObject("forward_from_chat"));
    }

    public long forward_from_message_id(){
        return jsonObject.getLong("forward_from_message_id");
    }

    public String forward_signature(){
        return jsonObject.getString("forward_signature");
    }

    public String forward_sender_name(){
        return jsonObject.getString("forward_sender_name");
    }

    public long forward_date(){
        return jsonObject.getLong("forward_date");
    }

    public Message reply_to_message(){
        return new Message(jsonObject.getJSONObject("reply_to_message"));
    }

    public User via_bot(){
        return new User(jsonObject.getJSONObject("via_bot"));
    }

    public long edit_date(){
        return jsonObject.getLong("edit_date");
    }

    public String media_group_id(){
        return jsonObject.getString("media_group_id");
    }

    public String author_signature(){
        return jsonObject.getString("author_signature");
    }

    public String text(){
        return jsonObject.getString("text");
    }

    public MessageEntity entities(){
        return new MessageEntity(jsonObject.getJSONArray("entities"));
    }

    public Animation animation(){
        return new Animation(jsonObject.getJSONObject("animation"));
    }

    public Audio audio(){
        return new Audio(jsonObject.getJSONObject("audio"));
    }

    public Document document(){
        return new Document(jsonObject.getJSONObject("document"));
    }

    public PhotoSize photo(){
        return new PhotoSize(jsonObject.getJSONArray("photo"));
    }

    public Sticker sticker(){
        return new Sticker(jsonObject.getJSONObject("sticker"));
    }

    public Video video(){
        return new Video(jsonObject.getJSONObject("video"));
    }

    public VideoNote video_note(){
        return new VideoNote(jsonObject.getJSONObject("video_note"));
    }


}
