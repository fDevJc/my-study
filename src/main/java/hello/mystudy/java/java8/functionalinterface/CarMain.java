package hello.mystudy.java.java8.functionalinterface;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car() {
            @Override
            public String drive(int driveLevel) {
                return driveLevel == 0 ? "" : driveLevel + "의 속도";
            }
        };
        System.out.println("car.drive(10) = " + car1.drive(10));
        
        Car car2 = (driveLevel) ->  driveLevel == 0 ? "" : driveLevel + "의 속도";
        System.out.println("car2.drive(11) = " + car2.drive(11));
        
    }
}
