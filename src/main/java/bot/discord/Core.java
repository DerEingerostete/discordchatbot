package bot.discord;

import javax.security.auth.login.LoginException;

public class Core {
    private static final String TOKEN = "";
    private static final String PREFIX = "";

    public static void main(String[] args) {
        try {
            Bot bot = new Bot(TOKEN, PREFIX);
        } catch (LoginException exception) {
            exception.printStackTrace();
        }
    }

}
