package hello.mystudy.java.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        List<Member> members = getMembers();

        List<Member> membersAgeGreaterThanThree1 = new ArrayList<>();
        for (Member member : members) {
            if (member.getAge() > 3) {
                membersAgeGreaterThanThree1.add(member);
            }
        }
        for (Member member : membersAgeGreaterThanThree1) {
            System.out.println("member.getName() = " + member.getName());
        }

        //stream 사용
        List<Member> membersAgeGreaterThanThree2 = members.stream()
                .filter(m -> m.getAge() > 3)
                .collect(Collectors.toList());
        membersAgeGreaterThanThree2.forEach(member -> System.out.println("member.getName() = " + member.getName()));
    }

    public static List<Member> getMembers() {
        List<Member> members = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            members.add(new Member("name" + i, i));
        }
        return members;
    }

    static class Member {
        private String name;
        private int age;

        public Member(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
