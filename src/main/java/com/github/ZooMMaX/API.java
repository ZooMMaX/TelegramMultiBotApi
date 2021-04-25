package com.github.ZooMMaX;
import org.json.JSONArray;
import org.json.JSONObject;

public class API {
    //Получаем и сбрасываем обновления
    public static String[] getUpdates(String bottoken) {
        //Получение обновлений
        String result = http.get(bottoken + "/getUpdates?offset=0");
        String ok = json(result).get("ok").toString();
        if (ok.equals("true")) {
            if (!json(result).getJSONArray("result").isEmpty()) {
                JSONArray jsonArray = json(result).getJSONArray("result");
                String[] ret = new String[jsonArray.length()];
                for (int x = 0; x < jsonArray.length(); x++) {
                    ret[x] = jsonArray.getJSONObject(x).toString();
                }
                //Узнаем id последнего полученного обновления
                int offset = jsonArray.getJSONObject(jsonArray.length() - 1).getInt("update_id");
                //Сбрасываем обновления на сервере telegram
                http.get(bottoken + "/getUpdates?offset=" + (offset + 1));
                //Возвращаем обновления
                return ret;
            }
        }
        return new String[0];
    }

    public static String [] update(String updates){
        return  null;
    }

    public static JSONObject json(String j){
        return new JSONObject(j);
    }
}
