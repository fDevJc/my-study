package hello.mystudy.cleancode.switchconstruction.after;

public class CommissionedEmployee extends Employee{
	@Override
	public int getPay() {
		System.out.println("커미션 임플로이 계산");
		return 0;
	}
}
