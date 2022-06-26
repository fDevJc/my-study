package hello.mystudy.effectivejava.item2.source;

/**
 * 자바빈즈 패턴
 * (JavaBeans Pattern)
 */
public class MemberV2 {
    //필수 매개변수
    private String name;
    private String mobilePhoneNumber;

    //선택 매개변수
    private String address;
    private String homePhoneNumber;
    private String hobby;

    public MemberV2(String name, String mobilePhoneNumber) {
        this.name = name;
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
