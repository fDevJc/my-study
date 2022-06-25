package hello.mystudy.programmers.lv1;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.IntStream;

public class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Repository repository = new Repository();

        IntStream
                .range(0, id_list.length)
                .forEach(index -> repository.save(id_list[index], new User(index)));

        Arrays.stream(report).forEach(s -> {
            String[] reportContent = s.split(" ");
            User reportUser = repository.findById(reportContent[0]);
            User badUser = repository.findById(reportContent[1]);
            badUser.reportedBy(reportUser);
        });

        int[] answer = new int[id_list.length];

        repository.findAll().forEach(user -> {
            if (user.isReportedCountGreaterThan(k)) {
                user.getReportedUsers().forEach(reportedUser-> answer[reportedUser.getIndex()]++);
            }
        });

        return answer;
    }

    static class Repository {
        private static Map<String, User> store = new ConcurrentHashMap<>();

        public void save(String userId, User user) {
            store.put(userId, user);
        }

        public User findById(String userId) {
            return store.get(userId);
        }

        public Collection<User> findAll() {
            return store.values();
        }
    }

    static class User {
        private int index;
        private final Set<User> reportedUsers = new HashSet<>();
        private int reportedCount = 0;

        public User(int index) {
            this.index = index;
        }

        private void reportedBy(User reporterUser) {
            if (reportedUsers.add(reporterUser)) {
                reportedCount++;
            }
        }

        public boolean isReportedCountGreaterThan(int k) {
            return reportedCount >= k;
        }

        public int getIndex() {
            return index;
        }

        public Set<User> getReportedUsers() {
            return reportedUsers;
        }
    }
}
