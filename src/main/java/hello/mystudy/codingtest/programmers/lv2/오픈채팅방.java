package hello.mystudy.codingtest.programmers.lv2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 오픈채팅방 {
    public String[] solution(String[] record) {
        List<Log> logs = new ArrayList<>();
        Map<String, User> userStoreRe = new HashMap<>();

        for (String datas : record) {
            String[] data = datas.split(" ");
            String action = data[0];
            String uid = data[1];
            String nickname;

            switch (action) {
                case "Enter":
                    nickname = data[2];
                    if (userStoreRe.get(uid) == null) {
                        userStoreRe.put(uid, new User(uid, nickname));
                    }
                    User user = userStoreRe.get(uid);
                    user.checkNickname(nickname);
                    logs.add(new Log(user, "님이 들어왔습니다."));
                    break;
                case "Leave":
                    logs.add(new Log(userStoreRe.get(uid), "님이 나갔습니다."));
                    break;
                case "Change":
                    nickname = data[2];
                    userStoreRe.get(uid).checkNickname(nickname);
                    break;
            }
        }

        List<String> result = new ArrayList<>();
        logs.stream().forEach(log -> result.add(log.getMessage()));
        return result.toArray(new String[0]);
    }

    static class User {
        private final String uid;
        private String nickname;

        public User(String uid, String nickname) {
            this.uid = uid;
            this.nickname = nickname;
        }

        private void changeNickname(String nickname) {
            this.nickname = nickname;
        }

        public void checkNickname(String nickname) {
            if (!this.nickname.equals(nickname)) {
                changeNickname(nickname);
            }
        }
    }

    static class Log {
        private final User user;
        private final String action;

        public Log(User user, String action) {
            this.user = user;
            this.action = action;
        }

        public String getMessage() {
            return user.nickname + action;
        }
    }
}
