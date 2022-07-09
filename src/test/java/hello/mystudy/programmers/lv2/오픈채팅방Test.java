package hello.mystudy.programmers.lv2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 오픈채팅방Test {

    오픈채팅방 test = new 오픈채팅방();

    String[] solution(String[] record) {
        return test.solution(record);
    }

    @Test
    void ex1() {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        String[] result = solution(record);
        String[] expected = {"Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."};

        Assertions.assertThat(result).containsExactly(expected);
    }
}