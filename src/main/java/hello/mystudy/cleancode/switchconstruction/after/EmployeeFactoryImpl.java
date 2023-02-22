package hello.mystudy.cleancode.switchconstruction.after;

public class EmployeeFactoryImpl implements EmployeeFactory {
	@Override
	public Employee getEmployee(String type) {
		switch (type) {
			case "Commissioned":
				return new CommissionedEmployee();
			case "Hourly":
				return new HourlyEmployee();
			default:
				throw new RuntimeException();
		}
	}
}
