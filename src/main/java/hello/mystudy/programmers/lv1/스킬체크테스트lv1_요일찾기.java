package hello.mystudy.programmers.lv1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

class 스킬체크테스트lv1_요일찾기 {
    public String solution(int a, int b) {
        Map<Integer, String> dayOfTheWeek = new HashMap<>();
        dayOfTheWeek.put(1, "MON");
        dayOfTheWeek.put(2, "TUE");
        dayOfTheWeek.put(3, "WED");
        dayOfTheWeek.put(4, "THU");
        dayOfTheWeek.put(5, "FRI");
        dayOfTheWeek.put(6, "SAT");
        dayOfTheWeek.put(7, "SUN");

        LocalDate localDate = LocalDate.of(2016, a, b);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        return dayOfTheWeek.get(dayOfWeek.getValue());
    }
}
