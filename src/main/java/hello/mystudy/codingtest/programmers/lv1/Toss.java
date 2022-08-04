package hello.mystudy.codingtest.programmers.lv1;

import java.util.ArrayList;
import java.util.List;

public class Toss {
    public int[][] solution(int servers, boolean sticky, int[] requests) {
        List<Server> serverList = new ArrayList<>();
        for (int i = 0; i < servers; i++) {
            Server server = new Server();
            serverList.add(server);
        }

        LoadBalancer loadBalancer = new LoadBalancer(sticky, serverList);
        loadBalancer.request(requests);

        return loadBalancer.getServersRequestNumberArray();
    }

    interface LoadBalancingDistributionOption {

    }

    class Server {
        List<Integer> requestNumbers = new ArrayList<>();
        public void request(int i) {
            requestNumbers.add(i);
        }
        public int[] getRequestNumberArray() {
            return requestNumbers.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }

        public boolean hasRequestNumber(int requestNumber) {
            return requestNumbers.contains(requestNumber);
        }
    }

    class LoadBalancer {
        private boolean sticky;
        private List<Server> servers;
        public LoadBalancer(boolean sticky, List<Server> serverList) {
            this.sticky = sticky;
            this.servers = serverList;
        }

        public void request(int[] requests) {
            int serverNumber = 0;

            for (int request : requests) {
                if (sticky) { //sticky가 true 일때, 이전 리퀘스트를 가진 서버에 요청한다.

                } else { //sticky가 false 일때, 이전 리퀘스트에 상관없이 순서대로 요청한다.

                }
            }
        }


        public void request2(int[] requests) {
            int serverNumber = 0;

            for (int i = 0; i < requests.length; i++) {
                if (sticky) {
                    for (Server server : servers) {
                        if (server.hasRequestNumber(requests[i])) {
                            server.request(requests[i]);
                        } else {
                            servers.get(serverNumber++ % servers.size()).request(requests[i]);
                        }
                    }
                } else {
                    servers.get(serverNumber++ % servers.size()).request(requests[i]);
                }
            }
        }

        public int[][] getServersRequestNumberArray() {
            int[][] result = new int[servers.size()][];
            for (int i = 0; i < servers.size(); i++) {
                result[i] = servers.get(i).getRequestNumberArray();
            }

            return result;
        }
    }
}
