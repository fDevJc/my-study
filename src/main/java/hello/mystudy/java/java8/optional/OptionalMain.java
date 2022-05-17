package hello.mystudy.java.java8.optional;

import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {
        Member member = new Member("memberA", 30, null);

        MemberService memberService = new MemberService();
        String teamNameOri = memberService.getTeamNameOri(member);

        if (teamNameOri == null) {
            System.out.println("teamNameOri is null");
        }else{
            System.out.println("teamNameOri is not null");
        }

        Optional<String> teamNameOpt = memberService.getTeamNameOpt(member);
        teamNameOpt.ifPresentOrElse(teamName -> System.out.println("teamNameOri is not null"), () -> System.out.println("teamNameOpt is null"));
    }
}
