package ru.zoommax.TelegramMultiBotApi.Utils;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

public class Updates {
	//Получаем и сбрасываем обновления
	public static List<String> get(String bottoken) {
		List<String> ret = new ArrayList<>();
		//Получение обновлений
		String result = http.get(bottoken + "/getUpdates?offset=0");
		String ok = Json.jObject(result).get("ok").toString();
		if (ok.equals("true")) {
			if (!Json.jArray(result,"result").isEmpty()) {
				JSONArray jsonArray = Json.jArray(result,"result");
				for (int x = 0; x < jsonArray.length(); x++) {
					ret.add(jsonArray.getJSONObject(x).toString());
			}
			//Узнаем id последнего полученного обновления
			int offset = jsonArray.getJSONObject(jsonArray.length() - 1).getInt("update_id");
			//Сбрасываем обновления на сервере telegram
			http.get(bottoken + "/getUpdates?offset=" + (offset + 1));
			//Возвращаем обновления
			return ret;
			}
		}
		return null;
	}
}
