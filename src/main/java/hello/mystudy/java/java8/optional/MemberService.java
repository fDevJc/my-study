package hello.mystudy.java.java8.optional;

import java.util.Optional;

public class MemberService {
    public String getTeamNameOri(Member member) {
        if (member.getTeam() == null) {
            System.out.println("team이 없습니다");
            return null;
        }
        return member.getTeam().getName();
    }

    public Optional<String> getTeamNameOpt(Member member) {
        return Optional.ofNullable(member)
                .map(m -> m.getTeam())
                .map(t -> t.getName());
    }
}
