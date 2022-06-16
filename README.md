# Telegram multi bot api
![Maven Central](https://img.shields.io/maven-central/v/ru.zoommax/TelegramMultiBotApi?color=00ff)
## Maven Central

```xml
    <dependency>
        <groupId>ru.zoommax</groupId>
        <artifactId>TelegramMultiBotApi</artifactId>
        <version>1.2.1</version>
    </dependency>
```

## Example

```java
import ru.zoommax.TelegramMultiBotApi.Responce.Update;
import ru.zoommax.TelegramMultiBotApi.Utils.Updates;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MainTest {
    static String bottoken = "XXXXXXXXX:YYYYYYYYYYYYYYYYYYYYY";
    public static void main(String[] args) {
        new Timer().schedule(new Listener(bottoken), 0, 1000);
    }
}

class Listener extends TimerTask {

    String bottoken;

    public Listener(String bottoken){
        this.bottoken = bottoken;
    }

    @Override
    public void run() {
        List<Update> updates = Updates.get(bottoken);
        if (updates != null) {
            for (Update upd : updates) {
                System.out.println(update.getUpdateID());
                System.out.println(update.getMessage().message_id());
                System.out.println(update.getMessage().chat().first_name() + " " + update.getMessage().chat().last_name());
                System.out.println(update.getMessage().text());
            }
        }
    }
}
```
