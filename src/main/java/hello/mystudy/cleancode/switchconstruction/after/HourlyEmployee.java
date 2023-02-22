package hello.mystudy.cleancode.switchconstruction.after;

public class HourlyEmployee extends Employee {

	@Override
	public int getPay() {
		System.out.println("시간제 임플로이 계산");
		return 0;
	}
}
