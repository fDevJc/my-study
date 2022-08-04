package hello.mystudy.codingtest.toss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 나만의L4만들기 {
    public int[][] solution(int servers, boolean sticky, int[] requests) {
        //로드밸런서 생성(sticky option)
        LoadBalancer loadBalancer = new LoadBalancer(sticky);
        //로드밸런서 서버추가
        for (int i = 0; i < servers; i++) {
            loadBalancer.addServer(new Server());
        }
        //로드밸런서에 요청보내기
        loadBalancer.request(requests);

        //결과받기
        //로드밸런서에서 서버리스트 받아오기
        List<Server> loadBalancerServers = loadBalancer.getServers();

        //server들의 request log 가져오기
        int[][] answer = new int[servers][];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = loadBalancerServers.get(i).getRequestLogToArray();
        }
        return answer;
    }

    class Server {
        private List<Integer> requestLogs = new ArrayList<>();
        public int[] getRequestLogToArray() {
            return requestLogs.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }

        public void request(int request) {
            //request 처리...
            writeRequestLog(request);
        }

        public void writeRequestLog(int request) {
            requestLogs.add(request);
        }

        public boolean hasRequest(int request) {
            return requestLogs.contains(request);
        }
    }

    class LoadBalancer {
        private boolean sticky;
        private List<Server> servers = new ArrayList<>();
        private int requestCount = 0;

        public LoadBalancer(boolean sticky) {
            this.sticky = sticky;
        }

        public void addServer(Server server) {
            servers.add(server);
        }

        public void request(int[] requests) {
            for (int request : requests) {
                getServer(request).request(request);
            }
        }

        private Server getServer(int request) {
            if (sticky) {
                for (Server server : getServers()) {
                    if (server.hasRequest(request)) {
                        return server;
                    }
                }
            }
            return servers.get(requestCount++ % servers.size());
        }

        public List<Server> getServers() {
            return Collections.unmodifiableList(servers);
        }
    }
}
