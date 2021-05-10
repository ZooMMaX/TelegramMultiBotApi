package com.github.ZooMMaX.Types;

import org.json.JSONArray;
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

    public Voice voice(){
        return new Voice(jsonObject.getJSONObject("voice"));
    }

    public String caption(){
        return jsonObject.getString("caption");
    }

    public MessageEntity caption_entities(){
        return new MessageEntity(jsonObject.getJSONArray("caption_entities"));
    }

    public Contact contact(){
        return new Contact(jsonObject.getJSONObject("contact"));
    }

    public Dice dice(){
        return new Dice(jsonObject.getJSONObject("dice"));
    }

    public Poll poll(){
        return new Poll(jsonObject.getJSONObject("poll"));
    }

    public Venue venue(){
        return new Venue(jsonObject.getJSONObject("venue"));
    }

    public Location location(){
        return new Location(jsonObject.getJSONObject("location"));
    }

    public User new_chat_members(){
        return new User(jsonObject.getJSONObject("new_chat_members"));
    }

    public User left_chat_member(){
        return new User(jsonObject.getJSONObject("left_chat_member"));
    }

    public String new_chat_title(){
        return jsonObject.getString("new_chat_title");
    }

    public PhotoSize new_chat_photo(){
        return new PhotoSize(jsonObject.getJSONArray("new_chat_photo"));
    }

    public Boolean delete_chat_photo(){
        return jsonObject.getBoolean("delete_chat_photo");
    }

    public Boolean group_chat_created(){
        return jsonObject.getBoolean("group_chat_created");
    }

    public Boolean supergroup_chat_created(){
        return jsonObject.getBoolean("supergroup_chat_created");
    }

    public Boolean channel_chat_created(){
        return jsonObject.getBoolean("channel_chat_created");
    }

    public MessageAutoDeleteTimerChanged message_auto_delete_timer_changed(){
        return new MessageAutoDeleteTimerChanged(jsonObject.getJSONObject("message_auto_delete_timer_changed"));
    }

    public Long migrate_to_chat_id(){
        return jsonObject.getLong("migrate_to_chat_id");
    }

    public Long migrate_from_chat_id(){
        return jsonObject.getLong("migrate_from_chat_id");
    }

    public Message pinned_message(){
        return new Message(jsonObject.getJSONObject("pinned_message"));
    }

    public String connected_website(){
        return jsonObject.getString("connected_website");
    }

    public ProximityAlertTriggered proximity_alert_triggered(){
        return new ProximityAlertTriggered(jsonObject.getJSONObject("proximity_alert_triggered"));
    }

    public VoiceChatScheduled voice_chat_scheduled(){
        return new VoiceChatScheduled(jsonObject.getJSONObject("voice_chat_scheduled"));
    }

    public VoiceChatStarted voice_chat_started(){
        return new VoiceChatStarted(jsonObject.getJSONObject("voice_chat_started"));
    }

    public VoiceChatEnded voice_chat_ended(){
        return new VoiceChatEnded(jsonObject.getJSONObject("voice_chat_ended"));
    }

    public VoiceChatParticipantsInvited voice_chat_participants_invited(){
        return new VoiceChatParticipantsInvited(jsonObject.getJSONObject("voice_chat_participants_invited"));
    }

    public InlineKeyboardMarkup reply_markup(){
        return new InlineKeyboardMarkup(jsonObject.getJSONObject("reply_markup"));
    }
}
