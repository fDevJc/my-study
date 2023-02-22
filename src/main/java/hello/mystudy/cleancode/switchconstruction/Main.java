package hello.mystudy.cleancode.switchconstruction;

import hello.mystudy.cleancode.switchconstruction.after.AfterCalculator;
import hello.mystudy.cleancode.switchconstruction.after.Employee;
import hello.mystudy.cleancode.switchconstruction.after.EmployeeFactory;
import hello.mystudy.cleancode.switchconstruction.after.EmployeeFactoryImpl;
import hello.mystudy.cleancode.switchconstruction.before.BeforeCalculator;
import hello.mystudy.cleancode.switchconstruction.before.BeforeEmployee;

/*
	CleanCode 3장 함수 Switch 문
 */
public class Main {
	public static void main(String[] args) {
		before();
		after();
	}

	private static void after() {
		AfterCalculator afterCalculator = new AfterCalculator();
		EmployeeFactory employeeFactory = new EmployeeFactoryImpl();
		Employee employee = employeeFactory.getEmployee("Hourly");
		afterCalculator.calculatePay(employee);
	}

	private static void before() {
		BeforeCalculator beforeCalculator = new BeforeCalculator();
		BeforeEmployee employee = new BeforeEmployee();
		employee.setType("Hourly");
		beforeCalculator.calculatePay(employee);
	}
}
