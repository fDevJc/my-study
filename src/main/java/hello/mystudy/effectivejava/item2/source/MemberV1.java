package hello.mystudy.effectivejava.item2.source;

/**
 * 점층적 생성자 패턴
 * (Telescoping Constructor Pattern)
 */
public class MemberV1 {
    //필수 매개변수
    private String name;
    private String mobilePhoneNumber;

    //선택 매개변수
    private String address;
    private String homePhoneNumber;
    private String hobby;

    public MemberV1(String name, String mobilePhoneNumber) {
        this.name = name;
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public MemberV1(String name, String mobilePhoneNumber, String address) {
        this.name = name;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.address = address;
    }

    public MemberV1(String name, String mobilePhoneNumber, String address, String homePhoneNumber) {
        this.name = name;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.address = address;
        this.homePhoneNumber = homePhoneNumber;
    }
}
