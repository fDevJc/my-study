package hello.mystudy.cleancode.switchconstruction.before;

public class BeforeCalculator {
	public int calculatePay(BeforeEmployee employee) {
		switch (employee.getType()) {
			case "Commissioned":
				return calculateCommissionedPay(employee);
			case "Hourly":
				return calculateHourlyPay(employee);
			default:
				throw new RuntimeException();
		}
	}

	private int calculateHourlyPay(BeforeEmployee employee) {
		System.out.println("시간제 임플로이 계산");
		return 0;
	}

	private int calculateCommissionedPay(BeforeEmployee employee) {
		System.out.println("커미션 임플로이 계산");
		return 0;
	}
}
